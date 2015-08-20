
package com.sabre.services.stl.v01;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.sabre.services.stl.v01 package. 
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

    private final static QName _ProblemInformation_QNAME = new QName("http://services.sabre.com/STL/v01", "ProblemInformation");
    private final static QName _ApplicationResults_QNAME = new QName("http://services.sabre.com/STL/v01", "ApplicationResults");
    private final static QName _Results_QNAME = new QName("http://services.sabre.com/STL/v01", "Results");
    private final static QName _STLPayload_QNAME = new QName("http://services.sabre.com/STL/v01", "STL_Payload");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.sabre.services.stl.v01
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ApplicationResults }
     * 
     */
    public ApplicationResults createApplicationResults() {
        return new ApplicationResults();
    }

    /**
     * Create an instance of {@link Results }
     * 
     */
    public Results createResults() {
        return new Results();
    }

    /**
     * Create an instance of {@link ProblemInformation }
     * 
     */
    public ProblemInformation createProblemInformation() {
        return new ProblemInformation();
    }

    /**
     * Create an instance of {@link STLPayload }
     * 
     */
    public STLPayload createSTLPayload() {
        return new STLPayload();
    }

    /**
     * Create an instance of {@link SystemSpecificResults }
     * 
     */
    public SystemSpecificResults createSystemSpecificResults() {
        return new SystemSpecificResults();
    }

    /**
     * Create an instance of {@link HostCommand }
     * 
     */
    public HostCommand createHostCommand() {
        return new HostCommand();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProblemInformation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.sabre.com/STL/v01", name = "ProblemInformation")
    public JAXBElement<ProblemInformation> createProblemInformation(ProblemInformation value) {
        return new JAXBElement<ProblemInformation>(_ProblemInformation_QNAME, ProblemInformation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApplicationResults }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.sabre.com/STL/v01", name = "ApplicationResults", substitutionHeadNamespace = "http://services.sabre.com/STL/v01", substitutionHeadName = "Results")
    public JAXBElement<ApplicationResults> createApplicationResults(ApplicationResults value) {
        return new JAXBElement<ApplicationResults>(_ApplicationResults_QNAME, ApplicationResults.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Results }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.sabre.com/STL/v01", name = "Results")
    public JAXBElement<Results> createResults(Results value) {
        return new JAXBElement<Results>(_Results_QNAME, Results.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link STLPayload }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.sabre.com/STL/v01", name = "STL_Payload")
    public JAXBElement<STLPayload> createSTLPayload(STLPayload value) {
        return new JAXBElement<STLPayload>(_STLPayload_QNAME, STLPayload.class, null, value);
    }

}
