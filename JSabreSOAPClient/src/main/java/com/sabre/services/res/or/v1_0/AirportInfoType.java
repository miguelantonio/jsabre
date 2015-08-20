
package com.sabre.services.res.or.v1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AirportInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AirportInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Airline" type="{http://services.sabre.com/res/or/v1_0}AirlineType" minOccurs="0"/>
 *         &lt;element name="AirportName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LocationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Terminal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Gate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AirportInfoType", propOrder = {
    "airline",
    "airportName",
    "locationCode",
    "terminal",
    "gate"
})
public class AirportInfoType {

    @XmlElement(name = "Airline")
    protected AirlineType airline;
    @XmlElement(name = "AirportName")
    protected String airportName;
    @XmlElement(name = "LocationCode")
    protected String locationCode;
    @XmlElement(name = "Terminal")
    protected String terminal;
    @XmlElement(name = "Gate")
    protected String gate;

    /**
     * Gets the value of the airline property.
     * 
     * @return
     *     possible object is
     *     {@link AirlineType }
     *     
     */
    public AirlineType getAirline() {
        return airline;
    }

    /**
     * Sets the value of the airline property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirlineType }
     *     
     */
    public void setAirline(AirlineType value) {
        this.airline = value;
    }

    /**
     * Gets the value of the airportName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirportName() {
        return airportName;
    }

    /**
     * Sets the value of the airportName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirportName(String value) {
        this.airportName = value;
    }

    /**
     * Gets the value of the locationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationCode() {
        return locationCode;
    }

    /**
     * Sets the value of the locationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationCode(String value) {
        this.locationCode = value;
    }

    /**
     * Gets the value of the terminal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerminal() {
        return terminal;
    }

    /**
     * Sets the value of the terminal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerminal(String value) {
        this.terminal = value;
    }

    /**
     * Gets the value of the gate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGate() {
        return gate;
    }

    /**
     * Sets the value of the gate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGate(String value) {
        this.gate = value;
    }

}
