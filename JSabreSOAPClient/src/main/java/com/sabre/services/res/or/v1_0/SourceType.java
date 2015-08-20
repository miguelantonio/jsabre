
package com.sabre.services.res.or.v1_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Provides information on the source of a request.
 * 				This is from the OTA xsd.
 * 			
 * 
 * <p>Java class for SourceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SourceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RequestorID" type="{http://services.sabre.com/res/or/v1_0}RequestorIDType" minOccurs="0"/>
 *         &lt;element name="BookingChannel" type="{http://services.sabre.com/res/or/v1_0}BookingChannelType" minOccurs="0"/>
 *         &lt;element name="TTYRecordLocator" type="{http://services.sabre.com/res/or/v1_0}TTYRecordLocatorType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="OAC" type="{http://services.sabre.com/res/or/v1_0}OACType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="BookingSource" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="AgentSine" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="PseudoCityCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ISOCountry" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ISOCurrency" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="AgentDutyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="AirlineVendorID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="AirportCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="FirstDepartPoint" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="SourceSystem" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="TerminalID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SourceType", propOrder = {
    "requestorID",
    "bookingChannel",
    "ttyRecordLocator",
    "oac"
})
public class SourceType {

    @XmlElement(name = "RequestorID")
    protected RequestorIDType requestorID;
    @XmlElement(name = "BookingChannel")
    protected BookingChannelType bookingChannel;
    @XmlElement(name = "TTYRecordLocator")
    protected List<TTYRecordLocatorType> ttyRecordLocator;
    @XmlElement(name = "OAC")
    protected OACType oac;
    @XmlAttribute(name = "BookingSource")
    protected String bookingSource;
    @XmlAttribute(name = "AgentSine")
    protected String agentSine;
    @XmlAttribute(name = "PseudoCityCode")
    protected String pseudoCityCode;
    @XmlAttribute(name = "ISOCountry")
    protected String isoCountry;
    @XmlAttribute(name = "ISOCurrency")
    protected String isoCurrency;
    @XmlAttribute(name = "AgentDutyCode")
    protected String agentDutyCode;
    @XmlAttribute(name = "AirlineVendorID")
    protected String airlineVendorID;
    @XmlAttribute(name = "AirportCode")
    protected String airportCode;
    @XmlAttribute(name = "FirstDepartPoint")
    protected String firstDepartPoint;
    @XmlAttribute(name = "SourceSystem")
    protected String sourceSystem;
    @XmlAttribute(name = "TerminalID")
    protected String terminalID;

    /**
     * Gets the value of the requestorID property.
     * 
     * @return
     *     possible object is
     *     {@link RequestorIDType }
     *     
     */
    public RequestorIDType getRequestorID() {
        return requestorID;
    }

    /**
     * Sets the value of the requestorID property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestorIDType }
     *     
     */
    public void setRequestorID(RequestorIDType value) {
        this.requestorID = value;
    }

    /**
     * Gets the value of the bookingChannel property.
     * 
     * @return
     *     possible object is
     *     {@link BookingChannelType }
     *     
     */
    public BookingChannelType getBookingChannel() {
        return bookingChannel;
    }

    /**
     * Sets the value of the bookingChannel property.
     * 
     * @param value
     *     allowed object is
     *     {@link BookingChannelType }
     *     
     */
    public void setBookingChannel(BookingChannelType value) {
        this.bookingChannel = value;
    }

    /**
     * Gets the value of the ttyRecordLocator property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ttyRecordLocator property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTTYRecordLocator().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TTYRecordLocatorType }
     * 
     * 
     */
    public List<TTYRecordLocatorType> getTTYRecordLocator() {
        if (ttyRecordLocator == null) {
            ttyRecordLocator = new ArrayList<TTYRecordLocatorType>();
        }
        return this.ttyRecordLocator;
    }

    /**
     * Gets the value of the oac property.
     * 
     * @return
     *     possible object is
     *     {@link OACType }
     *     
     */
    public OACType getOAC() {
        return oac;
    }

    /**
     * Sets the value of the oac property.
     * 
     * @param value
     *     allowed object is
     *     {@link OACType }
     *     
     */
    public void setOAC(OACType value) {
        this.oac = value;
    }

    /**
     * Gets the value of the bookingSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookingSource() {
        return bookingSource;
    }

    /**
     * Sets the value of the bookingSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookingSource(String value) {
        this.bookingSource = value;
    }

    /**
     * Gets the value of the agentSine property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgentSine() {
        return agentSine;
    }

    /**
     * Sets the value of the agentSine property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgentSine(String value) {
        this.agentSine = value;
    }

    /**
     * Gets the value of the pseudoCityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPseudoCityCode() {
        return pseudoCityCode;
    }

    /**
     * Sets the value of the pseudoCityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPseudoCityCode(String value) {
        this.pseudoCityCode = value;
    }

    /**
     * Gets the value of the isoCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISOCountry() {
        return isoCountry;
    }

    /**
     * Sets the value of the isoCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISOCountry(String value) {
        this.isoCountry = value;
    }

    /**
     * Gets the value of the isoCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISOCurrency() {
        return isoCurrency;
    }

    /**
     * Sets the value of the isoCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISOCurrency(String value) {
        this.isoCurrency = value;
    }

    /**
     * Gets the value of the agentDutyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgentDutyCode() {
        return agentDutyCode;
    }

    /**
     * Sets the value of the agentDutyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgentDutyCode(String value) {
        this.agentDutyCode = value;
    }

    /**
     * Gets the value of the airlineVendorID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirlineVendorID() {
        return airlineVendorID;
    }

    /**
     * Sets the value of the airlineVendorID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirlineVendorID(String value) {
        this.airlineVendorID = value;
    }

    /**
     * Gets the value of the airportCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirportCode() {
        return airportCode;
    }

    /**
     * Sets the value of the airportCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirportCode(String value) {
        this.airportCode = value;
    }

    /**
     * Gets the value of the firstDepartPoint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstDepartPoint() {
        return firstDepartPoint;
    }

    /**
     * Sets the value of the firstDepartPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstDepartPoint(String value) {
        this.firstDepartPoint = value;
    }

    /**
     * Gets the value of the sourceSystem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceSystem() {
        return sourceSystem;
    }

    /**
     * Sets the value of the sourceSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceSystem(String value) {
        this.sourceSystem = value;
    }

    /**
     * Gets the value of the terminalID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerminalID() {
        return terminalID;
    }

    /**
     * Sets the value of the terminalID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerminalID(String value) {
        this.terminalID = value;
    }

}
