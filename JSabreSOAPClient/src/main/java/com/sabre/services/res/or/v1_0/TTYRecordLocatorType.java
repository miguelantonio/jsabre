
package com.sabre.services.res.or.v1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TTYRecordLocatorType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TTYRecordLocatorType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CRSLocator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CRSCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RecordLocator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AgencyId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IataNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AgencyLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UserType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DutyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ERSPUserId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FirstPointOfDeparture" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TTYRecordLocatorType", propOrder = {
    "crsLocator",
    "crsCode",
    "recordLocator",
    "agencyId",
    "iataNumber",
    "agencyLocation",
    "userType",
    "countryCode",
    "currency",
    "dutyCode",
    "erspUserId",
    "firstPointOfDeparture"
})
public class TTYRecordLocatorType {

    @XmlElement(name = "CRSLocator")
    protected String crsLocator;
    @XmlElement(name = "CRSCode")
    protected String crsCode;
    @XmlElement(name = "RecordLocator")
    protected String recordLocator;
    @XmlElement(name = "AgencyId")
    protected String agencyId;
    @XmlElement(name = "IataNumber")
    protected String iataNumber;
    @XmlElement(name = "AgencyLocation")
    protected String agencyLocation;
    @XmlElement(name = "UserType")
    protected String userType;
    @XmlElement(name = "CountryCode")
    protected String countryCode;
    @XmlElement(name = "Currency")
    protected String currency;
    @XmlElement(name = "DutyCode")
    protected String dutyCode;
    @XmlElement(name = "ERSPUserId")
    protected String erspUserId;
    @XmlElement(name = "FirstPointOfDeparture")
    protected String firstPointOfDeparture;

    /**
     * Gets the value of the crsLocator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRSLocator() {
        return crsLocator;
    }

    /**
     * Sets the value of the crsLocator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRSLocator(String value) {
        this.crsLocator = value;
    }

    /**
     * Gets the value of the crsCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRSCode() {
        return crsCode;
    }

    /**
     * Sets the value of the crsCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRSCode(String value) {
        this.crsCode = value;
    }

    /**
     * Gets the value of the recordLocator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecordLocator() {
        return recordLocator;
    }

    /**
     * Sets the value of the recordLocator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecordLocator(String value) {
        this.recordLocator = value;
    }

    /**
     * Gets the value of the agencyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgencyId() {
        return agencyId;
    }

    /**
     * Sets the value of the agencyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgencyId(String value) {
        this.agencyId = value;
    }

    /**
     * Gets the value of the iataNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIataNumber() {
        return iataNumber;
    }

    /**
     * Sets the value of the iataNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIataNumber(String value) {
        this.iataNumber = value;
    }

    /**
     * Gets the value of the agencyLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgencyLocation() {
        return agencyLocation;
    }

    /**
     * Sets the value of the agencyLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgencyLocation(String value) {
        this.agencyLocation = value;
    }

    /**
     * Gets the value of the userType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserType() {
        return userType;
    }

    /**
     * Sets the value of the userType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserType(String value) {
        this.userType = value;
    }

    /**
     * Gets the value of the countryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryCode(String value) {
        this.countryCode = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

    /**
     * Gets the value of the dutyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDutyCode() {
        return dutyCode;
    }

    /**
     * Sets the value of the dutyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDutyCode(String value) {
        this.dutyCode = value;
    }

    /**
     * Gets the value of the erspUserId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getERSPUserId() {
        return erspUserId;
    }

    /**
     * Sets the value of the erspUserId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setERSPUserId(String value) {
        this.erspUserId = value;
    }

    /**
     * Gets the value of the firstPointOfDeparture property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstPointOfDeparture() {
        return firstPointOfDeparture;
    }

    /**
     * Sets the value of the firstPointOfDeparture property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstPointOfDeparture(String value) {
        this.firstPointOfDeparture = value;
    }

}
