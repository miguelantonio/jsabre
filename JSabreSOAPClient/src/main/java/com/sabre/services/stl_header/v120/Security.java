
package com.sabre.services.stl_header.v120;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Header records no longer contain user credentials (username/password) as these are needed only for 
 *      		 SessionCreateRQ in which the credentials should be in the payload.
 *      		 
 * 
 * <p>Java class for Security complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Security">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="SecurityToken" type="{http://services.sabre.com/STL_Header/v120}Text.Long"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Security", propOrder = {
    "securityToken"
})
public class Security {

    @XmlElement(name = "SecurityToken")
    protected String securityToken;

    /**
     * Gets the value of the securityToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecurityToken() {
        return securityToken;
    }

    /**
     * Sets the value of the securityToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecurityToken(String value) {
        this.securityToken = value;
    }

}
