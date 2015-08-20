package cl.bithaus.sabre;

import cl.bithaus.sabre.bo.SabreSearchRequest;
import cl.bithaus.sabre.bo.SabreSearchResponse;
import cl.bithaus.sabre.exceptions.SabreException;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JSabre30MinSearches {

    static JSabre instance;

    public static void main(String[] args) throws IOException {
        instance = new JSabre();
        instance.startSessionManager();
        final Date started = new Date();
        Thread t = null;
        try {
            t = new Thread(new Runnable() {
                Date date = new Date();

                @Override
                public void run() {
                    for (int i = 0; i < 10000; i++) {
                        date.setDate(date.getDate() + 1);
                        SabreSearchRequest request = new SabreSearchRequest("SCL", "LIM", date, 1, 0, 0);
                        try {
                            List<SabreSearchResponse> response = instance.airSearch(request);
                            Logger.getLogger(JSabre30MinSearches.class.getName()).log(Level.INFO, "{0} respuestas de b\u00fasqueda, tiempo de ejecuci\u00f3n: {1} segundos", new Object[]{response.size(), ((new Date()).getTime() - started.getTime()) / 1000});
                        } catch (SabreException ex) {
                            Logger.getLogger(JSabre30MinSearches.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(JSabre30MinSearches.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }
            });
            t.start();
            //15 min
            Thread.sleep(1000 * 60 * 60);
        } catch (InterruptedException ex) {
            Logger.getLogger(JSabre30MinSearches.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (t != null) {
                t.interrupt();
                
            }
            instance.stopSessionManager();
        }
    }

}
