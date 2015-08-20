
package com.sabre.webservices.sabrexml._2011._10;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="EndTransaction" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Email" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="eTicket" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="PDF" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Invoice" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Itinerary" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="PDF" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="Segment" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="EndNumber" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                                               &lt;attribute name="Number" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="PersonName" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="NameNumber" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Source" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="ReceivedFrom" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="ReturnHostCommand" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="TimeStamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="Version" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="2.0.4" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "endTransaction",
    "source"
})
@XmlRootElement(name = "EndTransactionRQ")
public class EndTransactionRQ {

    @XmlElement(name = "EndTransaction")
    protected EndTransactionRQ.EndTransaction endTransaction;
    @XmlElement(name = "Source")
    protected EndTransactionRQ.Source source;
    @XmlAttribute(name = "ReturnHostCommand")
    protected Boolean returnHostCommand;
    @XmlAttribute(name = "TimeStamp")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timeStamp;
    @XmlAttribute(name = "Version", required = true)
    protected String version;

    /**
     * Gets the value of the endTransaction property.
     * 
     * @return
     *     possible object is
     *     {@link EndTransactionRQ.EndTransaction }
     *     
     */
    public EndTransactionRQ.EndTransaction getEndTransaction() {
        return endTransaction;
    }

    /**
     * Sets the value of the endTransaction property.
     * 
     * @param value
     *     allowed object is
     *     {@link EndTransactionRQ.EndTransaction }
     *     
     */
    public void setEndTransaction(EndTransactionRQ.EndTransaction value) {
        this.endTransaction = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link EndTransactionRQ.Source }
     *     
     */
    public EndTransactionRQ.Source getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link EndTransactionRQ.Source }
     *     
     */
    public void setSource(EndTransactionRQ.Source value) {
        this.source = value;
    }

    /**
     * Gets the value of the returnHostCommand property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReturnHostCommand() {
        return returnHostCommand;
    }

    /**
     * Sets the value of the returnHostCommand property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReturnHostCommand(Boolean value) {
        this.returnHostCommand = value;
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

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        if (version == null) {
            return "2.0.4";
        } else {
            return version;
        }
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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Email" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="eTicket" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="PDF" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                           &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Invoice" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Itinerary" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="PDF" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="Segment" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="EndNumber" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *                                     &lt;attribute name="Number" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                           &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="PersonName" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="NameNumber" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "email"
    })
    public static class EndTransaction {

        @XmlElement(name = "Email")
        protected EndTransactionRQ.EndTransaction.Email email;
        @XmlAttribute(name = "Ind", required = true)
        protected boolean ind;

        /**
         * Gets the value of the email property.
         * 
         * @return
         *     possible object is
         *     {@link EndTransactionRQ.EndTransaction.Email }
         *     
         */
        public EndTransactionRQ.EndTransaction.Email getEmail() {
            return email;
        }

        /**
         * Sets the value of the email property.
         * 
         * @param value
         *     allowed object is
         *     {@link EndTransactionRQ.EndTransaction.Email }
         *     
         */
        public void setEmail(EndTransactionRQ.EndTransaction.Email value) {
            this.email = value;
        }

        /**
         * Gets the value of the ind property.
         * 
         */
        public boolean isInd() {
            return ind;
        }

        /**
         * Sets the value of the ind property.
         * 
         */
        public void setInd(boolean value) {
            this.ind = value;
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
         *         &lt;element name="eTicket" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="PDF" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *                 &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Invoice" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Itinerary" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="PDF" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="Segment" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attribute name="EndNumber" type="{http://www.w3.org/2001/XMLSchema}integer" />
         *                           &lt;attribute name="Number" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *                 &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="PersonName" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="NameNumber" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "eTicket",
            "invoice",
            "itinerary",
            "personName"
        })
        public static class Email {

            protected EndTransactionRQ.EndTransaction.Email.ETicket eTicket;
            @XmlElement(name = "Invoice")
            protected EndTransactionRQ.EndTransaction.Email.Invoice invoice;
            @XmlElement(name = "Itinerary")
            protected EndTransactionRQ.EndTransaction.Email.Itinerary itinerary;
            @XmlElement(name = "PersonName")
            protected EndTransactionRQ.EndTransaction.Email.PersonName personName;
            @XmlAttribute(name = "Ind", required = true)
            protected boolean ind;

            /**
             * Gets the value of the eTicket property.
             * 
             * @return
             *     possible object is
             *     {@link EndTransactionRQ.EndTransaction.Email.ETicket }
             *     
             */
            public EndTransactionRQ.EndTransaction.Email.ETicket getETicket() {
                return eTicket;
            }

            /**
             * Sets the value of the eTicket property.
             * 
             * @param value
             *     allowed object is
             *     {@link EndTransactionRQ.EndTransaction.Email.ETicket }
             *     
             */
            public void setETicket(EndTransactionRQ.EndTransaction.Email.ETicket value) {
                this.eTicket = value;
            }

            /**
             * Gets the value of the invoice property.
             * 
             * @return
             *     possible object is
             *     {@link EndTransactionRQ.EndTransaction.Email.Invoice }
             *     
             */
            public EndTransactionRQ.EndTransaction.Email.Invoice getInvoice() {
                return invoice;
            }

            /**
             * Sets the value of the invoice property.
             * 
             * @param value
             *     allowed object is
             *     {@link EndTransactionRQ.EndTransaction.Email.Invoice }
             *     
             */
            public void setInvoice(EndTransactionRQ.EndTransaction.Email.Invoice value) {
                this.invoice = value;
            }

            /**
             * Gets the value of the itinerary property.
             * 
             * @return
             *     possible object is
             *     {@link EndTransactionRQ.EndTransaction.Email.Itinerary }
             *     
             */
            public EndTransactionRQ.EndTransaction.Email.Itinerary getItinerary() {
                return itinerary;
            }

            /**
             * Sets the value of the itinerary property.
             * 
             * @param value
             *     allowed object is
             *     {@link EndTransactionRQ.EndTransaction.Email.Itinerary }
             *     
             */
            public void setItinerary(EndTransactionRQ.EndTransaction.Email.Itinerary value) {
                this.itinerary = value;
            }

            /**
             * Gets the value of the personName property.
             * 
             * @return
             *     possible object is
             *     {@link EndTransactionRQ.EndTransaction.Email.PersonName }
             *     
             */
            public EndTransactionRQ.EndTransaction.Email.PersonName getPersonName() {
                return personName;
            }

            /**
             * Sets the value of the personName property.
             * 
             * @param value
             *     allowed object is
             *     {@link EndTransactionRQ.EndTransaction.Email.PersonName }
             *     
             */
            public void setPersonName(EndTransactionRQ.EndTransaction.Email.PersonName value) {
                this.personName = value;
            }

            /**
             * Gets the value of the ind property.
             * 
             */
            public boolean isInd() {
                return ind;
            }

            /**
             * Sets the value of the ind property.
             * 
             */
            public void setInd(boolean value) {
                this.ind = value;
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
             *         &lt;element name="PDF" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *       &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "pdf"
            })
            public static class ETicket {

                @XmlElement(name = "PDF")
                protected EndTransactionRQ.EndTransaction.Email.ETicket.PDF pdf;
                @XmlAttribute(name = "Ind", required = true)
                protected boolean ind;

                /**
                 * Gets the value of the pdf property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link EndTransactionRQ.EndTransaction.Email.ETicket.PDF }
                 *     
                 */
                public EndTransactionRQ.EndTransaction.Email.ETicket.PDF getPDF() {
                    return pdf;
                }

                /**
                 * Sets the value of the pdf property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link EndTransactionRQ.EndTransaction.Email.ETicket.PDF }
                 *     
                 */
                public void setPDF(EndTransactionRQ.EndTransaction.Email.ETicket.PDF value) {
                    this.pdf = value;
                }

                /**
                 * Gets the value of the ind property.
                 * 
                 */
                public boolean isInd() {
                    return ind;
                }

                /**
                 * Sets the value of the ind property.
                 * 
                 */
                public void setInd(boolean value) {
                    this.ind = value;
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
                 *       &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class PDF {

                    @XmlAttribute(name = "Ind", required = true)
                    protected boolean ind;

                    /**
                     * Gets the value of the ind property.
                     * 
                     */
                    public boolean isInd() {
                        return ind;
                    }

                    /**
                     * Sets the value of the ind property.
                     * 
                     */
                    public void setInd(boolean value) {
                        this.ind = value;
                    }

                }

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
             *       &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Invoice {

                @XmlAttribute(name = "Ind", required = true)
                protected boolean ind;

                /**
                 * Gets the value of the ind property.
                 * 
                 */
                public boolean isInd() {
                    return ind;
                }

                /**
                 * Sets the value of the ind property.
                 * 
                 */
                public void setInd(boolean value) {
                    this.ind = value;
                }

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
             *         &lt;element name="PDF" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="Segment" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="EndNumber" type="{http://www.w3.org/2001/XMLSchema}integer" />
             *                 &lt;attribute name="Number" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *       &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "pdf",
                "segment"
            })
            public static class Itinerary {

                @XmlElement(name = "PDF")
                protected EndTransactionRQ.EndTransaction.Email.Itinerary.PDF pdf;
                @XmlElement(name = "Segment")
                protected List<EndTransactionRQ.EndTransaction.Email.Itinerary.Segment> segment;
                @XmlAttribute(name = "Ind", required = true)
                protected boolean ind;

                /**
                 * Gets the value of the pdf property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link EndTransactionRQ.EndTransaction.Email.Itinerary.PDF }
                 *     
                 */
                public EndTransactionRQ.EndTransaction.Email.Itinerary.PDF getPDF() {
                    return pdf;
                }

                /**
                 * Sets the value of the pdf property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link EndTransactionRQ.EndTransaction.Email.Itinerary.PDF }
                 *     
                 */
                public void setPDF(EndTransactionRQ.EndTransaction.Email.Itinerary.PDF value) {
                    this.pdf = value;
                }

                /**
                 * Gets the value of the segment property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the segment property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getSegment().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link EndTransactionRQ.EndTransaction.Email.Itinerary.Segment }
                 * 
                 * 
                 */
                public List<EndTransactionRQ.EndTransaction.Email.Itinerary.Segment> getSegment() {
                    if (segment == null) {
                        segment = new ArrayList<EndTransactionRQ.EndTransaction.Email.Itinerary.Segment>();
                    }
                    return this.segment;
                }

                /**
                 * Gets the value of the ind property.
                 * 
                 */
                public boolean isInd() {
                    return ind;
                }

                /**
                 * Sets the value of the ind property.
                 * 
                 */
                public void setInd(boolean value) {
                    this.ind = value;
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
                 *       &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class PDF {

                    @XmlAttribute(name = "Ind", required = true)
                    protected boolean ind;

                    /**
                     * Gets the value of the ind property.
                     * 
                     */
                    public boolean isInd() {
                        return ind;
                    }

                    /**
                     * Sets the value of the ind property.
                     * 
                     */
                    public void setInd(boolean value) {
                        this.ind = value;
                    }

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
                 *       &lt;attribute name="EndNumber" type="{http://www.w3.org/2001/XMLSchema}integer" />
                 *       &lt;attribute name="Number" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class Segment {

                    @XmlAttribute(name = "EndNumber")
                    protected BigInteger endNumber;
                    @XmlAttribute(name = "Number", required = true)
                    protected BigInteger number;

                    /**
                     * Gets the value of the endNumber property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigInteger }
                     *     
                     */
                    public BigInteger getEndNumber() {
                        return endNumber;
                    }

                    /**
                     * Sets the value of the endNumber property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigInteger }
                     *     
                     */
                    public void setEndNumber(BigInteger value) {
                        this.endNumber = value;
                    }

                    /**
                     * Gets the value of the number property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigInteger }
                     *     
                     */
                    public BigInteger getNumber() {
                        return number;
                    }

                    /**
                     * Sets the value of the number property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigInteger }
                     *     
                     */
                    public void setNumber(BigInteger value) {
                        this.number = value;
                    }

                }

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
             *       &lt;attribute name="NameNumber" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class PersonName {

                @XmlAttribute(name = "NameNumber", required = true)
                protected String nameNumber;

                /**
                 * Gets the value of the nameNumber property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNameNumber() {
                    return nameNumber;
                }

                /**
                 * Sets the value of the nameNumber property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNameNumber(String value) {
                    this.nameNumber = value;
                }

            }

        }

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
     *       &lt;attribute name="ReceivedFrom" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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

        @XmlAttribute(name = "ReceivedFrom", required = true)
        protected String receivedFrom;

        /**
         * Gets the value of the receivedFrom property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getReceivedFrom() {
            return receivedFrom;
        }

        /**
         * Sets the value of the receivedFrom property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setReceivedFrom(String value) {
            this.receivedFrom = value;
        }

    }

}
