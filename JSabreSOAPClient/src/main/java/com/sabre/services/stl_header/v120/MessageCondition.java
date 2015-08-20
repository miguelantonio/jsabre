
package com.sabre.services.stl_header.v120;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * Free text and code provided by the application or system that detected the condition. 
 * 			Contents may be anything the system detecting the error chooses to convey. Used by service consumers.  
 * 			Codes and/or messages should be agreed upon by service users. 
 * 			Do not use for structured data, use parameters instead.
 * 			
 * 
 * <p>Java class for Message.Condition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Message.Condition">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://services.sabre.com/STL_Header/v120>Text.Long">
 *       &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Message.Condition", propOrder = {
    "value"
})
public class MessageCondition {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "code")
    protected String code;

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
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

}
