
package com.sabre.webservices.sabrexml._2011._10;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.sabre.services.stl.v01.ApplicationResults;


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
 *         &lt;element ref="{http://services.sabre.com/STL/v01}ApplicationResults"/>
 *         &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Version" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "applicationResults",
    "text"
})
@XmlRootElement(name = "OTA_CancelRS")
public class OTACancelRS {

    @XmlElement(name = "ApplicationResults", namespace = "http://services.sabre.com/STL/v01", required = true)
    protected ApplicationResults applicationResults;
    @XmlElement(name = "Text")
    protected List<String> text;
    @XmlAttribute(name = "Version")
    protected String version;

    /**
     * Gets the value of the applicationResults property.
     * 
     * @return
     *     possible object is
     *     {@link ApplicationResults }
     *     
     */
    public ApplicationResults getApplicationResults() {
        return applicationResults;
    }

    /**
     * Sets the value of the applicationResults property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicationResults }
     *     
     */
    public void setApplicationResults(ApplicationResults value) {
        this.applicationResults = value;
    }

    /**
     * Gets the value of the text property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the text property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getText() {
        if (text == null) {
            text = new ArrayList<String>();
        }
        return this.text;
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

}
