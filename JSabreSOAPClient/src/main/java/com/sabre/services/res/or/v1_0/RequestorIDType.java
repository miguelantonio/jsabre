
package com.sabre.services.res.or.v1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RequestorIDType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequestorIDType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CompanyName" type="{http://services.sabre.com/res/or/v1_0}CompanyNameType" minOccurs="0"/>
 *         &lt;element name="ArrangerDetails" type="{http://services.sabre.com/res/or/v1_0}ArrangerDetailsType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="URL" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Instance" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ID_Context" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="MessagePassword" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestorIDType", propOrder = {
    "companyName",
    "arrangerDetails"
})
public class RequestorIDType {

    @XmlElement(name = "CompanyName")
    protected CompanyNameType companyName;
    @XmlElement(name = "ArrangerDetails")
    protected ArrangerDetailsType arrangerDetails;
    @XmlAttribute(name = "URL")
    protected String url;
    @XmlAttribute(name = "Type", required = true)
    protected String type;
    @XmlAttribute(name = "Instance")
    protected String instance;
    @XmlAttribute(name = "ID", required = true)
    protected String id;
    @XmlAttribute(name = "ID_Context")
    protected String idContext;
    @XmlAttribute(name = "MessagePassword")
    protected String messagePassword;

    /**
     * Gets the value of the companyName property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyNameType }
     *     
     */
    public CompanyNameType getCompanyName() {
        return companyName;
    }

    /**
     * Sets the value of the companyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyNameType }
     *     
     */
    public void setCompanyName(CompanyNameType value) {
        this.companyName = value;
    }

    /**
     * Gets the value of the arrangerDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ArrangerDetailsType }
     *     
     */
    public ArrangerDetailsType getArrangerDetails() {
        return arrangerDetails;
    }

    /**
     * Sets the value of the arrangerDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrangerDetailsType }
     *     
     */
    public void setArrangerDetails(ArrangerDetailsType value) {
        this.arrangerDetails = value;
    }

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURL() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setURL(String value) {
        this.url = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the instance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstance() {
        return instance;
    }

    /**
     * Sets the value of the instance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstance(String value) {
        this.instance = value;
    }

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

    /**
     * Gets the value of the idContext property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDContext() {
        return idContext;
    }

    /**
     * Sets the value of the idContext property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDContext(String value) {
        this.idContext = value;
    }

    /**
     * Gets the value of the messagePassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessagePassword() {
        return messagePassword;
    }

    /**
     * Sets the value of the messagePassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessagePassword(String value) {
        this.messagePassword = value;
    }

}
