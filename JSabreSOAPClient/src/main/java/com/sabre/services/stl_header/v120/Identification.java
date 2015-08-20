
package com.sabre.services.stl_header.v120;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * The Identification metadata uniquely identify each message instance.
 * 
 * <p>Java class for Identification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Identification">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CustomerID" type="{http://services.sabre.com/STL_Header/v120}PseudoCityCodeOrOAC"/>
 *         &lt;element name="CustomerAppID" type="{http://services.sabre.com/STL_Header/v120}Text.Short" minOccurs="0"/>
 *         &lt;element name="ConversationID" type="{http://services.sabre.com/STL_Header/v120}TrackingID"/>
 *         &lt;element name="MessageID" type="{http://services.sabre.com/STL_Header/v120}Identifier"/>
 *         &lt;element name="TimeStamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Identification", propOrder = {
    "customerID",
    "customerAppID",
    "conversationID",
    "messageID",
    "timeStamp"
})
public class Identification {

    @XmlElement(name = "CustomerID", required = true)
    protected String customerID;
    @XmlElement(name = "CustomerAppID")
    protected String customerAppID;
    @XmlElement(name = "ConversationID", required = true)
    protected TrackingID conversationID;
    @XmlElement(name = "MessageID", required = true)
    protected String messageID;
    @XmlElement(name = "TimeStamp")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timeStamp;

    /**
     * Gets the value of the customerID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerID() {
        return customerID;
    }

    /**
     * Sets the value of the customerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerID(String value) {
        this.customerID = value;
    }

    /**
     * Gets the value of the customerAppID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerAppID() {
        return customerAppID;
    }

    /**
     * Sets the value of the customerAppID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerAppID(String value) {
        this.customerAppID = value;
    }

    /**
     * Gets the value of the conversationID property.
     * 
     * @return
     *     possible object is
     *     {@link TrackingID }
     *     
     */
    public TrackingID getConversationID() {
        return conversationID;
    }

    /**
     * Sets the value of the conversationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrackingID }
     *     
     */
    public void setConversationID(TrackingID value) {
        this.conversationID = value;
    }

    /**
     * Gets the value of the messageID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageID() {
        return messageID;
    }

    /**
     * Sets the value of the messageID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageID(String value) {
        this.messageID = value;
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

}
