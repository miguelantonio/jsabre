package cl.bithaus.sabre;

import cl.bithaus.sabre.bo.SabreResponse;

import com.sabre.services.stl.v01.ApplicationResults;
import com.sabre.services.stl.v01.ProblemInformation;
import com.sabre.services.stl.v01.SystemSpecificResults;
import com.sabre.services.stl_header.v120.CompletionCodes;
import com.sabre.services.stl_header.v120.MessageCondition;
import java.math.BigDecimal;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Holder;
import org.ebxml.namespaces.messageheader.From;
import org.ebxml.namespaces.messageheader.MessageData;
import org.ebxml.namespaces.messageheader.MessageHeader;
import org.ebxml.namespaces.messageheader.PartyId;
import org.ebxml.namespaces.messageheader.To;
import org.xmlsoap.schemas.ws._2002._12.secext.Security;

/**
 *
 * @author Miguel A. Fuentes Buchholtz
 * @email miguel@variacode.com
 */
public class AbstractSabreClient {

    private final SimpleDateFormat sabreDateFormatNoYearNoSecond = new SimpleDateFormat("MM-dd'T'HH:mm");
    private final SimpleDateFormat sabreDateFormatNoSecond = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm");
    private final SimpleDateFormat sabreDateFormatFull = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
    private final SimpleDateFormat sabreDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
    private final SimpleDateFormat sabreDateFormatNatural = new SimpleDateFormat("ddMMMyy");
    private final SimpleDateFormat sabreDateFormatYearMonthDay = new SimpleDateFormat("yyyy-MM-dd");

    /**
     *
     */
    protected static final String PARTYID_TYPE = "urn:x12.org:IO5:01";

    /**
     *
     */
    protected final AtomicInteger sequence = new AtomicInteger(0);

    /**
     *
     * @param <P>
     * @param port
     * @param endpoint
     * @return
     */
    @SuppressWarnings("unchecked")
    protected <P> P portAddContext(P port, String endpoint) {
        BindingProvider bp = (BindingProvider) port;
        bp.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, endpoint);
        return (P) bp;
    }

    /**
     *
     * @param token
     * @return
     */
    protected Holder<Security> generateSecurity(String token) {
        Security security = new Security();
        security.setBinarySecurityToken(token);
        return new Holder<Security>(security);
    }

    protected BigDecimal safeStringToBigDecimal(String decimal) {
        try {
            return decimal == null ? null : new BigDecimal(decimal);
        } catch (NumberFormatException e) {

            return null;
        }
    }

    protected <R extends SabreResponse> R generateErrorResponse(R response, String ... error) {
        response.setError(true);
        response.setStatus(CompletionCodes.UNKNOWN.value());
        response.setErrorDescription(Arrays.asList(error));
        return response;
    }

    /**
     *
     * @param <R>
     * @param response
     * @param appResults
     * @return
     */
    protected <R extends SabreResponse> R generateErrorResponse(R response, ApplicationResults appResults) {
        response.setError(true);
        if (appResults == null) {
            response.setStatus(CompletionCodes.UNKNOWN.value());
            response.setErrorDescription(Collections.singletonList(CompletionCodes.UNKNOWN.value() + " - NULL POINTER"));
            return response;
        }
        if (null != appResults.getStatus()) {
            response.setStatus(appResults.getStatus().value());
        }
        List<String> errors = new ArrayList<String>();
        if (null != appResults.getError()) {
            for (ProblemInformation p : appResults.getError()) {
                for (SystemSpecificResults sr : p.getSystemSpecificResults()) {
                    for (MessageCondition mc : sr.getMessage()) {
                        errors.add("TYPE: " + p.getType().value() + " - CODE: " + mc.getCode() + " - ERROR: " + mc.getValue());
                    }
                }
            }
        }
        response.setErrorDescription(errors);
        return response;
    }

    protected SimpleDateFormat getSabreDateFormatNoYearNoSecond() {
        return sabreDateFormatNoYearNoSecond;
    }

    protected SimpleDateFormat getSabreDateFormatNoSecond() {
        return sabreDateFormatNoSecond;
    }

    protected SimpleDateFormat getSabreDateFormat() {
        return sabreDateFormat;
    }

    protected SimpleDateFormat getSabreDateFormatFull() {
        return sabreDateFormatFull;
    }

    protected SimpleDateFormat getSabreDateFormatNatural() {
        return sabreDateFormatNatural;
    }

    protected SimpleDateFormat getSabreDateFormatYearMonthDay() {
        return sabreDateFormatYearMonthDay;
    }
    
    protected boolean nullObjects(Object... objs) {
        for (Object o : objs) {
            if (o == null) {
                return true;
            }
        }
        return false;
    }

    /**
     *
     * @param senderCompanyDomain
     * @param endpointURL
     * @param IPCC
     * @param version
     * @param action
     * @return
     */
    protected Holder<MessageHeader> generateMessageHeader(String senderCompanyDomain, URL endpointURL, String IPCC, String version, String action) {
        MessageHeader messageHeader = new MessageHeader();
        From from = new From();
        PartyId fromPartyId = new PartyId();
        fromPartyId.setType(PARTYID_TYPE);
        fromPartyId.setValue(senderCompanyDomain);
        from.setPartyId(Collections.singletonList(fromPartyId));
        To to = new To();
        PartyId toPartyId = new PartyId();
        toPartyId.setValue(endpointURL.getHost());
        toPartyId.setType(PARTYID_TYPE);
        to.setPartyId(Collections.singletonList(toPartyId));
        MessageData messageData = new MessageData();
        messageData.setMessageId(this.sequence.incrementAndGet() + "-" + System.currentTimeMillis() + "@" + senderCompanyDomain);
        messageData.setTimestamp(getSabreDateFormat().format(new Date()));//2003-12-09T11:15:12Z
        messageHeader.setConversationId(this.sequence.incrementAndGet() + "-" + System.currentTimeMillis() + "@" + senderCompanyDomain);
        messageHeader.setFrom(from);
        messageHeader.setTo(to);
        messageHeader.setAction(action);
        messageHeader.setCPAId(IPCC);
        messageHeader.setMessageData(messageData);
        messageHeader.setVersion(version);
        return new Holder<MessageHeader>(messageHeader);
    }

}
