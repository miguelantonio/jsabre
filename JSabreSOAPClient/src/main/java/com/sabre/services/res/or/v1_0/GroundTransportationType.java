
package com.sabre.services.res.or.v1_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GroundTransportationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GroundTransportationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StatusCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Vendor" type="{http://services.sabre.com/res/or/v1_0}CompanyType" minOccurs="0"/>
 *         &lt;element name="Service" type="{http://services.sabre.com/res/or/v1_0}ServiceType" minOccurs="0"/>
 *         &lt;element name="ServiceProvider" type="{http://services.sabre.com/res/or/v1_0}ServiceProviderType" minOccurs="0"/>
 *         &lt;element name="StartDetails" type="{http://services.sabre.com/res/or/v1_0}LocationDetailsType" minOccurs="0"/>
 *         &lt;element name="StopDetails" type="{http://services.sabre.com/res/or/v1_0}LocationDetailsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="EndDetails" type="{http://services.sabre.com/res/or/v1_0}LocationDetailsType" minOccurs="0"/>
 *         &lt;element name="ExternalReservation" type="{http://services.sabre.com/res/or/v1_0}ExternalReservationType" minOccurs="0"/>
 *         &lt;element name="Restrictions" type="{http://services.sabre.com/res/or/v1_0}RestrictionsType" minOccurs="0"/>
 *         &lt;element name="POS" type="{http://services.sabre.com/res/or/v1_0}POSType"/>
 *         &lt;element name="AgentLoyalty" type="{http://services.sabre.com/res/or/v1_0}LoyaltyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Passenger" type="{http://services.sabre.com/res/or/v1_0}PassengerType" maxOccurs="99" minOccurs="0"/>
 *         &lt;element name="RateQualifier" type="{http://services.sabre.com/res/or/v1_0}RateQualifierType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Charges" type="{http://services.sabre.com/res/or/v1_0}ChargesType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GroundTransportationType", propOrder = {
    "statusCode",
    "vendor",
    "service",
    "serviceProvider",
    "startDetails",
    "stopDetails",
    "endDetails",
    "externalReservation",
    "restrictions",
    "pos",
    "agentLoyalty",
    "passenger",
    "rateQualifier",
    "charges"
})
public class GroundTransportationType {

    @XmlElement(name = "StatusCode")
    protected String statusCode;
    @XmlElement(name = "Vendor")
    protected CompanyType vendor;
    @XmlElement(name = "Service")
    protected ServiceType service;
    @XmlElement(name = "ServiceProvider")
    protected ServiceProviderType serviceProvider;
    @XmlElement(name = "StartDetails")
    protected LocationDetailsType startDetails;
    @XmlElement(name = "StopDetails")
    protected List<LocationDetailsType> stopDetails;
    @XmlElement(name = "EndDetails")
    protected LocationDetailsType endDetails;
    @XmlElement(name = "ExternalReservation")
    protected ExternalReservationType externalReservation;
    @XmlElement(name = "Restrictions")
    protected RestrictionsType restrictions;
    @XmlElement(name = "POS", required = true)
    protected POSType pos;
    @XmlElement(name = "AgentLoyalty")
    protected List<LoyaltyType> agentLoyalty;
    @XmlElement(name = "Passenger")
    protected List<PassengerType> passenger;
    @XmlElement(name = "RateQualifier")
    protected List<RateQualifierType> rateQualifier;
    @XmlElement(name = "Charges")
    protected ChargesType charges;

    /**
     * Gets the value of the statusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusCode() {
        return statusCode;
    }

    /**
     * Sets the value of the statusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusCode(String value) {
        this.statusCode = value;
    }

    /**
     * Gets the value of the vendor property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyType }
     *     
     */
    public CompanyType getVendor() {
        return vendor;
    }

    /**
     * Sets the value of the vendor property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyType }
     *     
     */
    public void setVendor(CompanyType value) {
        this.vendor = value;
    }

    /**
     * Gets the value of the service property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceType }
     *     
     */
    public ServiceType getService() {
        return service;
    }

    /**
     * Sets the value of the service property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceType }
     *     
     */
    public void setService(ServiceType value) {
        this.service = value;
    }

    /**
     * Gets the value of the serviceProvider property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceProviderType }
     *     
     */
    public ServiceProviderType getServiceProvider() {
        return serviceProvider;
    }

    /**
     * Sets the value of the serviceProvider property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceProviderType }
     *     
     */
    public void setServiceProvider(ServiceProviderType value) {
        this.serviceProvider = value;
    }

    /**
     * Gets the value of the startDetails property.
     * 
     * @return
     *     possible object is
     *     {@link LocationDetailsType }
     *     
     */
    public LocationDetailsType getStartDetails() {
        return startDetails;
    }

    /**
     * Sets the value of the startDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationDetailsType }
     *     
     */
    public void setStartDetails(LocationDetailsType value) {
        this.startDetails = value;
    }

    /**
     * Gets the value of the stopDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stopDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStopDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LocationDetailsType }
     * 
     * 
     */
    public List<LocationDetailsType> getStopDetails() {
        if (stopDetails == null) {
            stopDetails = new ArrayList<LocationDetailsType>();
        }
        return this.stopDetails;
    }

    /**
     * Gets the value of the endDetails property.
     * 
     * @return
     *     possible object is
     *     {@link LocationDetailsType }
     *     
     */
    public LocationDetailsType getEndDetails() {
        return endDetails;
    }

    /**
     * Sets the value of the endDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationDetailsType }
     *     
     */
    public void setEndDetails(LocationDetailsType value) {
        this.endDetails = value;
    }

    /**
     * Gets the value of the externalReservation property.
     * 
     * @return
     *     possible object is
     *     {@link ExternalReservationType }
     *     
     */
    public ExternalReservationType getExternalReservation() {
        return externalReservation;
    }

    /**
     * Sets the value of the externalReservation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExternalReservationType }
     *     
     */
    public void setExternalReservation(ExternalReservationType value) {
        this.externalReservation = value;
    }

    /**
     * Gets the value of the restrictions property.
     * 
     * @return
     *     possible object is
     *     {@link RestrictionsType }
     *     
     */
    public RestrictionsType getRestrictions() {
        return restrictions;
    }

    /**
     * Sets the value of the restrictions property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictionsType }
     *     
     */
    public void setRestrictions(RestrictionsType value) {
        this.restrictions = value;
    }

    /**
     * Gets the value of the pos property.
     * 
     * @return
     *     possible object is
     *     {@link POSType }
     *     
     */
    public POSType getPOS() {
        return pos;
    }

    /**
     * Sets the value of the pos property.
     * 
     * @param value
     *     allowed object is
     *     {@link POSType }
     *     
     */
    public void setPOS(POSType value) {
        this.pos = value;
    }

    /**
     * Gets the value of the agentLoyalty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the agentLoyalty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAgentLoyalty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LoyaltyType }
     * 
     * 
     */
    public List<LoyaltyType> getAgentLoyalty() {
        if (agentLoyalty == null) {
            agentLoyalty = new ArrayList<LoyaltyType>();
        }
        return this.agentLoyalty;
    }

    /**
     * Gets the value of the passenger property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the passenger property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPassenger().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PassengerType }
     * 
     * 
     */
    public List<PassengerType> getPassenger() {
        if (passenger == null) {
            passenger = new ArrayList<PassengerType>();
        }
        return this.passenger;
    }

    /**
     * Gets the value of the rateQualifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rateQualifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRateQualifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RateQualifierType }
     * 
     * 
     */
    public List<RateQualifierType> getRateQualifier() {
        if (rateQualifier == null) {
            rateQualifier = new ArrayList<RateQualifierType>();
        }
        return this.rateQualifier;
    }

    /**
     * Gets the value of the charges property.
     * 
     * @return
     *     possible object is
     *     {@link ChargesType }
     *     
     */
    public ChargesType getCharges() {
        return charges;
    }

    /**
     * Sets the value of the charges property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChargesType }
     *     
     */
    public void setCharges(ChargesType value) {
        this.charges = value;
    }

}
