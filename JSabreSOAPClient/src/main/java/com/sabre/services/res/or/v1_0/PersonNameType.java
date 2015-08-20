
package com.sabre.services.res.or.v1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PersonNameType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PersonNameType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Prefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Given" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Middle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Surname" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Suffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PreferredFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PreferredSurname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonNameType", propOrder = {
    "prefix",
    "given",
    "middle",
    "surname",
    "suffix",
    "type",
    "preferredFirstName",
    "preferredSurname"
})
public class PersonNameType {

    @XmlElement(name = "Prefix")
    protected String prefix;
    @XmlElement(name = "Given")
    protected String given;
    @XmlElement(name = "Middle")
    protected String middle;
    @XmlElement(name = "Surname", required = true)
    protected String surname;
    @XmlElement(name = "Suffix")
    protected String suffix;
    @XmlElement(name = "Type")
    protected String type;
    @XmlElement(name = "PreferredFirstName")
    protected String preferredFirstName;
    @XmlElement(name = "PreferredSurname")
    protected String preferredSurname;

    /**
     * Gets the value of the prefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrefix() {
        return prefix;
    }

    /**
     * Sets the value of the prefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrefix(String value) {
        this.prefix = value;
    }

    /**
     * Gets the value of the given property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGiven() {
        return given;
    }

    /**
     * Sets the value of the given property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGiven(String value) {
        this.given = value;
    }

    /**
     * Gets the value of the middle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiddle() {
        return middle;
    }

    /**
     * Sets the value of the middle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiddle(String value) {
        this.middle = value;
    }

    /**
     * Gets the value of the surname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSurname() {
        return surname;
    }

    /**
     * Sets the value of the surname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSurname(String value) {
        this.surname = value;
    }

    /**
     * Gets the value of the suffix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuffix() {
        return suffix;
    }

    /**
     * Sets the value of the suffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuffix(String value) {
        this.suffix = value;
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
     * Gets the value of the preferredFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreferredFirstName() {
        return preferredFirstName;
    }

    /**
     * Sets the value of the preferredFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreferredFirstName(String value) {
        this.preferredFirstName = value;
    }

    /**
     * Gets the value of the preferredSurname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreferredSurname() {
        return preferredSurname;
    }

    /**
     * Sets the value of the preferredSurname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreferredSurname(String value) {
        this.preferredSurname = value;
    }

}
