package cl.bithaus.sabre;

public class SabreConstants {

    public static boolean DEBUG = true;
    
    public static final String PASSENGER_TYPE_ADULT = "ADT";
    public static final String PASSENGER_TYPE_CHILD = "CHD";
    public static final String PASSENGER_TYPE_INFANT = "INF";
    public static final String PASSENGER_TYPE_INFANT_WITH_SEAT = "INS";

    //también es válido null
    public final static String DEFAULT_QUEUE_DEACTIVATED = "NONE";

    public final static String PROPERTIES_ENDPOINT_URL = "cl.bithaus.sabre.endpointURL";

    public final static String PROPERTIES_SENDER_COMPANY_DOMAIN = "cl.bithaus.sabre.senderCompanyDomain";

    public final static String PROPERTIES_IPCC = "cl.bithaus.sabre.IPCC";

    public final static String PROPERTIES_USERNAME = "cl.bithaus.sabre.username";

    public final static String PROPERTIES_PASSWORD = "cl.bithaus.sabre.password";

    public final static String PROPERTIES_MAX_TOKENS = "cl.bithaus.sabre.maxTokens";

    public final static String PROPERTIES_CACHE_SIZE = "cl.bithaus.sabre.cacheSize";

    public final static String PROPERTIES_CACHE_READ_EXPIRE_MILI = "cl.bithaus.sabre.cacheReadExpireMiliseconds";

    public final static String PROPERTIES_DEBUG = "cl.bithaus.sabre.debug";
    public final static String PROPERTIES_DEFAULT_QUEUE = "cl.bithaus.sabre.defaultQueue";
    public final static String PROPERTIES_QUEUE_PCC = "cl.bithaus.sabre.queuePCC";

    public final static String PROPERTIES_MAX_TOKEN_IDLE_TIME = "cl.bithaus.sabre.maxTokenIdleTimeSecs";

    public final static int DEFAULT_PROPERTIES_MAX_TOKEN_IDLE_TIME = 9;

    public final static String DEFAULT_PASSENGERDETAILS_WAITINTERVAL = "20000";

    public final static int DEFAULT_BOOKING_NUMATTEMPTS = 4;
    public final static int DEFAULT_BOOKING_WAITINTERVAL = 5000;

}
