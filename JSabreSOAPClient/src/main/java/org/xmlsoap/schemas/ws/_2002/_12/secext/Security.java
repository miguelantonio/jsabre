
package org.xmlsoap.schemas.ws._2002._12.secext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UsernameToken" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Username" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="NewPassword" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="2" minOccurs="0"/>
 *                   &lt;element name="Organization" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *                   &lt;element name="Domain" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="SabreAth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BinarySecurityToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "usernameToken",
    "sabreAth",
    "binarySecurityToken"
})
@XmlRootElement(name = "Security")
public class Security {

    @XmlElement(name = "UsernameToken")
    protected Security.UsernameToken usernameToken;
    @XmlElement(name = "SabreAth")
    protected String sabreAth;
    @XmlElement(name = "BinarySecurityToken")
    protected String binarySecurityToken;

    /**
     * Gets the value of the usernameToken property.
     * 
     * @return
     *     possible object is
     *     {@link Security.UsernameToken }
     *     
     */
    public Security.UsernameToken getUsernameToken() {
        return usernameToken;
    }

    /**
     * Sets the value of the usernameToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link Security.UsernameToken }
     *     
     */
    public void setUsernameToken(Security.UsernameToken value) {
        this.usernameToken = value;
    }

    /**
     * Gets the value of the sabreAth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSabreAth() {
        return sabreAth;
    }

    /**
     * Sets the value of the sabreAth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSabreAth(String value) {
        this.sabreAth = value;
    }

    /**
     * Gets the value of the binarySecurityToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBinarySecurityToken() {
        return binarySecurityToken;
    }

    /**
     * Sets the value of the binarySecurityToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBinarySecurityToken(String value) {
        this.binarySecurityToken = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Username" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="NewPassword" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="2" minOccurs="0"/>
     *         &lt;element name="Organization" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
     *         &lt;element name="Domain" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "username",
        "password",
        "newPassword",
        "organization",
        "domain"
    })
    public static class UsernameToken {

        @XmlElement(name = "Username")
        protected String username;
        @XmlElement(name = "Password")
        protected String password;
        @XmlElement(name = "NewPassword")
        protected List<String> newPassword;
        @XmlElement(name = "Organization", namespace = "")
        protected String organization;
        @XmlElement(name = "Domain", namespace = "")
        protected String domain;

        /**
         * Gets the value of the username property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUsername() {
            return username;
        }

        /**
         * Sets the value of the username property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUsername(String value) {
            this.username = value;
        }

        /**
         * Gets the value of the password property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPassword() {
            return password;
        }

        /**
         * Sets the value of the password property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPassword(String value) {
            this.password = value;
        }

        /**
         * Gets the value of the newPassword property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the newPassword property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getNewPassword().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getNewPassword() {
            if (newPassword == null) {
                newPassword = new ArrayList<String>();
            }
            return this.newPassword;
        }

        /**
         * Gets the value of the organization property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOrganization() {
            return organization;
        }

        /**
         * Sets the value of the organization property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOrganization(String value) {
            this.organization = value;
        }

        /**
         * Gets the value of the domain property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDomain() {
            return domain;
        }

        /**
         * Sets the value of the domain property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDomain(String value) {
            this.domain = value;
        }

    }

}
