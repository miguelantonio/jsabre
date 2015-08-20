package cl.bithaus.sabre.session;

import java.util.Collections;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;

/**
 *
 * @author Miguel A. Fuentes Buchholtz
 * @email miguel@variacode.com
 */
public class TokenHandler implements SOAPHandler<SOAPMessageContext> {

    private String token = null;

    /**
     *
     * @return
     */
    public String getToken() {
        return token;
    }

    @Override
    public Set<QName> getHeaders() {
        return Collections.EMPTY_SET;
    }

    @Override
    public boolean handleMessage(SOAPMessageContext arg0) {
        SOAPMessage message = arg0.getMessage();
        boolean isOutboundMessage = (Boolean) arg0.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);
        if (!isOutboundMessage) {
            try {
                token = (String) message.getSOAPHeader().getLastChild().getFirstChild().getFirstChild().getNodeValue();
            } catch (SOAPException ex) {
                Logger.getLogger(TokenHandler.class.getName()).log(Level.SEVERE, null, ex);
                token = null;
            }
        }
        return true;
    }

    @Override
    public boolean handleFault(SOAPMessageContext arg0) {
        SOAPMessage message = arg0.getMessage();
        Logger.getLogger(TokenHandler.class.getName()).log(Level.INFO, null, message);
        return false;
    }

    @Override
    public void close(MessageContext context) {
        //empty
    }
}
