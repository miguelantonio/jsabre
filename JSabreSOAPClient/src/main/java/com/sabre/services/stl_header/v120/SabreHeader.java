
package com.sabre.services.stl_header.v120;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SabreHeader complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SabreHeader">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://services.sabre.com/STL_Header/v120}Service"/>
 *         &lt;element ref="{http://services.sabre.com/STL_Header/v120}Identification"/>
 *         &lt;element ref="{http://services.sabre.com/STL_Header/v120}ResultSummary" minOccurs="0"/>
 *         &lt;element ref="{http://services.sabre.com/STL_Header/v120}Security" minOccurs="0"/>
 *         &lt;element ref="{http://services.sabre.com/STL_Header/v120}Traces" minOccurs="0"/>
 *         &lt;element ref="{http://services.sabre.com/STL_Header/v120}Diagnostics" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SabreHeader", propOrder = {
    "service",
    "identification",
    "resultSummary",
    "security",
    "traces",
    "diagnostics"
})
public class SabreHeader {

    @XmlElement(name = "Service", required = true)
    protected Service service;
    @XmlElement(name = "Identification", required = true)
    protected Identification identification;
    @XmlElement(name = "ResultSummary")
    protected ResultSummary resultSummary;
    @XmlElement(name = "Security")
    protected Security security;
    @XmlElement(name = "Traces")
    protected Traces traces;
    @XmlElement(name = "Diagnostics")
    protected Diagnostics diagnostics;

    /**
     * Gets the value of the service property.
     * 
     * @return
     *     possible object is
     *     {@link Service }
     *     
     */
    public Service getService() {
        return service;
    }

    /**
     * Sets the value of the service property.
     * 
     * @param value
     *     allowed object is
     *     {@link Service }
     *     
     */
    public void setService(Service value) {
        this.service = value;
    }

    /**
     * Gets the value of the identification property.
     * 
     * @return
     *     possible object is
     *     {@link Identification }
     *     
     */
    public Identification getIdentification() {
        return identification;
    }

    /**
     * Sets the value of the identification property.
     * 
     * @param value
     *     allowed object is
     *     {@link Identification }
     *     
     */
    public void setIdentification(Identification value) {
        this.identification = value;
    }

    /**
     * Gets the value of the resultSummary property.
     * 
     * @return
     *     possible object is
     *     {@link ResultSummary }
     *     
     */
    public ResultSummary getResultSummary() {
        return resultSummary;
    }

    /**
     * Sets the value of the resultSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultSummary }
     *     
     */
    public void setResultSummary(ResultSummary value) {
        this.resultSummary = value;
    }

    /**
     * Gets the value of the security property.
     * 
     * @return
     *     possible object is
     *     {@link Security }
     *     
     */
    public Security getSecurity() {
        return security;
    }

    /**
     * Sets the value of the security property.
     * 
     * @param value
     *     allowed object is
     *     {@link Security }
     *     
     */
    public void setSecurity(Security value) {
        this.security = value;
    }

    /**
     * Gets the value of the traces property.
     * 
     * @return
     *     possible object is
     *     {@link Traces }
     *     
     */
    public Traces getTraces() {
        return traces;
    }

    /**
     * Sets the value of the traces property.
     * 
     * @param value
     *     allowed object is
     *     {@link Traces }
     *     
     */
    public void setTraces(Traces value) {
        this.traces = value;
    }

    /**
     * Gets the value of the diagnostics property.
     * 
     * @return
     *     possible object is
     *     {@link Diagnostics }
     *     
     */
    public Diagnostics getDiagnostics() {
        return diagnostics;
    }

    /**
     * Sets the value of the diagnostics property.
     * 
     * @param value
     *     allowed object is
     *     {@link Diagnostics }
     *     
     */
    public void setDiagnostics(Diagnostics value) {
        this.diagnostics = value;
    }

}
