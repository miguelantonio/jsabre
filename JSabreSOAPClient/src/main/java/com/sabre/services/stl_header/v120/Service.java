
package com.sabre.services.stl_header.v120;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for Service complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Service">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://services.sabre.com/STL_Header/v120>Text.Short">
 *       &lt;attribute name="operation" type="{http://services.sabre.com/STL_Header/v120}Text.Short" />
 *       &lt;attribute name="version" type="{http://services.sabre.com/STL_Header/v120}Text.Short" />
 *       &lt;attribute name="ttl" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Service", propOrder = {
    "value"
})
public class Service {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "operation")
    protected String operation;
    @XmlAttribute(name = "version")
    protected String version;
    @XmlAttribute(name = "ttl")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger ttl;

    /**
     * Same as STL Text.Short - A field of text characters and no other constraints.
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
     * Gets the value of the operation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperation() {
        return operation;
    }

    /**
     * Sets the value of the operation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperation(String value) {
        this.operation = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the ttl property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTtl() {
        return ttl;
    }

    /**
     * Sets the value of the ttl property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTtl(BigInteger value) {
        this.ttl = value;
    }

}
