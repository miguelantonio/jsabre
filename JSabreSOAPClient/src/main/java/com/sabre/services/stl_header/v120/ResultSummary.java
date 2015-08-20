
package com.sabre.services.stl_header.v120;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResultSummary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResultSummary">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="Success" type="{http://services.sabre.com/STL_Header/v120}EmptyElement"/>
 *         &lt;element name="Error" type="{http://services.sabre.com/STL_Header/v120}ProblemSummary"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResultSummary", propOrder = {
    "success",
    "error"
})
public class ResultSummary {

    @XmlElement(name = "Success")
    protected String success;
    @XmlElement(name = "Error")
    protected ProblemSummary error;

    /**
     * Gets the value of the success property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuccess() {
        return success;
    }

    /**
     * Sets the value of the success property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuccess(String value) {
        this.success = value;
    }

    /**
     * Gets the value of the error property.
     * 
     * @return
     *     possible object is
     *     {@link ProblemSummary }
     *     
     */
    public ProblemSummary getError() {
        return error;
    }

    /**
     * Sets the value of the error property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProblemSummary }
     *     
     */
    public void setError(ProblemSummary value) {
        this.error = value;
    }

}
