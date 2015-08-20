
package com.sabre.services.res.or.v1_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProductBase" type="{http://services.sabre.com/res/or/v1_0}ProductBaseType"/>
 *         &lt;element name="ProductDetails" type="{http://services.sabre.com/res/or/v1_0}ProductDetailsType" minOccurs="0"/>
 *         &lt;element name="AdditionalContent" type="{http://services.sabre.com/res/or/v1_0}AdditionalContentType" maxOccurs="99" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="sequence" type="{http://www.w3.org/2001/XMLSchema}short" />
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductType", propOrder = {
    "productBase",
    "productDetails",
    "additionalContent"
})
public class ProductType {

    @XmlElement(name = "ProductBase", required = true)
    protected ProductBaseType productBase;
    @XmlElement(name = "ProductDetails")
    protected ProductDetailsType productDetails;
    @XmlElement(name = "AdditionalContent")
    protected List<AdditionalContentType> additionalContent;
    @XmlAttribute(name = "sequence")
    protected Short sequence;
    @XmlAttribute(name = "id")
    protected String id;

    /**
     * Gets the value of the productBase property.
     * 
     * @return
     *     possible object is
     *     {@link ProductBaseType }
     *     
     */
    public ProductBaseType getProductBase() {
        return productBase;
    }

    /**
     * Sets the value of the productBase property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductBaseType }
     *     
     */
    public void setProductBase(ProductBaseType value) {
        this.productBase = value;
    }

    /**
     * Gets the value of the productDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ProductDetailsType }
     *     
     */
    public ProductDetailsType getProductDetails() {
        return productDetails;
    }

    /**
     * Sets the value of the productDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductDetailsType }
     *     
     */
    public void setProductDetails(ProductDetailsType value) {
        this.productDetails = value;
    }

    /**
     * Gets the value of the additionalContent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalContent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalContentType }
     * 
     * 
     */
    public List<AdditionalContentType> getAdditionalContent() {
        if (additionalContent == null) {
            additionalContent = new ArrayList<AdditionalContentType>();
        }
        return this.additionalContent;
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

}
