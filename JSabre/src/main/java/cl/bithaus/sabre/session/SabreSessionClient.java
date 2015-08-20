package cl.bithaus.sabre.session;

import cl.bithaus.sabre.AbstractSabreClient;
import cl.bithaus.sabre.exceptions.SabreInternalException;
import https.webservices_sabre_com.websvc.SessionClosePortType;
import https.webservices_sabre_com.websvc.SessionCloseRQService;
import https.webservices_sabre_com.websvc.SessionCreatePortType;
import https.webservices_sabre_com.websvc.SessionCreateRQService;
import https.webservices_sabre_com.websvc.SessionValidatePortType;
import https.webservices_sabre_com.websvc.SessionValidateRQService;

import java.net.URL;
import java.util.Collections;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.xml.ws.handler.Handler;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Holder;
import javax.xml.ws.soap.SOAPFaultException;
import org.ebxml.namespaces.messageheader.From;
import org.ebxml.namespaces.messageheader.MessageData;
import org.ebxml.namespaces.messageheader.MessageHeader;
import org.ebxml.namespaces.messageheader.PartyId;
import org.ebxml.namespaces.messageheader.Service;
import org.ebxml.namespaces.messageheader.To;
import org.opentravel.ota._2002._11.SessionCloseRQ;
import org.opentravel.ota._2002._11.SessionCreateRQ;
import org.opentravel.ota._2002._11.SessionCreateRS;

/**
 *
 * @author Miguel A. Fuentes Buchholtz
 * @email miguel@variacode.com
 */
public class SabreSessionClient extends AbstractSabreClient {

    private final String senderCompanyDomain;
    private final String IPCC;
    private final String username;
    private final String password;
    private final URL endpointURL;

    private final SessionCloseRQService sessionCloseService = new SessionCloseRQService();
    private final SessionClosePortType sessionClosePort;

    private final SessionValidateRQService sessionValidateService = new SessionValidateRQService();
    private final SessionValidatePortType sessionValidatePort;

    private final SessionCreateRQService sessionCreateService = new SessionCreateRQService();
    private final SessionCreatePortType sessionCreatePort;

    /**
     *
     * @param endpointURL
     * @param senderCompanyDomain
     * @param IPCC
     * @param username
     * @param password
     */
    public SabreSessionClient(URL endpointURL, String senderCompanyDomain, String IPCC, String username, String password) {
        this.endpointURL = endpointURL;
        this.senderCompanyDomain = senderCompanyDomain;
        this.IPCC = IPCC;
        this.username = username;
        this.password = password;
        this.sessionCreatePort = portAddContext(sessionCreateService.getSessionCreatePortType(), endpointURL.toString());
        this.sessionValidatePort = portAddContext(sessionValidateService.getSessionValidatePortType(), endpointURL.toString());
        this.sessionClosePort = portAddContext(sessionCloseService.getSessionClosePortType(), endpointURL.toString());
    }

    /**
     *
     * @param token
     * @return
     */
    @SuppressWarnings("rawtypes")
    public String sessionCloseToken(String token) {
        MessageHeader messageHeader = new MessageHeader();
        From from = new From();
        PartyId fromPartyId = new PartyId();
        fromPartyId.setType(PARTYID_TYPE);
        fromPartyId.setValue(this.senderCompanyDomain);
        from.setPartyId(Collections.singletonList(fromPartyId));
        To to = new To();
        PartyId toPartyId = new PartyId();
        toPartyId.setValue(this.endpointURL.getHost());
        toPartyId.setType(PARTYID_TYPE);
        to.setPartyId(Collections.singletonList(toPartyId));
        MessageData messageData = new MessageData();
        messageData.setMessageId(this.sequence.incrementAndGet() + "-" + System.currentTimeMillis() + "@" + this.senderCompanyDomain);

        messageData.setTimestamp(getSabreDateFormatFull().format(new Date()));//2003-12-09T11:15:12Z
        messageHeader.setConversationId(this.sequence.incrementAndGet() + "-" + System.currentTimeMillis() + "@" + this.senderCompanyDomain);
        messageHeader.setFrom(from);
        messageHeader.setTo(to);
        messageHeader.setAction("SessionCloseRQ");
        messageHeader.setCPAId(this.IPCC);
        Service service = new Service();
        service.setType("sabreXML");
        service.setValue("Session");
        messageHeader.setService(service);
        messageHeader.setMessageData(messageData);

        org.xmlsoap.schemas.ws._2002._12.secext.Security security = new org.xmlsoap.schemas.ws._2002._12.secext.Security();
        security.setBinarySecurityToken(token);

        SessionCloseRQ sessionCloseRQ = new SessionCloseRQ();
        SessionCloseRQ.POS pos = new SessionCloseRQ.POS();
        SessionCloseRQ.POS.Source source = new SessionCloseRQ.POS.Source();
        source.setPseudoCityCode(this.IPCC);
        pos.setSource(source);
        sessionCloseRQ.setPOS(pos);

        java.util.List<Handler> handlers = ((BindingProvider) this.sessionClosePort).getBinding().getHandlerChain();
        TokenHandler tokenHandler = new TokenHandler();
        handlers.add(tokenHandler);
        ((BindingProvider) this.sessionClosePort).getBinding().setHandlerChain(handlers);

        try {
            @SuppressWarnings("unused")
            Object response = this.sessionClosePort.sessionCloseRQ(new Holder<MessageHeader>(messageHeader), new Holder<org.xmlsoap.schemas.ws._2002._12.secext.Security>(security), sessionCloseRQ);
        } catch (SOAPFaultException e) {
            Logger.getLogger(SabreSessionClient.class.getName()).log(Level.SEVERE, null, new SabreInternalException(e));
        }
        return tokenHandler.getToken();
    }

    /**
     *
     * @param token
     * @return
     */
    @SuppressWarnings("rawtypes")
    public String sessionValidateToken(String token) {
        MessageHeader messageHeader = new MessageHeader();
        From from = new From();
        PartyId fromPartyId = new PartyId();
        fromPartyId.setType(PARTYID_TYPE);
        fromPartyId.setValue(this.senderCompanyDomain);
        from.setPartyId(Collections.singletonList(fromPartyId));
        To to = new To();
        PartyId toPartyId = new PartyId();
        toPartyId.setValue(this.endpointURL.getHost());
        toPartyId.setType(PARTYID_TYPE);
        to.setPartyId(Collections.singletonList(toPartyId));
        MessageData messageData = new MessageData();
        messageData.setMessageId(this.sequence.incrementAndGet() + "-" + System.currentTimeMillis() + "@" + this.senderCompanyDomain);

        messageData.setTimestamp(getSabreDateFormatFull().format(new Date()));//2003-12-09T11:15:12Z
        messageHeader.setConversationId(this.sequence.incrementAndGet() + "-" + System.currentTimeMillis() + "@" + this.senderCompanyDomain);
        messageHeader.setFrom(from);
        messageHeader.setTo(to);
        messageHeader.setAction("SessionValidateRQ");
        messageHeader.setCPAId(this.IPCC);
        Service service = new Service();
        service.setType("sabreXML");
        service.setValue("Session");
        messageHeader.setService(service);
        messageHeader.setMessageData(messageData);

        org.xmlsoap.schemas.ws._2002._12.secext.Security security = new org.xmlsoap.schemas.ws._2002._12.secext.Security();
        security.setBinarySecurityToken(token);

        java.util.List<Handler> handlers = ((BindingProvider) this.sessionValidatePort).getBinding().getHandlerChain();

        TokenHandler tokenHandler = new TokenHandler();
        handlers.add(tokenHandler);
        ((BindingProvider) this.sessionValidatePort).getBinding().setHandlerChain(handlers);

        try {
            @SuppressWarnings("unused")
            Object response = this.sessionValidatePort.sessionValidateRQ(new Holder<MessageHeader>(messageHeader), new Holder<org.xmlsoap.schemas.ws._2002._12.secext.Security>(security), null);
        } catch (SOAPFaultException e) {
            Logger.getLogger(SabreSessionClient.class.getName()).log(Level.SEVERE, null, new SabreInternalException(e));
        }
        return tokenHandler.getToken();
    }

    /**
     *
     * @return
     */
    @SuppressWarnings("rawtypes")
    public String sessionCreateToken() {
        MessageHeader messageHeader = new MessageHeader();
        From from = new From();
        PartyId fromPartyId = new PartyId();
        fromPartyId.setType(PARTYID_TYPE);
        fromPartyId.setValue(this.senderCompanyDomain);
        from.setPartyId(Collections.singletonList(fromPartyId));
        To to = new To();
        PartyId toPartyId = new PartyId();
        toPartyId.setValue(this.endpointURL.getHost());
        toPartyId.setType(PARTYID_TYPE);
        to.setPartyId(Collections.singletonList(toPartyId));
        MessageData messageData = new MessageData();
        messageData.setMessageId(this.sequence.incrementAndGet() + "-" + System.currentTimeMillis() + "@" + this.senderCompanyDomain);

        messageData.setTimestamp(getSabreDateFormatFull().format(new Date()));//2003-12-09T11:15:12Z
        messageHeader.setConversationId(this.sequence.incrementAndGet() + "-" + System.currentTimeMillis() + "@" + this.senderCompanyDomain);
        messageHeader.setFrom(from);
        messageHeader.setTo(to);
        messageHeader.setAction("SessionCreateRQ");
        messageHeader.setCPAId(this.IPCC);
        Service service = new Service();
        service.setType("sabreXML");
        service.setValue("Session");
        messageHeader.setService(service);
        messageHeader.setMessageData(messageData);

        org.xmlsoap.schemas.ws._2002._12.secext.Security security = new org.xmlsoap.schemas.ws._2002._12.secext.Security();
        org.xmlsoap.schemas.ws._2002._12.secext.Security.UsernameToken usernameToken = new org.xmlsoap.schemas.ws._2002._12.secext.Security.UsernameToken();
        usernameToken.setPassword(this.password);
        usernameToken.setUsername(this.username);
        usernameToken.setOrganization(this.IPCC);
        usernameToken.setDomain("DEFAULT");
        security.setUsernameToken(usernameToken);

        SessionCreateRQ sessionCreateRQ = new SessionCreateRQ();
        org.opentravel.ota._2002._11.SessionCreateRQ.POS pos = new org.opentravel.ota._2002._11.SessionCreateRQ.POS();
        org.opentravel.ota._2002._11.SessionCreateRQ.POS.Source source = new org.opentravel.ota._2002._11.SessionCreateRQ.POS.Source();
        source.setPseudoCityCode(this.IPCC);
        pos.setSource(source);
        sessionCreateRQ.setPOS(pos);

        java.util.List<Handler> handlers = ((BindingProvider) sessionCreatePort).getBinding().getHandlerChain();

        TokenHandler tokenHandler = new TokenHandler();
        handlers.add(tokenHandler);
        ((BindingProvider) sessionCreatePort).getBinding().setHandlerChain(handlers);
        try {
            @SuppressWarnings("unused")
            SessionCreateRS response = this.sessionCreatePort.sessionCreateRQ(new Holder<MessageHeader>(messageHeader), new Holder<org.xmlsoap.schemas.ws._2002._12.secext.Security>(security), sessionCreateRQ);
        } catch (SOAPFaultException e) {
            Logger.getLogger(SabreSessionClient.class.getName()).log(Level.SEVERE, null, new SabreInternalException(e));
        }
        return tokenHandler.getToken();
    }

}
