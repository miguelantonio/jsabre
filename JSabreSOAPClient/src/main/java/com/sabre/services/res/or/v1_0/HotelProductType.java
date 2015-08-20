
package com.sabre.services.res.or.v1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HotelProductType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HotelProductType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.sabre.com/res/or/v1_0}HotelType">
 *       &lt;sequence>
 *         &lt;element name="RateDescription" type="{http://services.sabre.com/res/or/v1_0}MultilineTextType" minOccurs="0"/>
 *         &lt;element name="HotelPolicy">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="DepositPolicy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="GuaranteePolicy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="LateArrivalPolicy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="CancellationPolicy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="AdditionalPolicy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="SupplementalInformation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HotelProductType", propOrder = {
    "rateDescription",
    "hotelPolicy",
    "supplementalInformation"
})
public class HotelProductType
    extends HotelType
{

    @XmlElement(name = "RateDescription")
    protected MultilineTextType rateDescription;
    @XmlElement(name = "HotelPolicy", required = true)
    protected HotelProductType.HotelPolicy hotelPolicy;
    @XmlElement(name = "SupplementalInformation")
    protected String supplementalInformation;

    /**
     * Gets the value of the rateDescription property.
     * 
     * @return
     *     possible object is
     *     {@link MultilineTextType }
     *     
     */
    public MultilineTextType getRateDescription() {
        return rateDescription;
    }

    /**
     * Sets the value of the rateDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilineTextType }
     *     
     */
    public void setRateDescription(MultilineTextType value) {
        this.rateDescription = value;
    }

    /**
     * Gets the value of the hotelPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link HotelProductType.HotelPolicy }
     *     
     */
    public HotelProductType.HotelPolicy getHotelPolicy() {
        return hotelPolicy;
    }

    /**
     * Sets the value of the hotelPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelProductType.HotelPolicy }
     *     
     */
    public void setHotelPolicy(HotelProductType.HotelPolicy value) {
        this.hotelPolicy = value;
    }

    /**
     * Gets the value of the supplementalInformation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplementalInformation() {
        return supplementalInformation;
    }

    /**
     * Sets the value of the supplementalInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplementalInformation(String value) {
        this.supplementalInformation = value;
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
     *         &lt;element name="DepositPolicy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="GuaranteePolicy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="LateArrivalPolicy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="CancellationPolicy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="AdditionalPolicy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "depositPolicy",
        "guaranteePolicy",
        "lateArrivalPolicy",
        "cancellationPolicy",
        "additionalPolicy"
    })
    public static class HotelPolicy {

        @XmlElement(name = "DepositPolicy")
        protected String depositPolicy;
        @XmlElement(name = "GuaranteePolicy")
        protected String guaranteePolicy;
        @XmlElement(name = "LateArrivalPolicy")
        protected String lateArrivalPolicy;
        @XmlElement(name = "CancellationPolicy")
        protected String cancellationPolicy;
        @XmlElement(name = "AdditionalPolicy")
        protected String additionalPolicy;

        /**
         * Gets the value of the depositPolicy property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDepositPolicy() {
            return depositPolicy;
        }

        /**
         * Sets the value of the depositPolicy property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDepositPolicy(String value) {
            this.depositPolicy = value;
        }

        /**
         * Gets the value of the guaranteePolicy property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGuaranteePolicy() {
            return guaranteePolicy;
        }

        /**
         * Sets the value of the guaranteePolicy property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGuaranteePolicy(String value) {
            this.guaranteePolicy = value;
        }

        /**
         * Gets the value of the lateArrivalPolicy property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLateArrivalPolicy() {
            return lateArrivalPolicy;
        }

        /**
         * Sets the value of the lateArrivalPolicy property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLateArrivalPolicy(String value) {
            this.lateArrivalPolicy = value;
        }

        /**
         * Gets the value of the cancellationPolicy property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCancellationPolicy() {
            return cancellationPolicy;
        }

        /**
         * Sets the value of the cancellationPolicy property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCancellationPolicy(String value) {
            this.cancellationPolicy = value;
        }

        /**
         * Gets the value of the additionalPolicy property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAdditionalPolicy() {
            return additionalPolicy;
        }

        /**
         * Sets the value of the additionalPolicy property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAdditionalPolicy(String value) {
            this.additionalPolicy = value;
        }

    }

}
