
package com.sabre.services.res.or.v1_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChargesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChargesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GeneralNotes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Charge" type="{http://services.sabre.com/res/or/v1_0}ChargeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="GrandTotal" type="{http://services.sabre.com/res/or/v1_0}MoneyType" minOccurs="0"/>
 *         &lt;element name="GeneralBillingType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChargesType", propOrder = {
    "generalNotes",
    "charge",
    "grandTotal",
    "generalBillingType"
})
public class ChargesType {

    @XmlElement(name = "GeneralNotes")
    protected String generalNotes;
    @XmlElement(name = "Charge")
    protected List<ChargeType> charge;
    @XmlElement(name = "GrandTotal")
    protected MoneyType grandTotal;
    @XmlElement(name = "GeneralBillingType")
    protected String generalBillingType;

    /**
     * Gets the value of the generalNotes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeneralNotes() {
        return generalNotes;
    }

    /**
     * Sets the value of the generalNotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeneralNotes(String value) {
        this.generalNotes = value;
    }

    /**
     * Gets the value of the charge property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the charge property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCharge().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChargeType }
     * 
     * 
     */
    public List<ChargeType> getCharge() {
        if (charge == null) {
            charge = new ArrayList<ChargeType>();
        }
        return this.charge;
    }

    /**
     * Gets the value of the grandTotal property.
     * 
     * @return
     *     possible object is
     *     {@link MoneyType }
     *     
     */
    public MoneyType getGrandTotal() {
        return grandTotal;
    }

    /**
     * Sets the value of the grandTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link MoneyType }
     *     
     */
    public void setGrandTotal(MoneyType value) {
        this.grandTotal = value;
    }

    /**
     * Gets the value of the generalBillingType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeneralBillingType() {
        return generalBillingType;
    }

    /**
     * Sets the value of the generalBillingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeneralBillingType(String value) {
        this.generalBillingType = value;
    }

}
