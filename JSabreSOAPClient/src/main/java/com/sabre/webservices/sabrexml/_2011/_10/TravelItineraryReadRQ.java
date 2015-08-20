
package com.sabre.webservices.sabrexml._2011._10;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="MessagingDetails">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="SubjectAreas" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="SubjectArea" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="UniqueID" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="EchoToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReturnOptions" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="UnmaskCreditCard" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="TimeStamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="Version" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "messagingDetails",
    "uniqueID",
    "echoToken",
    "returnOptions"
})
@XmlRootElement(name = "TravelItineraryReadRQ")
public class TravelItineraryReadRQ {

    @XmlElement(name = "MessagingDetails", required = true)
    protected TravelItineraryReadRQ.MessagingDetails messagingDetails;
    @XmlElement(name = "UniqueID")
    protected TravelItineraryReadRQ.UniqueID uniqueID;
    @XmlElement(name = "EchoToken")
    protected String echoToken;
    @XmlElement(name = "ReturnOptions")
    protected TravelItineraryReadRQ.ReturnOptions returnOptions;
    @XmlAttribute(name = "TimeStamp")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timeStamp;
    @XmlAttribute(name = "Version", required = true)
    protected String version;

    /**
     * Gets the value of the messagingDetails property.
     * 
     * @return
     *     possible object is
     *     {@link TravelItineraryReadRQ.MessagingDetails }
     *     
     */
    public TravelItineraryReadRQ.MessagingDetails getMessagingDetails() {
        return messagingDetails;
    }

    /**
     * Sets the value of the messagingDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link TravelItineraryReadRQ.MessagingDetails }
     *     
     */
    public void setMessagingDetails(TravelItineraryReadRQ.MessagingDetails value) {
        this.messagingDetails = value;
    }

    /**
     * Gets the value of the uniqueID property.
     * 
     * @return
     *     possible object is
     *     {@link TravelItineraryReadRQ.UniqueID }
     *     
     */
    public TravelItineraryReadRQ.UniqueID getUniqueID() {
        return uniqueID;
    }

    /**
     * Sets the value of the uniqueID property.
     * 
     * @param value
     *     allowed object is
     *     {@link TravelItineraryReadRQ.UniqueID }
     *     
     */
    public void setUniqueID(TravelItineraryReadRQ.UniqueID value) {
        this.uniqueID = value;
    }

    /**
     * Gets the value of the echoToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEchoToken() {
        return echoToken;
    }

    /**
     * Sets the value of the echoToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEchoToken(String value) {
        this.echoToken = value;
    }

    /**
     * Gets the value of the returnOptions property.
     * 
     * @return
     *     possible object is
     *     {@link TravelItineraryReadRQ.ReturnOptions }
     *     
     */
    public TravelItineraryReadRQ.ReturnOptions getReturnOptions() {
        return returnOptions;
    }

    /**
     * Sets the value of the returnOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link TravelItineraryReadRQ.ReturnOptions }
     *     
     */
    public void setReturnOptions(TravelItineraryReadRQ.ReturnOptions value) {
        this.returnOptions = value;
    }

    /**
     * Gets the value of the timeStamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimeStamp() {
        return timeStamp;
    }

    /**
     * Sets the value of the timeStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimeStamp(XMLGregorianCalendar value) {
        this.timeStamp = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
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
     *         &lt;element name="SubjectAreas" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="SubjectArea" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
        "subjectAreas"
    })
    public static class MessagingDetails {

        @XmlElement(name = "SubjectAreas")
        protected TravelItineraryReadRQ.MessagingDetails.SubjectAreas subjectAreas;

        /**
         * Gets the value of the subjectAreas property.
         * 
         * @return
         *     possible object is
         *     {@link TravelItineraryReadRQ.MessagingDetails.SubjectAreas }
         *     
         */
        public TravelItineraryReadRQ.MessagingDetails.SubjectAreas getSubjectAreas() {
            return subjectAreas;
        }

        /**
         * Sets the value of the subjectAreas property.
         * 
         * @param value
         *     allowed object is
         *     {@link TravelItineraryReadRQ.MessagingDetails.SubjectAreas }
         *     
         */
        public void setSubjectAreas(TravelItineraryReadRQ.MessagingDetails.SubjectAreas value) {
            this.subjectAreas = value;
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
         *         &lt;element name="SubjectArea" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
            "subjectArea"
        })
        public static class SubjectAreas {

            @XmlElement(name = "SubjectArea")
            protected List<String> subjectArea;

            /**
             * Gets the value of the subjectArea property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the subjectArea property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getSubjectArea().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             * 
             * 
             */
            public List<String> getSubjectArea() {
                if (subjectArea == null) {
                    subjectArea = new ArrayList<String>();
                }
                return this.subjectArea;
            }
            
            public void setSubjectArea(List<String> subjectArea) {
                this.subjectArea = subjectArea;
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
     *       &lt;attribute name="UnmaskCreditCard" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ReturnOptions {

        @XmlAttribute(name = "UnmaskCreditCard")
        protected Boolean unmaskCreditCard;

        /**
         * Gets the value of the unmaskCreditCard property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public boolean isUnmaskCreditCard() {
            if (unmaskCreditCard == null) {
                return false;
            } else {
                return unmaskCreditCard;
            }
        }

        /**
         * Sets the value of the unmaskCreditCard property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setUnmaskCreditCard(Boolean value) {
            this.unmaskCreditCard = value;
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
     *       &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class UniqueID {

        @XmlAttribute(name = "ID", required = true)
        protected String id;

        /**
         * Gets the value of the id property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getID() {
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
        public void setID(String value) {
            this.id = value;
        }

    }

}
