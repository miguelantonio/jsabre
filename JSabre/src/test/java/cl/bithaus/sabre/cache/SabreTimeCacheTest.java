
package cl.bithaus.sabre.cache;

import cl.bithaus.sabre.bo.SabreSearchRequest;
import java.text.SimpleDateFormat;
import java.util.concurrent.Callable;
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
public class SabreTimeCacheTest {
    
    public SabreTimeCacheTest() {
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
     * Test of get method, of class SabreTimeCache, using SabreSearch objects
     */
    @Test
    public void testGetUsingSabreSearchRequest() throws Exception {
        
        System.out.println(this.getClass().getName()+".get (using SabreSearchRequest)");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        SabreSearchRequest key1 = new SabreSearchRequest("SCL", "HKG", sdf.parse("2014-11-11"), sdf.parse("2014-11-11"),  1, 0, 0);;
        SabreSearchRequest key2 = new SabreSearchRequest("SCL", "HKG", sdf.parse("2014-11-11"), sdf.parse("2014-11-11"),  1, 0, 0);;
        SabreTimeCache<SabreSearchRequest,String> instance = new SabreTimeCache<SabreSearchRequest,String>(60000, 1000);
        String expResult = "hola";
        instance.put(key1, expResult);
        String result = instance.get(key2);
        assertEquals(expResult, result);
    }

    /**
     * Test of get method, of class SabreTimeCache.
     */
    @Test
    public void testGet() throws Exception {
        
        System.out.println(this.getClass().getName()+".get");
        String key = "está";
        SabreTimeCache<String,String> instance = new SabreTimeCache<String,String>(60000, 1000, new Callable<String>() {

            @Override
            public String call() throws Exception {
                return "not-read";
           }
        });
        String expResult = null;
        String result = instance.get(key);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of getIfNullUseCallable method, of class SabreTimeCache.
     */
    @Test
    public void testGetIfNullUseCallable() throws Exception {
        
        System.out.println(this.getClass().getName()+".getIfNullUseCallable");
        String key = "está";
        SabreTimeCache<String,String> instance = new SabreTimeCache<String,String>(60000, 1000, new Callable<String>() {

            @Override
            public String call() throws Exception {
                return "get-ok";
           }
        });
        String expResult = "get-ok";
        String result = instance.getIfNullUseCallable(key);
        assertEquals(expResult, result);
    }

    /**
     * Test of put method, of class SabreTimeCache.
     */
    @Test
    public void testPut() {
        System.out.println(this.getClass().getName()+".put");
        String key = "está put";
        SabreTimeCache<String,String> instance = new SabreTimeCache<String,String>(60000, 1000, new Callable<String>() {

            @Override
            public String call() throws Exception {
                return "do-not-read";
           }
        });
        instance.put(key, "put-ok");
        String expResult = "put-ok";
        String result = instance.get(key);
        assertEquals(expResult, result);
    }
    
}
