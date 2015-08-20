
package com.sabre.services.stl.v01;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for HostCommand complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HostCommand">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://services.sabre.com/STL_Header/v120>Text.Long">
 *       &lt;attribute name="LNIATA" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostCommand", propOrder = {
    "value"
})
public class HostCommand {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "LNIATA")
    protected String lniata;

    /**
     * Same as STL Text.Long - A field text characters and no other constraints.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the lniata property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLNIATA() {
        return lniata;
    }

    /**
     * Sets the value of the lniata property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLNIATA(String value) {
        this.lniata = value;
    }

}
