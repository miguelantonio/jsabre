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
public class SabreSessionManagerTest {

    private final URL webserviceDevEndpoint;
    private final static String COMPANY_URL = "www.laaraucana.cl";
    private final static String IPCC = "B3IH";
    private final static String USER = "7971";
    private final static String PASSWORD = "WS121213";

    public SabreSessionManagerTest() throws MalformedURLException {
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
     * Test of stop method, of class SabreSessionManager.
     */
    @Test
    public void testStop() {
        System.out.println("SabreSessionManagerTest.stop");
        SabreSessionManager instance = new SabreSessionManager(2, webserviceDevEndpoint, COMPANY_URL,
                IPCC, USER, PASSWORD, 10000, 2000);
        instance.start();
        instance.stop();
        assertEquals(false, instance.isAvailable());
        assertEquals(null, instance.getToken());
        assertEquals(null, instance.getToken());
    }

    /**
     * Test of getToken method, of class SabreSessionManager.
     */
    @Test
    public void testGetToken() {
        System.out.println("SabreSessionManagerTest.getToken");
        SabreSessionManager instance = new SabreSessionManager(2, webserviceDevEndpoint, COMPANY_URL,
                IPCC, USER, PASSWORD, 10000, 2000);
        instance.start();
        try {
            assertEquals(true, instance.isAvailable());
            String token1 = instance.getToken();
            String token2 = instance.getToken();
            assertNotNull(token1);
            assertNotNull(token2);
            assertNotSame("", token1.trim());
            assertNotSame("", token2.trim());
            assertNotSame(token1, token2);
        } finally {
            instance.stop();
        }
    }

    /**
     * Test of internal token renewal functionality
     */
    @Test
    public void testTokenRenewal() {
        System.out.println("SabreSessionManagerTest.<token renewal>");
        SabreSessionManager instance = new SabreSessionManager(2, webserviceDevEndpoint, COMPANY_URL,
                IPCC, USER, PASSWORD, 10000, 2000);
        instance.start();
        try {
            assertEquals(true, instance.isAvailable());
            try {
                Thread.sleep(12000);
            } catch (InterruptedException ex) {
                Logger.getLogger(SabreSessionManagerTest.class.getName()).log(Level.SEVERE, null, ex);
            }
            String token1 = instance.getToken();
            String token2 = instance.getToken();
            assertNotNull(token1);
            assertNotNull(token2);
            assertNotSame("", token1.trim());
            assertNotSame("", token2.trim());
        } finally {
            instance.stop();
        }
    }

}
