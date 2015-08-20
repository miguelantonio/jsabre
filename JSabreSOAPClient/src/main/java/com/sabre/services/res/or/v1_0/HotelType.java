
package com.sabre.services.res.or.v1_0;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HotelType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HotelType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Reservation" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="LineNumber" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                   &lt;element name="LineType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="LineStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="POSRequestorID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="SpecialPrefs" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="RoomType" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="RoomTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="NumberOfUnits" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                             &lt;element name="ShortText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="RoomRates" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="AmountBeforeTax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Override" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="RateAccessCodeBooked" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ClientIdentificationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="RateAccessCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="CategoryTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="GuestCounts" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="GuestCount" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                             &lt;element name="ExtraGuestCount" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element name="RollAwayCount" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element name="CribCount" type="{http://www.w3.org/2001/XMLSchema}integer" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element name="ReserveUnderName" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="TimeSpanStart" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="TimeSpanDuration" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="TimeSpanEnd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Guarantee" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="PaymentCardNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="ChainCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="HotelCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="HotelCityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="HotelName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="AdditionalInformation" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ConfirmationNumber" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="Address" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="AddressLine" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element name="CountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="State" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="ZipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="ContactNumbers" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="PhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element name="FaxNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="CancelPenaltyPolicyCode" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="CustLoyaltyMembershipID" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="IDNumber" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="CorporateIDNumber" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="Commission" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Indicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="PerNight" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="WrittenConfirmation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="SegmentText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="index" type="{http://services.sabre.com/res/or/v1_0}Numeric0to99999" />
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="sequence" type="{http://www.w3.org/2001/XMLSchema}short" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HotelType", propOrder = {
    "reservation",
    "additionalInformation",
    "segmentText"
})
@XmlSeeAlso({
    HotelProductType.class
})
public class HotelType {

    @XmlElement(name = "Reservation")
    protected HotelType.Reservation reservation;
    @XmlElement(name = "AdditionalInformation")
    protected HotelType.AdditionalInformation additionalInformation;
    @XmlElement(name = "SegmentText")
    protected String segmentText;
    @XmlAttribute(name = "index")
    protected Integer index;
    @XmlAttribute(name = "id")
    protected String id;
    @XmlAttribute(name = "sequence")
    protected Short sequence;

    /**
     * Gets the value of the reservation property.
     * 
     * @return
     *     possible object is
     *     {@link HotelType.Reservation }
     *     
     */
    public HotelType.Reservation getReservation() {
        return reservation;
    }

    /**
     * Sets the value of the reservation property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelType.Reservation }
     *     
     */
    public void setReservation(HotelType.Reservation value) {
        this.reservation = value;
    }

    /**
     * Gets the value of the additionalInformation property.
     * 
     * @return
     *     possible object is
     *     {@link HotelType.AdditionalInformation }
     *     
     */
    public HotelType.AdditionalInformation getAdditionalInformation() {
        return additionalInformation;
    }

    /**
     * Sets the value of the additionalInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelType.AdditionalInformation }
     *     
     */
    public void setAdditionalInformation(HotelType.AdditionalInformation value) {
        this.additionalInformation = value;
    }

    /**
     * Gets the value of the segmentText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegmentText() {
        return segmentText;
    }

    /**
     * Sets the value of the segmentText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegmentText(String value) {
        this.segmentText = value;
    }

    /**
     * Gets the value of the index property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIndex() {
        return index;
    }

    /**
     * Sets the value of the index property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIndex(Integer value) {
        this.index = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the sequence property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getSequence() {
        return sequence;
    }

    /**
     * Sets the value of the sequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setSequence(Short value) {
        this.sequence = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="ConfirmationNumber" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="Address" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="AddressLine" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element name="CountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="State" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="ZipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="ContactNumbers" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="PhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element name="FaxNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="CancelPenaltyPolicyCode" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="CustLoyaltyMembershipID" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="IDNumber" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="CorporateIDNumber" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="Commission" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Indicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="PerNight" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="WrittenConfirmation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "confirmationNumber",
        "address",
        "contactNumbers",
        "cancelPenaltyPolicyCode",
        "custLoyaltyMembershipID",
        "idNumber",
        "corporateIDNumber",
        "text",
        "commission",
        "writtenConfirmation"
    })
    public static class AdditionalInformation {

        @XmlElement(name = "ConfirmationNumber")
        protected List<String> confirmationNumber;
        @XmlElement(name = "Address")
        protected HotelType.AdditionalInformation.Address address;
        @XmlElement(name = "ContactNumbers")
        protected HotelType.AdditionalInformation.ContactNumbers contactNumbers;
        @XmlElement(name = "CancelPenaltyPolicyCode")
        protected List<String> cancelPenaltyPolicyCode;
        @XmlElement(name = "CustLoyaltyMembershipID")
        protected List<String> custLoyaltyMembershipID;
        @XmlElement(name = "IDNumber")
        protected List<String> idNumber;
        @XmlElement(name = "CorporateIDNumber")
        protected List<String> corporateIDNumber;
        @XmlElement(name = "Text")
        protected List<String> text;
        @XmlElement(name = "Commission")
        protected HotelType.AdditionalInformation.Commission commission;
        @XmlElement(name = "WrittenConfirmation")
        protected Boolean writtenConfirmation;

        /**
         * Gets the value of the confirmationNumber property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the confirmationNumber property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getConfirmationNumber().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getConfirmationNumber() {
            if (confirmationNumber == null) {
                confirmationNumber = new ArrayList<String>();
            }
            return this.confirmationNumber;
        }

        /**
         * Gets the value of the address property.
         * 
         * @return
         *     possible object is
         *     {@link HotelType.AdditionalInformation.Address }
         *     
         */
        public HotelType.AdditionalInformation.Address getAddress() {
            return address;
        }

        /**
         * Sets the value of the address property.
         * 
         * @param value
         *     allowed object is
         *     {@link HotelType.AdditionalInformation.Address }
         *     
         */
        public void setAddress(HotelType.AdditionalInformation.Address value) {
            this.address = value;
        }

        /**
         * Gets the value of the contactNumbers property.
         * 
         * @return
         *     possible object is
         *     {@link HotelType.AdditionalInformation.ContactNumbers }
         *     
         */
        public HotelType.AdditionalInformation.ContactNumbers getContactNumbers() {
            return contactNumbers;
        }

        /**
         * Sets the value of the contactNumbers property.
         * 
         * @param value
         *     allowed object is
         *     {@link HotelType.AdditionalInformation.ContactNumbers }
         *     
         */
        public void setContactNumbers(HotelType.AdditionalInformation.ContactNumbers value) {
            this.contactNumbers = value;
        }

        /**
         * Gets the value of the cancelPenaltyPolicyCode property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the cancelPenaltyPolicyCode property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCancelPenaltyPolicyCode().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getCancelPenaltyPolicyCode() {
            if (cancelPenaltyPolicyCode == null) {
                cancelPenaltyPolicyCode = new ArrayList<String>();
            }
            return this.cancelPenaltyPolicyCode;
        }

        /**
         * Gets the value of the custLoyaltyMembershipID property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the custLoyaltyMembershipID property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCustLoyaltyMembershipID().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getCustLoyaltyMembershipID() {
            if (custLoyaltyMembershipID == null) {
                custLoyaltyMembershipID = new ArrayList<String>();
            }
            return this.custLoyaltyMembershipID;
        }

        /**
         * Gets the value of the idNumber property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the idNumber property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getIDNumber().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getIDNumber() {
            if (idNumber == null) {
                idNumber = new ArrayList<String>();
            }
            return this.idNumber;
        }

        /**
         * Gets the value of the corporateIDNumber property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the corporateIDNumber property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCorporateIDNumber().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getCorporateIDNumber() {
            if (corporateIDNumber == null) {
                corporateIDNumber = new ArrayList<String>();
            }
            return this.corporateIDNumber;
        }

        /**
         * Gets the value of the text property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the text property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getText().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getText() {
            if (text == null) {
                text = new ArrayList<String>();
            }
            return this.text;
        }

        /**
         * Gets the value of the commission property.
         * 
         * @return
         *     possible object is
         *     {@link HotelType.AdditionalInformation.Commission }
         *     
         */
        public HotelType.AdditionalInformation.Commission getCommission() {
            return commission;
        }

        /**
         * Sets the value of the commission property.
         * 
         * @param value
         *     allowed object is
         *     {@link HotelType.AdditionalInformation.Commission }
         *     
         */
        public void setCommission(HotelType.AdditionalInformation.Commission value) {
            this.commission = value;
        }

        /**
         * Gets the value of the writtenConfirmation property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isWrittenConfirmation() {
            return writtenConfirmation;
        }

        /**
         * Sets the value of the writtenConfirmation property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setWrittenConfirmation(Boolean value) {
            this.writtenConfirmation = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="AddressLine" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;element name="CountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="State" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="ZipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "addressLine",
            "countryCode",
            "city",
            "state",
            "zipCode"
        })
        public static class Address {

            @XmlElement(name = "AddressLine")
            protected List<String> addressLine;
            @XmlElement(name = "CountryCode")
            protected String countryCode;
            @XmlElement(name = "City")
            protected String city;
            @XmlElement(name = "State")
            protected String state;
            @XmlElement(name = "ZipCode")
            protected String zipCode;

            /**
             * Gets the value of the addressLine property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the addressLine property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getAddressLine().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             * 
             * 
             */
            public List<String> getAddressLine() {
                if (addressLine == null) {
                    addressLine = new ArrayList<String>();
                }
                return this.addressLine;
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
             * Gets the value of the city property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCity() {
                return city;
            }

            /**
             * Sets the value of the city property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCity(String value) {
                this.city = value;
            }

            /**
             * Gets the value of the state property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getState() {
                return state;
            }

            /**
             * Sets the value of the state property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setState(String value) {
                this.state = value;
            }

            /**
             * Gets the value of the zipCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getZipCode() {
                return zipCode;
            }

            /**
             * Sets the value of the zipCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setZipCode(String value) {
                this.zipCode = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="Indicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="PerNight" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "indicator",
            "perNight",
            "text"
        })
        public static class Commission {

            @XmlElement(name = "Indicator")
            protected String indicator;
            @XmlElement(name = "PerNight")
            protected String perNight;
            @XmlElement(name = "Text")
            protected String text;

            /**
             * Gets the value of the indicator property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIndicator() {
                return indicator;
            }

            /**
             * Sets the value of the indicator property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIndicator(String value) {
                this.indicator = value;
            }

            /**
             * Gets the value of the perNight property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPerNight() {
                return perNight;
            }

            /**
             * Sets the value of the perNight property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPerNight(String value) {
                this.perNight = value;
            }

            /**
             * Gets the value of the text property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getText() {
                return text;
            }

            /**
             * Sets the value of the text property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setText(String value) {
                this.text = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="PhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;element name="FaxNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "phoneNumber",
            "faxNumber"
        })
        public static class ContactNumbers {

            @XmlElement(name = "PhoneNumber")
            protected List<String> phoneNumber;
            @XmlElement(name = "FaxNumber")
            protected String faxNumber;

            /**
             * Gets the value of the phoneNumber property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the phoneNumber property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getPhoneNumber().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             * 
             * 
             */
            public List<String> getPhoneNumber() {
                if (phoneNumber == null) {
                    phoneNumber = new ArrayList<String>();
                }
                return this.phoneNumber;
            }

            /**
             * Gets the value of the faxNumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFaxNumber() {
                return faxNumber;
            }

            /**
             * Sets the value of the faxNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFaxNumber(String value) {
                this.faxNumber = value;
            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="LineNumber" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *         &lt;element name="LineType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="LineStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="POSRequestorID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="SpecialPrefs" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="RoomType" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="RoomTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="NumberOfUnits" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *                   &lt;element name="ShortText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="RoomRates" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="AmountBeforeTax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Override" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="RateAccessCodeBooked" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ClientIdentificationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="RateAccessCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="CategoryTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="GuestCounts" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="GuestCount" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *                   &lt;element name="ExtraGuestCount" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element name="RollAwayCount" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element name="CribCount" type="{http://www.w3.org/2001/XMLSchema}integer" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element name="ReserveUnderName" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="TimeSpanStart" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="TimeSpanDuration" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="TimeSpanEnd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Guarantee" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="PaymentCardNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="ChainCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="HotelCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="HotelCityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="HotelName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "lineNumber",
        "lineType",
        "lineStatus",
        "posRequestorID",
        "specialPrefs",
        "roomType",
        "roomRates",
        "rateAccessCodeBooked",
        "guestCounts",
        "timeSpanStart",
        "timeSpanDuration",
        "timeSpanEnd",
        "guarantee",
        "chainCode",
        "hotelCode",
        "hotelCityCode",
        "hotelName"
    })
    public static class Reservation {

        @XmlElement(name = "LineNumber")
        protected BigInteger lineNumber;
        @XmlElement(name = "LineType")
        protected String lineType;
        @XmlElement(name = "LineStatus")
        protected String lineStatus;
        @XmlElement(name = "POSRequestorID")
        protected String posRequestorID;
        @XmlElement(name = "SpecialPrefs")
        protected HotelType.Reservation.SpecialPrefs specialPrefs;
        @XmlElement(name = "RoomType")
        protected HotelType.Reservation.RoomType roomType;
        @XmlElement(name = "RoomRates")
        protected HotelType.Reservation.RoomRates roomRates;
        @XmlElement(name = "RateAccessCodeBooked")
        protected HotelType.Reservation.RateAccessCodeBooked rateAccessCodeBooked;
        @XmlElement(name = "GuestCounts")
        protected HotelType.Reservation.GuestCounts guestCounts;
        @XmlElement(name = "TimeSpanStart")
        protected String timeSpanStart;
        @XmlElement(name = "TimeSpanDuration")
        protected String timeSpanDuration;
        @XmlElement(name = "TimeSpanEnd")
        protected String timeSpanEnd;
        @XmlElement(name = "Guarantee")
        protected HotelType.Reservation.Guarantee guarantee;
        @XmlElement(name = "ChainCode")
        protected String chainCode;
        @XmlElement(name = "HotelCode")
        protected String hotelCode;
        @XmlElement(name = "HotelCityCode")
        protected String hotelCityCode;
        @XmlElement(name = "HotelName")
        protected String hotelName;

        /**
         * Gets the value of the lineNumber property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getLineNumber() {
            return lineNumber;
        }

        /**
         * Sets the value of the lineNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setLineNumber(BigInteger value) {
            this.lineNumber = value;
        }

        /**
         * Gets the value of the lineType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLineType() {
            return lineType;
        }

        /**
         * Sets the value of the lineType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLineType(String value) {
            this.lineType = value;
        }

        /**
         * Gets the value of the lineStatus property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLineStatus() {
            return lineStatus;
        }

        /**
         * Sets the value of the lineStatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLineStatus(String value) {
            this.lineStatus = value;
        }

        /**
         * Gets the value of the posRequestorID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPOSRequestorID() {
            return posRequestorID;
        }

        /**
         * Sets the value of the posRequestorID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPOSRequestorID(String value) {
            this.posRequestorID = value;
        }

        /**
         * Gets the value of the specialPrefs property.
         * 
         * @return
         *     possible object is
         *     {@link HotelType.Reservation.SpecialPrefs }
         *     
         */
        public HotelType.Reservation.SpecialPrefs getSpecialPrefs() {
            return specialPrefs;
        }

        /**
         * Sets the value of the specialPrefs property.
         * 
         * @param value
         *     allowed object is
         *     {@link HotelType.Reservation.SpecialPrefs }
         *     
         */
        public void setSpecialPrefs(HotelType.Reservation.SpecialPrefs value) {
            this.specialPrefs = value;
        }

        /**
         * Gets the value of the roomType property.
         * 
         * @return
         *     possible object is
         *     {@link HotelType.Reservation.RoomType }
         *     
         */
        public HotelType.Reservation.RoomType getRoomType() {
            return roomType;
        }

        /**
         * Sets the value of the roomType property.
         * 
         * @param value
         *     allowed object is
         *     {@link HotelType.Reservation.RoomType }
         *     
         */
        public void setRoomType(HotelType.Reservation.RoomType value) {
            this.roomType = value;
        }

        /**
         * Gets the value of the roomRates property.
         * 
         * @return
         *     possible object is
         *     {@link HotelType.Reservation.RoomRates }
         *     
         */
        public HotelType.Reservation.RoomRates getRoomRates() {
            return roomRates;
        }

        /**
         * Sets the value of the roomRates property.
         * 
         * @param value
         *     allowed object is
         *     {@link HotelType.Reservation.RoomRates }
         *     
         */
        public void setRoomRates(HotelType.Reservation.RoomRates value) {
            this.roomRates = value;
        }

        /**
         * Gets the value of the rateAccessCodeBooked property.
         * 
         * @return
         *     possible object is
         *     {@link HotelType.Reservation.RateAccessCodeBooked }
         *     
         */
        public HotelType.Reservation.RateAccessCodeBooked getRateAccessCodeBooked() {
            return rateAccessCodeBooked;
        }

        /**
         * Sets the value of the rateAccessCodeBooked property.
         * 
         * @param value
         *     allowed object is
         *     {@link HotelType.Reservation.RateAccessCodeBooked }
         *     
         */
        public void setRateAccessCodeBooked(HotelType.Reservation.RateAccessCodeBooked value) {
            this.rateAccessCodeBooked = value;
        }

        /**
         * Gets the value of the guestCounts property.
         * 
         * @return
         *     possible object is
         *     {@link HotelType.Reservation.GuestCounts }
         *     
         */
        public HotelType.Reservation.GuestCounts getGuestCounts() {
            return guestCounts;
        }

        /**
         * Sets the value of the guestCounts property.
         * 
         * @param value
         *     allowed object is
         *     {@link HotelType.Reservation.GuestCounts }
         *     
         */
        public void setGuestCounts(HotelType.Reservation.GuestCounts value) {
            this.guestCounts = value;
        }

        /**
         * Gets the value of the timeSpanStart property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTimeSpanStart() {
            return timeSpanStart;
        }

        /**
         * Sets the value of the timeSpanStart property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTimeSpanStart(String value) {
            this.timeSpanStart = value;
        }

        /**
         * Gets the value of the timeSpanDuration property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTimeSpanDuration() {
            return timeSpanDuration;
        }

        /**
         * Sets the value of the timeSpanDuration property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTimeSpanDuration(String value) {
            this.timeSpanDuration = value;
        }

        /**
         * Gets the value of the timeSpanEnd property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTimeSpanEnd() {
            return timeSpanEnd;
        }

        /**
         * Sets the value of the timeSpanEnd property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTimeSpanEnd(String value) {
            this.timeSpanEnd = value;
        }

        /**
         * Gets the value of the guarantee property.
         * 
         * @return
         *     possible object is
         *     {@link HotelType.Reservation.Guarantee }
         *     
         */
        public HotelType.Reservation.Guarantee getGuarantee() {
            return guarantee;
        }

        /**
         * Sets the value of the guarantee property.
         * 
         * @param value
         *     allowed object is
         *     {@link HotelType.Reservation.Guarantee }
         *     
         */
        public void setGuarantee(HotelType.Reservation.Guarantee value) {
            this.guarantee = value;
        }

        /**
         * Gets the value of the chainCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getChainCode() {
            return chainCode;
        }

        /**
         * Sets the value of the chainCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setChainCode(String value) {
            this.chainCode = value;
        }

        /**
         * Gets the value of the hotelCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHotelCode() {
            return hotelCode;
        }

        /**
         * Sets the value of the hotelCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHotelCode(String value) {
            this.hotelCode = value;
        }

        /**
         * Gets the value of the hotelCityCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHotelCityCode() {
            return hotelCityCode;
        }

        /**
         * Sets the value of the hotelCityCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHotelCityCode(String value) {
            this.hotelCityCode = value;
        }

        /**
         * Gets the value of the hotelName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHotelName() {
            return hotelName;
        }

        /**
         * Sets the value of the hotelName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHotelName(String value) {
            this.hotelName = value;
        }


        /**
         * The guarantee
         * 										information to hold a reservation
         * 									
         * 
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="PaymentCardNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "paymentCardNumber",
            "text"
        })
        public static class Guarantee {

            @XmlElement(name = "PaymentCardNumber")
            protected String paymentCardNumber;
            @XmlElement(name = "Text")
            protected String text;

            /**
             * Gets the value of the paymentCardNumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPaymentCardNumber() {
                return paymentCardNumber;
            }

            /**
             * Sets the value of the paymentCardNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPaymentCardNumber(String value) {
                this.paymentCardNumber = value;
            }

            /**
             * Gets the value of the text property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getText() {
                return text;
            }

            /**
             * Sets the value of the text property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setText(String value) {
                this.text = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="GuestCount" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
         *         &lt;element name="ExtraGuestCount" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;element name="RollAwayCount" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;element name="CribCount" type="{http://www.w3.org/2001/XMLSchema}integer" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;element name="ReserveUnderName" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "guestCount",
            "extraGuestCount",
            "rollAwayCount",
            "cribCount",
            "reserveUnderName",
            "name"
        })
        public static class GuestCounts {

            @XmlElement(name = "GuestCount")
            protected BigInteger guestCount;
            @XmlElement(name = "ExtraGuestCount")
            protected List<String> extraGuestCount;
            @XmlElement(name = "RollAwayCount")
            protected List<String> rollAwayCount;
            @XmlElement(name = "CribCount")
            protected List<BigInteger> cribCount;
            @XmlElement(name = "ReserveUnderName")
            protected List<String> reserveUnderName;
            @XmlElement(name = "Name")
            protected List<String> name;

            /**
             * Gets the value of the guestCount property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getGuestCount() {
                return guestCount;
            }

            /**
             * Sets the value of the guestCount property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setGuestCount(BigInteger value) {
                this.guestCount = value;
            }

            /**
             * Gets the value of the extraGuestCount property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the extraGuestCount property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getExtraGuestCount().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             * 
             * 
             */
            public List<String> getExtraGuestCount() {
                if (extraGuestCount == null) {
                    extraGuestCount = new ArrayList<String>();
                }
                return this.extraGuestCount;
            }

            /**
             * Gets the value of the rollAwayCount property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the rollAwayCount property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getRollAwayCount().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             * 
             * 
             */
            public List<String> getRollAwayCount() {
                if (rollAwayCount == null) {
                    rollAwayCount = new ArrayList<String>();
                }
                return this.rollAwayCount;
            }

            /**
             * Gets the value of the cribCount property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the cribCount property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getCribCount().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link BigInteger }
             * 
             * 
             */
            public List<BigInteger> getCribCount() {
                if (cribCount == null) {
                    cribCount = new ArrayList<BigInteger>();
                }
                return this.cribCount;
            }

            /**
             * Gets the value of the reserveUnderName property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the reserveUnderName property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getReserveUnderName().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             * 
             * 
             */
            public List<String> getReserveUnderName() {
                if (reserveUnderName == null) {
                    reserveUnderName = new ArrayList<String>();
                }
                return this.reserveUnderName;
            }

            /**
             * Gets the value of the name property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the name property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getName().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             * 
             * 
             */
            public List<String> getName() {
                if (name == null) {
                    name = new ArrayList<String>();
                }
                return this.name;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="ClientIdentificationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="RateAccessCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="CategoryTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "clientIdentificationCode",
            "rateAccessCode",
            "categoryTypeCode"
        })
        public static class RateAccessCodeBooked {

            @XmlElement(name = "ClientIdentificationCode")
            protected String clientIdentificationCode;
            @XmlElement(name = "RateAccessCode")
            protected String rateAccessCode;
            @XmlElement(name = "CategoryTypeCode")
            protected String categoryTypeCode;

            /**
             * Gets the value of the clientIdentificationCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getClientIdentificationCode() {
                return clientIdentificationCode;
            }

            /**
             * Sets the value of the clientIdentificationCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setClientIdentificationCode(String value) {
                this.clientIdentificationCode = value;
            }

            /**
             * Gets the value of the rateAccessCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRateAccessCode() {
                return rateAccessCode;
            }

            /**
             * Sets the value of the rateAccessCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRateAccessCode(String value) {
                this.rateAccessCode = value;
            }

            /**
             * Gets the value of the categoryTypeCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCategoryTypeCode() {
                return categoryTypeCode;
            }

            /**
             * Sets the value of the categoryTypeCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCategoryTypeCode(String value) {
                this.categoryTypeCode = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="AmountBeforeTax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Override" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "amountBeforeTax",
            "currencyCode",
            "override"
        })
        public static class RoomRates {

            @XmlElement(name = "AmountBeforeTax")
            protected String amountBeforeTax;
            @XmlElement(name = "CurrencyCode")
            protected String currencyCode;
            @XmlElement(name = "Override")
            protected Boolean override;

            /**
             * Gets the value of the amountBeforeTax property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAmountBeforeTax() {
                return amountBeforeTax;
            }

            /**
             * Sets the value of the amountBeforeTax property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAmountBeforeTax(String value) {
                this.amountBeforeTax = value;
            }

            /**
             * Gets the value of the currencyCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCurrencyCode() {
                return currencyCode;
            }

            /**
             * Sets the value of the currencyCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCurrencyCode(String value) {
                this.currencyCode = value;
            }

            /**
             * Gets the value of the override property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isOverride() {
                return override;
            }

            /**
             * Sets the value of the override property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setOverride(Boolean value) {
                this.override = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="RoomTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="NumberOfUnits" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
         *         &lt;element name="ShortText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "roomTypeCode",
            "numberOfUnits",
            "shortText"
        })
        public static class RoomType {

            @XmlElement(name = "RoomTypeCode")
            protected String roomTypeCode;
            @XmlElement(name = "NumberOfUnits")
            protected BigInteger numberOfUnits;
            @XmlElement(name = "ShortText")
            protected String shortText;

            /**
             * Gets the value of the roomTypeCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRoomTypeCode() {
                return roomTypeCode;
            }

            /**
             * Sets the value of the roomTypeCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRoomTypeCode(String value) {
                this.roomTypeCode = value;
            }

            /**
             * Gets the value of the numberOfUnits property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getNumberOfUnits() {
                return numberOfUnits;
            }

            /**
             * Sets the value of the numberOfUnits property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setNumberOfUnits(BigInteger value) {
                this.numberOfUnits = value;
            }

            /**
             * Gets the value of the shortText property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getShortText() {
                return shortText;
            }

            /**
             * Sets the value of the shortText property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setShortText(String value) {
                this.shortText = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "text"
        })
        public static class SpecialPrefs {

            @XmlElement(name = "Text")
            protected List<String> text;

            /**
             * Gets the value of the text property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the text property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getText().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             * 
             * 
             */
            public List<String> getText() {
                if (text == null) {
                    text = new ArrayList<String>();
                }
                return this.text;
            }

        }

    }

}
