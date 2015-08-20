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
import java.util.Arrays;
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
public class JSabreBookTest {

    private static JSabre instance;

    public JSabreBookTest() {
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
     * Test of airBook method, of class JSabre.
     *
     * @throws java.io.IOException
     * @throws cl.bithaus.sabre.exceptions.SabreException
     */
    @Test
    public void testAirBook() throws IOException, SabreException {
        System.out.println("airBook");
        Date date = new Date();
        date.setDate(date.getDate() + 21);

        Date date2 = new Date();
        date2.setDate(date2.getDate() + 28);
        int adt = 2;
        int chl = 2;
        int inf = 1;
        //BKK
        SabreSearchRequest request = new SabreSearchRequest("SCL", "LIM", date, /*date2,*/ adt, chl, inf);
        assertTrue(request.isValid());
        List<SabreSearchResponse> response = instance.airSearch(request);
        assertTrue(response.size() >= 1);
        assertFalse(response.get(0).isError());
        List<SabrePassengerInformation> i = new ArrayList<SabrePassengerInformation>();
        for (int j = 0; j < (adt + chl + inf); j++) {
            i.add(generatePassenger(j));
            if (j < adt + chl) {
                i.get(j).setPassengerType(SabreConstants.PASSENGER_TYPE_ADULT);
            } else {
                i.get(j).setPassengerType(SabreConstants.PASSENGER_TYPE_INFANT);
            }
        }
        SabreBookRequest br = new SabreBookRequest(request, response.get(0), i);
        SabreBookResponse result = instance.airBook(br);
        if (result.isError()) {
            System.out.println("ERROR: " + Arrays.toString(result.getErrorDescription().toArray()));
        }
        assertNotNull(result.getItineraryRefID());
        assertNotSame(result.getStatus(), SabreResponse.STATUS_INCOMPLETE);
        if (result.getItineraryRefID() != null) {
            SabreCancelResponse f = instance.airCancel(result.getItineraryRefID());
        }
    }
    private final String[] pasajeros = {"qerqwere", "fsadfsad", "dfgdfgdfg", "fghfghfgh", "tyjtyjty", "vdfdfv", "cvbcvbcvbn",
        "dhnghnnn", "assdgjhgfd", "lkklhhjgk", "serg", "fdfgsdjjjjj", "qwerqrwe", "ffffdfsdfg", "mnbvcggj"};

    private SabrePassengerInformation generatePassenger(int i) {
        SabrePassengerInformation pi = new SabrePassengerInformation();
        pi.setGivenName(pasajeros[i]);
        pi.setSurname(pasajeros[pasajeros.length - (i + 1)]);
        pi.setPhoneNumber("5600330330" + i);
        pi.setMembershipID("16110110" + i);
        pi.setPassport("16110110" + i);
        pi.setCountryCode("CL");
        pi.setIsFemale(Boolean.FALSE);

        pi.setBirthDay(new Date());
        return pi;
    }

}
