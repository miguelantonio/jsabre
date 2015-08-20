
package com.sabre.webservices.sabrexml._2011._10;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.sabre.services.stl.v01.ApplicationResults;


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
 *         &lt;element ref="{http://services.sabre.com/STL/v01}ApplicationResults"/>
 *         &lt;element name="QueueInfo" maxOccurs="20" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="QueueIdentifier" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="Number" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="PseudoCityCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="UniqueID" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="DateTime" type="{http://webservices.sabre.com/sabreXML/2011/10}dateTime" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Version" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "applicationResults",
    "queueInfo",
    "text"
})
@XmlRootElement(name = "QueuePlaceRS")
public class QueuePlaceRS {

    @XmlElement(name = "ApplicationResults", namespace = "http://services.sabre.com/STL/v01", required = true)
    protected ApplicationResults applicationResults;
    @XmlElement(name = "QueueInfo")
    protected List<QueuePlaceRS.QueueInfo> queueInfo;
    @XmlElement(name = "Text")
    protected List<String> text;
    @XmlAttribute(name = "Version")
    protected String version;

    /**
     * Gets the value of the applicationResults property.
     * 
     * @return
     *     possible object is
     *     {@link ApplicationResults }
     *     
     */
    public ApplicationResults getApplicationResults() {
        return applicationResults;
    }

    /**
     * Sets the value of the applicationResults property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicationResults }
     *     
     */
    public void setApplicationResults(ApplicationResults value) {
        this.applicationResults = value;
    }

    /**
     * Gets the value of the queueInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the queueInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQueueInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QueuePlaceRS.QueueInfo }
     * 
     * 
     */
    public List<QueuePlaceRS.QueueInfo> getQueueInfo() {
        if (queueInfo == null) {
            queueInfo = new ArrayList<QueuePlaceRS.QueueInfo>();
        }
        return this.queueInfo;
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
     *         &lt;element name="QueueIdentifier" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="Number" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="PseudoCityCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="UniqueID" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="DateTime" type="{http://webservices.sabre.com/sabreXML/2011/10}dateTime" />
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

        @XmlElement(name = "QueueIdentifier")
        protected QueuePlaceRS.QueueInfo.QueueIdentifier queueIdentifier;
        @XmlElement(name = "UniqueID")
        protected QueuePlaceRS.QueueInfo.UniqueID uniqueID;
        @XmlAttribute(name = "DateTime")
        protected String dateTime;

        /**
         * Gets the value of the queueIdentifier property.
         * 
         * @return
         *     possible object is
         *     {@link QueuePlaceRS.QueueInfo.QueueIdentifier }
         *     
         */
        public QueuePlaceRS.QueueInfo.QueueIdentifier getQueueIdentifier() {
            return queueIdentifier;
        }

        /**
         * Sets the value of the queueIdentifier property.
         * 
         * @param value
         *     allowed object is
         *     {@link QueuePlaceRS.QueueInfo.QueueIdentifier }
         *     
         */
        public void setQueueIdentifier(QueuePlaceRS.QueueInfo.QueueIdentifier value) {
            this.queueIdentifier = value;
        }

        /**
         * Gets the value of the uniqueID property.
         * 
         * @return
         *     possible object is
         *     {@link QueuePlaceRS.QueueInfo.UniqueID }
         *     
         */
        public QueuePlaceRS.QueueInfo.UniqueID getUniqueID() {
            return uniqueID;
        }

        /**
         * Sets the value of the uniqueID property.
         * 
         * @param value
         *     allowed object is
         *     {@link QueuePlaceRS.QueueInfo.UniqueID }
         *     
         */
        public void setUniqueID(QueuePlaceRS.QueueInfo.UniqueID value) {
            this.uniqueID = value;
        }

        /**
         * Gets the value of the dateTime property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDateTime() {
            return dateTime;
        }

        /**
         * Sets the value of the dateTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDateTime(String value) {
            this.dateTime = value;
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
         *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" />
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

            @XmlAttribute(name = "ID")
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
