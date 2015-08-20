
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
 *         &lt;element name="MultiQueuePlace" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="QueueIdentifier" maxOccurs="20">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="Number" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="PrefatoryInstructionCode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="PseudoCityCode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="QueueInfo" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="QueueIdentifier" maxOccurs="3">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="Number" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="PrefatoryInstructionCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="PseudoCityCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="UniqueID" maxOccurs="6" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="ReturnHostCommand" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="TimeStamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="Version" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="2.0.3" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "multiQueuePlace",
    "queueInfo"
})
@XmlRootElement(name = "QueuePlaceRQ")
public class QueuePlaceRQ {

    @XmlElement(name = "MultiQueuePlace")
    protected QueuePlaceRQ.MultiQueuePlace multiQueuePlace;
    @XmlElement(name = "QueueInfo")
    protected QueuePlaceRQ.QueueInfo queueInfo;
    @XmlAttribute(name = "ReturnHostCommand")
    protected Boolean returnHostCommand;
    @XmlAttribute(name = "TimeStamp")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timeStamp;
    @XmlAttribute(name = "Version", required = true)
    protected String version;

    /**
     * Gets the value of the multiQueuePlace property.
     * 
     * @return
     *     possible object is
     *     {@link QueuePlaceRQ.MultiQueuePlace }
     *     
     */
    public QueuePlaceRQ.MultiQueuePlace getMultiQueuePlace() {
        return multiQueuePlace;
    }

    /**
     * Sets the value of the multiQueuePlace property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueuePlaceRQ.MultiQueuePlace }
     *     
     */
    public void setMultiQueuePlace(QueuePlaceRQ.MultiQueuePlace value) {
        this.multiQueuePlace = value;
    }

    /**
     * Gets the value of the queueInfo property.
     * 
     * @return
     *     possible object is
     *     {@link QueuePlaceRQ.QueueInfo }
     *     
     */
    public QueuePlaceRQ.QueueInfo getQueueInfo() {
        return queueInfo;
    }

    /**
     * Sets the value of the queueInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueuePlaceRQ.QueueInfo }
     *     
     */
    public void setQueueInfo(QueuePlaceRQ.QueueInfo value) {
        this.queueInfo = value;
    }

    /**
     * Gets the value of the returnHostCommand property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReturnHostCommand() {
        return returnHostCommand;
    }

    /**
     * Sets the value of the returnHostCommand property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReturnHostCommand(Boolean value) {
        this.returnHostCommand = value;
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
        if (version == null) {
            return "2.0.3";
        } else {
            return version;
        }
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
     *         &lt;element name="QueueIdentifier" maxOccurs="20">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Number" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="PrefatoryInstructionCode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="PseudoCityCode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
        "queueIdentifier"
    })
    public static class MultiQueuePlace {

        @XmlElement(name = "QueueIdentifier", required = true)
        protected List<QueuePlaceRQ.MultiQueuePlace.QueueIdentifier> queueIdentifier;

        /**
         * Gets the value of the queueIdentifier property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the queueIdentifier property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getQueueIdentifier().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link QueuePlaceRQ.MultiQueuePlace.QueueIdentifier }
         * 
         * 
         */
        public List<QueuePlaceRQ.MultiQueuePlace.QueueIdentifier> getQueueIdentifier() {
            if (queueIdentifier == null) {
                queueIdentifier = new ArrayList<QueuePlaceRQ.MultiQueuePlace.QueueIdentifier>();
            }
            return this.queueIdentifier;
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
         *       &lt;attribute name="Number" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="PrefatoryInstructionCode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="PseudoCityCode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class QueueIdentifier {

            @XmlAttribute(name = "Number", required = true)
            protected String number;
            @XmlAttribute(name = "PrefatoryInstructionCode", required = true)
            protected String prefatoryInstructionCode;
            @XmlAttribute(name = "PseudoCityCode", required = true)
            protected String pseudoCityCode;

            /**
             * Gets the value of the number property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNumber() {
                return number;
            }

            /**
             * Sets the value of the number property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNumber(String value) {
                this.number = value;
            }

            /**
             * Gets the value of the prefatoryInstructionCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPrefatoryInstructionCode() {
                return prefatoryInstructionCode;
            }

            /**
             * Sets the value of the prefatoryInstructionCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPrefatoryInstructionCode(String value) {
                this.prefatoryInstructionCode = value;
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
     *         &lt;element name="QueueIdentifier" maxOccurs="3">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="Number" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="PrefatoryInstructionCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="PseudoCityCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="UniqueID" maxOccurs="6" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
        "queueIdentifier",
        "uniqueID"
    })
    public static class QueueInfo {

        @XmlElement(name = "QueueIdentifier", required = true)
        protected List<QueuePlaceRQ.QueueInfo.QueueIdentifier> queueIdentifier;
        @XmlElement(name = "UniqueID")
        protected List<QueuePlaceRQ.QueueInfo.UniqueID> uniqueID;

        /**
         * Gets the value of the queueIdentifier property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the queueIdentifier property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getQueueIdentifier().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link QueuePlaceRQ.QueueInfo.QueueIdentifier }
         * 
         * 
         */
        public List<QueuePlaceRQ.QueueInfo.QueueIdentifier> getQueueIdentifier() {
            if (queueIdentifier == null) {
                queueIdentifier = new ArrayList<QueuePlaceRQ.QueueInfo.QueueIdentifier>();
            }
            return this.queueIdentifier;
        }

        /**
         * Gets the value of the uniqueID property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the uniqueID property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getUniqueID().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link QueuePlaceRQ.QueueInfo.UniqueID }
         * 
         * 
         */
        public List<QueuePlaceRQ.QueueInfo.UniqueID> getUniqueID() {
            if (uniqueID == null) {
                uniqueID = new ArrayList<QueuePlaceRQ.QueueInfo.UniqueID>();
            }
            return this.uniqueID;
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
         *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="Number" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="PrefatoryInstructionCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="PseudoCityCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class QueueIdentifier {

            @XmlAttribute(name = "Name")
            protected String name;
            @XmlAttribute(name = "Number")
            protected String number;
            @XmlAttribute(name = "PrefatoryInstructionCode")
            protected String prefatoryInstructionCode;
            @XmlAttribute(name = "PseudoCityCode")
            protected String pseudoCityCode;

            /**
             * Gets the value of the name property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getName() {
                return name;
            }

            /**
             * Sets the value of the name property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setName(String value) {
                this.name = value;
            }

            /**
             * Gets the value of the number property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNumber() {
                return number;
            }

            /**
             * Sets the value of the number property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNumber(String value) {
                this.number = value;
            }

            /**
             * Gets the value of the prefatoryInstructionCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPrefatoryInstructionCode() {
                return prefatoryInstructionCode;
            }

            /**
             * Sets the value of the prefatoryInstructionCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPrefatoryInstructionCode(String value) {
                this.prefatoryInstructionCode = value;
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

}
