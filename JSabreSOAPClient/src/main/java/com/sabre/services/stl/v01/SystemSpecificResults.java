
package com.sabre.services.stl.v01;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.sabre.services.stl_header.v120.MessageCondition;


/**
 * <p>Java class for SystemSpecificResults complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SystemSpecificResults">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HostCommand" type="{http://services.sabre.com/STL/v01}HostCommand" minOccurs="0"/>
 *         &lt;element name="Message" type="{http://services.sabre.com/STL_Header/v120}Message.Condition" maxOccurs="99" minOccurs="0"/>
 *         &lt;element name="ShortText" type="{http://services.sabre.com/STL_Header/v120}Text.Short" minOccurs="0"/>
 *         &lt;element name="Element" type="{http://services.sabre.com/STL_Header/v120}Text.Long" minOccurs="0"/>
 *         &lt;element name="RecordID" type="{http://services.sabre.com/STL_Header/v120}Identifier" minOccurs="0"/>
 *         &lt;element name="DocURL" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="timeStamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SystemSpecificResults", propOrder = {
    "hostCommand",
    "message",
    "shortText",
    "element",
    "recordID",
    "docURL"
})
public class SystemSpecificResults {

    @XmlElement(name = "HostCommand")
    protected HostCommand hostCommand;
    @XmlElement(name = "Message")
    protected List<MessageCondition> message;
    @XmlElement(name = "ShortText")
    protected String shortText;
    @XmlElement(name = "Element")
    protected String element;
    @XmlElement(name = "RecordID")
    protected String recordID;
    @XmlElement(name = "DocURL")
    @XmlSchemaType(name = "anyURI")
    protected String docURL;
    @XmlAttribute(name = "timeStamp")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timeStamp;

    /**
     * Gets the value of the hostCommand property.
     * 
     * @return
     *     possible object is
     *     {@link HostCommand }
     *     
     */
    public HostCommand getHostCommand() {
        return hostCommand;
    }

    /**
     * Sets the value of the hostCommand property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostCommand }
     *     
     */
    public void setHostCommand(HostCommand value) {
        this.hostCommand = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the message property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMessage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MessageCondition }
     * 
     * 
     */
    public List<MessageCondition> getMessage() {
        if (message == null) {
            message = new ArrayList<MessageCondition>();
        }
        return this.message;
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

    /**
     * Gets the value of the element property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getElement() {
        return element;
    }

    /**
     * Sets the value of the element property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setElement(String value) {
        this.element = value;
    }

    /**
     * Gets the value of the recordID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecordID() {
        return recordID;
    }

    /**
     * Sets the value of the recordID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecordID(String value) {
        this.recordID = value;
    }

    /**
     * Gets the value of the docURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocURL() {
        return docURL;
    }

    /**
     * Sets the value of the docURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocURL(String value) {
        this.docURL = value;
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
