
package com.sabre.services.stl.v01;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.sabre.services.stl_header.v120.ErrorType;


/**
 * <p>Java class for ProblemInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProblemInformation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SystemSpecificResults" type="{http://services.sabre.com/STL/v01}SystemSpecificResults" maxOccurs="99" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="type" type="{http://services.sabre.com/STL_Header/v120}ErrorType" />
 *       &lt;attribute name="timeStamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProblemInformation", propOrder = {
    "systemSpecificResults"
})
public class ProblemInformation {

    @XmlElement(name = "SystemSpecificResults")
    protected List<SystemSpecificResults> systemSpecificResults;
    @XmlAttribute(name = "type")
    protected ErrorType type;
    @XmlAttribute(name = "timeStamp")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timeStamp;

    /**
     * Gets the value of the systemSpecificResults property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the systemSpecificResults property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSystemSpecificResults().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SystemSpecificResults }
     * 
     * 
     */
    public List<SystemSpecificResults> getSystemSpecificResults() {
        if (systemSpecificResults == null) {
            systemSpecificResults = new ArrayList<SystemSpecificResults>();
        }
        return this.systemSpecificResults;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link ErrorType }
     *     
     */
    public ErrorType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorType }
     *     
     */
    public void setType(ErrorType value) {
        this.type = value;
    }

    /**
     * Gets the value of the timeStamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimeStamp() {
        return timeStamp;
    }

    /**
     * Sets the value of the timeStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimeStamp(XMLGregorianCalendar value) {
        this.timeStamp = value;
    }

}
