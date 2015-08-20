package cl.bithaus.sabre.session;

import cl.bithaus.sabre.SabreConstants;
import cl.bithaus.sabre.bo.SabreSearchRequest;
import cl.bithaus.sabre.bo.SabreSearchResponse;
import cl.bithaus.sabre.exceptions.SabreInternalException;
import cl.bithaus.sabre.search.SabreSearchClient;
import com.google.common.annotations.VisibleForTesting;
import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Miguel A. Fuentes Buchholtz
 * @email miguel@variacode.com
 */
public class SabreSessionManager {

    private final int maxTokens;
    private final String[] tokens;
    private final boolean[] tokensInUse;
    private final Object[] tokenMutex;
    private int agent = 0;
    private boolean available = false;
    private final ExecutorService executorService;
    private final SabreSessionClient sessionClient;
    private final int heartbeat;
    private final int createTokenWaitTimeMilis;
    private boolean loopUsingExecutor = true;
    private int tokenCount = 0;
    private long tokenSecondCount = 0;
    private boolean started = false;

    /**
     *
     * @param maxTokens
     * @param endpointURL
     * @param senderCompanyURL
     * @param IPCC
     * @param username
     * @param password
     */
    public SabreSessionManager(int maxTokens, URL endpointURL, String senderCompanyURL, String IPCC,
            String username, String password) {
        this(maxTokens, endpointURL, senderCompanyURL, IPCC, username, password, 0, 0);
    }

    /**
     *
     * @param maxTokens
     * @param endpointURL
     * @param senderCompanyURL
     * @param IPCC
     * @param username
     * @param password
     * @param maxTokenIdleTimeSecs
     * @param createTokenWaitTimeSecs
     */
    public SabreSessionManager(int maxTokens, URL endpointURL, String senderCompanyURL, String IPCC,
            String username, String password, int maxTokenIdleTimeSecs, int createTokenWaitTimeSecs) {
        this.maxTokens = maxTokens;
        this.tokens = new String[maxTokens];
        this.tokensInUse = new boolean[maxTokens];
        this.tokenMutex = new Object[maxTokens];
        this.executorService = Executors.newSingleThreadExecutor();
        this.sessionClient = new SabreSessionClient(endpointURL, senderCompanyURL, IPCC, username, password);
        //10 minutos
        this.heartbeat = (maxTokenIdleTimeSecs <= 0 ? (1000 * 60 * 9) : (1000 * maxTokenIdleTimeSecs)) / maxTokens;
        this.createTokenWaitTimeMilis = (createTokenWaitTimeSecs <= 0 ? 3000 : (1000 * 60 * createTokenWaitTimeSecs));
    }

    /**
     *
     * @return
     */
    public boolean isAvailable() {
        return this.available;
    }

    /**
     *
     * @return @throws cl.bithaus.sabre.exceptions.SabreInternalException
     */
    public String tokenCreate() throws SabreInternalException {
        String token = this.sessionClient.sessionCreateToken();
        if (token == null) {
            throw generateEmptyTokenException();
        }
        return token;
    }

    /**
     *
     * @param token
     * @return
     */
    public String tokenClose(String token) {
        return this.sessionClient.sessionCloseToken(token);
    }

    /*
     * OJO! esto detendrá el Executor!!
     */
    public void manualBySecondTokenRenew() {
        if (loopUsingExecutor) {
            loopUsingExecutor = false;
        }
        if (started) {
            tokenSecondCount = tokenSecondCount + 1000;
            if (tokenSecondCount >= heartbeat) {
                tokenSecondCount = 0;
                tokenCount = tokenCount + 1;
                if (tokenCount >= maxTokens) {
                    tokenCount = 0;
                }
                if (SabreConstants.DEBUG) {
                    Logger.getLogger(SabreSessionManager.class.getName()).log(Level.INFO, "TOKEN COUNT: " + tokenCount + ", TOKEN SECOND COUNT: " + tokenSecondCount);
                }
                renewToken(tokenCount);
            }
        }
    }

    private void renewToken(int i) {
        if (i >= 0 && i < maxTokens) {
            if (SabreConstants.DEBUG) {
                Logger.getLogger(SabreSessionManager.class.getName()).log(Level.INFO, "SESSION STATUS BEFORE CHECK: " + Arrays.deepToString(tokens));
            }
            //para evitar que al usar el token esté vacío al invalidarse (peor de los casos)
            synchronized (tokenMutex[i]) {
                if (tokens[i] == null || tokens[i].trim().equals("")) {
                    renewTokenWS(i);
                } else {
                    tokens[i] = sessionClient.sessionValidateToken(tokens[i]);
                    if (tokens[i] == null || tokens[i].trim().equals("")) {
                        renewTokenWS(i);
                    }
                }
            }
            if (SabreConstants.DEBUG) {
                Logger.getLogger(SabreSessionManager.class.getName()).log(Level.INFO, "SESSION STATUS AFTER CHECK: " + Arrays.deepToString(tokens));
            }
        }
    }

    private void renewTokenWS(int i) {
        String token = sessionClient.sessionCreateToken();
        if (token == null) {
            Logger.getLogger(SabreSessionManager.class.getName()).log(Level.SEVERE, null, generateEmptyTokenException());
        } else {
            tokens[i] = token;
        }
    }

    /**
     *
     */
    public void start() {
        for (int i = 0; i < maxTokens; i++) {
            tokens[i] = sessionClient.sessionCreateToken();
            tokensInUse[i] = false;
            tokenMutex[i] = new Object();
            try {
                Thread.sleep(createTokenWaitTimeMilis);
            } catch (InterruptedException ex) {
                Logger.getLogger(SabreSessionManager.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        if (SabreConstants.DEBUG) {
            Logger.getLogger(SabreSessionManager.class.getName()).log(Level.INFO, "SESSION STATUS INITAL TOKENS: " + Arrays.deepToString(tokens));
        }
        started = true;
        if (this.loopUsingExecutor) {
            this.executorService.submit(new Runnable() {

                @Override
                public void run() {
                    try {
                        //cada X segundos renovar girando (menos de 10 minutos en total)
                        while (true) {
                            for (int i = 0; i < maxTokens; i++) {
                                try {
                                    Thread.sleep(heartbeat);
                                } catch (InterruptedException ex) {
                                    Logger.getLogger(SabreSessionManager.class.getName()).log(Level.SEVERE, "ERROR EN SESSION TOKEN MANAGER", ex);
                                    break;
                                }
                                if (loopUsingExecutor) {
                                    renewToken(i);
                                } else {
                                    Logger.getLogger(SabreSessionManager.class.getName()).log(Level.INFO, "USING JAVAEE MODE!");
                                    break;
                                }
                            }
                            if (!loopUsingExecutor) {
                                Logger.getLogger(SabreSessionManager.class.getName()).log(Level.INFO, "USING JAVAEE MODE!");
                                break;
                            }
                        }
                    } catch (Exception e) {
                        Logger.getLogger(SabreSessionManager.class.getName()).log(Level.SEVERE, "ERROR DE EJECUCIÓN EN SESSION TOKEN MANAGER", e);
                    }
                }
            });
        } else {
            Logger.getLogger(SabreSessionManager.class.getName()).log(Level.INFO, "USING JAVAEE MODE!");
        }
        this.available = true;
    }

    /**
     *
     */
    public void stop() {
        if (!executorService.isShutdown()) {
            this.executorService.shutdown();
        }
        this.available = false;
        Logger.getLogger(SabreSessionManager.class.getName()).log(Level.INFO, "DETENIENDO SESSION MANAGER");
        for (int i = 0; i < maxTokens; i++) {
            sessionClient.sessionCloseToken(tokens[i]);
            tokens[i] = null;
            try {
                Thread.sleep(3000);
            } catch (InterruptedException ex) {
                Logger.getLogger(SabreSessionManager.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        Logger.getLogger(SabreSessionManager.class.getName()).log(Level.INFO, "SESSION MANAGER DETENIDO");
    }

    /**
     * NO se debe utilizar fuera de ambiente de prueba NO es una operación
     * thread safe
     *
     * @return @deprecated
     */
    @VisibleForTesting
    @Deprecated
    protected String getToken() {
        return this.tokens[getAndIncrementAgent()];
    }

    private int getAndIncrementAgent() {
        int a;
        //no se repiten dos con el mismo valor por condicion de carrera
        synchronized (tokenMutex) {
            if (agent >= maxTokens) {
                agent = 0;
            }
            a = agent;
            agent++;
        }
        return a;
    }

    //a futuro se podrían pasar todos los request por acá en el caso de requerir mas de 1 operacion concurrente
    //en operaciones NO search, usando funcion operation e interfaces, genericos, lo típico
    /**
     *
     * @param searchClient
     * @param request
     * @return
     * @throws cl.bithaus.sabre.exceptions.SabreInternalException
     */
    public List<SabreSearchResponse> sabreSearch(SabreSearchClient searchClient, SabreSearchRequest request) throws SabreInternalException {
        int a = getAndIncrementAgent();
        //si se llega al tope de tokens se encola
        synchronized (this.tokenMutex[a]) {
            if (this.tokens[a] == null) {
                throw generateEmptyTokenException();
            }
            return searchClient.search(request, this.tokens[a]);
        }
    }

    private SabreInternalException generateEmptyTokenException() {
        return new SabreInternalException("Sabre no disponible, token vacío");
    }

}
