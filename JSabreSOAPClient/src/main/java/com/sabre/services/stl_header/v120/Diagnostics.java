
package com.sabre.services.stl_header.v120;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Diagnostics complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Diagnostics">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Level" type="{http://services.sabre.com/STL_Header/v120}DiagnosticLevels" minOccurs="0"/>
 *         &lt;element name="Data" type="{http://services.sabre.com/STL_Header/v120}Text.Long" minOccurs="0"/>
 *         &lt;element name="Diagnostic" type="{http://services.sabre.com/STL_Header/v120}DiagnosticResults" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Diagnostics", propOrder = {
    "level",
    "data",
    "diagnostic"
})
public class Diagnostics {

    @XmlElement(name = "Level")
    protected DiagnosticLevels level;
    @XmlElement(name = "Data")
    protected String data;
    @XmlElement(name = "Diagnostic")
    protected DiagnosticResults diagnostic;

    /**
     * Gets the value of the level property.
     * 
     * @return
     *     possible object is
     *     {@link DiagnosticLevels }
     *     
     */
    public DiagnosticLevels getLevel() {
        return level;
    }

    /**
     * Sets the value of the level property.
     * 
     * @param value
     *     allowed object is
     *     {@link DiagnosticLevels }
     *     
     */
    public void setLevel(DiagnosticLevels value) {
        this.level = value;
    }

    /**
     * Gets the value of the data property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getData() {
        return data;
    }

    /**
     * Sets the value of the data property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setData(String value) {
        this.data = value;
    }

    /**
     * Gets the value of the diagnostic property.
     * 
     * @return
     *     possible object is
     *     {@link DiagnosticResults }
     *     
     */
    public DiagnosticResults getDiagnostic() {
        return diagnostic;
    }

    /**
     * Sets the value of the diagnostic property.
     * 
     * @param value
     *     allowed object is
     *     {@link DiagnosticResults }
     *     
     */
    public void setDiagnostic(DiagnosticResults value) {
        this.diagnostic = value;
    }

}
