
package org.opentravel.ota._2002._11;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.opentravel.ota._2002._11 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    private final static QName _SessionValidateRS_QNAME = new QName("http://www.opentravel.org/OTA/2002/11", "SessionValidateRS");
    private final static QName _SessionValidateRQ_QNAME = new QName("http://www.opentravel.org/OTA/2002/11", "SessionValidateRQ");

    
    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.opentravel.ota._2002._11
     * 
     */
    public ObjectFactory() {
    }
    
    
    /**
     * Create an instance of {@link SessionCreateRS }
     * 
     */
    public SessionCreateRS createSessionCreateRS() {
        return new SessionCreateRS();
    }

    /**
     * Create an instance of {@link SessionCreateRQ }
     * 
     */
    public SessionCreateRQ createSessionCreateRQ() {
        return new SessionCreateRQ();
    }

    /**
     * Create an instance of {@link SessionCreateRQ.POS }
     * 
     */
    public SessionCreateRQ.POS createSessionCreateRQPOS() {
        return new SessionCreateRQ.POS();
    }

    /**
     * Create an instance of {@link SessionCreateRS.Errors }
     * 
     */
    public SessionCreateRS.Errors createSessionCreateRSErrors() {
        return new SessionCreateRS.Errors();
    }

    /**
     * Create an instance of {@link SessionCreateRS.Errors.Error }
     * 
     */
    public SessionCreateRS.Errors.Error createSessionCreateRSErrorsError() {
        return new SessionCreateRS.Errors.Error();
    }

    /**
     * Create an instance of {@link SessionCreateRS.Warnings }
     * 
     */
    public SessionCreateRS.Warnings createSessionCreateRSWarnings() {
        return new SessionCreateRS.Warnings();
    }

    /**
     * Create an instance of {@link SessionCreateRS.Success }
     * 
     */
    public SessionCreateRS.Success createSessionCreateRSSuccess() {
        return new SessionCreateRS.Success();
    }

    /**
     * Create an instance of {@link SessionCreateRQ.POS.Source }
     * 
     */
    public SessionCreateRQ.POS.Source createSessionCreateRQPOSSource() {
        return new SessionCreateRQ.POS.Source();
    }

    /**
     * Create an instance of {@link SessionCreateRS.Errors.Error.ErrorInfo }
     * 
     */
    public SessionCreateRS.Errors.Error.ErrorInfo createSessionCreateRSErrorsErrorErrorInfo() {
        return new SessionCreateRS.Errors.Error.ErrorInfo();
    }

    /**
     * Create an instance of {@link SessionCreateRS.Warnings.Warning }
     * 
     */
    public SessionCreateRS.Warnings.Warning createSessionCreateRSWarningsWarning() {
        return new SessionCreateRS.Warnings.Warning();
    }


    /**
     * Create an instance of {@link SessionCloseRS }
     * 
     */
    public SessionCloseRS createSessionCloseRS() {
        return new SessionCloseRS();
    }

    /**
     * Create an instance of {@link SessionCloseRQ }
     * 
     */
    public SessionCloseRQ createSessionCloseRQ() {
        return new SessionCloseRQ();
    }

    /**
     * Create an instance of {@link SessionCloseRQ.POS }
     * 
     */
    public SessionCloseRQ.POS createSessionCloseRQPOS() {
        return new SessionCloseRQ.POS();
    }

    /**
     * Create an instance of {@link SessionCloseRS.Errors }
     * 
     */
    public SessionCloseRS.Errors createSessionCloseRSErrors() {
        return new SessionCloseRS.Errors();
    }

    /**
     * Create an instance of {@link SessionCloseRS.Errors.Error }
     * 
     */
    public SessionCloseRS.Errors.Error createSessionCloseRSErrorsError() {
        return new SessionCloseRS.Errors.Error();
    }

    /**
     * Create an instance of {@link SessionCloseRS.Warnings }
     * 
     */
    public SessionCloseRS.Warnings createSessionCloseRSWarnings() {
        return new SessionCloseRS.Warnings();
    }

    /**
     * Create an instance of {@link SessionCloseRS.Success }
     * 
     */
    public SessionCloseRS.Success createSessionCloseRSSuccess() {
        return new SessionCloseRS.Success();
    }

    /**
     * Create an instance of {@link SessionCloseRQ.POS.Source }
     * 
     */
    public SessionCloseRQ.POS.Source createSessionCloseRQPOSSource() {
        return new SessionCloseRQ.POS.Source();
    }

    /**
     * Create an instance of {@link SessionCloseRS.Errors.Error.ErrorInfo }
     * 
     */
    public SessionCloseRS.Errors.Error.ErrorInfo createSessionCloseRSErrorsErrorErrorInfo() {
        return new SessionCloseRS.Errors.Error.ErrorInfo();
    }

    /**
     * Create an instance of {@link SessionCloseRS.Warnings.Warning }
     * 
     */
    public SessionCloseRS.Warnings.Warning createSessionCloseRSWarningsWarning() {
        return new SessionCloseRS.Warnings.Warning();
    }
    
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2002/11", name = "SessionValidateRS")
    public JAXBElement<Object> createSessionValidateRS(Object value) {
        return new JAXBElement<Object>(_SessionValidateRS_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2002/11", name = "SessionValidateRQ")
    public JAXBElement<Object> createSessionValidateRQ(Object value) {
        return new JAXBElement<Object>(_SessionValidateRQ_QNAME, Object.class, null, value);
    }


}
