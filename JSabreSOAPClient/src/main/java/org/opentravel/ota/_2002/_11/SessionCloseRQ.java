
package org.opentravel.ota._2002._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *         &lt;element name="POS">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Source">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="PseudoCityCode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
    "pos"
})
@XmlRootElement(name = "SessionCloseRQ")
public class SessionCloseRQ {

    @XmlElement(name = "POS", required = true)
    protected SessionCloseRQ.POS pos;

    /**
     * Gets the value of the pos property.
     * 
     * @return
     *     possible object is
     *     {@link SessionCloseRQ.POS }
     *     
     */
    public SessionCloseRQ.POS getPOS() {
        return pos;
    }

    /**
     * Sets the value of the pos property.
     * 
     * @param value
     *     allowed object is
     *     {@link SessionCloseRQ.POS }
     *     
     */
    public void setPOS(SessionCloseRQ.POS value) {
        this.pos = value;
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
     *         &lt;element name="Source">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="PseudoCityCode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
        "source"
    })
    public static class POS {

        @XmlElement(name = "Source", required = true)
        protected SessionCloseRQ.POS.Source source;

        /**
         * Gets the value of the source property.
         * 
         * @return
         *     possible object is
         *     {@link SessionCloseRQ.POS.Source }
         *     
         */
        public SessionCloseRQ.POS.Source getSource() {
            return source;
        }

        /**
         * Sets the value of the source property.
         * 
         * @param value
         *     allowed object is
         *     {@link SessionCloseRQ.POS.Source }
         *     
         */
        public void setSource(SessionCloseRQ.POS.Source value) {
            this.source = value;
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
         *       &lt;attribute name="PseudoCityCode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Source {

            @XmlAttribute(name = "PseudoCityCode", required = true)
            protected String pseudoCityCode;

            /**
             * Gets the value of the pseudoCityCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPseudoCityCode() {
                return pseudoCityCode;
            }

            /**
             * Sets the value of the pseudoCityCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPseudoCityCode(String value) {
                this.pseudoCityCode = value;
            }

        }

    }

}
