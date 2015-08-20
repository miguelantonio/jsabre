
package com.sabre.services.res.or.v1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ProductDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProductName" type="{http://services.sabre.com/res/or/v1_0}ProductNameType"/>
 *         &lt;choice>
 *           &lt;element name="Hotel" type="{http://services.sabre.com/res/or/v1_0}HotelProductType"/>
 *           &lt;element name="GroundTransportation" type="{http://services.sabre.com/res/or/v1_0}GroundTransportationType"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://services.sabre.com/res/or/v1_0}SegmentCommonAttributes"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductDetailsType", propOrder = {
    "productName",
    "hotel",
    "groundTransportation"
})
public class ProductDetailsType {

    @XmlElement(name = "ProductName", required = true)
    protected ProductNameType productName;
    @XmlElement(name = "Hotel")
    protected HotelProductType hotel;
    @XmlElement(name = "GroundTransportation")
    protected GroundTransportationType groundTransportation;
    @XmlAttribute(name = "productType")
    protected String productType;
    @XmlAttribute(name = "statusCode")
    protected String statusCode;
    @XmlAttribute(name = "previousStatusCode")
    protected String previousStatusCode;
    @XmlAttribute(name = "startPoint")
    protected String startPoint;
    @XmlAttribute(name = "startDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDateTime;
    @XmlAttribute(name = "endPoint")
    protected String endPoint;
    @XmlAttribute(name = "endDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endDateTime;

    /**
     * Gets the value of the productName property.
     * 
     * @return
     *     possible object is
     *     {@link ProductNameType }
     *     
     */
    public ProductNameType getProductName() {
        return productName;
    }

    /**
     * Sets the value of the productName property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductNameType }
     *     
     */
    public void setProductName(ProductNameType value) {
        this.productName = value;
    }

    /**
     * Gets the value of the hotel property.
     * 
     * @return
     *     possible object is
     *     {@link HotelProductType }
     *     
     */
    public HotelProductType getHotel() {
        return hotel;
    }

    /**
     * Sets the value of the hotel property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelProductType }
     *     
     */
    public void setHotel(HotelProductType value) {
        this.hotel = value;
    }

    /**
     * Gets the value of the groundTransportation property.
     * 
     * @return
     *     possible object is
     *     {@link GroundTransportationType }
     *     
     */
    public GroundTransportationType getGroundTransportation() {
        return groundTransportation;
    }

    /**
     * Sets the value of the groundTransportation property.
     * 
     * @param value
     *     allowed object is
     *     {@link GroundTransportationType }
     *     
     */
    public void setGroundTransportation(GroundTransportationType value) {
        this.groundTransportation = value;
    }

    /**
     * Gets the value of the productType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductType() {
        return productType;
    }

    /**
     * Sets the value of the productType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductType(String value) {
        this.productType = value;
    }

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
     * Gets the value of the previousStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreviousStatusCode() {
        return previousStatusCode;
    }

    /**
     * Sets the value of the previousStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreviousStatusCode(String value) {
        this.previousStatusCode = value;
    }

    /**
     * Gets the value of the startPoint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartPoint() {
        return startPoint;
    }

    /**
     * Sets the value of the startPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartPoint(String value) {
        this.startPoint = value;
    }

    /**
     * Gets the value of the startDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDateTime() {
        return startDateTime;
    }

    /**
     * Sets the value of the startDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDateTime(XMLGregorianCalendar value) {
        this.startDateTime = value;
    }

    /**
     * Gets the value of the endPoint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndPoint() {
        return endPoint;
    }

    /**
     * Sets the value of the endPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndPoint(String value) {
        this.endPoint = value;
    }

    /**
     * Gets the value of the endDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDateTime() {
        return endDateTime;
    }

    /**
     * Sets the value of the endDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDateTime(XMLGregorianCalendar value) {
        this.endDateTime = value;
    }

}
