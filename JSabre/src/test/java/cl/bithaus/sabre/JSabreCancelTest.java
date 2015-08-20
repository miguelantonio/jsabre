package cl.bithaus.sabre;

import cl.bithaus.sabre.bo.SabreBookRequest;
import cl.bithaus.sabre.bo.SabreBookResponse;
import cl.bithaus.sabre.bo.SabreCancelResponse;
import cl.bithaus.sabre.bo.SabrePassengerInformation;
import cl.bithaus.sabre.bo.SabreResponse;
import cl.bithaus.sabre.bo.SabreSearchRequest;
import cl.bithaus.sabre.bo.SabreSearchResponse;
import cl.bithaus.sabre.exceptions.SabreException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author miguelfuentes
 */
public class JSabreCancelTest {

    private static JSabre instance;

    public JSabreCancelTest() {
    }

    @BeforeClass
    public static void setUpClass() throws IOException {
        instance = new JSabre();
        instance.startSessionManager();
    }

    @AfterClass
    public static void tearDownClass() {
        instance.stopSessionManager();
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of airCancel method, of class JSabre.
     * @throws java.io.IOException
     * @throws cl.bithaus.sabre.exceptions.SabreException
     */
    @Test
    public void testAirCancel() throws IOException, SabreException {
        System.out.println("airCancel");
        Date date = new Date();
        date.setDate(date.getDate() + 30);
        SabreSearchRequest request = new SabreSearchRequest("SCL", "BOG", date, 1, 0, 0);

        List<SabreSearchResponse> response = instance.airSearch(request);
        assertTrue(response.size() >= 1);
        assertFalse(response.get(0).isError());
        List<SabrePassengerInformation> i = new ArrayList<SabrePassengerInformation>();
        SabrePassengerInformation pi = new SabrePassengerInformation();
        pi.setGivenName("Ooodody");
        pi.setSurname("Siiorsssy");
        pi.setPhoneNumber("56003303301");
        i.add(pi);
        SabreBookRequest br = new SabreBookRequest(request, response.get(0), i);
        SabreBookResponse result = instance.airBook(br);
        assertNotNull(result.getItineraryRefID());
        SabreCancelResponse f = instance.airCancel(result.getItineraryRefID());
        assertTrue(f.isCancel());
    }

}
