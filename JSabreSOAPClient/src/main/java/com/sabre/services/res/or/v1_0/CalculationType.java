
package com.sabre.services.res.or.v1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CalculationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CalculationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UnitName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UnitCharge" type="{http://services.sabre.com/res/or/v1_0}MinMaxType" minOccurs="0"/>
 *         &lt;element name="Quantity" type="{http://services.sabre.com/res/or/v1_0}MinMaxType" minOccurs="0"/>
 *         &lt;element name="Total" type="{http://services.sabre.com/res/or/v1_0}MinMaxType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CalculationType", propOrder = {
    "unitName",
    "unitCharge",
    "quantity",
    "total"
})
public class CalculationType {

    @XmlElement(name = "UnitName")
    protected String unitName;
    @XmlElement(name = "UnitCharge")
    protected MinMaxType unitCharge;
    @XmlElement(name = "Quantity")
    protected MinMaxType quantity;
    @XmlElement(name = "Total")
    protected MinMaxType total;

    /**
     * Gets the value of the unitName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitName() {
        return unitName;
    }

    /**
     * Sets the value of the unitName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitName(String value) {
        this.unitName = value;
    }

    /**
     * Gets the value of the unitCharge property.
     * 
     * @return
     *     possible object is
     *     {@link MinMaxType }
     *     
     */
    public MinMaxType getUnitCharge() {
        return unitCharge;
    }

    /**
     * Sets the value of the unitCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link MinMaxType }
     *     
     */
    public void setUnitCharge(MinMaxType value) {
        this.unitCharge = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link MinMaxType }
     *     
     */
    public MinMaxType getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link MinMaxType }
     *     
     */
    public void setQuantity(MinMaxType value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the total property.
     * 
     * @return
     *     possible object is
     *     {@link MinMaxType }
     *     
     */
    public MinMaxType getTotal() {
        return total;
    }

    /**
     * Sets the value of the total property.
     * 
     * @param value
     *     allowed object is
     *     {@link MinMaxType }
     *     
     */
    public void setTotal(MinMaxType value) {
        this.total = value;
    }

}
