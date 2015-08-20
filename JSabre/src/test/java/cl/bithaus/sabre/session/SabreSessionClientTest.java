package cl.bithaus.sabre.session;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Miguel A. Fuentes Buchholtz
 * @email miguel@variacode.com
 */
public class SabreSessionClientTest {

    private final URL webserviceDevEndpoint;
    private final static String COMPANY_URL = "www.laaraucana.cl";
    private final static String IPCC = "B3IH";
    private final static String USER = "7971";
    private final static String PASSWORD = "WS121213";

    public SabreSessionClientTest() throws MalformedURLException {
        webserviceDevEndpoint = new URL("https://sws-sts.cert.sabre.com");
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of sessionCloseToken method, of class SabreSessionClient.
     */
    @Test
    public void testSessionCloseToken() {
        System.out.println(this.getClass().getName()+".sessionCloseToken");
        SabreSessionClient instance = new SabreSessionClient(webserviceDevEndpoint, COMPANY_URL, IPCC, USER, PASSWORD);
        String token = instance.sessionCreateToken();
        String result = instance.sessionCloseToken(token);
        assertEquals(token, result);
    }

    /**
     * Test of sessionValidateToken method, of class SabreSessionClient.
     */
    @Test
    public void testSessionValidateToken() {
        System.out.println(this.getClass().getName()+".sessionValidateToken");
        SabreSessionClient instance = new SabreSessionClient(webserviceDevEndpoint, COMPANY_URL, IPCC, USER, PASSWORD);
        String token = instance.sessionCreateToken();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(SabreSessionClientTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        String result = instance.sessionValidateToken(token);
        assertEquals(token, result);
    }

    /**
     * Test of sessionCreateToken method, of class SabreSessionClient.
     */
    @Test
    public void testSessionCreateToken() {
        System.out.println(this.getClass().getName()+".sessionCreateToken");
        SabreSessionClient instance = new SabreSessionClient(webserviceDevEndpoint, COMPANY_URL, IPCC, USER, PASSWORD);
        String result = instance.sessionCreateToken();
        assertNotNull(result);
        assertNotSame(null, result);
        assertNotSame("",result.trim());
    }

}
