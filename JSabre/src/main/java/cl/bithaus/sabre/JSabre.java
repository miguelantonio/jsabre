package cl.bithaus.sabre;

import cl.bithaus.sabre.bo.SabreBookRequest;
import cl.bithaus.sabre.bo.SabreBookResponse;
import cl.bithaus.sabre.bo.SabreCancelResponse;
import cl.bithaus.sabre.bo.SabreSearchRequest;
import cl.bithaus.sabre.bo.SabreSearchResponse;
import cl.bithaus.sabre.book.SabreBookClient;
import cl.bithaus.sabre.cache.SabreCacheInterface;
import cl.bithaus.sabre.cache.SabreTimeCache;
import cl.bithaus.sabre.exceptions.SabreException;
import cl.bithaus.sabre.exceptions.SabreInternalException;
import cl.bithaus.sabre.search.SabreSearchClient;
import cl.bithaus.sabre.session.SabreSessionManager;
import java.io.FileReader;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Miguel A. Fuentes Buchholtz
 * @email miguel@variacode.com
 */
public class JSabre implements JSabreInterface {

    /*
     ChangeAAA: Cambio de PCC desde el de la WEB al PCC de emisión
     ContextChangeLLSRQ
     https://developer.sabre.com/docs/read/soap_apis/management/utility/Change_AAA

     DesignatePrinter: Asignación de impresoras para la emisión
     DesignatePrinterLLSRQ
     https://developer.sabre.com/docs/read/soap_apis/management/utility/Designate_Printer
     Necesito la de itinerario y ticketing LNIATA XXXXXX
     InvoiceItinerary, ticketing

     TravelItineraryRead: Recuperar reserva para emitir en el PCC de emisión

     Para el ticketing sugiero que la araucana se pronuncie con todo lo que se necesita
     linea aerea
     FPA CA : cash
     AirTicket: Servicio para la emisión del boleto
     AirTicketLLSRQ
     https://developer.sabre.com/docs/read/soap_apis/air/fulfill/Issue_Air_Ticket
    
    
     Cancelar: Reserva 
     Anular Voidear: ticket 
    
    
     */
    private String defaultQueue;

    private boolean lateInit = false;
    private SabreSessionManager sessionManager;
    private SabreCacheInterface<SabreSearchRequest, List<SabreSearchResponse>> searchTimeCache;
    private SabreSearchClient searchClient;
    private SabreBookClient bookClient;
    // solo permite uno a la vez, se podría usar un
    // Executor a futuro, aunque no es necesario para
    // el 1% de los requests
    private final Object mutexTransaction = new Object();
    private final static String DEFAULT_CONFIG_FILE = "conf/config.properties";

    private JSabre(boolean lateInit) {
        this.lateInit = lateInit;
        this.sessionManager = null;
        this.searchTimeCache = null;
        this.searchClient = null;
        this.bookClient = null;
        this.defaultQueue = null;
    }

    /**
     *
     * @param configFile
     * @throws IOException
     */
    public JSabre(String configFile) throws IOException {
        this(loadPropertiesFromFile(configFile));
    }

    /**
     *
     * @throws IOException
     */
    public JSabre() throws IOException {
        this(DEFAULT_CONFIG_FILE);
    }

    // archivo configuración, usando SabreConfig u otro objeto
    /**
     *
     * @param properties
     * @throws MalformedURLException
     */
    public JSabre(Properties properties) throws MalformedURLException {
        this(
                Integer.parseInt(properties.getProperty(SabreConstants.PROPERTIES_MAX_TOKENS)),
                Integer.parseInt(properties
                        .getProperty(SabreConstants.PROPERTIES_CACHE_READ_EXPIRE_MILI)),
                Integer.parseInt(properties.getProperty(SabreConstants.PROPERTIES_CACHE_SIZE)),
                new URL(properties.getProperty(SabreConstants.PROPERTIES_ENDPOINT_URL)),
                properties.getProperty(SabreConstants.PROPERTIES_SENDER_COMPANY_DOMAIN),
                properties.getProperty(SabreConstants.PROPERTIES_IPCC), properties
                .getProperty(SabreConstants.PROPERTIES_USERNAME), properties
                .getProperty(SabreConstants.PROPERTIES_PASSWORD), Boolean
                .parseBoolean(properties.getProperty(SabreConstants.PROPERTIES_DEBUG, "false")), properties.getProperty(SabreConstants.PROPERTIES_DEFAULT_QUEUE, SabreConstants.DEFAULT_QUEUE_DEACTIVATED),
                properties.getProperty(SabreConstants.PROPERTIES_QUEUE_PCC, properties.getProperty(SabreConstants.PROPERTIES_DEFAULT_QUEUE, SabreConstants.DEFAULT_QUEUE_DEACTIVATED)),
                Integer.parseInt(properties.getProperty(SabreConstants.PROPERTIES_MAX_TOKEN_IDLE_TIME, SabreConstants.DEFAULT_PROPERTIES_MAX_TOKEN_IDLE_TIME+"")));
        SabreConstants.DEBUG = Boolean.parseBoolean(properties.getProperty(SabreConstants.PROPERTIES_DEBUG, "false"));
    }

    /**
     *
     * @param maxTokens
     * @param cacheReadExpireMiliseconds
     * @param cacheSize
     * @param endpointURL
     * @param senderCompanyDomain
     * @param IPCC
     * @param username
     * @param password
     * @param queuePCC
     * @param maxTokenIdleTimeSecs
     */
    public JSabre(int maxTokens, int cacheReadExpireMiliseconds, int cacheSize,
            URL endpointURL, String senderCompanyDomain, String IPCC,
            String username, String password, String queuePCC, int maxTokenIdleTimeSecs) {
        this(maxTokens, cacheReadExpireMiliseconds, cacheSize, endpointURL,
                senderCompanyDomain, IPCC, username, password, false,
                SabreConstants.DEFAULT_QUEUE_DEACTIVATED, queuePCC, maxTokenIdleTimeSecs);
    }

    /**
     *
     * @param maxTokens
     * @param cacheReadExpireMiliseconds
     * @param cacheSize
     * @param endpointURL
     * @param senderCompanyDomain
     * @param IPCC
     * @param username
     * @param password
     * @param debug
     * @param defaultQueue
     * @param queuePCC
     * @param maxTokenIdleTimeSecs
     */
    public JSabre(int maxTokens, int cacheReadExpireMiliseconds, int cacheSize,
            URL endpointURL, String senderCompanyDomain, String IPCC,
            String username, String password, boolean debug, String defaultQueue, String queuePCC, int maxTokenIdleTimeSecs) {
        if (debug) {
            System.setProperty(
                    "com.sun.xml.ws.transport.http.client.HttpTransportPipe.dump",
                    "true");
            System.setProperty(
                    "com.sun.xml.internal.ws.transport.http.client.HttpTransportPipe.dump",
                    "true");
            System.setProperty(
                    "com.sun.xml.ws.transport.http.HttpAdapter.dump", "true");
            System.setProperty(
                    "com.sun.xml.internal.ws.transport.http.HttpAdapter.dump",
                    "true");
            System.setProperty(
                    "com.sun.xml.internal.ws.transport.http.HttpAdapter.dumpTreshold",
                    "20000");
        }
        this.sessionManager = new SabreSessionManager(maxTokens, endpointURL,
                senderCompanyDomain, IPCC, username, password, maxTokenIdleTimeSecs, 0);
        this.searchTimeCache = new SabreTimeCache<SabreSearchRequest, List<SabreSearchResponse>>(
                cacheReadExpireMiliseconds, cacheSize);
        this.searchClient = new SabreSearchClient(endpointURL,
                senderCompanyDomain, IPCC);
        this.bookClient = new SabreBookClient(endpointURL, senderCompanyDomain,
                IPCC, queuePCC);
        this.defaultQueue = defaultQueue;
    }

    public void bySecondTick() {
        if (this.sessionManager != null) {
            this.sessionManager.manualBySecondTokenRenew();
        }
    }

    /**
     *
     * @return
     */
    public static JSabre getInstance() {
        return new JSabre(true);
    }

    /**
     *
     * @param configFile
     * @throws IOException
     * @throws MalformedURLException
     * @throws SabreException
     */
    public void setJSabreProperties(String configFile) throws IOException,
            MalformedURLException, SabreException {
        setJSabreProperties(loadPropertiesFromFile(configFile));
    }

    /**
     *
     * @param properties
     * @throws MalformedURLException
     * @throws SabreException
     */
    public void setJSabreProperties(Properties properties)
            throws MalformedURLException, SabreException {
        SabreConstants.DEBUG = Boolean.parseBoolean(properties.getProperty(SabreConstants.PROPERTIES_DEBUG, "false"));
        setJSabreProperties(
                Integer.parseInt(properties.getProperty(SabreConstants.PROPERTIES_MAX_TOKENS)),
                Integer.parseInt(properties
                        .getProperty(SabreConstants.PROPERTIES_CACHE_READ_EXPIRE_MILI)),
                Integer.parseInt(properties.getProperty(SabreConstants.PROPERTIES_CACHE_SIZE)),
                new URL(properties.getProperty(SabreConstants.PROPERTIES_ENDPOINT_URL)),
                properties.getProperty(SabreConstants.PROPERTIES_SENDER_COMPANY_DOMAIN),
                properties.getProperty(SabreConstants.PROPERTIES_IPCC), properties
                .getProperty(SabreConstants.PROPERTIES_USERNAME), properties
                .getProperty(SabreConstants.PROPERTIES_PASSWORD), SabreConstants.DEBUG,
                properties.getProperty(SabreConstants.PROPERTIES_DEFAULT_QUEUE, SabreConstants.DEFAULT_QUEUE_DEACTIVATED),
                properties.getProperty(SabreConstants.PROPERTIES_QUEUE_PCC, properties.getProperty(SabreConstants.PROPERTIES_DEFAULT_QUEUE, SabreConstants.DEFAULT_QUEUE_DEACTIVATED)),
                Integer.parseInt(properties.getProperty(SabreConstants.PROPERTIES_MAX_TOKEN_IDLE_TIME), SabreConstants.DEFAULT_PROPERTIES_MAX_TOKEN_IDLE_TIME));
    }

    /**
     *
     * @param maxTokens
     * @param cacheReadExpireMiliseconds
     * @param cacheSize
     * @param endpointURL
     * @param senderCompanyDomain
     * @param IPCC
     * @param username
     * @param password
     * @param debug
     * @param defaultQueue
     * @param queuePCC
     * @param maxTokenIdleTimeSecs
     * @throws SabreException
     */
    public void setJSabreProperties(int maxTokens,
            int cacheReadExpireMiliseconds, int cacheSize, URL endpointURL,
            String senderCompanyDomain, String IPCC, String username,
            String password, boolean debug, String defaultQueue, String queuePCC, int maxTokenIdleTimeSecs) throws SabreException {
        SabreConstants.DEBUG = debug;
        if (this.lateInit && !this.isSessionAvailable()) {
            if (debug) {
                System.setProperty(
                        "com.sun.xml.ws.transport.http.client.HttpTransportPipe.dump",
                        "true");
                System.setProperty(
                        "com.sun.xml.internal.ws.transport.http.client.HttpTransportPipe.dump",
                        "true");
                System.setProperty(
                        "com.sun.xml.ws.transport.http.HttpAdapter.dump",
                        "true");
                System.setProperty(
                        "com.sun.xml.internal.ws.transport.http.HttpAdapter.dump",
                        "true");
                System.setProperty(
                        "com.sun.xml.internal.ws.transport.http.HttpAdapter.dumpTreshold",
                        "20000");
            }
            this.sessionManager = new SabreSessionManager(maxTokens,
                    endpointURL, senderCompanyDomain, IPCC, username, password, maxTokenIdleTimeSecs, 0);
            this.searchTimeCache = new SabreTimeCache<SabreSearchRequest, List<SabreSearchResponse>>(
                    cacheReadExpireMiliseconds, cacheSize);
            this.searchClient = new SabreSearchClient(endpointURL,
                    senderCompanyDomain, IPCC);
            this.bookClient = new SabreBookClient(endpointURL,
                    senderCompanyDomain, IPCC, queuePCC);
            this.defaultQueue = defaultQueue;
        } else {
            throw new SabreException(
                    "No se puede ejecutar esta función una vez inicializada la sesi�n o utilizando un constructor");
        }
    }

    private static Properties loadPropertiesFromFile(String configFile)
            throws IOException {
        FileReader reader = new FileReader(configFile);
        Properties properties = new Properties();
        properties.load(reader);
        reader.close();
        return properties;
    }

    /**
     *
     */
    @Override
    public void startSessionManager() {
        this.sessionManager.start();
    }

    /**
     *
     */
    @Override
    public void stopSessionManager() {
        this.sessionManager.stop();
    }

    /**
     *
     * @return
     */
    public boolean isSessionAvailable() {
        if (this.sessionManager == null) {
            return false;
        }
        return this.sessionManager.isAvailable();
    }

    /**
     *
     * Algunos errores de host, los pueden encontrar en la documentación de
     * Format Finder de Sabre
     *
     * @param request
     * @return
     * @throws cl.bithaus.sabre.exceptions.SabreInternalException
     */
    @Override
    public SabreBookResponse airBook(SabreBookRequest request) throws SabreInternalException {
        if (request.getQueueNumber() == null || !request.getQueueNumber().equals("")) {
            request.setQueueNumber(defaultQueue);
        }
        synchronized (mutexTransaction) {
            String tempToken = this.sessionManager.tokenCreate();
            SabreBookResponse r = this.bookClient.airBook(request, tempToken);
            this.sessionManager.tokenClose(tempToken);
            return r;
        }
    }

    /**
     *
     * @param reserveID
     * @return
     * @throws cl.bithaus.sabre.exceptions.SabreInternalException
     */
    public SabreCancelResponse airCancel(String reserveID) throws SabreInternalException {
        synchronized (mutexTransaction) {
            String tempToken = this.sessionManager.tokenCreate();
            SabreCancelResponse r = this.bookClient.airCancel(reserveID,
                    tempToken);
            this.sessionManager.tokenClose(tempToken);
            return r;
        }

    }

    /**
     *
     * @param itineraryNumber
     * @return
     */
    @Override
    public SabreSearchResponse readItinerary(String itineraryNumber) throws SabreInternalException {
        synchronized (mutexTransaction) {
            String tempToken = this.sessionManager.tokenCreate();
            SabreSearchResponse sr = null;
            try {
                sr = this.bookClient.readItinerary(itineraryNumber, tempToken);
                this.sessionManager.tokenClose(tempToken);
                return sr;
            } catch (SabreException ex) {
                Logger.getLogger(JSabre.class.getName()).log(Level.SEVERE,
                        null, ex);
                this.sessionManager.tokenClose(tempToken);
            }
            return sr;
        }
    }

    /**
     *
     * @param request
     * @return
     * @throws SabreInternalException
     */
    @Override
    public List<SabreSearchResponse> airSearch(SabreSearchRequest request)
            throws SabreInternalException {
        if (!this.sessionManager.isAvailable()) {
            throw new SabreInternalException(
                    "No hay sesiones disponibles en Sabre Session Manager");
        }
        List<SabreSearchResponse> response = this.searchTimeCache.get(request);
        if (response != null) {
            return response;
        } else {
            response = this.sessionManager.sabreSearch(searchClient, request);
            if (response != null && !response.isEmpty() && !response.get(0).isError()) {
                searchTimeCache.put(request, response);
            }
            return response;
        }
    }
}
