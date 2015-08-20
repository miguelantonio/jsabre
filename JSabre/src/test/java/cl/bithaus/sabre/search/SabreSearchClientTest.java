package cl.bithaus.sabre.search;

import cl.bithaus.sabre.bo.SabreSearchRequest;
import cl.bithaus.sabre.bo.SabreSearchResponse;
import cl.bithaus.sabre.exceptions.SabreException;
import cl.bithaus.sabre.session.SabreSessionManager;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;
import java.util.List;
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
public class SabreSearchClientTest {

    private final URL webserviceDevEndpoint;
    private final static String COMPANY_URL = "www.laaraucana.cl";
    private final static String IPCC = "B3IH";
    private final static String USER = "7971";
    private final static String PASSWORD = "WS121213";

    public SabreSearchClientTest() throws MalformedURLException {
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
     * Test of search method, of class SabreSearchClient.
     * @throws java.lang.Exception
     */
    @Test
    public void testSearch() throws Exception {
        System.out.println("SabreSearchClient.search");

        SabreSessionManager manager = new SabreSessionManager(2, webserviceDevEndpoint, COMPANY_URL,
                IPCC, USER, PASSWORD, 10000, 2000);
        manager.start();
        try {
            assertEquals(true, manager.isAvailable());
            SabreSearchClient instance = new SabreSearchClient(webserviceDevEndpoint, COMPANY_URL, IPCC);
            Date returnDate = new Date();
            returnDate.setDate(returnDate.getDate() + 7);
            SabreSearchRequest request = new SabreSearchRequest("SCL", "HKG", new Date(), returnDate, 1, 0, 0);
            List<SabreSearchResponse> result = manager.sabreSearch(instance, request);
            assertNotNull(result);
            assertTrue(result.size() > 0);
            assertTrue(result.get(0).getPrice() != null && result.get(0).getPrice().intValue() != 0);
        } finally {
            manager.stop();
        }
    }

    //TODO: test concurrente
    @Test
    public void testConcurrentSearchWithWait() throws InterruptedException {
        System.out.println("SabreSearchClient.search (concurrent)");
        final SabreSessionManager manager = new SabreSessionManager(2, webserviceDevEndpoint, COMPANY_URL,
                IPCC, USER, PASSWORD, 10000, 2000);
        manager.start();
        try {
            final SabreSearchClient instance = new SabreSearchClient(webserviceDevEndpoint, COMPANY_URL, IPCC);
            final int maxTestSearches = 4;
            final Long[] resultTimes = new Long[maxTestSearches];
            final Integer[] resultSizes = new Integer[maxTestSearches];
            Runnable s0 = new Runnable() {

                @Override
                public void run() {
                    final int number = 0;
                    long start = System.currentTimeMillis();
                    Date date = new Date();
                    date.setDate(date.getDate() + 7);
                    SabreSearchRequest request = new SabreSearchRequest("SCL", "HKG", date, 1, 0, 0);
                    try {
                        List<SabreSearchResponse> result = manager.sabreSearch(instance, request);
                        if (result == null) {
                            resultSizes[number] = null;
                        } else {
                            resultSizes[number] = result.size();
                        }
                    } catch (SabreException ex) {
                        Logger.getLogger(SabreSearchClientTest.class.getName()).log(Level.SEVERE, null, ex);
                        resultSizes[number] = -1;
                    }
                    resultTimes[number] = System.currentTimeMillis() - start;
                }
            };
            Runnable s1 = new Runnable() {

                @Override
                public void run() {
                    final int number = 1;
                    long start = System.currentTimeMillis();
                    Date date = new Date();
                    date.setDate(date.getDate() + 8);
                    SabreSearchRequest request = new SabreSearchRequest("SCL", "HKG", date, 1, 0, 0);
                    try {
                        List<SabreSearchResponse> result = manager.sabreSearch(instance, request);
                        if (result == null) {
                            resultSizes[number] = null;
                        } else {
                            resultSizes[number] = result.size();
                        }
                    } catch (SabreException ex) {
                        Logger.getLogger(SabreSearchClientTest.class.getName()).log(Level.SEVERE, null, ex);
                        resultSizes[number] = -1;
                    }
                    resultTimes[number] = System.currentTimeMillis() - start;
                }
            };
            //le toca esperar
            Runnable s2 = new Runnable() {

                @Override
                public void run() {
                    final int number = 2;
                    long start = System.currentTimeMillis();
                    Date date = new Date();
                    date.setDate(date.getDate() + 9);
                    SabreSearchRequest request = new SabreSearchRequest("SCL", "HKG", date, 1, 0, 0);
                    try {
                        List<SabreSearchResponse> result = manager.sabreSearch(instance, request);
                        if (result == null) {
                            resultSizes[number] = null;
                        } else {
                            resultSizes[number] = result.size();
                        }
                    } catch (SabreException ex) {
                        Logger.getLogger(SabreSearchClientTest.class.getName()).log(Level.SEVERE, null, ex);
                        resultSizes[number] = -1;
                    }
                    resultTimes[number] = System.currentTimeMillis() - start;
                }
            };
            //le toca esperar
            Runnable s3 = new Runnable() {

                @Override
                public void run() {
                    final int number = 3;
                    long start = System.currentTimeMillis();
                    Date date = new Date();
                    date.setDate(date.getDate() + 9);
                    SabreSearchRequest request = new SabreSearchRequest("SCL", "HKG", date, 1, 0, 0);
                    try {
                        List<SabreSearchResponse> result = manager.sabreSearch(instance, request);
                        if (result == null) {
                            resultSizes[number] = null;
                        } else {
                            resultSizes[number] = result.size();
                        }
                    } catch (SabreException ex) {
                        Logger.getLogger(SabreSearchClientTest.class.getName()).log(Level.SEVERE, null, ex);
                        resultSizes[number] = -1;
                    }
                    resultTimes[number] = System.currentTimeMillis() - start;
                }
            };
            Thread t0 = new Thread(s0);
            t0.start();
            Thread t1 = new Thread(s1);
            t1.start();
            Thread t2 = new Thread(s2);
            t2.start();
            Thread t3 = new Thread(s3);
            t3.start();
            t0.join();
            t1.join();
            t2.join();
            t3.join();

            double sum = 0.0;
            for (int i = 0; i < maxTestSearches; i++) {
                assertTrue(resultTimes[i] != null && resultTimes[i] > 0);
                assertNotNull(resultSizes[i]);
                sum = sum + resultTimes[i];
            }
            double avg = sum / maxTestSearches;
            double std = std_dev1(resultTimes, avg);
            //si la mitad pasa la banda entonces estamos OK tuvieron que esperar
            double low = avg - (std);
            double high = avg + (std);
            int count = 0;
            for (Long l : resultTimes) {
                if (l < low || l > high) {
                    count--;
                } else {
                    count++;
                }
            }
            assertEquals(count, 0);
        } finally {
            System.out.println("SabreSearchClient.search (concurrent) CLEANUP");
            manager.stop();
        }
    }

    double std_dev1(Long a[], double avg) {
        if (a.length == 0) {
            return 0.0;
        }
        double sq_diff_sum = 0;
        for (int i = 0; i < a.length; ++i) {
            double diff = a[i] - avg;
            sq_diff_sum += diff * diff;
        }
        double variance = sq_diff_sum / a.length;
        return Math.sqrt(variance);
    }

    /**
     * Test of search method, of class SabreSearchClient.
     */
    @Test
    public void testBadDateSearch() throws Exception {
        System.out.println("SabreSearchClient.search (bad date)");

        SabreSessionManager manager = new SabreSessionManager(2, webserviceDevEndpoint, COMPANY_URL,
                IPCC, USER, PASSWORD, 10000, 2000);
        manager.start();
        try {
            assertEquals(true, manager.isAvailable());
            SabreSearchClient instance = new SabreSearchClient(webserviceDevEndpoint, COMPANY_URL, IPCC);
            Date returnDate = new Date();
            returnDate.setDate(returnDate.getDate() - 100);
            SabreSearchRequest request = new SabreSearchRequest("SCL", "HKG", new Date(), returnDate, 1, 0, 0);
            List<SabreSearchResponse> result = manager.sabreSearch(instance, request);
            assertNotNull(result);
            assertTrue(result.size() > 0);
            assertTrue(result.get(0).isError());
        } finally {
            manager.stop();
        }
    }

    /**
     * Test of search method, of class SabreSearchClient.
     */
    @Test
    public void testBadLocationSearch() throws Exception {
        System.out.println("SabreSearchClient.search (bad location)");

        SabreSessionManager manager = new SabreSessionManager(2, webserviceDevEndpoint, COMPANY_URL,
                IPCC, USER, PASSWORD, 10000, 2000);
        manager.start();
        try {
            assertEquals(true, manager.isAvailable());
            SabreSearchClient instance = new SabreSearchClient(webserviceDevEndpoint, COMPANY_URL, IPCC);
            Date returnDate = new Date();
            returnDate.setDate(returnDate.getDate() + 7);
            SabreSearchRequest request = new SabreSearchRequest("S%CL", "HK.G", new Date(), returnDate, 1, 0, 0);
            List<SabreSearchResponse> result = manager.sabreSearch(instance, request);
            assertNotNull(result);
            assertTrue(result.size() > 0);
            assertTrue(result.get(0).isError());
        } finally {
            manager.stop();
        }
    }

}
