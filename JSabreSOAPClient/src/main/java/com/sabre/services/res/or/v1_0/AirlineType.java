
package com.sabre.services.res.or.v1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for AirlineType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AirlineType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="flightNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="flightDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="flightType" type="{http://services.sabre.com/res/or/v1_0}FlightDirectionType" />
 *       &lt;attribute name="privateAviation" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AirlineType", propOrder = {
    "value"
})
public class AirlineType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "code")
    protected String code;
    @XmlAttribute(name = "flightNumber")
    protected String flightNumber;
    @XmlAttribute(name = "flightDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar flightDateTime;
    @XmlAttribute(name = "flightType")
    protected FlightDirectionType flightType;
    @XmlAttribute(name = "privateAviation")
    protected Boolean privateAviation;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the flightNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlightNumber() {
        return flightNumber;
    }

    /**
     * Sets the value of the flightNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlightNumber(String value) {
        this.flightNumber = value;
    }

    /**
     * Gets the value of the flightDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFlightDateTime() {
        return flightDateTime;
    }

    /**
     * Sets the value of the flightDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFlightDateTime(XMLGregorianCalendar value) {
        this.flightDateTime = value;
    }

    /**
     * Gets the value of the flightType property.
     * 
     * @return
     *     possible object is
     *     {@link FlightDirectionType }
     *     
     */
    public FlightDirectionType getFlightType() {
        return flightType;
    }

    /**
     * Sets the value of the flightType property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightDirectionType }
     *     
     */
    public void setFlightType(FlightDirectionType value) {
        this.flightType = value;
    }

    /**
     * Gets the value of the privateAviation property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrivateAviation() {
        return privateAviation;
    }

    /**
     * Sets the value of the privateAviation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrivateAviation(Boolean value) {
        this.privateAviation = value;
    }

}
