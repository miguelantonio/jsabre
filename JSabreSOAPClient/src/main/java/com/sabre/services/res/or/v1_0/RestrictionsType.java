
package com.sabre.services.res.or.v1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RestrictionsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RestrictionsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CancelPolicy" type="{http://services.sabre.com/res/or/v1_0}MultilineTextType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RestrictionsType", propOrder = {
    "cancelPolicy"
})
public class RestrictionsType {

    @XmlElement(name = "CancelPolicy", required = true)
    protected MultilineTextType cancelPolicy;

    /**
     * Gets the value of the cancelPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link MultilineTextType }
     *     
     */
    public MultilineTextType getCancelPolicy() {
        return cancelPolicy;
    }

    /**
     * Sets the value of the cancelPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilineTextType }
     *     
     */
    public void setCancelPolicy(MultilineTextType value) {
        this.cancelPolicy = value;
    }

}
