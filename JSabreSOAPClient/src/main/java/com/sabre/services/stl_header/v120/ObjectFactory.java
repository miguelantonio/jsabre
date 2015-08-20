
package com.sabre.services.stl_header.v120;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.sabre.services.stl_header.v120 package. 
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

    private final static QName _ResultSummary_QNAME = new QName("http://services.sabre.com/STL_Header/v120", "ResultSummary");
    private final static QName _Service_QNAME = new QName("http://services.sabre.com/STL_Header/v120", "Service");
    private final static QName _Identification_QNAME = new QName("http://services.sabre.com/STL_Header/v120", "Identification");
    private final static QName _Diagnostics_QNAME = new QName("http://services.sabre.com/STL_Header/v120", "Diagnostics");
    private final static QName _SabreHeader_QNAME = new QName("http://services.sabre.com/STL_Header/v120", "SabreHeader");
    private final static QName _Traces_QNAME = new QName("http://services.sabre.com/STL_Header/v120", "Traces");
    private final static QName _Security_QNAME = new QName("http://services.sabre.com/STL_Header/v120", "Security");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.sabre.services.stl_header.v120
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Diagnostics }
     * 
     */
    public Diagnostics createDiagnostics() {
        return new Diagnostics();
    }

    /**
     * Create an instance of {@link Traces }
     * 
     */
    public Traces createTraces() {
        return new Traces();
    }

    /**
     * Create an instance of {@link SabreHeader }
     * 
     */
    public SabreHeader createSabreHeader() {
        return new SabreHeader();
    }

    /**
     * Create an instance of {@link ResultSummary }
     * 
     */
    public ResultSummary createResultSummary() {
        return new ResultSummary();
    }

    /**
     * Create an instance of {@link Service }
     * 
     */
    public Service createService() {
        return new Service();
    }

    /**
     * Create an instance of {@link Identification }
     * 
     */
    public Identification createIdentification() {
        return new Identification();
    }

    /**
     * Create an instance of {@link Security }
     * 
     */
    public Security createSecurity() {
        return new Security();
    }

    /**
     * Create an instance of {@link MessageCondition }
     * 
     */
    public MessageCondition createMessageCondition() {
        return new MessageCondition();
    }

    /**
     * Create an instance of {@link TrackingID }
     * 
     */
    public TrackingID createTrackingID() {
        return new TrackingID();
    }

    /**
     * Create an instance of {@link ProblemSummary }
     * 
     */
    public ProblemSummary createProblemSummary() {
        return new ProblemSummary();
    }

    /**
     * Create an instance of {@link TraceRecord }
     * 
     */
    public TraceRecord createTraceRecord() {
        return new TraceRecord();
    }

    /**
     * Create an instance of {@link ProblemBase }
     * 
     */
    public ProblemBase createProblemBase() {
        return new ProblemBase();
    }

    /**
     * Create an instance of {@link DiagnosticResults }
     * 
     */
    public DiagnosticResults createDiagnosticResults() {
        return new DiagnosticResults();
    }

    /**
     * Create an instance of {@link IdentifierSystem }
     * 
     */
    public IdentifierSystem createIdentifierSystem() {
        return new IdentifierSystem();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResultSummary }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.sabre.com/STL_Header/v120", name = "ResultSummary")
    public JAXBElement<ResultSummary> createResultSummary(ResultSummary value) {
        return new JAXBElement<ResultSummary>(_ResultSummary_QNAME, ResultSummary.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Service }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.sabre.com/STL_Header/v120", name = "Service")
    public JAXBElement<Service> createService(Service value) {
        return new JAXBElement<Service>(_Service_QNAME, Service.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Identification }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.sabre.com/STL_Header/v120", name = "Identification")
    public JAXBElement<Identification> createIdentification(Identification value) {
        return new JAXBElement<Identification>(_Identification_QNAME, Identification.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Diagnostics }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.sabre.com/STL_Header/v120", name = "Diagnostics")
    public JAXBElement<Diagnostics> createDiagnostics(Diagnostics value) {
        return new JAXBElement<Diagnostics>(_Diagnostics_QNAME, Diagnostics.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SabreHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.sabre.com/STL_Header/v120", name = "SabreHeader")
    public JAXBElement<SabreHeader> createSabreHeader(SabreHeader value) {
        return new JAXBElement<SabreHeader>(_SabreHeader_QNAME, SabreHeader.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Traces }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.sabre.com/STL_Header/v120", name = "Traces")
    public JAXBElement<Traces> createTraces(Traces value) {
        return new JAXBElement<Traces>(_Traces_QNAME, Traces.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Security }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.sabre.com/STL_Header/v120", name = "Security")
    public JAXBElement<Security> createSecurity(Security value) {
        return new JAXBElement<Security>(_Security_QNAME, Security.class, null, value);
    }

}
