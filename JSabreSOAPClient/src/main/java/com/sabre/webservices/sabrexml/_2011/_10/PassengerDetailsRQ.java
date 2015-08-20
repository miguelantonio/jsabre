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
 * <p>
 * Java class for anonymous complex type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 *
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IgnoreOnError" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="MiscSegmentSellRQ" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="MiscSegment">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="OriginLocation">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="LocationCode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="VendorPrefs">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Airline">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attribute name="DepartureDateTime" use="required" type="{http://webservices.sabre.com/sabreXML/2011/10}date" />
 *                           &lt;attribute name="InsertAfter" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                           &lt;attribute name="NumberInParty" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                           &lt;attribute name="Status" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="Type" use="required">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;enumeration value="INS"/>
 *                                 &lt;enumeration value="MCO"/>
 *                                 &lt;enumeration value="OTH"/>
 *                                 &lt;enumeration value="PTA"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="HaltOnError" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PostProcessing" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ARUNK_RQ" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="HaltOnError" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="EndTransactionRQ" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="EndTransaction" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Email" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="eTicket" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="PDF" minOccurs="0">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                                                 &lt;/restriction>
 *                                                               &lt;/complexContent>
 *                                                             &lt;/complexType>
 *                                                           &lt;/element>
 *                                                         &lt;/sequence>
 *                                                         &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="Invoice" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="Itinerary" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="PDF" minOccurs="0">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                                                 &lt;/restriction>
 *                                                               &lt;/complexContent>
 *                                                             &lt;/complexType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="Segment" maxOccurs="unbounded" minOccurs="0">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;attribute name="EndNumber" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                                                                   &lt;attribute name="Number" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                                                                 &lt;/restriction>
 *                                                               &lt;/complexContent>
 *                                                             &lt;/complexType>
 *                                                           &lt;/element>
 *                                                         &lt;/sequence>
 *                                                         &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="PersonName" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;attribute name="NameNumber" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                               &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Source" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="ReceivedFrom" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attribute name="HaltOnError" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="QueuePlaceRQ" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="MultiQueuePlace" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="QueueIdentifier" maxOccurs="20">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="Number" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="PrefatoryInstructionCode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="PseudoCityCode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="QueueInfo" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="QueueIdentifier" maxOccurs="3">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="Number" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="PrefatoryInstructionCode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="PseudoCityCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="UniqueID" maxOccurs="6" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attribute name="HaltOnError" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="HaltOnError" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="IgnoreAfter" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="RedisplayReservation" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PreProcessing" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="UniqueID" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="HaltOnError" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="IgnoreBefore" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PriceQuoteInfo" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Link" maxOccurs="98">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="HostedCarrier" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                           &lt;attribute name="NameNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="Record" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="HaltOnError" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ProfileRQ" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="UniqueID">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="HaltOnError" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="SpecialReqDetails" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="AddRemarkRQ" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="RemarkInfo">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="FOP_Remark" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="CC_Info" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="PaymentCard">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;attribute name="AirlineCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                   &lt;attribute name="CardSecurityCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                   &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                   &lt;attribute name="ExpireDate" use="required" type="{http://webservices.sabre.com/sabreXML/2011/10}expireDate" />
 *                                                                   &lt;attribute name="ExtendedPayment" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                   &lt;attribute name="ManualApprovalCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                   &lt;attribute name="Number" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                   &lt;attribute name="SuppressApprovalCode" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *                                                                 &lt;/restriction>
 *                                                               &lt;/complexContent>
 *                                                             &lt;/complexType>
 *                                                           &lt;/element>
 *                                                         &lt;/sequence>
 *                                                         &lt;attribute name="Suppress" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                               &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="FutureQueuePlaceRemark" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="Date" use="required" type="{http://webservices.sabre.com/sabreXML/2011/10}date" />
 *                                               &lt;attribute name="PrefatoryInstructionCode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="PseudoCityCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="QueueIdentifier" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="Time" type="{http://webservices.sabre.com/sabreXML/2011/10}time" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="Remark" maxOccurs="98" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                               &lt;/sequence>
 *                                               &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="SegmentNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="Type" use="required">
 *                                                 &lt;simpleType>
 *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                     &lt;enumeration value="Alpha-Coded"/>
 *                                                     &lt;enumeration value="Client Address"/>
 *                                                     &lt;enumeration value="Corporate"/>
 *                                                     &lt;enumeration value="Delivery Address"/>
 *                                                     &lt;enumeration value="General"/>
 *                                                     &lt;enumeration value="Group Name"/>
 *                                                     &lt;enumeration value="Hidden"/>
 *                                                     &lt;enumeration value="Historical"/>
 *                                                     &lt;enumeration value="Invoice"/>
 *                                                     &lt;enumeration value="Itinerary"/>
 *                                                   &lt;/restriction>
 *                                                 &lt;/simpleType>
 *                                               &lt;/attribute>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attribute name="HaltOnError" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="AirSeatRQ" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Seats">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Seat" maxOccurs="98">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="BoardingPass" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                               &lt;attribute name="ChangeOfGauge" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                               &lt;attribute name="NameNumber" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="Number" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="Preference" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="SegmentNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attribute name="HaltOnError" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="SpecialServiceRQ" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="SpecialServiceInfo">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="SecureFlight" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="PersonName" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="GivenName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                           &lt;element name="Surname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                         &lt;/sequence>
 *                                                         &lt;attribute name="DateOfBirth" type="{http://webservices.sabre.com/sabreXML/2011/10}date" />
 *                                                         &lt;attribute name="Gender">
 *                                                           &lt;simpleType>
 *                                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                               &lt;enumeration value="F"/>
 *                                                               &lt;enumeration value="M"/>
 *                                                               &lt;enumeration value="FI"/>
 *                                                               &lt;enumeration value="MI"/>
 *                                                             &lt;/restriction>
 *                                                           &lt;/simpleType>
 *                                                         &lt;/attribute>
 *                                                         &lt;attribute name="NameNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="RedressNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="VendorPrefs" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="Airline">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;attribute name="Hosted" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                                                 &lt;/restriction>
 *                                                               &lt;/complexContent>
 *                                                             &lt;/complexType>
 *                                                           &lt;/element>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                               &lt;attribute name="SegmentNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="SSR_Code" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="Service" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="PersonName" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;attribute name="NameNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="VendorPrefs" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="Airline">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                   &lt;attribute name="Hosted" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                                                 &lt;/restriction>
 *                                                               &lt;/complexContent>
 *                                                             &lt;/complexType>
 *                                                           &lt;/element>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                               &lt;attribute name="SegmentNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="SSR_Code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attribute name="HaltOnError" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="TravelItineraryAddInfoRQ" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="AgencyInfo" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Address" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="AddressLine" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="CityName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="CountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="PostalCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="StateCountyProv" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="StateCode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="StreetNmbr" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="VendorPrefs" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="Airline">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;attribute name="Hosted" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Ticketing" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="PseudoCityCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="QueueNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="ShortText" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="TicketTimeLimit" type="{http://webservices.sabre.com/sabreXML/2011/10}dateTime" />
 *                                     &lt;attribute name="TicketType" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="CustomerInfo" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ContactNumbers" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="ContactNumber" maxOccurs="unbounded">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="InsertAfter" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                                               &lt;attribute name="LocationCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="NameNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="Phone" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="PhoneUseType" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Corporate" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="CustLoyalty" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="MembershipID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="NameNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="ProgramID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="SegmentNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="TravelingCarrierCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="CustomerIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Email" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="Address" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="NameNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="ShortText" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="Type">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                           &lt;enumeration value="BC"/>
 *                                           &lt;enumeration value="CC"/>
 *                                           &lt;enumeration value="FR"/>
 *                                           &lt;enumeration value="TO"/>
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="PersonName" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="GivenName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="GroupInfo" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="VendorPrefs" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="Airline">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                 &lt;/restriction>
 *                                                               &lt;/complexContent>
 *                                                             &lt;/complexType>
 *                                                           &lt;/element>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                               &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="NumSeatsRemaining" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="Surname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="Infant" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                     &lt;attribute name="NameNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="NameReference" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="PassengerType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="HaltOnError" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="ReturnHostCommand" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="TimeStamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="Version" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="2.3.0" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "ignoreOnError",
    "miscSegmentSellRQ",
    "postProcessing",
    "preProcessing",
    "priceQuoteInfo",
    "profileRQ",
    "specialReqDetails",
    "travelItineraryAddInfoRQ"
})
@XmlRootElement(name = "PassengerDetailsRQ")
public class PassengerDetailsRQ {

    @XmlElement(name = "IgnoreOnError")
    protected PassengerDetailsRQ.IgnoreOnError ignoreOnError;
    @XmlElement(name = "MiscSegmentSellRQ")
    protected PassengerDetailsRQ.MiscSegmentSellRQ miscSegmentSellRQ;
    @XmlElement(name = "PostProcessing")
    protected PassengerDetailsRQ.PostProcessing postProcessing;
    @XmlElement(name = "PreProcessing")
    protected PassengerDetailsRQ.PreProcessing preProcessing;
    @XmlElement(name = "PriceQuoteInfo")
    protected PassengerDetailsRQ.PriceQuoteInfo priceQuoteInfo;
    @XmlElement(name = "ProfileRQ")
    protected PassengerDetailsRQ.ProfileRQ profileRQ;
    @XmlElement(name = "SpecialReqDetails")
    protected PassengerDetailsRQ.SpecialReqDetails specialReqDetails;
    @XmlElement(name = "TravelItineraryAddInfoRQ")
    protected PassengerDetailsRQ.TravelItineraryAddInfoRQ travelItineraryAddInfoRQ;
    @XmlAttribute(name = "ReturnHostCommand")
    protected Boolean returnHostCommand;
    @XmlAttribute(name = "TimeStamp")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timeStamp;
    @XmlAttribute(name = "Version", required = true)
    protected String version;

    /**
     * Gets the value of the ignoreOnError property.
     *
     * @return possible object is {@link PassengerDetailsRQ.IgnoreOnError }
     *
     */
    public PassengerDetailsRQ.IgnoreOnError getIgnoreOnError() {
        return ignoreOnError;
    }

    /**
     * Sets the value of the ignoreOnError property.
     *
     * @param value allowed object is {@link PassengerDetailsRQ.IgnoreOnError }
     *
     */
    public void setIgnoreOnError(PassengerDetailsRQ.IgnoreOnError value) {
        this.ignoreOnError = value;
    }

    /**
     * Gets the value of the miscSegmentSellRQ property.
     *
     * @return possible object is {@link PassengerDetailsRQ.MiscSegmentSellRQ }
     *
     */
    public PassengerDetailsRQ.MiscSegmentSellRQ getMiscSegmentSellRQ() {
        return miscSegmentSellRQ;
    }

    /**
     * Sets the value of the miscSegmentSellRQ property.
     *
     * @param value allowed object is
     *     {@link PassengerDetailsRQ.MiscSegmentSellRQ }
     *
     */
    public void setMiscSegmentSellRQ(PassengerDetailsRQ.MiscSegmentSellRQ value) {
        this.miscSegmentSellRQ = value;
    }

    /**
     * Gets the value of the postProcessing property.
     *
     * @return possible object is {@link PassengerDetailsRQ.PostProcessing }
     *
     */
    public PassengerDetailsRQ.PostProcessing getPostProcessing() {
        return postProcessing;
    }

    /**
     * Sets the value of the postProcessing property.
     *
     * @param value allowed object is {@link PassengerDetailsRQ.PostProcessing }
     *
     */
    public void setPostProcessing(PassengerDetailsRQ.PostProcessing value) {
        this.postProcessing = value;
    }

    /**
     * Gets the value of the preProcessing property.
     *
     * @return possible object is {@link PassengerDetailsRQ.PreProcessing }
     *
     */
    public PassengerDetailsRQ.PreProcessing getPreProcessing() {
        return preProcessing;
    }

    /**
     * Sets the value of the preProcessing property.
     *
     * @param value allowed object is {@link PassengerDetailsRQ.PreProcessing }
     *
     */
    public void setPreProcessing(PassengerDetailsRQ.PreProcessing value) {
        this.preProcessing = value;
    }

    /**
     * Gets the value of the priceQuoteInfo property.
     *
     * @return possible object is {@link PassengerDetailsRQ.PriceQuoteInfo }
     *
     */
    public PassengerDetailsRQ.PriceQuoteInfo getPriceQuoteInfo() {
        return priceQuoteInfo;
    }

    /**
     * Sets the value of the priceQuoteInfo property.
     *
     * @param value allowed object is {@link PassengerDetailsRQ.PriceQuoteInfo }
     *
     */
    public void setPriceQuoteInfo(PassengerDetailsRQ.PriceQuoteInfo value) {
        this.priceQuoteInfo = value;
    }

    /**
     * Gets the value of the profileRQ property.
     *
     * @return possible object is {@link PassengerDetailsRQ.ProfileRQ }
     *
     */
    public PassengerDetailsRQ.ProfileRQ getProfileRQ() {
        return profileRQ;
    }

    /**
     * Sets the value of the profileRQ property.
     *
     * @param value allowed object is {@link PassengerDetailsRQ.ProfileRQ }
     *
     */
    public void setProfileRQ(PassengerDetailsRQ.ProfileRQ value) {
        this.profileRQ = value;
    }

    /**
     * Gets the value of the specialReqDetails property.
     *
     * @return possible object is {@link PassengerDetailsRQ.SpecialReqDetails }
     *
     */
    public PassengerDetailsRQ.SpecialReqDetails getSpecialReqDetails() {
        return specialReqDetails;
    }

    /**
     * Sets the value of the specialReqDetails property.
     *
     * @param value allowed object is
     *     {@link PassengerDetailsRQ.SpecialReqDetails }
     *
     */
    public void setSpecialReqDetails(PassengerDetailsRQ.SpecialReqDetails value) {
        this.specialReqDetails = value;
    }

    /**
     * Gets the value of the travelItineraryAddInfoRQ property.
     *
     * @return possible object is
     *     {@link PassengerDetailsRQ.TravelItineraryAddInfoRQ }
     *
     */
    public PassengerDetailsRQ.TravelItineraryAddInfoRQ getTravelItineraryAddInfoRQ() {
        return travelItineraryAddInfoRQ;
    }

    /**
     * Sets the value of the travelItineraryAddInfoRQ property.
     *
     * @param value allowed object is
     *     {@link PassengerDetailsRQ.TravelItineraryAddInfoRQ }
     *
     */
    public void setTravelItineraryAddInfoRQ(PassengerDetailsRQ.TravelItineraryAddInfoRQ value) {
        this.travelItineraryAddInfoRQ = value;
    }

    /**
     * Gets the value of the returnHostCommand property.
     *
     * @return possible object is {@link Boolean }
     *
     */
    public Boolean isReturnHostCommand() {
        return returnHostCommand;
    }

    /**
     * Sets the value of the returnHostCommand property.
     *
     * @param value allowed object is {@link Boolean }
     *
     */
    public void setReturnHostCommand(Boolean value) {
        this.returnHostCommand = value;
    }

    /**
     * Gets the value of the timeStamp property.
     *
     * @return possible object is {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getTimeStamp() {
        return timeStamp;
    }

    /**
     * Sets the value of the timeStamp property.
     *
     * @param value allowed object is {@link XMLGregorianCalendar }
     *
     */
    public void setTimeStamp(XMLGregorianCalendar value) {
        this.timeStamp = value;
    }

    /**
     * Gets the value of the version property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getVersion() {
        if (version == null) {
            return "2.3.0";
        } else {
            return version;
        }
    }

    /**
     * Sets the value of the version property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * <p>
     * Java class for anonymous complex type.
     *
     * <p>
     * The following schema fragment specifies the expected content contained
     * within this class.
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
    public static class IgnoreOnError {

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
     * <p>
     * Java class for anonymous complex type.
     *
     * <p>
     * The following schema fragment specifies the expected content contained
     * within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="MiscSegment">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="OriginLocation">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="LocationCode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="VendorPrefs">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Airline">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="DepartureDateTime" use="required" type="{http://webservices.sabre.com/sabreXML/2011/10}date" />
     *                 &lt;attribute name="InsertAfter" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *                 &lt;attribute name="NumberInParty" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *                 &lt;attribute name="Status" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="Type" use="required">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;enumeration value="INS"/>
     *                       &lt;enumeration value="MCO"/>
     *                       &lt;enumeration value="OTH"/>
     *                       &lt;enumeration value="PTA"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="HaltOnError" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "miscSegment"
    })
    public static class MiscSegmentSellRQ {

        @XmlElement(name = "MiscSegment", required = true)
        protected PassengerDetailsRQ.MiscSegmentSellRQ.MiscSegment miscSegment;
        @XmlAttribute(name = "HaltOnError")
        protected Boolean haltOnError;

        /**
         * Gets the value of the miscSegment property.
         *
         * @return possible object is
         *     {@link PassengerDetailsRQ.MiscSegmentSellRQ.MiscSegment }
         *
         */
        public PassengerDetailsRQ.MiscSegmentSellRQ.MiscSegment getMiscSegment() {
            return miscSegment;
        }

        /**
         * Sets the value of the miscSegment property.
         *
         * @param value allowed object is
         *     {@link PassengerDetailsRQ.MiscSegmentSellRQ.MiscSegment }
         *
         */
        public void setMiscSegment(PassengerDetailsRQ.MiscSegmentSellRQ.MiscSegment value) {
            this.miscSegment = value;
        }

        /**
         * Gets the value of the haltOnError property.
         *
         * @return possible object is {@link Boolean }
         *
         */
        public Boolean isHaltOnError() {
            return haltOnError;
        }

        /**
         * Sets the value of the haltOnError property.
         *
         * @param value allowed object is {@link Boolean }
         *
         */
        public void setHaltOnError(Boolean value) {
            this.haltOnError = value;
        }

        /**
         * <p>
         * Java class for anonymous complex type.
         *
         * <p>
         * The following schema fragment specifies the expected content
         * contained within this class.
         *
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="OriginLocation">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="LocationCode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="VendorPrefs">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Airline">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
         *       &lt;attribute name="DepartureDateTime" use="required" type="{http://webservices.sabre.com/sabreXML/2011/10}date" />
         *       &lt;attribute name="InsertAfter" type="{http://www.w3.org/2001/XMLSchema}integer" />
         *       &lt;attribute name="NumberInParty" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
         *       &lt;attribute name="Status" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="Type" use="required">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;enumeration value="INS"/>
         *             &lt;enumeration value="MCO"/>
         *             &lt;enumeration value="OTH"/>
         *             &lt;enumeration value="PTA"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         *
         *
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "originLocation",
            "text",
            "vendorPrefs"
        })
        public static class MiscSegment {

            @XmlElement(name = "OriginLocation", required = true)
            protected PassengerDetailsRQ.MiscSegmentSellRQ.MiscSegment.OriginLocation originLocation;
            @XmlElement(name = "Text", required = true)
            protected String text;
            @XmlElement(name = "VendorPrefs", required = true)
            protected PassengerDetailsRQ.MiscSegmentSellRQ.MiscSegment.VendorPrefs vendorPrefs;
            @XmlAttribute(name = "DepartureDateTime", required = true)
            protected String departureDateTime;
            @XmlAttribute(name = "InsertAfter")
            protected BigInteger insertAfter;
            @XmlAttribute(name = "NumberInParty", required = true)
            protected BigInteger numberInParty;
            @XmlAttribute(name = "Status", required = true)
            protected String status;
            @XmlAttribute(name = "Type", required = true)
            protected String type;

            /**
             * Gets the value of the originLocation property.
             *
             * @return possible object is
             *     {@link PassengerDetailsRQ.MiscSegmentSellRQ.MiscSegment.OriginLocation }
             *
             */
            public PassengerDetailsRQ.MiscSegmentSellRQ.MiscSegment.OriginLocation getOriginLocation() {
                return originLocation;
            }

            /**
             * Sets the value of the originLocation property.
             *
             * @param value allowed object is
             *     {@link PassengerDetailsRQ.MiscSegmentSellRQ.MiscSegment.OriginLocation }
             *
             */
            public void setOriginLocation(PassengerDetailsRQ.MiscSegmentSellRQ.MiscSegment.OriginLocation value) {
                this.originLocation = value;
            }

            /**
             * Gets the value of the text property.
             *
             * @return possible object is {@link String }
             *
             */
            public String getText() {
                return text;
            }

            /**
             * Sets the value of the text property.
             *
             * @param value allowed object is {@link String }
             *
             */
            public void setText(String value) {
                this.text = value;
            }

            /**
             * Gets the value of the vendorPrefs property.
             *
             * @return possible object is
             *     {@link PassengerDetailsRQ.MiscSegmentSellRQ.MiscSegment.VendorPrefs }
             *
             */
            public PassengerDetailsRQ.MiscSegmentSellRQ.MiscSegment.VendorPrefs getVendorPrefs() {
                return vendorPrefs;
            }

            /**
             * Sets the value of the vendorPrefs property.
             *
             * @param value allowed object is
             *     {@link PassengerDetailsRQ.MiscSegmentSellRQ.MiscSegment.VendorPrefs }
             *
             */
            public void setVendorPrefs(PassengerDetailsRQ.MiscSegmentSellRQ.MiscSegment.VendorPrefs value) {
                this.vendorPrefs = value;
            }

            /**
             * Gets the value of the departureDateTime property.
             *
             * @return possible object is {@link String }
             *
             */
            public String getDepartureDateTime() {
                return departureDateTime;
            }

            /**
             * Sets the value of the departureDateTime property.
             *
             * @param value allowed object is {@link String }
             *
             */
            public void setDepartureDateTime(String value) {
                this.departureDateTime = value;
            }

            /**
             * Gets the value of the insertAfter property.
             *
             * @return possible object is {@link BigInteger }
             *
             */
            public BigInteger getInsertAfter() {
                return insertAfter;
            }

            /**
             * Sets the value of the insertAfter property.
             *
             * @param value allowed object is {@link BigInteger }
             *
             */
            public void setInsertAfter(BigInteger value) {
                this.insertAfter = value;
            }

            /**
             * Gets the value of the numberInParty property.
             *
             * @return possible object is {@link BigInteger }
             *
             */
            public BigInteger getNumberInParty() {
                return numberInParty;
            }

            /**
             * Sets the value of the numberInParty property.
             *
             * @param value allowed object is {@link BigInteger }
             *
             */
            public void setNumberInParty(BigInteger value) {
                this.numberInParty = value;
            }

            /**
             * Gets the value of the status property.
             *
             * @return possible object is {@link String }
             *
             */
            public String getStatus() {
                return status;
            }

            /**
             * Sets the value of the status property.
             *
             * @param value allowed object is {@link String }
             *
             */
            public void setStatus(String value) {
                this.status = value;
            }

            /**
             * Gets the value of the type property.
             *
             * @return possible object is {@link String }
             *
             */
            public String getType() {
                return type;
            }

            /**
             * Sets the value of the type property.
             *
             * @param value allowed object is {@link String }
             *
             */
            public void setType(String value) {
                this.type = value;
            }

            /**
             * <p>
             * Java class for anonymous complex type.
             *
             * <p>
             * The following schema fragment specifies the expected content
             * contained within this class.
             *
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;attribute name="LocationCode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class OriginLocation {

                @XmlAttribute(name = "LocationCode", required = true)
                protected String locationCode;

                /**
                 * Gets the value of the locationCode property.
                 *
                 * @return possible object is {@link String }
                 *
                 */
                public String getLocationCode() {
                    return locationCode;
                }

                /**
                 * Sets the value of the locationCode property.
                 *
                 * @param value allowed object is {@link String }
                 *
                 */
                public void setLocationCode(String value) {
                    this.locationCode = value;
                }

            }

            /**
             * <p>
             * Java class for anonymous complex type.
             *
             * <p>
             * The following schema fragment specifies the expected content
             * contained within this class.
             *
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="Airline">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
                "airline"
            })
            public static class VendorPrefs {

                @XmlElement(name = "Airline", required = true)
                protected PassengerDetailsRQ.MiscSegmentSellRQ.MiscSegment.VendorPrefs.Airline airline;

                /**
                 * Gets the value of the airline property.
                 *
                 * @return possible object is
                 *     {@link PassengerDetailsRQ.MiscSegmentSellRQ.MiscSegment.VendorPrefs.Airline }
                 *
                 */
                public PassengerDetailsRQ.MiscSegmentSellRQ.MiscSegment.VendorPrefs.Airline getAirline() {
                    return airline;
                }

                /**
                 * Sets the value of the airline property.
                 *
                 * @param value allowed object is
                 *     {@link PassengerDetailsRQ.MiscSegmentSellRQ.MiscSegment.VendorPrefs.Airline }
                 *
                 */
                public void setAirline(PassengerDetailsRQ.MiscSegmentSellRQ.MiscSegment.VendorPrefs.Airline value) {
                    this.airline = value;
                }

                /**
                 * <p>
                 * Java class for anonymous complex type.
                 *
                 * <p>
                 * The following schema fragment specifies the expected content
                 * contained within this class.
                 *
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 *
                 *
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class Airline {

                    @XmlAttribute(name = "Code", required = true)
                    protected String code;

                    /**
                     * Gets the value of the code property.
                     *
                     * @return possible object is {@link String }
                     *
                     */
                    public String getCode() {
                        return code;
                    }

                    /**
                     * Sets the value of the code property.
                     *
                     * @param value allowed object is {@link String }
                     *
                     */
                    public void setCode(String value) {
                        this.code = value;
                    }

                }

            }

        }

    }

    /**
     * <p>
     * Java class for anonymous complex type.
     *
     * <p>
     * The following schema fragment specifies the expected content contained
     * within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="ARUNK_RQ" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="HaltOnError" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="EndTransactionRQ" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="EndTransaction" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Email" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="eTicket" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="PDF" minOccurs="0">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                                                       &lt;/restriction>
     *                                                     &lt;/complexContent>
     *                                                   &lt;/complexType>
     *                                                 &lt;/element>
     *                                               &lt;/sequence>
     *                                               &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="Invoice" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="Itinerary" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="PDF" minOccurs="0">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                                                       &lt;/restriction>
     *                                                     &lt;/complexContent>
     *                                                   &lt;/complexType>
     *                                                 &lt;/element>
     *                                                 &lt;element name="Segment" maxOccurs="unbounded" minOccurs="0">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;attribute name="EndNumber" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *                                                         &lt;attribute name="Number" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *                                                       &lt;/restriction>
     *                                                     &lt;/complexContent>
     *                                                   &lt;/complexType>
     *                                                 &lt;/element>
     *                                               &lt;/sequence>
     *                                               &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="PersonName" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;attribute name="NameNumber" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
     *                           &lt;/sequence>
     *                           &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Source" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="ReceivedFrom" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="HaltOnError" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="QueuePlaceRQ" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="MultiQueuePlace" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="QueueIdentifier" maxOccurs="20">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="Number" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="PrefatoryInstructionCode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="PseudoCityCode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="QueueInfo" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="QueueIdentifier" maxOccurs="3">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="Number" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="PrefatoryInstructionCode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="PseudoCityCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="UniqueID" maxOccurs="6" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="HaltOnError" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="HaltOnError" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="IgnoreAfter" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="RedisplayReservation" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "arunkrq",
        "endTransactionRQ",
        "queuePlaceRQ"
    })
    public static class PostProcessing {

        @XmlElement(name = "ARUNK_RQ")
        protected PassengerDetailsRQ.PostProcessing.ARUNKRQ arunkrq;
        @XmlElement(name = "EndTransactionRQ")
        protected PassengerDetailsRQ.PostProcessing.EndTransactionRQ endTransactionRQ;
        @XmlElement(name = "QueuePlaceRQ")
        protected PassengerDetailsRQ.PostProcessing.QueuePlaceRQ queuePlaceRQ;
        @XmlAttribute(name = "HaltOnError")
        protected Boolean haltOnError;
        @XmlAttribute(name = "IgnoreAfter")
        protected Boolean ignoreAfter;
        @XmlAttribute(name = "RedisplayReservation")
        protected Boolean redisplayReservation;

        /**
         * Gets the value of the arunkrq property.
         *
         * @return possible object is
         *     {@link PassengerDetailsRQ.PostProcessing.ARUNKRQ }
         *
         */
        public PassengerDetailsRQ.PostProcessing.ARUNKRQ getARUNKRQ() {
            return arunkrq;
        }

        /**
         * Sets the value of the arunkrq property.
         *
         * @param value allowed object is
         *     {@link PassengerDetailsRQ.PostProcessing.ARUNKRQ }
         *
         */
        public void setARUNKRQ(PassengerDetailsRQ.PostProcessing.ARUNKRQ value) {
            this.arunkrq = value;
        }

        /**
         * Gets the value of the endTransactionRQ property.
         *
         * @return possible object is
         *     {@link PassengerDetailsRQ.PostProcessing.EndTransactionRQ }
         *
         */
        public PassengerDetailsRQ.PostProcessing.EndTransactionRQ getEndTransactionRQ() {
            return endTransactionRQ;
        }

        /**
         * Sets the value of the endTransactionRQ property.
         *
         * @param value allowed object is
         *     {@link PassengerDetailsRQ.PostProcessing.EndTransactionRQ }
         *
         */
        public void setEndTransactionRQ(PassengerDetailsRQ.PostProcessing.EndTransactionRQ value) {
            this.endTransactionRQ = value;
        }

        /**
         * Gets the value of the queuePlaceRQ property.
         *
         * @return possible object is
         *     {@link PassengerDetailsRQ.PostProcessing.QueuePlaceRQ }
         *
         */
        public PassengerDetailsRQ.PostProcessing.QueuePlaceRQ getQueuePlaceRQ() {
            return queuePlaceRQ;
        }

        /**
         * Sets the value of the queuePlaceRQ property.
         *
         * @param value allowed object is
         *     {@link PassengerDetailsRQ.PostProcessing.QueuePlaceRQ }
         *
         */
        public void setQueuePlaceRQ(PassengerDetailsRQ.PostProcessing.QueuePlaceRQ value) {
            this.queuePlaceRQ = value;
        }

        /**
         * Gets the value of the haltOnError property.
         *
         * @return possible object is {@link Boolean }
         *
         */
        public Boolean isHaltOnError() {
            return haltOnError;
        }

        /**
         * Sets the value of the haltOnError property.
         *
         * @param value allowed object is {@link Boolean }
         *
         */
        public void setHaltOnError(Boolean value) {
            this.haltOnError = value;
        }

        /**
         * Gets the value of the ignoreAfter property.
         *
         * @return possible object is {@link Boolean }
         *
         */
        public Boolean isIgnoreAfter() {
            return ignoreAfter;
        }

        /**
         * Sets the value of the ignoreAfter property.
         *
         * @param value allowed object is {@link Boolean }
         *
         */
        public void setIgnoreAfter(Boolean value) {
            this.ignoreAfter = value;
        }

        /**
         * Gets the value of the redisplayReservation property.
         *
         * @return possible object is {@link Boolean }
         *
         */
        public Boolean isRedisplayReservation() {
            return redisplayReservation;
        }

        /**
         * Sets the value of the redisplayReservation property.
         *
         * @param value allowed object is {@link Boolean }
         *
         */
        public void setRedisplayReservation(Boolean value) {
            this.redisplayReservation = value;
        }

        /**
         * <p>
         * Java class for anonymous complex type.
         *
         * <p>
         * The following schema fragment specifies the expected content
         * contained within this class.
         *
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attribute name="HaltOnError" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         *
         *
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class ARUNKRQ {

            @XmlAttribute(name = "HaltOnError")
            protected Boolean haltOnError;

            /**
             * Gets the value of the haltOnError property.
             *
             * @return possible object is {@link Boolean }
             *
             */
            public Boolean isHaltOnError() {
                return haltOnError;
            }

            /**
             * Sets the value of the haltOnError property.
             *
             * @param value allowed object is {@link Boolean }
             *
             */
            public void setHaltOnError(Boolean value) {
                this.haltOnError = value;
            }

        }

        /**
         * <p>
         * Java class for anonymous complex type.
         *
         * <p>
         * The following schema fragment specifies the expected content
         * contained within this class.
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
         *                 &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
         *       &lt;attribute name="HaltOnError" type="{http://www.w3.org/2001/XMLSchema}boolean" />
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
        public static class EndTransactionRQ {

            @XmlElement(name = "EndTransaction")
            protected PassengerDetailsRQ.PostProcessing.EndTransactionRQ.EndTransaction endTransaction;
            @XmlElement(name = "Source")
            protected PassengerDetailsRQ.PostProcessing.EndTransactionRQ.Source source;
            @XmlAttribute(name = "HaltOnError")
            protected Boolean haltOnError;

            /**
             * Gets the value of the endTransaction property.
             *
             * @return possible object is
             *     {@link PassengerDetailsRQ.PostProcessing.EndTransactionRQ.EndTransaction }
             *
             */
            public PassengerDetailsRQ.PostProcessing.EndTransactionRQ.EndTransaction getEndTransaction() {
                return endTransaction;
            }

            /**
             * Sets the value of the endTransaction property.
             *
             * @param value allowed object is
             *     {@link PassengerDetailsRQ.PostProcessing.EndTransactionRQ.EndTransaction }
             *
             */
            public void setEndTransaction(PassengerDetailsRQ.PostProcessing.EndTransactionRQ.EndTransaction value) {
                this.endTransaction = value;
            }

            /**
             * Gets the value of the source property.
             *
             * @return possible object is
             *     {@link PassengerDetailsRQ.PostProcessing.EndTransactionRQ.Source }
             *
             */
            public PassengerDetailsRQ.PostProcessing.EndTransactionRQ.Source getSource() {
                return source;
            }

            /**
             * Sets the value of the source property.
             *
             * @param value allowed object is
             *     {@link PassengerDetailsRQ.PostProcessing.EndTransactionRQ.Source }
             *
             */
            public void setSource(PassengerDetailsRQ.PostProcessing.EndTransactionRQ.Source value) {
                this.source = value;
            }

            /**
             * Gets the value of the haltOnError property.
             *
             * @return possible object is {@link Boolean }
             *
             */
            public Boolean isHaltOnError() {
                return haltOnError;
            }

            /**
             * Sets the value of the haltOnError property.
             *
             * @param value allowed object is {@link Boolean }
             *
             */
            public void setHaltOnError(Boolean value) {
                this.haltOnError = value;
            }

            /**
             * <p>
             * Java class for anonymous complex type.
             *
             * <p>
             * The following schema fragment specifies the expected content
             * contained within this class.
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
             *       &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
                protected PassengerDetailsRQ.PostProcessing.EndTransactionRQ.EndTransaction.Email email;
                @XmlAttribute(name = "Ind", required = true)
                protected String ind;

                /**
                 * Gets the value of the email property.
                 *
                 * @return possible object is
                 *     {@link PassengerDetailsRQ.PostProcessing.EndTransactionRQ.EndTransaction.Email }
                 *
                 */
                public PassengerDetailsRQ.PostProcessing.EndTransactionRQ.EndTransaction.Email getEmail() {
                    return email;
                }

                /**
                 * Sets the value of the email property.
                 *
                 * @param value allowed object is
                 *     {@link PassengerDetailsRQ.PostProcessing.EndTransactionRQ.EndTransaction.Email }
                 *
                 */
                public void setEmail(PassengerDetailsRQ.PostProcessing.EndTransactionRQ.EndTransaction.Email value) {
                    this.email = value;
                }

                /**
                 * Gets the value of the ind property.
                 *
                 * @return possible object is {@link String }
                 *
                 */
                public String getInd() {
                    return ind;
                }

                /**
                 * Sets the value of the ind property.
                 *
                 * @param value allowed object is {@link String }
                 *
                 */
                public void setInd(String value) {
                    this.ind = value;
                }

                /**
                 * <p>
                 * Java class for anonymous complex type.
                 *
                 * <p>
                 * The following schema fragment specifies the expected content
                 * contained within this class.
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

                    protected PassengerDetailsRQ.PostProcessing.EndTransactionRQ.EndTransaction.Email.ETicket eTicket;
                    @XmlElement(name = "Invoice")
                    protected PassengerDetailsRQ.PostProcessing.EndTransactionRQ.EndTransaction.Email.Invoice invoice;
                    @XmlElement(name = "Itinerary")
                    protected PassengerDetailsRQ.PostProcessing.EndTransactionRQ.EndTransaction.Email.Itinerary itinerary;
                    @XmlElement(name = "PersonName")
                    protected PassengerDetailsRQ.PostProcessing.EndTransactionRQ.EndTransaction.Email.PersonName personName;
                    @XmlAttribute(name = "Ind", required = true)
                    protected boolean ind;

                    /**
                     * Gets the value of the eTicket property.
                     *
                     * @return possible object is
                     *     {@link PassengerDetailsRQ.PostProcessing.EndTransactionRQ.EndTransaction.Email.ETicket }
                     *
                     */
                    public PassengerDetailsRQ.PostProcessing.EndTransactionRQ.EndTransaction.Email.ETicket getETicket() {
                        return eTicket;
                    }

                    /**
                     * Sets the value of the eTicket property.
                     *
                     * @param value allowed object is
                     *     {@link PassengerDetailsRQ.PostProcessing.EndTransactionRQ.EndTransaction.Email.ETicket }
                     *
                     */
                    public void setETicket(PassengerDetailsRQ.PostProcessing.EndTransactionRQ.EndTransaction.Email.ETicket value) {
                        this.eTicket = value;
                    }

                    /**
                     * Gets the value of the invoice property.
                     *
                     * @return possible object is
                     *     {@link PassengerDetailsRQ.PostProcessing.EndTransactionRQ.EndTransaction.Email.Invoice }
                     *
                     */
                    public PassengerDetailsRQ.PostProcessing.EndTransactionRQ.EndTransaction.Email.Invoice getInvoice() {
                        return invoice;
                    }

                    /**
                     * Sets the value of the invoice property.
                     *
                     * @param value allowed object is
                     *     {@link PassengerDetailsRQ.PostProcessing.EndTransactionRQ.EndTransaction.Email.Invoice }
                     *
                     */
                    public void setInvoice(PassengerDetailsRQ.PostProcessing.EndTransactionRQ.EndTransaction.Email.Invoice value) {
                        this.invoice = value;
                    }

                    /**
                     * Gets the value of the itinerary property.
                     *
                     * @return possible object is
                     *     {@link PassengerDetailsRQ.PostProcessing.EndTransactionRQ.EndTransaction.Email.Itinerary }
                     *
                     */
                    public PassengerDetailsRQ.PostProcessing.EndTransactionRQ.EndTransaction.Email.Itinerary getItinerary() {
                        return itinerary;
                    }

                    /**
                     * Sets the value of the itinerary property.
                     *
                     * @param value allowed object is
                     *     {@link PassengerDetailsRQ.PostProcessing.EndTransactionRQ.EndTransaction.Email.Itinerary }
                     *
                     */
                    public void setItinerary(PassengerDetailsRQ.PostProcessing.EndTransactionRQ.EndTransaction.Email.Itinerary value) {
                        this.itinerary = value;
                    }

                    /**
                     * Gets the value of the personName property.
                     *
                     * @return possible object is
                     *     {@link PassengerDetailsRQ.PostProcessing.EndTransactionRQ.EndTransaction.Email.PersonName }
                     *
                     */
                    public PassengerDetailsRQ.PostProcessing.EndTransactionRQ.EndTransaction.Email.PersonName getPersonName() {
                        return personName;
                    }

                    /**
                     * Sets the value of the personName property.
                     *
                     * @param value allowed object is
                     *     {@link PassengerDetailsRQ.PostProcessing.EndTransactionRQ.EndTransaction.Email.PersonName }
                     *
                     */
                    public void setPersonName(PassengerDetailsRQ.PostProcessing.EndTransactionRQ.EndTransaction.Email.PersonName value) {
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
                     * <p>
                     * Java class for anonymous complex type.
                     *
                     * <p>
                     * The following schema fragment specifies the expected
                     * content contained within this class.
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
                        protected PassengerDetailsRQ.PostProcessing.EndTransactionRQ.EndTransaction.Email.ETicket.PDF pdf;
                        @XmlAttribute(name = "Ind", required = true)
                        protected boolean ind;

                        /**
                         * Gets the value of the pdf property.
                         *
                         * @return possible object is
                         *     {@link PassengerDetailsRQ.PostProcessing.EndTransactionRQ.EndTransaction.Email.ETicket.PDF }
                         *
                         */
                        public PassengerDetailsRQ.PostProcessing.EndTransactionRQ.EndTransaction.Email.ETicket.PDF getPDF() {
                            return pdf;
                        }

                        /**
                         * Sets the value of the pdf property.
                         *
                         * @param value allowed object is
                         *     {@link PassengerDetailsRQ.PostProcessing.EndTransactionRQ.EndTransaction.Email.ETicket.PDF }
                         *
                         */
                        public void setPDF(PassengerDetailsRQ.PostProcessing.EndTransactionRQ.EndTransaction.Email.ETicket.PDF value) {
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
                         * <p>
                         * Java class for anonymous complex type.
                         *
                         * <p>
                         * The following schema fragment specifies the expected
                         * content contained within this class.
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
                     * <p>
                     * Java class for anonymous complex type.
                     *
                     * <p>
                     * The following schema fragment specifies the expected
                     * content contained within this class.
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
                     * <p>
                     * Java class for anonymous complex type.
                     *
                     * <p>
                     * The following schema fragment specifies the expected
                     * content contained within this class.
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
                        protected PassengerDetailsRQ.PostProcessing.EndTransactionRQ.EndTransaction.Email.Itinerary.PDF pdf;
                        @XmlElement(name = "Segment")
                        protected List<PassengerDetailsRQ.PostProcessing.EndTransactionRQ.EndTransaction.Email.Itinerary.Segment> segment;
                        @XmlAttribute(name = "Ind", required = true)
                        protected boolean ind;

                        /**
                         * Gets the value of the pdf property.
                         *
                         * @return possible object is
                         *     {@link PassengerDetailsRQ.PostProcessing.EndTransactionRQ.EndTransaction.Email.Itinerary.PDF }
                         *
                         */
                        public PassengerDetailsRQ.PostProcessing.EndTransactionRQ.EndTransaction.Email.Itinerary.PDF getPDF() {
                            return pdf;
                        }

                        /**
                         * Sets the value of the pdf property.
                         *
                         * @param value allowed object is
                         *     {@link PassengerDetailsRQ.PostProcessing.EndTransactionRQ.EndTransaction.Email.Itinerary.PDF }
                         *
                         */
                        public void setPDF(PassengerDetailsRQ.PostProcessing.EndTransactionRQ.EndTransaction.Email.Itinerary.PDF value) {
                            this.pdf = value;
                        }

                        /**
                         * Gets the value of the segment property.
                         *
                         * <p>
                         * This accessor method returns a reference to the live
                         * list, not a snapshot. Therefore any modification you
                         * make to the returned list will be present inside the
                         * JAXB object. This is why there is not a
                         * <CODE>set</CODE> method for the segment property.
                         *
                         * <p>
                         * For example, to add a new item, do as follows:
                         * <pre>
                         *    getSegment().add(newItem);
                         * </pre>
                         *
                         *
                         * <p>
                         * Objects of the following type(s) are allowed in the
                         * list
                         * {@link PassengerDetailsRQ.PostProcessing.EndTransactionRQ.EndTransaction.Email.Itinerary.Segment }
                         *
                         *
                         */
                        public List<PassengerDetailsRQ.PostProcessing.EndTransactionRQ.EndTransaction.Email.Itinerary.Segment> getSegment() {
                            if (segment == null) {
                                segment = new ArrayList<PassengerDetailsRQ.PostProcessing.EndTransactionRQ.EndTransaction.Email.Itinerary.Segment>();
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
                         * <p>
                         * Java class for anonymous complex type.
                         *
                         * <p>
                         * The following schema fragment specifies the expected
                         * content contained within this class.
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
                         * <p>
                         * Java class for anonymous complex type.
                         *
                         * <p>
                         * The following schema fragment specifies the expected
                         * content contained within this class.
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
                             * @return possible object is {@link BigInteger }
                             *
                             */
                            public BigInteger getEndNumber() {
                                return endNumber;
                            }

                            /**
                             * Sets the value of the endNumber property.
                             *
                             * @param value allowed object is
                             *     {@link BigInteger }
                             *
                             */
                            public void setEndNumber(BigInteger value) {
                                this.endNumber = value;
                            }

                            /**
                             * Gets the value of the number property.
                             *
                             * @return possible object is {@link BigInteger }
                             *
                             */
                            public BigInteger getNumber() {
                                return number;
                            }

                            /**
                             * Sets the value of the number property.
                             *
                             * @param value allowed object is
                             *     {@link BigInteger }
                             *
                             */
                            public void setNumber(BigInteger value) {
                                this.number = value;
                            }

                        }

                    }

                    /**
                     * <p>
                     * Java class for anonymous complex type.
                     *
                     * <p>
                     * The following schema fragment specifies the expected
                     * content contained within this class.
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
                         * @return possible object is {@link String }
                         *
                         */
                        public String getNameNumber() {
                            return nameNumber;
                        }

                        /**
                         * Sets the value of the nameNumber property.
                         *
                         * @param value allowed object is {@link String }
                         *
                         */
                        public void setNameNumber(String value) {
                            this.nameNumber = value;
                        }

                    }

                }

            }

            /**
             * <p>
             * Java class for anonymous complex type.
             *
             * <p>
             * The following schema fragment specifies the expected content
             * contained within this class.
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
                 * @return possible object is {@link String }
                 *
                 */
                public String getReceivedFrom() {
                    return receivedFrom;
                }

                /**
                 * Sets the value of the receivedFrom property.
                 *
                 * @param value allowed object is {@link String }
                 *
                 */
                public void setReceivedFrom(String value) {
                    this.receivedFrom = value;
                }

            }

        }

        /**
         * <p>
         * Java class for anonymous complex type.
         *
         * <p>
         * The following schema fragment specifies the expected content
         * contained within this class.
         *
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="MultiQueuePlace" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="QueueIdentifier" maxOccurs="20">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attribute name="Number" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="PrefatoryInstructionCode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
         *         &lt;element name="QueueInfo" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="QueueIdentifier" maxOccurs="3">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="Number" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="PrefatoryInstructionCode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="PseudoCityCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="UniqueID" maxOccurs="6" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
         *       &lt;attribute name="HaltOnError" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         *
         *
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "multiQueuePlace",
            "queueInfo"
        })
        public static class QueuePlaceRQ {

            @XmlElement(name = "MultiQueuePlace")
            protected PassengerDetailsRQ.PostProcessing.QueuePlaceRQ.MultiQueuePlace multiQueuePlace;
            @XmlElement(name = "QueueInfo")
            protected PassengerDetailsRQ.PostProcessing.QueuePlaceRQ.QueueInfo queueInfo;
            @XmlAttribute(name = "HaltOnError")
            protected Boolean haltOnError;

            /**
             * Gets the value of the multiQueuePlace property.
             *
             * @return possible object is
             *     {@link PassengerDetailsRQ.PostProcessing.QueuePlaceRQ.MultiQueuePlace }
             *
             */
            public PassengerDetailsRQ.PostProcessing.QueuePlaceRQ.MultiQueuePlace getMultiQueuePlace() {
                return multiQueuePlace;
            }

            /**
             * Sets the value of the multiQueuePlace property.
             *
             * @param value allowed object is
             *     {@link PassengerDetailsRQ.PostProcessing.QueuePlaceRQ.MultiQueuePlace }
             *
             */
            public void setMultiQueuePlace(PassengerDetailsRQ.PostProcessing.QueuePlaceRQ.MultiQueuePlace value) {
                this.multiQueuePlace = value;
            }

            /**
             * Gets the value of the queueInfo property.
             *
             * @return possible object is
             *     {@link PassengerDetailsRQ.PostProcessing.QueuePlaceRQ.QueueInfo }
             *
             */
            public PassengerDetailsRQ.PostProcessing.QueuePlaceRQ.QueueInfo getQueueInfo() {
                return queueInfo;
            }

            /**
             * Sets the value of the queueInfo property.
             *
             * @param value allowed object is
             *     {@link PassengerDetailsRQ.PostProcessing.QueuePlaceRQ.QueueInfo }
             *
             */
            public void setQueueInfo(PassengerDetailsRQ.PostProcessing.QueuePlaceRQ.QueueInfo value) {
                this.queueInfo = value;
            }

            /**
             * Gets the value of the haltOnError property.
             *
             * @return possible object is {@link Boolean }
             *
             */
            public Boolean isHaltOnError() {
                return haltOnError;
            }

            /**
             * Sets the value of the haltOnError property.
             *
             * @param value allowed object is {@link Boolean }
             *
             */
            public void setHaltOnError(Boolean value) {
                this.haltOnError = value;
            }

            /**
             * <p>
             * Java class for anonymous complex type.
             *
             * <p>
             * The following schema fragment specifies the expected content
             * contained within this class.
             *
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="QueueIdentifier" maxOccurs="20">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="Number" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="PrefatoryInstructionCode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
                "queueIdentifier"
            })
            public static class MultiQueuePlace {

                @XmlElement(name = "QueueIdentifier", required = true)
                protected List<PassengerDetailsRQ.PostProcessing.QueuePlaceRQ.MultiQueuePlace.QueueIdentifier> queueIdentifier;

                /**
                 * Gets the value of the queueIdentifier property.
                 *
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object. This is
                 * why there is not a <CODE>set</CODE> method for the
                 * queueIdentifier property.
                 *
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getQueueIdentifier().add(newItem);
                 * </pre>
                 *
                 *
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link PassengerDetailsRQ.PostProcessing.QueuePlaceRQ.MultiQueuePlace.QueueIdentifier }
                 *
                 *
                 */
                public List<PassengerDetailsRQ.PostProcessing.QueuePlaceRQ.MultiQueuePlace.QueueIdentifier> getQueueIdentifier() {
                    if (queueIdentifier == null) {
                        queueIdentifier = new ArrayList<PassengerDetailsRQ.PostProcessing.QueuePlaceRQ.MultiQueuePlace.QueueIdentifier>();
                    }
                    return this.queueIdentifier;
                }

                public void setQueueIdentifier(List<PassengerDetailsRQ.PostProcessing.QueuePlaceRQ.MultiQueuePlace.QueueIdentifier> queueIdentifier) {
                    this.queueIdentifier = queueIdentifier;
                }

                /**
                 * <p>
                 * Java class for anonymous complex type.
                 *
                 * <p>
                 * The following schema fragment specifies the expected content
                 * contained within this class.
                 *
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;attribute name="Number" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="PrefatoryInstructionCode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
                public static class QueueIdentifier {

                    @XmlAttribute(name = "Number", required = true)
                    protected String number;
                    @XmlAttribute(name = "PrefatoryInstructionCode", required = true)
                    protected String prefatoryInstructionCode;
                    @XmlAttribute(name = "PseudoCityCode", required = true)
                    protected String pseudoCityCode;

                    /**
                     * Gets the value of the number property.
                     *
                     * @return possible object is {@link String }
                     *
                     */
                    public String getNumber() {
                        return number;
                    }

                    /**
                     * Sets the value of the number property.
                     *
                     * @param value allowed object is {@link String }
                     *
                     */
                    public void setNumber(String value) {
                        this.number = value;
                    }

                    /**
                     * Gets the value of the prefatoryInstructionCode property.
                     *
                     * @return possible object is {@link String }
                     *
                     */
                    public String getPrefatoryInstructionCode() {
                        return prefatoryInstructionCode;
                    }

                    /**
                     * Sets the value of the prefatoryInstructionCode property.
                     *
                     * @param value allowed object is {@link String }
                     *
                     */
                    public void setPrefatoryInstructionCode(String value) {
                        this.prefatoryInstructionCode = value;
                    }

                    /**
                     * Gets the value of the pseudoCityCode property.
                     *
                     * @return possible object is {@link String }
                     *
                     */
                    public String getPseudoCityCode() {
                        return pseudoCityCode;
                    }

                    /**
                     * Sets the value of the pseudoCityCode property.
                     *
                     * @param value allowed object is {@link String }
                     *
                     */
                    public void setPseudoCityCode(String value) {
                        this.pseudoCityCode = value;
                    }

                }

            }

            /**
             * <p>
             * Java class for anonymous complex type.
             *
             * <p>
             * The following schema fragment specifies the expected content
             * contained within this class.
             *
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="QueueIdentifier" maxOccurs="3">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="Number" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="PrefatoryInstructionCode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="PseudoCityCode" type="{http://www.w3.org/2001/XMLSchema}string" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="UniqueID" maxOccurs="6" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
                "queueIdentifier",
                "uniqueID"
            })
            public static class QueueInfo {

                @XmlElement(name = "QueueIdentifier", required = true)
                protected List<PassengerDetailsRQ.PostProcessing.QueuePlaceRQ.QueueInfo.QueueIdentifier> queueIdentifier;
                @XmlElement(name = "UniqueID")
                protected List<PassengerDetailsRQ.PostProcessing.QueuePlaceRQ.QueueInfo.UniqueID> uniqueID;

                /**
                 * Gets the value of the queueIdentifier property.
                 *
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object. This is
                 * why there is not a <CODE>set</CODE> method for the
                 * queueIdentifier property.
                 *
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getQueueIdentifier().add(newItem);
                 * </pre>
                 *
                 *
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link PassengerDetailsRQ.PostProcessing.QueuePlaceRQ.QueueInfo.QueueIdentifier }
                 *
                 *
                 */
                public List<PassengerDetailsRQ.PostProcessing.QueuePlaceRQ.QueueInfo.QueueIdentifier> getQueueIdentifier() {
                    if (queueIdentifier == null) {
                        queueIdentifier = new ArrayList<PassengerDetailsRQ.PostProcessing.QueuePlaceRQ.QueueInfo.QueueIdentifier>();
                    }
                    return this.queueIdentifier;
                }

                public void setQueueIdentifier(List<PassengerDetailsRQ.PostProcessing.QueuePlaceRQ.QueueInfo.QueueIdentifier> queueIdentifier) {
                    this.queueIdentifier = queueIdentifier;
                }

                /**
                 * Gets the value of the uniqueID property.
                 *
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object. This is
                 * why there is not a <CODE>set</CODE> method for the uniqueID
                 * property.
                 *
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getUniqueID().add(newItem);
                 * </pre>
                 *
                 *
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link PassengerDetailsRQ.PostProcessing.QueuePlaceRQ.QueueInfo.UniqueID }
                 *
                 *
                 */
                public List<PassengerDetailsRQ.PostProcessing.QueuePlaceRQ.QueueInfo.UniqueID> getUniqueID() {
                    if (uniqueID == null) {
                        uniqueID = new ArrayList<PassengerDetailsRQ.PostProcessing.QueuePlaceRQ.QueueInfo.UniqueID>();
                    }
                    return this.uniqueID;
                }

                /**
                 * <p>
                 * Java class for anonymous complex type.
                 *
                 * <p>
                 * The following schema fragment specifies the expected content
                 * contained within this class.
                 *
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="Number" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="PrefatoryInstructionCode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="PseudoCityCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 *
                 *
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class QueueIdentifier {

                    @XmlAttribute(name = "Name")
                    protected String name;
                    @XmlAttribute(name = "Number")
                    protected String number;
                    @XmlAttribute(name = "PrefatoryInstructionCode", required = true)
                    protected String prefatoryInstructionCode;
                    @XmlAttribute(name = "PseudoCityCode")
                    protected String pseudoCityCode;

                    /**
                     * Gets the value of the name property.
                     *
                     * @return possible object is {@link String }
                     *
                     */
                    public String getName() {
                        return name;
                    }

                    /**
                     * Sets the value of the name property.
                     *
                     * @param value allowed object is {@link String }
                     *
                     */
                    public void setName(String value) {
                        this.name = value;
                    }

                    /**
                     * Gets the value of the number property.
                     *
                     * @return possible object is {@link String }
                     *
                     */
                    public String getNumber() {
                        return number;
                    }

                    /**
                     * Sets the value of the number property.
                     *
                     * @param value allowed object is {@link String }
                     *
                     */
                    public void setNumber(String value) {
                        this.number = value;
                    }

                    /**
                     * Gets the value of the prefatoryInstructionCode property.
                     *
                     * @return possible object is {@link String }
                     *
                     */
                    public String getPrefatoryInstructionCode() {
                        return prefatoryInstructionCode;
                    }

                    /**
                     * Sets the value of the prefatoryInstructionCode property.
                     *
                     * @param value allowed object is {@link String }
                     *
                     */
                    public void setPrefatoryInstructionCode(String value) {
                        this.prefatoryInstructionCode = value;
                    }

                    /**
                     * Gets the value of the pseudoCityCode property.
                     *
                     * @return possible object is {@link String }
                     *
                     */
                    public String getPseudoCityCode() {
                        return pseudoCityCode;
                    }

                    /**
                     * Sets the value of the pseudoCityCode property.
                     *
                     * @param value allowed object is {@link String }
                     *
                     */
                    public void setPseudoCityCode(String value) {
                        this.pseudoCityCode = value;
                    }

                }

                /**
                 * <p>
                 * Java class for anonymous complex type.
                 *
                 * <p>
                 * The following schema fragment specifies the expected content
                 * contained within this class.
                 *
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 *
                 *
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class UniqueID {

                    @XmlAttribute(name = "ID", required = true)
                    protected String id;

                    /**
                     * Gets the value of the id property.
                     *
                     * @return possible object is {@link String }
                     *
                     */
                    public String getID() {
                        return id;
                    }

                    /**
                     * Sets the value of the id property.
                     *
                     * @param value allowed object is {@link String }
                     *
                     */
                    public void setID(String value) {
                        this.id = value;
                    }

                }

            }

        }

    }

    /**
     * <p>
     * Java class for anonymous complex type.
     *
     * <p>
     * The following schema fragment specifies the expected content contained
     * within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="UniqueID" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="HaltOnError" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="IgnoreBefore" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "uniqueID"
    })
    public static class PreProcessing {

        @XmlElement(name = "UniqueID")
        protected PassengerDetailsRQ.PreProcessing.UniqueID uniqueID;
        @XmlAttribute(name = "HaltOnError")
        protected Boolean haltOnError;
        @XmlAttribute(name = "IgnoreBefore")
        protected Boolean ignoreBefore;

        /**
         * Gets the value of the uniqueID property.
         *
         * @return possible object is
         *     {@link PassengerDetailsRQ.PreProcessing.UniqueID }
         *
         */
        public PassengerDetailsRQ.PreProcessing.UniqueID getUniqueID() {
            return uniqueID;
        }

        /**
         * Sets the value of the uniqueID property.
         *
         * @param value allowed object is
         *     {@link PassengerDetailsRQ.PreProcessing.UniqueID }
         *
         */
        public void setUniqueID(PassengerDetailsRQ.PreProcessing.UniqueID value) {
            this.uniqueID = value;
        }

        /**
         * Gets the value of the haltOnError property.
         *
         * @return possible object is {@link Boolean }
         *
         */
        public Boolean isHaltOnError() {
            return haltOnError;
        }

        /**
         * Sets the value of the haltOnError property.
         *
         * @param value allowed object is {@link Boolean }
         *
         */
        public void setHaltOnError(Boolean value) {
            this.haltOnError = value;
        }

        /**
         * Gets the value of the ignoreBefore property.
         *
         * @return possible object is {@link Boolean }
         *
         */
        public Boolean isIgnoreBefore() {
            return ignoreBefore;
        }

        /**
         * Sets the value of the ignoreBefore property.
         *
         * @param value allowed object is {@link Boolean }
         *
         */
        public void setIgnoreBefore(Boolean value) {
            this.ignoreBefore = value;
        }

        /**
         * <p>
         * Java class for anonymous complex type.
         *
         * <p>
         * The following schema fragment specifies the expected content
         * contained within this class.
         *
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         *
         *
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class UniqueID {

            @XmlAttribute(name = "ID", required = true)
            protected String id;

            /**
             * Gets the value of the id property.
             *
             * @return possible object is {@link String }
             *
             */
            public String getID() {
                return id;
            }

            /**
             * Sets the value of the id property.
             *
             * @param value allowed object is {@link String }
             *
             */
            public void setID(String value) {
                this.id = value;
            }

        }

    }

    /**
     * <p>
     * Java class for anonymous complex type.
     *
     * <p>
     * The following schema fragment specifies the expected content contained
     * within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Link" maxOccurs="98">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="HostedCarrier" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                 &lt;attribute name="NameNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="Record" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="HaltOnError" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "link"
    })
    public static class PriceQuoteInfo {

        @XmlElement(name = "Link", required = true)
        protected List<PassengerDetailsRQ.PriceQuoteInfo.Link> link;
        @XmlAttribute(name = "HaltOnError")
        protected Boolean haltOnError;

        /**
         * Gets the value of the link property.
         *
         * <p>
         * This accessor method returns a reference to the live list, not a
         * snapshot. Therefore any modification you make to the returned list
         * will be present inside the JAXB object. This is why there is not a
         * <CODE>set</CODE> method for the link property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLink().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PassengerDetailsRQ.PriceQuoteInfo.Link }
         *
         *
         */
        public List<PassengerDetailsRQ.PriceQuoteInfo.Link> getLink() {
            if (link == null) {
                link = new ArrayList<PassengerDetailsRQ.PriceQuoteInfo.Link>();
            }
            return this.link;
        }

        public void setLink(List<PassengerDetailsRQ.PriceQuoteInfo.Link> link) {
            this.link = link;
        }

        /**
         * Gets the value of the haltOnError property.
         *
         * @return possible object is {@link Boolean }
         *
         */
        public Boolean isHaltOnError() {
            return haltOnError;
        }

        /**
         * Sets the value of the haltOnError property.
         *
         * @param value allowed object is {@link Boolean }
         *
         */
        public void setHaltOnError(Boolean value) {
            this.haltOnError = value;
        }

        /**
         * <p>
         * Java class for anonymous complex type.
         *
         * <p>
         * The following schema fragment specifies the expected content
         * contained within this class.
         *
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attribute name="HostedCarrier" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *       &lt;attribute name="NameNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="Record" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         *
         *
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Link {

            @XmlAttribute(name = "HostedCarrier")
            protected Boolean hostedCarrier;
            @XmlAttribute(name = "NameNumber")
            protected String nameNumber;
            @XmlAttribute(name = "Record", required = true)
            protected String record;

            /**
             * Gets the value of the hostedCarrier property.
             *
             * @return possible object is {@link Boolean }
             *
             */
            public Boolean isHostedCarrier() {
                return hostedCarrier;
            }

            /**
             * Sets the value of the hostedCarrier property.
             *
             * @param value allowed object is {@link Boolean }
             *
             */
            public void setHostedCarrier(Boolean value) {
                this.hostedCarrier = value;
            }

            /**
             * Gets the value of the nameNumber property.
             *
             * @return possible object is {@link String }
             *
             */
            public String getNameNumber() {
                return nameNumber;
            }

            /**
             * Sets the value of the nameNumber property.
             *
             * @param value allowed object is {@link String }
             *
             */
            public void setNameNumber(String value) {
                this.nameNumber = value;
            }

            /**
             * Gets the value of the record property.
             *
             * @return possible object is {@link String }
             *
             */
            public String getRecord() {
                return record;
            }

            /**
             * Sets the value of the record property.
             *
             * @param value allowed object is {@link String }
             *
             */
            public void setRecord(String value) {
                this.record = value;
            }

        }

    }

    /**
     * <p>
     * Java class for anonymous complex type.
     *
     * <p>
     * The following schema fragment specifies the expected content contained
     * within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="UniqueID">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="HaltOnError" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "uniqueID"
    })
    public static class ProfileRQ {

        @XmlElement(name = "UniqueID", required = true)
        protected PassengerDetailsRQ.ProfileRQ.UniqueID uniqueID;
        @XmlAttribute(name = "HaltOnError")
        protected Boolean haltOnError;

        /**
         * Gets the value of the uniqueID property.
         *
         * @return possible object is
         *     {@link PassengerDetailsRQ.ProfileRQ.UniqueID }
         *
         */
        public PassengerDetailsRQ.ProfileRQ.UniqueID getUniqueID() {
            return uniqueID;
        }

        /**
         * Sets the value of the uniqueID property.
         *
         * @param value allowed object is
         *     {@link PassengerDetailsRQ.ProfileRQ.UniqueID }
         *
         */
        public void setUniqueID(PassengerDetailsRQ.ProfileRQ.UniqueID value) {
            this.uniqueID = value;
        }

        /**
         * Gets the value of the haltOnError property.
         *
         * @return possible object is {@link Boolean }
         *
         */
        public Boolean isHaltOnError() {
            return haltOnError;
        }

        /**
         * Sets the value of the haltOnError property.
         *
         * @param value allowed object is {@link Boolean }
         *
         */
        public void setHaltOnError(Boolean value) {
            this.haltOnError = value;
        }

        /**
         * <p>
         * Java class for anonymous complex type.
         *
         * <p>
         * The following schema fragment specifies the expected content
         * contained within this class.
         *
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         *
         *
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class UniqueID {

            @XmlAttribute(name = "ID", required = true)
            protected String id;

            /**
             * Gets the value of the id property.
             *
             * @return possible object is {@link String }
             *
             */
            public String getID() {
                return id;
            }

            /**
             * Sets the value of the id property.
             *
             * @param value allowed object is {@link String }
             *
             */
            public void setID(String value) {
                this.id = value;
            }

        }

    }

    /**
     * <p>
     * Java class for anonymous complex type.
     *
     * <p>
     * The following schema fragment specifies the expected content contained
     * within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="AddRemarkRQ" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="RemarkInfo">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="FOP_Remark" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="CC_Info" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="PaymentCard">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;attribute name="AirlineCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                         &lt;attribute name="CardSecurityCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                         &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                         &lt;attribute name="ExpireDate" use="required" type="{http://webservices.sabre.com/sabreXML/2011/10}expireDate" />
     *                                                         &lt;attribute name="ExtendedPayment" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                         &lt;attribute name="ManualApprovalCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                         &lt;attribute name="Number" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                         &lt;attribute name="SuppressApprovalCode" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
     *                                                       &lt;/restriction>
     *                                                     &lt;/complexContent>
     *                                                   &lt;/complexType>
     *                                                 &lt;/element>
     *                                               &lt;/sequence>
     *                                               &lt;attribute name="Suppress" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                     &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="FutureQueuePlaceRemark" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="Date" use="required" type="{http://webservices.sabre.com/sabreXML/2011/10}date" />
     *                                     &lt;attribute name="PrefatoryInstructionCode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="PseudoCityCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="QueueIdentifier" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="Time" type="{http://webservices.sabre.com/sabreXML/2011/10}time" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="Remark" maxOccurs="98" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                     &lt;/sequence>
     *                                     &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="SegmentNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="Type" use="required">
     *                                       &lt;simpleType>
     *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                           &lt;enumeration value="Alpha-Coded"/>
     *                                           &lt;enumeration value="Client Address"/>
     *                                           &lt;enumeration value="Corporate"/>
     *                                           &lt;enumeration value="Delivery Address"/>
     *                                           &lt;enumeration value="General"/>
     *                                           &lt;enumeration value="Group Name"/>
     *                                           &lt;enumeration value="Hidden"/>
     *                                           &lt;enumeration value="Historical"/>
     *                                           &lt;enumeration value="Invoice"/>
     *                                           &lt;enumeration value="Itinerary"/>
     *                                         &lt;/restriction>
     *                                       &lt;/simpleType>
     *                                     &lt;/attribute>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="HaltOnError" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="AirSeatRQ" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Seats">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Seat" maxOccurs="98">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="BoardingPass" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                                     &lt;attribute name="ChangeOfGauge" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                                     &lt;attribute name="NameNumber" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="Number" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="Preference" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="SegmentNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="HaltOnError" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="SpecialServiceRQ" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="SpecialServiceInfo">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="SecureFlight" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="PersonName" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="GivenName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                 &lt;element name="Surname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                               &lt;/sequence>
     *                                               &lt;attribute name="DateOfBirth" type="{http://webservices.sabre.com/sabreXML/2011/10}date" />
     *                                               &lt;attribute name="Gender">
     *                                                 &lt;simpleType>
     *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                     &lt;enumeration value="F"/>
     *                                                     &lt;enumeration value="M"/>
     *                                                     &lt;enumeration value="FI"/>
     *                                                     &lt;enumeration value="MI"/>
     *                                                   &lt;/restriction>
     *                                                 &lt;/simpleType>
     *                                               &lt;/attribute>
     *                                               &lt;attribute name="NameNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="RedressNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="VendorPrefs" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="Airline">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;attribute name="Hosted" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                                                       &lt;/restriction>
     *                                                     &lt;/complexContent>
     *                                                   &lt;/complexType>
     *                                                 &lt;/element>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                     &lt;attribute name="SegmentNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="SSR_Code" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="Service" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="PersonName" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;attribute name="NameNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="VendorPrefs" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="Airline">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                         &lt;attribute name="Hosted" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                                                       &lt;/restriction>
     *                                                     &lt;/complexContent>
     *                                                   &lt;/complexType>
     *                                                 &lt;/element>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                     &lt;attribute name="SegmentNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="SSR_Code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="HaltOnError" type="{http://www.w3.org/2001/XMLSchema}boolean" />
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
        "addRemarkRQ",
        "airSeatRQ",
        "specialServiceRQ"
    })
    public static class SpecialReqDetails {

        @XmlElement(name = "AddRemarkRQ")
        protected PassengerDetailsRQ.SpecialReqDetails.AddRemarkRQ addRemarkRQ;
        @XmlElement(name = "AirSeatRQ")
        protected PassengerDetailsRQ.SpecialReqDetails.AirSeatRQ airSeatRQ;
        @XmlElement(name = "SpecialServiceRQ")
        protected PassengerDetailsRQ.SpecialReqDetails.SpecialServiceRQ specialServiceRQ;

        /**
         * Gets the value of the addRemarkRQ property.
         *
         * @return possible object is
         *     {@link PassengerDetailsRQ.SpecialReqDetails.AddRemarkRQ }
         *
         */
        public PassengerDetailsRQ.SpecialReqDetails.AddRemarkRQ getAddRemarkRQ() {
            return addRemarkRQ;
        }

        /**
         * Sets the value of the addRemarkRQ property.
         *
         * @param value allowed object is
         *     {@link PassengerDetailsRQ.SpecialReqDetails.AddRemarkRQ }
         *
         */
        public void setAddRemarkRQ(PassengerDetailsRQ.SpecialReqDetails.AddRemarkRQ value) {
            this.addRemarkRQ = value;
        }

        /**
         * Gets the value of the airSeatRQ property.
         *
         * @return possible object is
         *     {@link PassengerDetailsRQ.SpecialReqDetails.AirSeatRQ }
         *
         */
        public PassengerDetailsRQ.SpecialReqDetails.AirSeatRQ getAirSeatRQ() {
            return airSeatRQ;
        }

        /**
         * Sets the value of the airSeatRQ property.
         *
         * @param value allowed object is
         *     {@link PassengerDetailsRQ.SpecialReqDetails.AirSeatRQ }
         *
         */
        public void setAirSeatRQ(PassengerDetailsRQ.SpecialReqDetails.AirSeatRQ value) {
            this.airSeatRQ = value;
        }

        /**
         * Gets the value of the specialServiceRQ property.
         *
         * @return possible object is
         *     {@link PassengerDetailsRQ.SpecialReqDetails.SpecialServiceRQ }
         *
         */
        public PassengerDetailsRQ.SpecialReqDetails.SpecialServiceRQ getSpecialServiceRQ() {
            return specialServiceRQ;
        }

        /**
         * Sets the value of the specialServiceRQ property.
         *
         * @param value allowed object is
         *     {@link PassengerDetailsRQ.SpecialReqDetails.SpecialServiceRQ }
         *
         */
        public void setSpecialServiceRQ(PassengerDetailsRQ.SpecialReqDetails.SpecialServiceRQ value) {
            this.specialServiceRQ = value;
        }

        /**
         * <p>
         * Java class for anonymous complex type.
         *
         * <p>
         * The following schema fragment specifies the expected content
         * contained within this class.
         *
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="RemarkInfo">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="FOP_Remark" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="CC_Info" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="PaymentCard">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;attribute name="AirlineCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                               &lt;attribute name="CardSecurityCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                               &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                               &lt;attribute name="ExpireDate" use="required" type="{http://webservices.sabre.com/sabreXML/2011/10}expireDate" />
         *                                               &lt;attribute name="ExtendedPayment" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                               &lt;attribute name="ManualApprovalCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                               &lt;attribute name="Number" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                               &lt;attribute name="SuppressApprovalCode" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
         *                                             &lt;/restriction>
         *                                           &lt;/complexContent>
         *                                         &lt;/complexType>
         *                                       &lt;/element>
         *                                     &lt;/sequence>
         *                                     &lt;attribute name="Suppress" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                           &lt;/sequence>
         *                           &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="FutureQueuePlaceRemark" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attribute name="Date" use="required" type="{http://webservices.sabre.com/sabreXML/2011/10}date" />
         *                           &lt;attribute name="PrefatoryInstructionCode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="PseudoCityCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="QueueIdentifier" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="Time" type="{http://webservices.sabre.com/sabreXML/2011/10}time" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="Remark" maxOccurs="98" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                           &lt;/sequence>
         *                           &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="SegmentNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="Type" use="required">
         *                             &lt;simpleType>
         *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                 &lt;enumeration value="Alpha-Coded"/>
         *                                 &lt;enumeration value="Client Address"/>
         *                                 &lt;enumeration value="Corporate"/>
         *                                 &lt;enumeration value="Delivery Address"/>
         *                                 &lt;enumeration value="General"/>
         *                                 &lt;enumeration value="Group Name"/>
         *                                 &lt;enumeration value="Hidden"/>
         *                                 &lt;enumeration value="Historical"/>
         *                                 &lt;enumeration value="Invoice"/>
         *                                 &lt;enumeration value="Itinerary"/>
         *                               &lt;/restriction>
         *                             &lt;/simpleType>
         *                           &lt;/attribute>
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
         *       &lt;attribute name="HaltOnError" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         *
         *
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "remarkInfo"
        })
        public static class AddRemarkRQ {

            @XmlElement(name = "RemarkInfo", required = true)
            protected PassengerDetailsRQ.SpecialReqDetails.AddRemarkRQ.RemarkInfo remarkInfo;
            @XmlAttribute(name = "HaltOnError")
            protected Boolean haltOnError;

            /**
             * Gets the value of the remarkInfo property.
             *
             * @return possible object is
             *     {@link PassengerDetailsRQ.SpecialReqDetails.AddRemarkRQ.RemarkInfo }
             *
             */
            public PassengerDetailsRQ.SpecialReqDetails.AddRemarkRQ.RemarkInfo getRemarkInfo() {
                return remarkInfo;
            }

            /**
             * Sets the value of the remarkInfo property.
             *
             * @param value allowed object is
             *     {@link PassengerDetailsRQ.SpecialReqDetails.AddRemarkRQ.RemarkInfo }
             *
             */
            public void setRemarkInfo(PassengerDetailsRQ.SpecialReqDetails.AddRemarkRQ.RemarkInfo value) {
                this.remarkInfo = value;
            }

            /**
             * Gets the value of the haltOnError property.
             *
             * @return possible object is {@link Boolean }
             *
             */
            public Boolean isHaltOnError() {
                return haltOnError;
            }

            /**
             * Sets the value of the haltOnError property.
             *
             * @param value allowed object is {@link Boolean }
             *
             */
            public void setHaltOnError(Boolean value) {
                this.haltOnError = value;
            }

            /**
             * <p>
             * Java class for anonymous complex type.
             *
             * <p>
             * The following schema fragment specifies the expected content
             * contained within this class.
             *
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="FOP_Remark" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="CC_Info" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="PaymentCard">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;attribute name="AirlineCode" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                     &lt;attribute name="CardSecurityCode" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                     &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                     &lt;attribute name="ExpireDate" use="required" type="{http://webservices.sabre.com/sabreXML/2011/10}expireDate" />
             *                                     &lt;attribute name="ExtendedPayment" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                     &lt;attribute name="ManualApprovalCode" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                     &lt;attribute name="Number" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                     &lt;attribute name="SuppressApprovalCode" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
             *                                   &lt;/restriction>
             *                                 &lt;/complexContent>
             *                               &lt;/complexType>
             *                             &lt;/element>
             *                           &lt;/sequence>
             *                           &lt;attribute name="Suppress" type="{http://www.w3.org/2001/XMLSchema}boolean" />
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                 &lt;/sequence>
             *                 &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="FutureQueuePlaceRemark" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="Date" use="required" type="{http://webservices.sabre.com/sabreXML/2011/10}date" />
             *                 &lt;attribute name="PrefatoryInstructionCode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="PseudoCityCode" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="QueueIdentifier" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="Time" type="{http://webservices.sabre.com/sabreXML/2011/10}time" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="Remark" maxOccurs="98" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                 &lt;/sequence>
             *                 &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="SegmentNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="Type" use="required">
             *                   &lt;simpleType>
             *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                       &lt;enumeration value="Alpha-Coded"/>
             *                       &lt;enumeration value="Client Address"/>
             *                       &lt;enumeration value="Corporate"/>
             *                       &lt;enumeration value="Delivery Address"/>
             *                       &lt;enumeration value="General"/>
             *                       &lt;enumeration value="Group Name"/>
             *                       &lt;enumeration value="Hidden"/>
             *                       &lt;enumeration value="Historical"/>
             *                       &lt;enumeration value="Invoice"/>
             *                       &lt;enumeration value="Itinerary"/>
             *                     &lt;/restriction>
             *                   &lt;/simpleType>
             *                 &lt;/attribute>
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
                "fopRemark",
                "futureQueuePlaceRemark",
                "remark"
            })
            public static class RemarkInfo {

                @XmlElement(name = "FOP_Remark")
                protected PassengerDetailsRQ.SpecialReqDetails.AddRemarkRQ.RemarkInfo.FOPRemark fopRemark;
                @XmlElement(name = "FutureQueuePlaceRemark")
                protected PassengerDetailsRQ.SpecialReqDetails.AddRemarkRQ.RemarkInfo.FutureQueuePlaceRemark futureQueuePlaceRemark;
                @XmlElement(name = "Remark")
                protected List<PassengerDetailsRQ.SpecialReqDetails.AddRemarkRQ.RemarkInfo.Remark> remark;

                /**
                 * Gets the value of the fopRemark property.
                 *
                 * @return possible object is
                 *     {@link PassengerDetailsRQ.SpecialReqDetails.AddRemarkRQ.RemarkInfo.FOPRemark }
                 *
                 */
                public PassengerDetailsRQ.SpecialReqDetails.AddRemarkRQ.RemarkInfo.FOPRemark getFOPRemark() {
                    return fopRemark;
                }

                /**
                 * Sets the value of the fopRemark property.
                 *
                 * @param value allowed object is
                 *     {@link PassengerDetailsRQ.SpecialReqDetails.AddRemarkRQ.RemarkInfo.FOPRemark }
                 *
                 */
                public void setFOPRemark(PassengerDetailsRQ.SpecialReqDetails.AddRemarkRQ.RemarkInfo.FOPRemark value) {
                    this.fopRemark = value;
                }

                /**
                 * Gets the value of the futureQueuePlaceRemark property.
                 *
                 * @return possible object is
                 *     {@link PassengerDetailsRQ.SpecialReqDetails.AddRemarkRQ.RemarkInfo.FutureQueuePlaceRemark }
                 *
                 */
                public PassengerDetailsRQ.SpecialReqDetails.AddRemarkRQ.RemarkInfo.FutureQueuePlaceRemark getFutureQueuePlaceRemark() {
                    return futureQueuePlaceRemark;
                }

                /**
                 * Sets the value of the futureQueuePlaceRemark property.
                 *
                 * @param value allowed object is
                 *     {@link PassengerDetailsRQ.SpecialReqDetails.AddRemarkRQ.RemarkInfo.FutureQueuePlaceRemark }
                 *
                 */
                public void setFutureQueuePlaceRemark(PassengerDetailsRQ.SpecialReqDetails.AddRemarkRQ.RemarkInfo.FutureQueuePlaceRemark value) {
                    this.futureQueuePlaceRemark = value;
                }

                /**
                 * Gets the value of the remark property.
                 *
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object. This is
                 * why there is not a <CODE>set</CODE> method for the remark
                 * property.
                 *
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getRemark().add(newItem);
                 * </pre>
                 *
                 *
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link PassengerDetailsRQ.SpecialReqDetails.AddRemarkRQ.RemarkInfo.Remark }
                 *
                 *
                 */
                public List<PassengerDetailsRQ.SpecialReqDetails.AddRemarkRQ.RemarkInfo.Remark> getRemark() {
                    if (remark == null) {
                        remark = new ArrayList<PassengerDetailsRQ.SpecialReqDetails.AddRemarkRQ.RemarkInfo.Remark>();
                    }
                    return this.remark;
                }

                /**
                 * <p>
                 * Java class for anonymous complex type.
                 *
                 * <p>
                 * The following schema fragment specifies the expected content
                 * contained within this class.
                 *
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="CC_Info" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="PaymentCard">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;attribute name="AirlineCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                           &lt;attribute name="CardSecurityCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                           &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                           &lt;attribute name="ExpireDate" use="required" type="{http://webservices.sabre.com/sabreXML/2011/10}expireDate" />
                 *                           &lt;attribute name="ExtendedPayment" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                           &lt;attribute name="ManualApprovalCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                           &lt;attribute name="Number" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                           &lt;attribute name="SuppressApprovalCode" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
                 *                         &lt;/restriction>
                 *                       &lt;/complexContent>
                 *                     &lt;/complexType>
                 *                   &lt;/element>
                 *                 &lt;/sequence>
                 *                 &lt;attribute name="Suppress" type="{http://www.w3.org/2001/XMLSchema}boolean" />
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *       &lt;/sequence>
                 *       &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 *
                 *
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "ccInfo"
                })
                public static class FOPRemark {

                    @XmlElement(name = "CC_Info")
                    protected PassengerDetailsRQ.SpecialReqDetails.AddRemarkRQ.RemarkInfo.FOPRemark.CCInfo ccInfo;
                    @XmlAttribute(name = "Type")
                    protected String type;

                    /**
                     * Gets the value of the ccInfo property.
                     *
                     * @return possible object is
                     *     {@link PassengerDetailsRQ.SpecialReqDetails.AddRemarkRQ.RemarkInfo.FOPRemark.CCInfo }
                     *
                     */
                    public PassengerDetailsRQ.SpecialReqDetails.AddRemarkRQ.RemarkInfo.FOPRemark.CCInfo getCCInfo() {
                        return ccInfo;
                    }

                    /**
                     * Sets the value of the ccInfo property.
                     *
                     * @param value allowed object is
                     *     {@link PassengerDetailsRQ.SpecialReqDetails.AddRemarkRQ.RemarkInfo.FOPRemark.CCInfo }
                     *
                     */
                    public void setCCInfo(PassengerDetailsRQ.SpecialReqDetails.AddRemarkRQ.RemarkInfo.FOPRemark.CCInfo value) {
                        this.ccInfo = value;
                    }

                    /**
                     * Gets the value of the type property.
                     *
                     * @return possible object is {@link String }
                     *
                     */
                    public String getType() {
                        return type;
                    }

                    /**
                     * Sets the value of the type property.
                     *
                     * @param value allowed object is {@link String }
                     *
                     */
                    public void setType(String value) {
                        this.type = value;
                    }

                    /**
                     * <p>
                     * Java class for anonymous complex type.
                     *
                     * <p>
                     * The following schema fragment specifies the expected
                     * content contained within this class.
                     *
                     * <pre>
                     * &lt;complexType>
                     *   &lt;complexContent>
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *       &lt;sequence>
                     *         &lt;element name="PaymentCard">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;attribute name="AirlineCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *                 &lt;attribute name="CardSecurityCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *                 &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *                 &lt;attribute name="ExpireDate" use="required" type="{http://webservices.sabre.com/sabreXML/2011/10}expireDate" />
                     *                 &lt;attribute name="ExtendedPayment" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *                 &lt;attribute name="ManualApprovalCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *                 &lt;attribute name="Number" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *                 &lt;attribute name="SuppressApprovalCode" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
                     *               &lt;/restriction>
                     *             &lt;/complexContent>
                     *           &lt;/complexType>
                     *         &lt;/element>
                     *       &lt;/sequence>
                     *       &lt;attribute name="Suppress" type="{http://www.w3.org/2001/XMLSchema}boolean" />
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     *
                     *
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "paymentCard"
                    })
                    public static class CCInfo {

                        @XmlElement(name = "PaymentCard", required = true)
                        protected PassengerDetailsRQ.SpecialReqDetails.AddRemarkRQ.RemarkInfo.FOPRemark.CCInfo.PaymentCard paymentCard;
                        @XmlAttribute(name = "Suppress")
                        protected Boolean suppress;

                        /**
                         * Gets the value of the paymentCard property.
                         *
                         * @return possible object is
                         *     {@link PassengerDetailsRQ.SpecialReqDetails.AddRemarkRQ.RemarkInfo.FOPRemark.CCInfo.PaymentCard }
                         *
                         */
                        public PassengerDetailsRQ.SpecialReqDetails.AddRemarkRQ.RemarkInfo.FOPRemark.CCInfo.PaymentCard getPaymentCard() {
                            return paymentCard;
                        }

                        /**
                         * Sets the value of the paymentCard property.
                         *
                         * @param value allowed object is
                         *     {@link PassengerDetailsRQ.SpecialReqDetails.AddRemarkRQ.RemarkInfo.FOPRemark.CCInfo.PaymentCard }
                         *
                         */
                        public void setPaymentCard(PassengerDetailsRQ.SpecialReqDetails.AddRemarkRQ.RemarkInfo.FOPRemark.CCInfo.PaymentCard value) {
                            this.paymentCard = value;
                        }

                        /**
                         * Gets the value of the suppress property.
                         *
                         * @return possible object is {@link Boolean }
                         *
                         */
                        public Boolean isSuppress() {
                            return suppress;
                        }

                        /**
                         * Sets the value of the suppress property.
                         *
                         * @param value allowed object is {@link Boolean }
                         *
                         */
                        public void setSuppress(Boolean value) {
                            this.suppress = value;
                        }

                        /**
                         * <p>
                         * Java class for anonymous complex type.
                         *
                         * <p>
                         * The following schema fragment specifies the expected
                         * content contained within this class.
                         *
                         * <pre>
                         * &lt;complexType>
                         *   &lt;complexContent>
                         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *       &lt;attribute name="AirlineCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                         *       &lt;attribute name="CardSecurityCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                         *       &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
                         *       &lt;attribute name="ExpireDate" use="required" type="{http://webservices.sabre.com/sabreXML/2011/10}expireDate" />
                         *       &lt;attribute name="ExtendedPayment" type="{http://www.w3.org/2001/XMLSchema}string" />
                         *       &lt;attribute name="ManualApprovalCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                         *       &lt;attribute name="Number" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
                         *       &lt;attribute name="SuppressApprovalCode" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
                         *     &lt;/restriction>
                         *   &lt;/complexContent>
                         * &lt;/complexType>
                         * </pre>
                         *
                         *
                         */
                        @XmlAccessorType(XmlAccessType.FIELD)
                        @XmlType(name = "")
                        public static class PaymentCard {

                            @XmlAttribute(name = "AirlineCode")
                            protected String airlineCode;
                            @XmlAttribute(name = "CardSecurityCode")
                            protected String cardSecurityCode;
                            @XmlAttribute(name = "Code", required = true)
                            protected String code;
                            @XmlAttribute(name = "ExpireDate", required = true)
                            protected XMLGregorianCalendar expireDate;
                            @XmlAttribute(name = "ExtendedPayment")
                            protected String extendedPayment;
                            @XmlAttribute(name = "ManualApprovalCode")
                            protected String manualApprovalCode;
                            @XmlAttribute(name = "Number", required = true)
                            protected String number;
                            @XmlAttribute(name = "SuppressApprovalCode")
                            protected Boolean suppressApprovalCode;

                            /**
                             * Gets the value of the airlineCode property.
                             *
                             * @return possible object is {@link String }
                             *
                             */
                            public String getAirlineCode() {
                                return airlineCode;
                            }

                            /**
                             * Sets the value of the airlineCode property.
                             *
                             * @param value allowed object is {@link String }
                             *
                             */
                            public void setAirlineCode(String value) {
                                this.airlineCode = value;
                            }

                            /**
                             * Gets the value of the cardSecurityCode property.
                             *
                             * @return possible object is {@link String }
                             *
                             */
                            public String getCardSecurityCode() {
                                return cardSecurityCode;
                            }

                            /**
                             * Sets the value of the cardSecurityCode property.
                             *
                             * @param value allowed object is {@link String }
                             *
                             */
                            public void setCardSecurityCode(String value) {
                                this.cardSecurityCode = value;
                            }

                            /**
                             * Gets the value of the code property.
                             *
                             * @return possible object is {@link String }
                             *
                             */
                            public String getCode() {
                                return code;
                            }

                            /**
                             * Sets the value of the code property.
                             *
                             * @param value allowed object is {@link String }
                             *
                             */
                            public void setCode(String value) {
                                this.code = value;
                            }

                            /**
                             * Gets the value of the expireDate property.
                             *
                             * @return possible object is
                             *     {@link XMLGregorianCalendar }
                             *
                             */
                            public XMLGregorianCalendar getExpireDate() {
                                return expireDate;
                            }

                            /**
                             * Sets the value of the expireDate property.
                             *
                             * @param value allowed object is
                             *     {@link XMLGregorianCalendar }
                             *
                             */
                            public void setExpireDate(XMLGregorianCalendar value) {
                                this.expireDate = value;
                            }

                            /**
                             * Gets the value of the extendedPayment property.
                             *
                             * @return possible object is {@link String }
                             *
                             */
                            public String getExtendedPayment() {
                                return extendedPayment;
                            }

                            /**
                             * Sets the value of the extendedPayment property.
                             *
                             * @param value allowed object is {@link String }
                             *
                             */
                            public void setExtendedPayment(String value) {
                                this.extendedPayment = value;
                            }

                            /**
                             * Gets the value of the manualApprovalCode
                             * property.
                             *
                             * @return possible object is {@link String }
                             *
                             */
                            public String getManualApprovalCode() {
                                return manualApprovalCode;
                            }

                            /**
                             * Sets the value of the manualApprovalCode
                             * property.
                             *
                             * @param value allowed object is {@link String }
                             *
                             */
                            public void setManualApprovalCode(String value) {
                                this.manualApprovalCode = value;
                            }

                            /**
                             * Gets the value of the number property.
                             *
                             * @return possible object is {@link String }
                             *
                             */
                            public String getNumber() {
                                return number;
                            }

                            /**
                             * Sets the value of the number property.
                             *
                             * @param value allowed object is {@link String }
                             *
                             */
                            public void setNumber(String value) {
                                this.number = value;
                            }

                            /**
                             * Gets the value of the suppressApprovalCode
                             * property.
                             *
                             * @return possible object is {@link Boolean }
                             *
                             */
                            public boolean isSuppressApprovalCode() {
                                if (suppressApprovalCode == null) {
                                    return false;
                                } else {
                                    return suppressApprovalCode;
                                }
                            }

                            /**
                             * Sets the value of the suppressApprovalCode
                             * property.
                             *
                             * @param value allowed object is {@link Boolean }
                             *
                             */
                            public void setSuppressApprovalCode(Boolean value) {
                                this.suppressApprovalCode = value;
                            }

                        }

                    }

                }

                /**
                 * <p>
                 * Java class for anonymous complex type.
                 *
                 * <p>
                 * The following schema fragment specifies the expected content
                 * contained within this class.
                 *
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;attribute name="Date" use="required" type="{http://webservices.sabre.com/sabreXML/2011/10}date" />
                 *       &lt;attribute name="PrefatoryInstructionCode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="PseudoCityCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="QueueIdentifier" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="Time" type="{http://webservices.sabre.com/sabreXML/2011/10}time" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 *
                 *
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class FutureQueuePlaceRemark {

                    @XmlAttribute(name = "Date", required = true)
                    protected String date;
                    @XmlAttribute(name = "PrefatoryInstructionCode", required = true)
                    protected String prefatoryInstructionCode;
                    @XmlAttribute(name = "PseudoCityCode")
                    protected String pseudoCityCode;
                    @XmlAttribute(name = "QueueIdentifier", required = true)
                    protected String queueIdentifier;
                    @XmlAttribute(name = "Time")
                    protected String time;

                    /**
                     * Gets the value of the date property.
                     *
                     * @return possible object is {@link String }
                     *
                     */
                    public String getDate() {
                        return date;
                    }

                    /**
                     * Sets the value of the date property.
                     *
                     * @param value allowed object is {@link String }
                     *
                     */
                    public void setDate(String value) {
                        this.date = value;
                    }

                    /**
                     * Gets the value of the prefatoryInstructionCode property.
                     *
                     * @return possible object is {@link String }
                     *
                     */
                    public String getPrefatoryInstructionCode() {
                        return prefatoryInstructionCode;
                    }

                    /**
                     * Sets the value of the prefatoryInstructionCode property.
                     *
                     * @param value allowed object is {@link String }
                     *
                     */
                    public void setPrefatoryInstructionCode(String value) {
                        this.prefatoryInstructionCode = value;
                    }

                    /**
                     * Gets the value of the pseudoCityCode property.
                     *
                     * @return possible object is {@link String }
                     *
                     */
                    public String getPseudoCityCode() {
                        return pseudoCityCode;
                    }

                    /**
                     * Sets the value of the pseudoCityCode property.
                     *
                     * @param value allowed object is {@link String }
                     *
                     */
                    public void setPseudoCityCode(String value) {
                        this.pseudoCityCode = value;
                    }

                    /**
                     * Gets the value of the queueIdentifier property.
                     *
                     * @return possible object is {@link String }
                     *
                     */
                    public String getQueueIdentifier() {
                        return queueIdentifier;
                    }

                    /**
                     * Sets the value of the queueIdentifier property.
                     *
                     * @param value allowed object is {@link String }
                     *
                     */
                    public void setQueueIdentifier(String value) {
                        this.queueIdentifier = value;
                    }

                    /**
                     * Gets the value of the time property.
                     *
                     * @return possible object is {@link String }
                     *
                     */
                    public String getTime() {
                        return time;
                    }

                    /**
                     * Sets the value of the time property.
                     *
                     * @param value allowed object is {@link String }
                     *
                     */
                    public void setTime(String value) {
                        this.time = value;
                    }

                }

                /**
                 * <p>
                 * Java class for anonymous complex type.
                 *
                 * <p>
                 * The following schema fragment specifies the expected content
                 * contained within this class.
                 *
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *       &lt;/sequence>
                 *       &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="SegmentNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="Type" use="required">
                 *         &lt;simpleType>
                 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *             &lt;enumeration value="Alpha-Coded"/>
                 *             &lt;enumeration value="Client Address"/>
                 *             &lt;enumeration value="Corporate"/>
                 *             &lt;enumeration value="Delivery Address"/>
                 *             &lt;enumeration value="General"/>
                 *             &lt;enumeration value="Group Name"/>
                 *             &lt;enumeration value="Hidden"/>
                 *             &lt;enumeration value="Historical"/>
                 *             &lt;enumeration value="Invoice"/>
                 *             &lt;enumeration value="Itinerary"/>
                 *           &lt;/restriction>
                 *         &lt;/simpleType>
                 *       &lt;/attribute>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 *
                 *
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "text"
                })
                public static class Remark {

                    @XmlElement(name = "Text", required = true)
                    protected String text;
                    @XmlAttribute(name = "Code")
                    protected String code;
                    @XmlAttribute(name = "SegmentNumber")
                    protected String segmentNumber;
                    @XmlAttribute(name = "Type", required = true)
                    protected String type;

                    /**
                     * Gets the value of the text property.
                     *
                     * @return possible object is {@link String }
                     *
                     */
                    public String getText() {
                        return text;
                    }

                    /**
                     * Sets the value of the text property.
                     *
                     * @param value allowed object is {@link String }
                     *
                     */
                    public void setText(String value) {
                        this.text = value;
                    }

                    /**
                     * Gets the value of the code property.
                     *
                     * @return possible object is {@link String }
                     *
                     */
                    public String getCode() {
                        return code;
                    }

                    /**
                     * Sets the value of the code property.
                     *
                     * @param value allowed object is {@link String }
                     *
                     */
                    public void setCode(String value) {
                        this.code = value;
                    }

                    /**
                     * Gets the value of the segmentNumber property.
                     *
                     * @return possible object is {@link String }
                     *
                     */
                    public String getSegmentNumber() {
                        return segmentNumber;
                    }

                    /**
                     * Sets the value of the segmentNumber property.
                     *
                     * @param value allowed object is {@link String }
                     *
                     */
                    public void setSegmentNumber(String value) {
                        this.segmentNumber = value;
                    }

                    /**
                     * Gets the value of the type property.
                     *
                     * @return possible object is {@link String }
                     *
                     */
                    public String getType() {
                        return type;
                    }

                    /**
                     * Sets the value of the type property.
                     *
                     * @param value allowed object is {@link String }
                     *
                     */
                    public void setType(String value) {
                        this.type = value;
                    }

                }

            }

        }

        /**
         * <p>
         * Java class for anonymous complex type.
         *
         * <p>
         * The following schema fragment specifies the expected content
         * contained within this class.
         *
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="Seats">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Seat" maxOccurs="98">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attribute name="BoardingPass" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *                           &lt;attribute name="ChangeOfGauge" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *                           &lt;attribute name="NameNumber" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="Number" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="Preference" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="SegmentNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
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
         *       &lt;attribute name="HaltOnError" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         *
         *
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "seats"
        })
        public static class AirSeatRQ {

            @XmlElement(name = "Seats", required = true)
            protected PassengerDetailsRQ.SpecialReqDetails.AirSeatRQ.Seats seats;
            @XmlAttribute(name = "HaltOnError")
            protected Boolean haltOnError;

            /**
             * Gets the value of the seats property.
             *
             * @return possible object is
             *     {@link PassengerDetailsRQ.SpecialReqDetails.AirSeatRQ.Seats }
             *
             */
            public PassengerDetailsRQ.SpecialReqDetails.AirSeatRQ.Seats getSeats() {
                return seats;
            }

            /**
             * Sets the value of the seats property.
             *
             * @param value allowed object is
             *     {@link PassengerDetailsRQ.SpecialReqDetails.AirSeatRQ.Seats }
             *
             */
            public void setSeats(PassengerDetailsRQ.SpecialReqDetails.AirSeatRQ.Seats value) {
                this.seats = value;
            }

            /**
             * Gets the value of the haltOnError property.
             *
             * @return possible object is {@link Boolean }
             *
             */
            public Boolean isHaltOnError() {
                return haltOnError;
            }

            /**
             * Sets the value of the haltOnError property.
             *
             * @param value allowed object is {@link Boolean }
             *
             */
            public void setHaltOnError(Boolean value) {
                this.haltOnError = value;
            }

            /**
             * <p>
             * Java class for anonymous complex type.
             *
             * <p>
             * The following schema fragment specifies the expected content
             * contained within this class.
             *
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="Seat" maxOccurs="98">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="BoardingPass" type="{http://www.w3.org/2001/XMLSchema}boolean" />
             *                 &lt;attribute name="ChangeOfGauge" type="{http://www.w3.org/2001/XMLSchema}boolean" />
             *                 &lt;attribute name="NameNumber" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="Number" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="Preference" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="SegmentNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
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
                "seat"
            })
            public static class Seats {

                @XmlElement(name = "Seat", required = true)
                protected List<PassengerDetailsRQ.SpecialReqDetails.AirSeatRQ.Seats.Seat> seat;

                /**
                 * Gets the value of the seat property.
                 *
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object. This is
                 * why there is not a <CODE>set</CODE> method for the seat
                 * property.
                 *
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getSeat().add(newItem);
                 * </pre>
                 *
                 *
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link PassengerDetailsRQ.SpecialReqDetails.AirSeatRQ.Seats.Seat }
                 *
                 *
                 */
                public List<PassengerDetailsRQ.SpecialReqDetails.AirSeatRQ.Seats.Seat> getSeat() {
                    if (seat == null) {
                        seat = new ArrayList<PassengerDetailsRQ.SpecialReqDetails.AirSeatRQ.Seats.Seat>();
                    }
                    return this.seat;
                }

                /**
                 * <p>
                 * Java class for anonymous complex type.
                 *
                 * <p>
                 * The following schema fragment specifies the expected content
                 * contained within this class.
                 *
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;attribute name="BoardingPass" type="{http://www.w3.org/2001/XMLSchema}boolean" />
                 *       &lt;attribute name="ChangeOfGauge" type="{http://www.w3.org/2001/XMLSchema}boolean" />
                 *       &lt;attribute name="NameNumber" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="Number" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="Preference" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="SegmentNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 *
                 *
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class Seat {

                    @XmlAttribute(name = "BoardingPass")
                    protected Boolean boardingPass;
                    @XmlAttribute(name = "ChangeOfGauge")
                    protected Boolean changeOfGauge;
                    @XmlAttribute(name = "NameNumber", required = true)
                    protected String nameNumber;
                    @XmlAttribute(name = "Number")
                    protected String number;
                    @XmlAttribute(name = "Preference")
                    protected String preference;
                    @XmlAttribute(name = "SegmentNumber")
                    protected String segmentNumber;

                    /**
                     * Gets the value of the boardingPass property.
                     *
                     * @return possible object is {@link Boolean }
                     *
                     */
                    public Boolean isBoardingPass() {
                        return boardingPass;
                    }

                    /**
                     * Sets the value of the boardingPass property.
                     *
                     * @param value allowed object is {@link Boolean }
                     *
                     */
                    public void setBoardingPass(Boolean value) {
                        this.boardingPass = value;
                    }

                    /**
                     * Gets the value of the changeOfGauge property.
                     *
                     * @return possible object is {@link Boolean }
                     *
                     */
                    public Boolean isChangeOfGauge() {
                        return changeOfGauge;
                    }

                    /**
                     * Sets the value of the changeOfGauge property.
                     *
                     * @param value allowed object is {@link Boolean }
                     *
                     */
                    public void setChangeOfGauge(Boolean value) {
                        this.changeOfGauge = value;
                    }

                    /**
                     * Gets the value of the nameNumber property.
                     *
                     * @return possible object is {@link String }
                     *
                     */
                    public String getNameNumber() {
                        return nameNumber;
                    }

                    /**
                     * Sets the value of the nameNumber property.
                     *
                     * @param value allowed object is {@link String }
                     *
                     */
                    public void setNameNumber(String value) {
                        this.nameNumber = value;
                    }

                    /**
                     * Gets the value of the number property.
                     *
                     * @return possible object is {@link String }
                     *
                     */
                    public String getNumber() {
                        return number;
                    }

                    /**
                     * Sets the value of the number property.
                     *
                     * @param value allowed object is {@link String }
                     *
                     */
                    public void setNumber(String value) {
                        this.number = value;
                    }

                    /**
                     * Gets the value of the preference property.
                     *
                     * @return possible object is {@link String }
                     *
                     */
                    public String getPreference() {
                        return preference;
                    }

                    /**
                     * Sets the value of the preference property.
                     *
                     * @param value allowed object is {@link String }
                     *
                     */
                    public void setPreference(String value) {
                        this.preference = value;
                    }

                    /**
                     * Gets the value of the segmentNumber property.
                     *
                     * @return possible object is {@link String }
                     *
                     */
                    public String getSegmentNumber() {
                        return segmentNumber;
                    }

                    /**
                     * Sets the value of the segmentNumber property.
                     *
                     * @param value allowed object is {@link String }
                     *
                     */
                    public void setSegmentNumber(String value) {
                        this.segmentNumber = value;
                    }

                }

            }

        }

        /**
         * <p>
         * Java class for anonymous complex type.
         *
         * <p>
         * The following schema fragment specifies the expected content
         * contained within this class.
         *
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="SpecialServiceInfo">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="SecureFlight" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="PersonName" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="GivenName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                       &lt;element name="Surname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                     &lt;/sequence>
         *                                     &lt;attribute name="DateOfBirth" type="{http://webservices.sabre.com/sabreXML/2011/10}date" />
         *                                     &lt;attribute name="Gender">
         *                                       &lt;simpleType>
         *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                           &lt;enumeration value="F"/>
         *                                           &lt;enumeration value="M"/>
         *                                           &lt;enumeration value="FI"/>
         *                                           &lt;enumeration value="MI"/>
         *                                         &lt;/restriction>
         *                                       &lt;/simpleType>
         *                                     &lt;/attribute>
         *                                     &lt;attribute name="NameNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="RedressNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="VendorPrefs" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="Airline">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;attribute name="Hosted" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *                                             &lt;/restriction>
         *                                           &lt;/complexContent>
         *                                         &lt;/complexType>
         *                                       &lt;/element>
         *                                     &lt;/sequence>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                           &lt;/sequence>
         *                           &lt;attribute name="SegmentNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="SSR_Code" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="Service" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="PersonName" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;attribute name="NameNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="VendorPrefs" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="Airline">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                               &lt;attribute name="Hosted" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *                                             &lt;/restriction>
         *                                           &lt;/complexContent>
         *                                         &lt;/complexType>
         *                                       &lt;/element>
         *                                     &lt;/sequence>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                           &lt;/sequence>
         *                           &lt;attribute name="SegmentNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="SSR_Code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
         *       &lt;attribute name="HaltOnError" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         *
         *
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "specialServiceInfo"
        })
        public static class SpecialServiceRQ {

            @XmlElement(name = "SpecialServiceInfo", required = true)
            protected PassengerDetailsRQ.SpecialReqDetails.SpecialServiceRQ.SpecialServiceInfo specialServiceInfo;
            @XmlAttribute(name = "HaltOnError")
            protected Boolean haltOnError;

            /**
             * Gets the value of the specialServiceInfo property.
             *
             * @return possible object is
             *     {@link PassengerDetailsRQ.SpecialReqDetails.SpecialServiceRQ.SpecialServiceInfo }
             *
             */
            public PassengerDetailsRQ.SpecialReqDetails.SpecialServiceRQ.SpecialServiceInfo getSpecialServiceInfo() {
                return specialServiceInfo;
            }

            /**
             * Sets the value of the specialServiceInfo property.
             *
             * @param value allowed object is
             *     {@link PassengerDetailsRQ.SpecialReqDetails.SpecialServiceRQ.SpecialServiceInfo }
             *
             */
            public void setSpecialServiceInfo(PassengerDetailsRQ.SpecialReqDetails.SpecialServiceRQ.SpecialServiceInfo value) {
                this.specialServiceInfo = value;
            }

            /**
             * Gets the value of the haltOnError property.
             *
             * @return possible object is {@link Boolean }
             *
             */
            public Boolean isHaltOnError() {
                return haltOnError;
            }

            /**
             * Sets the value of the haltOnError property.
             *
             * @param value allowed object is {@link Boolean }
             *
             */
            public void setHaltOnError(Boolean value) {
                this.haltOnError = value;
            }

            /**
             * <p>
             * Java class for anonymous complex type.
             *
             * <p>
             * The following schema fragment specifies the expected content
             * contained within this class.
             *
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="SecureFlight" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="PersonName" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="GivenName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                             &lt;element name="Surname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                           &lt;/sequence>
             *                           &lt;attribute name="DateOfBirth" type="{http://webservices.sabre.com/sabreXML/2011/10}date" />
             *                           &lt;attribute name="Gender">
             *                             &lt;simpleType>
             *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                 &lt;enumeration value="F"/>
             *                                 &lt;enumeration value="M"/>
             *                                 &lt;enumeration value="FI"/>
             *                                 &lt;enumeration value="MI"/>
             *                               &lt;/restriction>
             *                             &lt;/simpleType>
             *                           &lt;/attribute>
             *                           &lt;attribute name="NameNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="RedressNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="VendorPrefs" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="Airline">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;attribute name="Hosted" type="{http://www.w3.org/2001/XMLSchema}boolean" />
             *                                   &lt;/restriction>
             *                                 &lt;/complexContent>
             *                               &lt;/complexType>
             *                             &lt;/element>
             *                           &lt;/sequence>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                 &lt;/sequence>
             *                 &lt;attribute name="SegmentNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="SSR_Code" type="{http://www.w3.org/2001/XMLSchema}string" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="Service" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="PersonName" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;attribute name="NameNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="VendorPrefs" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="Airline">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                     &lt;attribute name="Hosted" type="{http://www.w3.org/2001/XMLSchema}boolean" />
             *                                   &lt;/restriction>
             *                                 &lt;/complexContent>
             *                               &lt;/complexType>
             *                             &lt;/element>
             *                           &lt;/sequence>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                 &lt;/sequence>
             *                 &lt;attribute name="SegmentNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="SSR_Code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
                "secureFlight",
                "service"
            })
            public static class SpecialServiceInfo {

                @XmlElement(name = "SecureFlight")
                protected List<PassengerDetailsRQ.SpecialReqDetails.SpecialServiceRQ.SpecialServiceInfo.SecureFlight> secureFlight;
                @XmlElement(name = "Service")
                protected List<PassengerDetailsRQ.SpecialReqDetails.SpecialServiceRQ.SpecialServiceInfo.Service> service;

                /**
                 * Gets the value of the secureFlight property.
                 *
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object. This is
                 * why there is not a <CODE>set</CODE> method for the
                 * secureFlight property.
                 *
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getSecureFlight().add(newItem);
                 * </pre>
                 *
                 *
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link PassengerDetailsRQ.SpecialReqDetails.SpecialServiceRQ.SpecialServiceInfo.SecureFlight }
                 *
                 *
                 */
                public List<PassengerDetailsRQ.SpecialReqDetails.SpecialServiceRQ.SpecialServiceInfo.SecureFlight> getSecureFlight() {
                    if (secureFlight == null) {
                        secureFlight = new ArrayList<PassengerDetailsRQ.SpecialReqDetails.SpecialServiceRQ.SpecialServiceInfo.SecureFlight>();
                    }
                    return this.secureFlight;
                }
                
                public void setSecureFlight(List<PassengerDetailsRQ.SpecialReqDetails.SpecialServiceRQ.SpecialServiceInfo.SecureFlight> ssff) {
                    this.secureFlight = ssff;
                }

                /**
                 * Gets the value of the service property.
                 *
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object. This is
                 * why there is not a <CODE>set</CODE> method for the service
                 * property.
                 *
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getService().add(newItem);
                 * </pre>
                 *
                 *
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link PassengerDetailsRQ.SpecialReqDetails.SpecialServiceRQ.SpecialServiceInfo.Service }
                 *
                 *
                 */
                public List<PassengerDetailsRQ.SpecialReqDetails.SpecialServiceRQ.SpecialServiceInfo.Service> getService() {
                    if (service == null) {
                        service = new ArrayList<PassengerDetailsRQ.SpecialReqDetails.SpecialServiceRQ.SpecialServiceInfo.Service>();
                    }
                    return this.service;
                }
                
                public void setService(List<PassengerDetailsRQ.SpecialReqDetails.SpecialServiceRQ.SpecialServiceInfo.Service> service){
                    this.service = service;
                }

                /**
                 * <p>
                 * Java class for anonymous complex type.
                 *
                 * <p>
                 * The following schema fragment specifies the expected content
                 * contained within this class.
                 *
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="PersonName" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="GivenName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                   &lt;element name="Surname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                 &lt;/sequence>
                 *                 &lt;attribute name="DateOfBirth" type="{http://webservices.sabre.com/sabreXML/2011/10}date" />
                 *                 &lt;attribute name="Gender">
                 *                   &lt;simpleType>
                 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                       &lt;enumeration value="F"/>
                 *                       &lt;enumeration value="M"/>
                 *                       &lt;enumeration value="FI"/>
                 *                       &lt;enumeration value="MI"/>
                 *                     &lt;/restriction>
                 *                   &lt;/simpleType>
                 *                 &lt;/attribute>
                 *                 &lt;attribute name="NameNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="RedressNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="VendorPrefs" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="Airline">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;attribute name="Hosted" type="{http://www.w3.org/2001/XMLSchema}boolean" />
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
                 *       &lt;attribute name="SegmentNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="SSR_Code" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 *
                 *
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "personName",
                    "redressNumber",
                    "vendorPrefs"
                })
                public static class SecureFlight {

                    @XmlElement(name = "PersonName")
                    protected PassengerDetailsRQ.SpecialReqDetails.SpecialServiceRQ.SpecialServiceInfo.SecureFlight.PersonName personName;
                    @XmlElement(name = "RedressNumber")
                    protected String redressNumber;
                    @XmlElement(name = "VendorPrefs")
                    protected PassengerDetailsRQ.SpecialReqDetails.SpecialServiceRQ.SpecialServiceInfo.SecureFlight.VendorPrefs vendorPrefs;
                    @XmlAttribute(name = "SegmentNumber")
                    protected String segmentNumber;
                    @XmlAttribute(name = "SSR_Code")
                    protected String ssrCode;

                    /**
                     * Gets the value of the personName property.
                     *
                     * @return possible object is
                     *     {@link PassengerDetailsRQ.SpecialReqDetails.SpecialServiceRQ.SpecialServiceInfo.SecureFlight.PersonName }
                     *
                     */
                    public PassengerDetailsRQ.SpecialReqDetails.SpecialServiceRQ.SpecialServiceInfo.SecureFlight.PersonName getPersonName() {
                        return personName;
                    }

                    /**
                     * Sets the value of the personName property.
                     *
                     * @param value allowed object is
                     *     {@link PassengerDetailsRQ.SpecialReqDetails.SpecialServiceRQ.SpecialServiceInfo.SecureFlight.PersonName }
                     *
                     */
                    public void setPersonName(PassengerDetailsRQ.SpecialReqDetails.SpecialServiceRQ.SpecialServiceInfo.SecureFlight.PersonName value) {
                        this.personName = value;
                    }

                    /**
                     * Gets the value of the redressNumber property.
                     *
                     * @return possible object is {@link String }
                     *
                     */
                    public String getRedressNumber() {
                        return redressNumber;
                    }

                    /**
                     * Sets the value of the redressNumber property.
                     *
                     * @param value allowed object is {@link String }
                     *
                     */
                    public void setRedressNumber(String value) {
                        this.redressNumber = value;
                    }

                    /**
                     * Gets the value of the vendorPrefs property.
                     *
                     * @return possible object is
                     *     {@link PassengerDetailsRQ.SpecialReqDetails.SpecialServiceRQ.SpecialServiceInfo.SecureFlight.VendorPrefs }
                     *
                     */
                    public PassengerDetailsRQ.SpecialReqDetails.SpecialServiceRQ.SpecialServiceInfo.SecureFlight.VendorPrefs getVendorPrefs() {
                        return vendorPrefs;
                    }

                    /**
                     * Sets the value of the vendorPrefs property.
                     *
                     * @param value allowed object is
                     *     {@link PassengerDetailsRQ.SpecialReqDetails.SpecialServiceRQ.SpecialServiceInfo.SecureFlight.VendorPrefs }
                     *
                     */
                    public void setVendorPrefs(PassengerDetailsRQ.SpecialReqDetails.SpecialServiceRQ.SpecialServiceInfo.SecureFlight.VendorPrefs value) {
                        this.vendorPrefs = value;
                    }

                    /**
                     * Gets the value of the segmentNumber property.
                     *
                     * @return possible object is {@link String }
                     *
                     */
                    public String getSegmentNumber() {
                        return segmentNumber;
                    }

                    /**
                     * Sets the value of the segmentNumber property.
                     *
                     * @param value allowed object is {@link String }
                     *
                     */
                    public void setSegmentNumber(String value) {
                        this.segmentNumber = value;
                    }

                    /**
                     * Gets the value of the ssrCode property.
                     *
                     * @return possible object is {@link String }
                     *
                     */
                    public String getSSRCode() {
                        return ssrCode;
                    }

                    /**
                     * Sets the value of the ssrCode property.
                     *
                     * @param value allowed object is {@link String }
                     *
                     */
                    public void setSSRCode(String value) {
                        this.ssrCode = value;
                    }

                    /**
                     * <p>
                     * Java class for anonymous complex type.
                     *
                     * <p>
                     * The following schema fragment specifies the expected
                     * content contained within this class.
                     *
                     * <pre>
                     * &lt;complexType>
                     *   &lt;complexContent>
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *       &lt;sequence>
                     *         &lt;element name="GivenName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *         &lt;element name="Surname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *       &lt;/sequence>
                     *       &lt;attribute name="DateOfBirth" type="{http://webservices.sabre.com/sabreXML/2011/10}date" />
                     *       &lt;attribute name="Gender">
                     *         &lt;simpleType>
                     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *             &lt;enumeration value="F"/>
                     *             &lt;enumeration value="M"/>
                     *             &lt;enumeration value="FI"/>
                     *             &lt;enumeration value="MI"/>
                     *           &lt;/restriction>
                     *         &lt;/simpleType>
                     *       &lt;/attribute>
                     *       &lt;attribute name="NameNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     *
                     *
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "givenName",
                        "surname"
                    })
                    public static class PersonName {

                        @XmlElement(name = "GivenName")
                        protected String givenName;
                        @XmlElement(name = "Surname")
                        protected String surname;
                        @XmlAttribute(name = "DateOfBirth")
                        protected String dateOfBirth;
                        @XmlAttribute(name = "Gender")
                        protected String gender;
                        @XmlAttribute(name = "NameNumber")
                        protected String nameNumber;

                        /**
                         * Gets the value of the givenName property.
                         *
                         * @return possible object is {@link String }
                         *
                         */
                        public String getGivenName() {
                            return givenName;
                        }

                        /**
                         * Sets the value of the givenName property.
                         *
                         * @param value allowed object is {@link String }
                         *
                         */
                        public void setGivenName(String value) {
                            this.givenName = value;
                        }

                        /**
                         * Gets the value of the surname property.
                         *
                         * @return possible object is {@link String }
                         *
                         */
                        public String getSurname() {
                            return surname;
                        }

                        /**
                         * Sets the value of the surname property.
                         *
                         * @param value allowed object is {@link String }
                         *
                         */
                        public void setSurname(String value) {
                            this.surname = value;
                        }

                        /**
                         * Gets the value of the dateOfBirth property.
                         *
                         * @return possible object is {@link String }
                         *
                         */
                        public String getDateOfBirth() {
                            return dateOfBirth;
                        }

                        /**
                         * Sets the value of the dateOfBirth property.
                         *
                         * @param value allowed object is {@link String }
                         *
                         */
                        public void setDateOfBirth(String value) {
                            this.dateOfBirth = value;
                        }

                        /**
                         * Gets the value of the gender property.
                         *
                         * @return possible object is {@link String }
                         *
                         */
                        public String getGender() {
                            return gender;
                        }

                        /**
                         * Sets the value of the gender property.
                         *
                         * @param value allowed object is {@link String }
                         *
                         */
                        public void setGender(String value) {
                            this.gender = value;
                        }

                        /**
                         * Gets the value of the nameNumber property.
                         *
                         * @return possible object is {@link String }
                         *
                         */
                        public String getNameNumber() {
                            return nameNumber;
                        }

                        /**
                         * Sets the value of the nameNumber property.
                         *
                         * @param value allowed object is {@link String }
                         *
                         */
                        public void setNameNumber(String value) {
                            this.nameNumber = value;
                        }

                    }

                    /**
                     * <p>
                     * Java class for anonymous complex type.
                     *
                     * <p>
                     * The following schema fragment specifies the expected
                     * content contained within this class.
                     *
                     * <pre>
                     * &lt;complexType>
                     *   &lt;complexContent>
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *       &lt;sequence>
                     *         &lt;element name="Airline">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;attribute name="Hosted" type="{http://www.w3.org/2001/XMLSchema}boolean" />
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
                        "airline"
                    })
                    public static class VendorPrefs {

                        @XmlElement(name = "Airline", required = true)
                        protected PassengerDetailsRQ.SpecialReqDetails.SpecialServiceRQ.SpecialServiceInfo.SecureFlight.VendorPrefs.Airline airline;

                        /**
                         * Gets the value of the airline property.
                         *
                         * @return possible object is
                         *     {@link PassengerDetailsRQ.SpecialReqDetails.SpecialServiceRQ.SpecialServiceInfo.SecureFlight.VendorPrefs.Airline }
                         *
                         */
                        public PassengerDetailsRQ.SpecialReqDetails.SpecialServiceRQ.SpecialServiceInfo.SecureFlight.VendorPrefs.Airline getAirline() {
                            return airline;
                        }

                        /**
                         * Sets the value of the airline property.
                         *
                         * @param value allowed object is
                         *     {@link PassengerDetailsRQ.SpecialReqDetails.SpecialServiceRQ.SpecialServiceInfo.SecureFlight.VendorPrefs.Airline }
                         *
                         */
                        public void setAirline(PassengerDetailsRQ.SpecialReqDetails.SpecialServiceRQ.SpecialServiceInfo.SecureFlight.VendorPrefs.Airline value) {
                            this.airline = value;
                        }

                        /**
                         * <p>
                         * Java class for anonymous complex type.
                         *
                         * <p>
                         * The following schema fragment specifies the expected
                         * content contained within this class.
                         *
                         * <pre>
                         * &lt;complexType>
                         *   &lt;complexContent>
                         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *       &lt;attribute name="Hosted" type="{http://www.w3.org/2001/XMLSchema}boolean" />
                         *     &lt;/restriction>
                         *   &lt;/complexContent>
                         * &lt;/complexType>
                         * </pre>
                         *
                         *
                         */
                        @XmlAccessorType(XmlAccessType.FIELD)
                        @XmlType(name = "")
                        public static class Airline {

                            @XmlAttribute(name = "Hosted")
                            protected Boolean hosted;

                            /**
                             * Gets the value of the hosted property.
                             *
                             * @return possible object is {@link Boolean }
                             *
                             */
                            public Boolean isHosted() {
                                return hosted;
                            }

                            /**
                             * Sets the value of the hosted property.
                             *
                             * @param value allowed object is {@link Boolean }
                             *
                             */
                            public void setHosted(Boolean value) {
                                this.hosted = value;
                            }

                        }

                    }

                }

                /**
                 * <p>
                 * Java class for anonymous complex type.
                 *
                 * <p>
                 * The following schema fragment specifies the expected content
                 * contained within this class.
                 *
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="PersonName" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;attribute name="NameNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="VendorPrefs" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="Airline">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                           &lt;attribute name="Hosted" type="{http://www.w3.org/2001/XMLSchema}boolean" />
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
                 *       &lt;attribute name="SegmentNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="SSR_Code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 *
                 *
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "personName",
                    "text",
                    "vendorPrefs"
                })
                public static class Service {

                    @XmlElement(name = "PersonName")
                    protected PassengerDetailsRQ.SpecialReqDetails.SpecialServiceRQ.SpecialServiceInfo.Service.PersonName personName;
                    @XmlElement(name = "Text")
                    protected String text;
                    @XmlElement(name = "VendorPrefs")
                    protected PassengerDetailsRQ.SpecialReqDetails.SpecialServiceRQ.SpecialServiceInfo.Service.VendorPrefs vendorPrefs;
                    @XmlAttribute(name = "SegmentNumber")
                    protected String segmentNumber;
                    @XmlAttribute(name = "SSR_Code", required = true)
                    protected String ssrCode;

                    /**
                     * Gets the value of the personName property.
                     *
                     * @return possible object is
                     *     {@link PassengerDetailsRQ.SpecialReqDetails.SpecialServiceRQ.SpecialServiceInfo.Service.PersonName }
                     *
                     */
                    public PassengerDetailsRQ.SpecialReqDetails.SpecialServiceRQ.SpecialServiceInfo.Service.PersonName getPersonName() {
                        return personName;
                    }

                    /**
                     * Sets the value of the personName property.
                     *
                     * @param value allowed object is
                     *     {@link PassengerDetailsRQ.SpecialReqDetails.SpecialServiceRQ.SpecialServiceInfo.Service.PersonName }
                     *
                     */
                    public void setPersonName(PassengerDetailsRQ.SpecialReqDetails.SpecialServiceRQ.SpecialServiceInfo.Service.PersonName value) {
                        this.personName = value;
                    }

                    /**
                     * Gets the value of the text property.
                     *
                     * @return possible object is {@link String }
                     *
                     */
                    public String getText() {
                        return text;
                    }

                    /**
                     * Sets the value of the text property.
                     *
                     * @param value allowed object is {@link String }
                     *
                     */
                    public void setText(String value) {
                        this.text = value;
                    }

                    /**
                     * Gets the value of the vendorPrefs property.
                     *
                     * @return possible object is
                     *     {@link PassengerDetailsRQ.SpecialReqDetails.SpecialServiceRQ.SpecialServiceInfo.Service.VendorPrefs }
                     *
                     */
                    public PassengerDetailsRQ.SpecialReqDetails.SpecialServiceRQ.SpecialServiceInfo.Service.VendorPrefs getVendorPrefs() {
                        return vendorPrefs;
                    }

                    /**
                     * Sets the value of the vendorPrefs property.
                     *
                     * @param value allowed object is
                     *     {@link PassengerDetailsRQ.SpecialReqDetails.SpecialServiceRQ.SpecialServiceInfo.Service.VendorPrefs }
                     *
                     */
                    public void setVendorPrefs(PassengerDetailsRQ.SpecialReqDetails.SpecialServiceRQ.SpecialServiceInfo.Service.VendorPrefs value) {
                        this.vendorPrefs = value;
                    }

                    /**
                     * Gets the value of the segmentNumber property.
                     *
                     * @return possible object is {@link String }
                     *
                     */
                    public String getSegmentNumber() {
                        return segmentNumber;
                    }

                    /**
                     * Sets the value of the segmentNumber property.
                     *
                     * @param value allowed object is {@link String }
                     *
                     */
                    public void setSegmentNumber(String value) {
                        this.segmentNumber = value;
                    }

                    /**
                     * Gets the value of the ssrCode property.
                     *
                     * @return possible object is {@link String }
                     *
                     */
                    public String getSSRCode() {
                        return ssrCode;
                    }

                    /**
                     * Sets the value of the ssrCode property.
                     *
                     * @param value allowed object is {@link String }
                     *
                     */
                    public void setSSRCode(String value) {
                        this.ssrCode = value;
                    }

                    /**
                     * <p>
                     * Java class for anonymous complex type.
                     *
                     * <p>
                     * The following schema fragment specifies the expected
                     * content contained within this class.
                     *
                     * <pre>
                     * &lt;complexType>
                     *   &lt;complexContent>
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *       &lt;attribute name="NameNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
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

                        @XmlAttribute(name = "NameNumber")
                        protected String nameNumber;

                        /**
                         * Gets the value of the nameNumber property.
                         *
                         * @return possible object is {@link String }
                         *
                         */
                        public String getNameNumber() {
                            return nameNumber;
                        }

                        /**
                         * Sets the value of the nameNumber property.
                         *
                         * @param value allowed object is {@link String }
                         *
                         */
                        public void setNameNumber(String value) {
                            this.nameNumber = value;
                        }

                    }

                    /**
                     * <p>
                     * Java class for anonymous complex type.
                     *
                     * <p>
                     * The following schema fragment specifies the expected
                     * content contained within this class.
                     *
                     * <pre>
                     * &lt;complexType>
                     *   &lt;complexContent>
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *       &lt;sequence>
                     *         &lt;element name="Airline">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *                 &lt;attribute name="Hosted" type="{http://www.w3.org/2001/XMLSchema}boolean" />
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
                        "airline"
                    })
                    public static class VendorPrefs {

                        @XmlElement(name = "Airline", required = true)
                        protected PassengerDetailsRQ.SpecialReqDetails.SpecialServiceRQ.SpecialServiceInfo.Service.VendorPrefs.Airline airline;

                        /**
                         * Gets the value of the airline property.
                         *
                         * @return possible object is
                         *     {@link PassengerDetailsRQ.SpecialReqDetails.SpecialServiceRQ.SpecialServiceInfo.Service.VendorPrefs.Airline }
                         *
                         */
                        public PassengerDetailsRQ.SpecialReqDetails.SpecialServiceRQ.SpecialServiceInfo.Service.VendorPrefs.Airline getAirline() {
                            return airline;
                        }

                        /**
                         * Sets the value of the airline property.
                         *
                         * @param value allowed object is
                         *     {@link PassengerDetailsRQ.SpecialReqDetails.SpecialServiceRQ.SpecialServiceInfo.Service.VendorPrefs.Airline }
                         *
                         */
                        public void setAirline(PassengerDetailsRQ.SpecialReqDetails.SpecialServiceRQ.SpecialServiceInfo.Service.VendorPrefs.Airline value) {
                            this.airline = value;
                        }

                        /**
                         * <p>
                         * Java class for anonymous complex type.
                         *
                         * <p>
                         * The following schema fragment specifies the expected
                         * content contained within this class.
                         *
                         * <pre>
                         * &lt;complexType>
                         *   &lt;complexContent>
                         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *       &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
                         *       &lt;attribute name="Hosted" type="{http://www.w3.org/2001/XMLSchema}boolean" />
                         *     &lt;/restriction>
                         *   &lt;/complexContent>
                         * &lt;/complexType>
                         * </pre>
                         *
                         *
                         */
                        @XmlAccessorType(XmlAccessType.FIELD)
                        @XmlType(name = "")
                        public static class Airline {

                            @XmlAttribute(name = "Code")
                            protected String code;
                            @XmlAttribute(name = "Hosted")
                            protected Boolean hosted;

                            /**
                             * Gets the value of the code property.
                             *
                             * @return possible object is {@link String }
                             *
                             */
                            public String getCode() {
                                return code;
                            }

                            /**
                             * Sets the value of the code property.
                             *
                             * @param value allowed object is {@link String }
                             *
                             */
                            public void setCode(String value) {
                                this.code = value;
                            }

                            /**
                             * Gets the value of the hosted property.
                             *
                             * @return possible object is {@link Boolean }
                             *
                             */
                            public Boolean isHosted() {
                                return hosted;
                            }

                            /**
                             * Sets the value of the hosted property.
                             *
                             * @param value allowed object is {@link Boolean }
                             *
                             */
                            public void setHosted(Boolean value) {
                                this.hosted = value;
                            }

                        }

                    }

                }

            }

        }

    }

    /**
     * <p>
     * Java class for anonymous complex type.
     *
     * <p>
     * The following schema fragment specifies the expected content contained
     * within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="AgencyInfo" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Address" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="AddressLine" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="CityName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="CountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="PostalCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="StateCountyProv" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="StateCode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="StreetNmbr" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="VendorPrefs" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="Airline">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;attribute name="Hosted" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Ticketing" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="PseudoCityCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="QueueNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="ShortText" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="TicketTimeLimit" type="{http://webservices.sabre.com/sabreXML/2011/10}dateTime" />
     *                           &lt;attribute name="TicketType" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="CustomerInfo" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ContactNumbers" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="ContactNumber" maxOccurs="unbounded">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="InsertAfter" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *                                     &lt;attribute name="LocationCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="NameNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="Phone" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="PhoneUseType" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Corporate" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="CustLoyalty" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="MembershipID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="NameNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="ProgramID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="SegmentNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="TravelingCarrierCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="CustomerIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Email" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="Address" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="NameNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="ShortText" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="Type">
     *                             &lt;simpleType>
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                 &lt;enumeration value="BC"/>
     *                                 &lt;enumeration value="CC"/>
     *                                 &lt;enumeration value="FR"/>
     *                                 &lt;enumeration value="TO"/>
     *                               &lt;/restriction>
     *                             &lt;/simpleType>
     *                           &lt;/attribute>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="PersonName" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="GivenName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="GroupInfo" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="VendorPrefs" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="Airline">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                       &lt;/restriction>
     *                                                     &lt;/complexContent>
     *                                                   &lt;/complexType>
     *                                                 &lt;/element>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                     &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="NumSeatsRemaining" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="Surname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                           &lt;attribute name="Infant" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                           &lt;attribute name="NameNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="NameReference" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="PassengerType" type="{http://www.w3.org/2001/XMLSchema}string" />
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
     *       &lt;attribute name="HaltOnError" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "agencyInfo",
        "customerInfo"
    })
    public static class TravelItineraryAddInfoRQ {

        @XmlElement(name = "AgencyInfo")
        protected PassengerDetailsRQ.TravelItineraryAddInfoRQ.AgencyInfo agencyInfo;
        @XmlElement(name = "CustomerInfo")
        protected PassengerDetailsRQ.TravelItineraryAddInfoRQ.CustomerInfo customerInfo;
        @XmlAttribute(name = "HaltOnError")
        protected Boolean haltOnError;

        /**
         * Gets the value of the agencyInfo property.
         *
         * @return possible object is
         *     {@link PassengerDetailsRQ.TravelItineraryAddInfoRQ.AgencyInfo }
         *
         */
        public PassengerDetailsRQ.TravelItineraryAddInfoRQ.AgencyInfo getAgencyInfo() {
            return agencyInfo;
        }

        /**
         * Sets the value of the agencyInfo property.
         *
         * @param value allowed object is
         *     {@link PassengerDetailsRQ.TravelItineraryAddInfoRQ.AgencyInfo }
         *
         */
        public void setAgencyInfo(PassengerDetailsRQ.TravelItineraryAddInfoRQ.AgencyInfo value) {
            this.agencyInfo = value;
        }

        /**
         * Gets the value of the customerInfo property.
         *
         * @return possible object is
         *     {@link PassengerDetailsRQ.TravelItineraryAddInfoRQ.CustomerInfo }
         *
         */
        public PassengerDetailsRQ.TravelItineraryAddInfoRQ.CustomerInfo getCustomerInfo() {
            return customerInfo;
        }

        /**
         * Sets the value of the customerInfo property.
         *
         * @param value allowed object is
         *     {@link PassengerDetailsRQ.TravelItineraryAddInfoRQ.CustomerInfo }
         *
         */
        public void setCustomerInfo(PassengerDetailsRQ.TravelItineraryAddInfoRQ.CustomerInfo value) {
            this.customerInfo = value;
        }

        /**
         * Gets the value of the haltOnError property.
         *
         * @return possible object is {@link Boolean }
         *
         */
        public Boolean isHaltOnError() {
            return haltOnError;
        }

        /**
         * Sets the value of the haltOnError property.
         *
         * @param value allowed object is {@link Boolean }
         *
         */
        public void setHaltOnError(Boolean value) {
            this.haltOnError = value;
        }

        /**
         * <p>
         * Java class for anonymous complex type.
         *
         * <p>
         * The following schema fragment specifies the expected content
         * contained within this class.
         *
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="Address" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="AddressLine" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="CityName" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="CountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="PostalCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="StateCountyProv" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attribute name="StateCode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="StreetNmbr" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="VendorPrefs" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="Airline">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;attribute name="Hosted" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Ticketing" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="PseudoCityCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="QueueNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="ShortText" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="TicketTimeLimit" type="{http://webservices.sabre.com/sabreXML/2011/10}dateTime" />
         *                 &lt;attribute name="TicketType" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
            "address",
            "ticketing"
        })
        public static class AgencyInfo {

            @XmlElement(name = "Address")
            protected PassengerDetailsRQ.TravelItineraryAddInfoRQ.AgencyInfo.Address address;
            @XmlElement(name = "Ticketing")
            protected PassengerDetailsRQ.TravelItineraryAddInfoRQ.AgencyInfo.Ticketing ticketing;

            /**
             * Gets the value of the address property.
             *
             * @return possible object is
             *     {@link PassengerDetailsRQ.TravelItineraryAddInfoRQ.AgencyInfo.Address }
             *
             */
            public PassengerDetailsRQ.TravelItineraryAddInfoRQ.AgencyInfo.Address getAddress() {
                return address;
            }

            /**
             * Sets the value of the address property.
             *
             * @param value allowed object is
             *     {@link PassengerDetailsRQ.TravelItineraryAddInfoRQ.AgencyInfo.Address }
             *
             */
            public void setAddress(PassengerDetailsRQ.TravelItineraryAddInfoRQ.AgencyInfo.Address value) {
                this.address = value;
            }

            /**
             * Gets the value of the ticketing property.
             *
             * @return possible object is
             *     {@link PassengerDetailsRQ.TravelItineraryAddInfoRQ.AgencyInfo.Ticketing }
             *
             */
            public PassengerDetailsRQ.TravelItineraryAddInfoRQ.AgencyInfo.Ticketing getTicketing() {
                return ticketing;
            }

            /**
             * Sets the value of the ticketing property.
             *
             * @param value allowed object is
             *     {@link PassengerDetailsRQ.TravelItineraryAddInfoRQ.AgencyInfo.Ticketing }
             *
             */
            public void setTicketing(PassengerDetailsRQ.TravelItineraryAddInfoRQ.AgencyInfo.Ticketing value) {
                this.ticketing = value;
            }

            /**
             * <p>
             * Java class for anonymous complex type.
             *
             * <p>
             * The following schema fragment specifies the expected content
             * contained within this class.
             *
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="AddressLine" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="CityName" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="CountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="PostalCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="StateCountyProv" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="StateCode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="StreetNmbr" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="VendorPrefs" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="Airline">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;attribute name="Hosted" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
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
                "addressLine",
                "cityName",
                "countryCode",
                "postalCode",
                "stateCountyProv",
                "streetNmbr",
                "vendorPrefs"
            })
            public static class Address {

                @XmlElement(name = "AddressLine")
                protected String addressLine;
                @XmlElement(name = "CityName", required = true)
                protected String cityName;
                @XmlElement(name = "CountryCode")
                protected String countryCode;
                @XmlElement(name = "PostalCode", required = true)
                protected String postalCode;
                @XmlElement(name = "StateCountyProv")
                protected PassengerDetailsRQ.TravelItineraryAddInfoRQ.AgencyInfo.Address.StateCountyProv stateCountyProv;
                @XmlElement(name = "StreetNmbr", required = true)
                protected String streetNmbr;
                @XmlElement(name = "VendorPrefs")
                protected PassengerDetailsRQ.TravelItineraryAddInfoRQ.AgencyInfo.Address.VendorPrefs vendorPrefs;

                /**
                 * Gets the value of the addressLine property.
                 *
                 * @return possible object is {@link String }
                 *
                 */
                public String getAddressLine() {
                    return addressLine;
                }

                /**
                 * Sets the value of the addressLine property.
                 *
                 * @param value allowed object is {@link String }
                 *
                 */
                public void setAddressLine(String value) {
                    this.addressLine = value;
                }

                /**
                 * Gets the value of the cityName property.
                 *
                 * @return possible object is {@link String }
                 *
                 */
                public String getCityName() {
                    return cityName;
                }

                /**
                 * Sets the value of the cityName property.
                 *
                 * @param value allowed object is {@link String }
                 *
                 */
                public void setCityName(String value) {
                    this.cityName = value;
                }

                /**
                 * Gets the value of the countryCode property.
                 *
                 * @return possible object is {@link String }
                 *
                 */
                public String getCountryCode() {
                    return countryCode;
                }

                /**
                 * Sets the value of the countryCode property.
                 *
                 * @param value allowed object is {@link String }
                 *
                 */
                public void setCountryCode(String value) {
                    this.countryCode = value;
                }

                /**
                 * Gets the value of the postalCode property.
                 *
                 * @return possible object is {@link String }
                 *
                 */
                public String getPostalCode() {
                    return postalCode;
                }

                /**
                 * Sets the value of the postalCode property.
                 *
                 * @param value allowed object is {@link String }
                 *
                 */
                public void setPostalCode(String value) {
                    this.postalCode = value;
                }

                /**
                 * Gets the value of the stateCountyProv property.
                 *
                 * @return possible object is
                 *     {@link PassengerDetailsRQ.TravelItineraryAddInfoRQ.AgencyInfo.Address.StateCountyProv }
                 *
                 */
                public PassengerDetailsRQ.TravelItineraryAddInfoRQ.AgencyInfo.Address.StateCountyProv getStateCountyProv() {
                    return stateCountyProv;
                }

                /**
                 * Sets the value of the stateCountyProv property.
                 *
                 * @param value allowed object is
                 *     {@link PassengerDetailsRQ.TravelItineraryAddInfoRQ.AgencyInfo.Address.StateCountyProv }
                 *
                 */
                public void setStateCountyProv(PassengerDetailsRQ.TravelItineraryAddInfoRQ.AgencyInfo.Address.StateCountyProv value) {
                    this.stateCountyProv = value;
                }

                /**
                 * Gets the value of the streetNmbr property.
                 *
                 * @return possible object is {@link String }
                 *
                 */
                public String getStreetNmbr() {
                    return streetNmbr;
                }

                /**
                 * Sets the value of the streetNmbr property.
                 *
                 * @param value allowed object is {@link String }
                 *
                 */
                public void setStreetNmbr(String value) {
                    this.streetNmbr = value;
                }

                /**
                 * Gets the value of the vendorPrefs property.
                 *
                 * @return possible object is
                 *     {@link PassengerDetailsRQ.TravelItineraryAddInfoRQ.AgencyInfo.Address.VendorPrefs }
                 *
                 */
                public PassengerDetailsRQ.TravelItineraryAddInfoRQ.AgencyInfo.Address.VendorPrefs getVendorPrefs() {
                    return vendorPrefs;
                }

                /**
                 * Sets the value of the vendorPrefs property.
                 *
                 * @param value allowed object is
                 *     {@link PassengerDetailsRQ.TravelItineraryAddInfoRQ.AgencyInfo.Address.VendorPrefs }
                 *
                 */
                public void setVendorPrefs(PassengerDetailsRQ.TravelItineraryAddInfoRQ.AgencyInfo.Address.VendorPrefs value) {
                    this.vendorPrefs = value;
                }

                /**
                 * <p>
                 * Java class for anonymous complex type.
                 *
                 * <p>
                 * The following schema fragment specifies the expected content
                 * contained within this class.
                 *
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;attribute name="StateCode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 *
                 *
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class StateCountyProv {

                    @XmlAttribute(name = "StateCode", required = true)
                    protected String stateCode;

                    /**
                     * Gets the value of the stateCode property.
                     *
                     * @return possible object is {@link String }
                     *
                     */
                    public String getStateCode() {
                        return stateCode;
                    }

                    /**
                     * Sets the value of the stateCode property.
                     *
                     * @param value allowed object is {@link String }
                     *
                     */
                    public void setStateCode(String value) {
                        this.stateCode = value;
                    }

                }

                /**
                 * <p>
                 * Java class for anonymous complex type.
                 *
                 * <p>
                 * The following schema fragment specifies the expected content
                 * contained within this class.
                 *
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="Airline">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;attribute name="Hosted" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
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
                    "airline"
                })
                public static class VendorPrefs {

                    @XmlElement(name = "Airline", required = true)
                    protected PassengerDetailsRQ.TravelItineraryAddInfoRQ.AgencyInfo.Address.VendorPrefs.Airline airline;

                    /**
                     * Gets the value of the airline property.
                     *
                     * @return possible object is
                     *     {@link PassengerDetailsRQ.TravelItineraryAddInfoRQ.AgencyInfo.Address.VendorPrefs.Airline }
                     *
                     */
                    public PassengerDetailsRQ.TravelItineraryAddInfoRQ.AgencyInfo.Address.VendorPrefs.Airline getAirline() {
                        return airline;
                    }

                    /**
                     * Sets the value of the airline property.
                     *
                     * @param value allowed object is
                     *     {@link PassengerDetailsRQ.TravelItineraryAddInfoRQ.AgencyInfo.Address.VendorPrefs.Airline }
                     *
                     */
                    public void setAirline(PassengerDetailsRQ.TravelItineraryAddInfoRQ.AgencyInfo.Address.VendorPrefs.Airline value) {
                        this.airline = value;
                    }

                    /**
                     * <p>
                     * Java class for anonymous complex type.
                     *
                     * <p>
                     * The following schema fragment specifies the expected
                     * content contained within this class.
                     *
                     * <pre>
                     * &lt;complexType>
                     *   &lt;complexContent>
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *       &lt;attribute name="Hosted" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     *
                     *
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class Airline {

                        @XmlAttribute(name = "Hosted", required = true)
                        protected boolean hosted;

                        /**
                         * Gets the value of the hosted property.
                         *
                         */
                        public boolean isHosted() {
                            return hosted;
                        }

                        /**
                         * Sets the value of the hosted property.
                         *
                         */
                        public void setHosted(boolean value) {
                            this.hosted = value;
                        }

                    }

                }

            }

            /**
             * <p>
             * Java class for anonymous complex type.
             *
             * <p>
             * The following schema fragment specifies the expected content
             * contained within this class.
             *
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;attribute name="PseudoCityCode" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="QueueNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="ShortText" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="TicketTimeLimit" type="{http://webservices.sabre.com/sabreXML/2011/10}dateTime" />
             *       &lt;attribute name="TicketType" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Ticketing {

                @XmlAttribute(name = "PseudoCityCode")
                protected String pseudoCityCode;
                @XmlAttribute(name = "QueueNumber")
                protected String queueNumber;
                @XmlAttribute(name = "ShortText")
                protected String shortText;
                @XmlAttribute(name = "TicketTimeLimit")
                protected String ticketTimeLimit;
                @XmlAttribute(name = "TicketType", required = true)
                protected String ticketType;

                /**
                 * Gets the value of the pseudoCityCode property.
                 *
                 * @return possible object is {@link String }
                 *
                 */
                public String getPseudoCityCode() {
                    return pseudoCityCode;
                }

                /**
                 * Sets the value of the pseudoCityCode property.
                 *
                 * @param value allowed object is {@link String }
                 *
                 */
                public void setPseudoCityCode(String value) {
                    this.pseudoCityCode = value;
                }

                /**
                 * Gets the value of the queueNumber property.
                 *
                 * @return possible object is {@link String }
                 *
                 */
                public String getQueueNumber() {
                    return queueNumber;
                }

                /**
                 * Sets the value of the queueNumber property.
                 *
                 * @param value allowed object is {@link String }
                 *
                 */
                public void setQueueNumber(String value) {
                    this.queueNumber = value;
                }

                /**
                 * Gets the value of the shortText property.
                 *
                 * @return possible object is {@link String }
                 *
                 */
                public String getShortText() {
                    return shortText;
                }

                /**
                 * Sets the value of the shortText property.
                 *
                 * @param value allowed object is {@link String }
                 *
                 */
                public void setShortText(String value) {
                    this.shortText = value;
                }

                /**
                 * Gets the value of the ticketTimeLimit property.
                 *
                 * @return possible object is {@link String }
                 *
                 */
                public String getTicketTimeLimit() {
                    return ticketTimeLimit;
                }

                /**
                 * Sets the value of the ticketTimeLimit property.
                 *
                 * @param value allowed object is {@link String }
                 *
                 */
                public void setTicketTimeLimit(String value) {
                    this.ticketTimeLimit = value;
                }

                /**
                 * Gets the value of the ticketType property.
                 *
                 * @return possible object is {@link String }
                 *
                 */
                public String getTicketType() {
                    return ticketType;
                }

                /**
                 * Sets the value of the ticketType property.
                 *
                 * @param value allowed object is {@link String }
                 *
                 */
                public void setTicketType(String value) {
                    this.ticketType = value;
                }

            }

        }

        /**
         * <p>
         * Java class for anonymous complex type.
         *
         * <p>
         * The following schema fragment specifies the expected content
         * contained within this class.
         *
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="ContactNumbers" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="ContactNumber" maxOccurs="unbounded">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attribute name="InsertAfter" type="{http://www.w3.org/2001/XMLSchema}integer" />
         *                           &lt;attribute name="LocationCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="NameNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="Phone" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="PhoneUseType" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Corporate" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="CustLoyalty" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="MembershipID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="NameNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="ProgramID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="SegmentNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="TravelingCarrierCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="CustomerIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Email" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="Address" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="NameNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="ShortText" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="Type">
         *                   &lt;simpleType>
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                       &lt;enumeration value="BC"/>
         *                       &lt;enumeration value="CC"/>
         *                       &lt;enumeration value="FR"/>
         *                       &lt;enumeration value="TO"/>
         *                     &lt;/restriction>
         *                   &lt;/simpleType>
         *                 &lt;/attribute>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="PersonName" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="GivenName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="GroupInfo" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="VendorPrefs" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="Airline">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                             &lt;/restriction>
         *                                           &lt;/complexContent>
         *                                         &lt;/complexType>
         *                                       &lt;/element>
         *                                     &lt;/sequence>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                           &lt;/sequence>
         *                           &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="NumSeatsRemaining" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="Surname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *                 &lt;attribute name="Infant" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *                 &lt;attribute name="NameNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="NameReference" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="PassengerType" type="{http://www.w3.org/2001/XMLSchema}string" />
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
            "contactNumbers",
            "corporate",
            "custLoyalty",
            "customerIdentifier",
            "email",
            "personName"
        })
        public static class CustomerInfo {

            @XmlElement(name = "ContactNumbers")
            protected PassengerDetailsRQ.TravelItineraryAddInfoRQ.CustomerInfo.ContactNumbers contactNumbers;
            @XmlElement(name = "Corporate")
            protected PassengerDetailsRQ.TravelItineraryAddInfoRQ.CustomerInfo.Corporate corporate;
            @XmlElement(name = "CustLoyalty")
            protected List<PassengerDetailsRQ.TravelItineraryAddInfoRQ.CustomerInfo.CustLoyalty> custLoyalty;
            @XmlElement(name = "CustomerIdentifier")
            protected String customerIdentifier;
            @XmlElement(name = "Email")
            protected List<PassengerDetailsRQ.TravelItineraryAddInfoRQ.CustomerInfo.Email> email;
            @XmlElement(name = "PersonName")
            protected List<PassengerDetailsRQ.TravelItineraryAddInfoRQ.CustomerInfo.PersonName> personName;

            /**
             * Gets the value of the contactNumbers property.
             *
             * @return possible object is
             *     {@link PassengerDetailsRQ.TravelItineraryAddInfoRQ.CustomerInfo.ContactNumbers }
             *
             */
            public PassengerDetailsRQ.TravelItineraryAddInfoRQ.CustomerInfo.ContactNumbers getContactNumbers() {
                return contactNumbers;
            }

            /**
             * Sets the value of the contactNumbers property.
             *
             * @param value allowed object is
             *     {@link PassengerDetailsRQ.TravelItineraryAddInfoRQ.CustomerInfo.ContactNumbers }
             *
             */
            public void setContactNumbers(PassengerDetailsRQ.TravelItineraryAddInfoRQ.CustomerInfo.ContactNumbers value) {
                this.contactNumbers = value;
            }

            /**
             * Gets the value of the corporate property.
             *
             * @return possible object is
             *     {@link PassengerDetailsRQ.TravelItineraryAddInfoRQ.CustomerInfo.Corporate }
             *
             */
            public PassengerDetailsRQ.TravelItineraryAddInfoRQ.CustomerInfo.Corporate getCorporate() {
                return corporate;
            }

            /**
             * Sets the value of the corporate property.
             *
             * @param value allowed object is
             *     {@link PassengerDetailsRQ.TravelItineraryAddInfoRQ.CustomerInfo.Corporate }
             *
             */
            public void setCorporate(PassengerDetailsRQ.TravelItineraryAddInfoRQ.CustomerInfo.Corporate value) {
                this.corporate = value;
            }

            /**
             * Gets the value of the custLoyalty property.
             *
             * <p>
             * This accessor method returns a reference to the live list, not a
             * snapshot. Therefore any modification you make to the returned
             * list will be present inside the JAXB object. This is why there is
             * not a <CODE>set</CODE> method for the custLoyalty property.
             *
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getCustLoyalty().add(newItem);
             * </pre>
             *
             *
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link PassengerDetailsRQ.TravelItineraryAddInfoRQ.CustomerInfo.CustLoyalty }
             *
             *
             */
            public List<PassengerDetailsRQ.TravelItineraryAddInfoRQ.CustomerInfo.CustLoyalty> getCustLoyalty() {
                if (custLoyalty == null) {
                    custLoyalty = new ArrayList<PassengerDetailsRQ.TravelItineraryAddInfoRQ.CustomerInfo.CustLoyalty>();
                }
                return this.custLoyalty;
            }

            public void setCustLoyalty(List<PassengerDetailsRQ.TravelItineraryAddInfoRQ.CustomerInfo.CustLoyalty> custLoyalty) {
                this.custLoyalty = custLoyalty;
            }

            /**
             * Gets the value of the customerIdentifier property.
             *
             * @return possible object is {@link String }
             *
             */
            public String getCustomerIdentifier() {
                return customerIdentifier;
            }

            /**
             * Sets the value of the customerIdentifier property.
             *
             * @param value allowed object is {@link String }
             *
             */
            public void setCustomerIdentifier(String value) {
                this.customerIdentifier = value;
            }

            /**
             * Gets the value of the email property.
             *
             * <p>
             * This accessor method returns a reference to the live list, not a
             * snapshot. Therefore any modification you make to the returned
             * list will be present inside the JAXB object. This is why there is
             * not a <CODE>set</CODE> method for the email property.
             *
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getEmail().add(newItem);
             * </pre>
             *
             *
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link PassengerDetailsRQ.TravelItineraryAddInfoRQ.CustomerInfo.Email }
             *
             *
             */
            public List<PassengerDetailsRQ.TravelItineraryAddInfoRQ.CustomerInfo.Email> getEmail() {
                if (email == null) {
                    email = new ArrayList<PassengerDetailsRQ.TravelItineraryAddInfoRQ.CustomerInfo.Email>();
                }
                return this.email;
            }

            public void setEmail(List<PassengerDetailsRQ.TravelItineraryAddInfoRQ.CustomerInfo.Email> email) {
                this.email = email;
            }

            /**
             * Gets the value of the personName property.
             *
             * <p>
             * This accessor method returns a reference to the live list, not a
             * snapshot. Therefore any modification you make to the returned
             * list will be present inside the JAXB object. This is why there is
             * not a <CODE>set</CODE> method for the personName property.
             *
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getPersonName().add(newItem);
             * </pre>
             *
             *
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link PassengerDetailsRQ.TravelItineraryAddInfoRQ.CustomerInfo.PersonName }
             *
             *
             */
            public List<PassengerDetailsRQ.TravelItineraryAddInfoRQ.CustomerInfo.PersonName> getPersonName() {
                if (personName == null) {
                    personName = new ArrayList<PassengerDetailsRQ.TravelItineraryAddInfoRQ.CustomerInfo.PersonName>();
                }
                return this.personName;
            }

            public void setPersonName(List<PassengerDetailsRQ.TravelItineraryAddInfoRQ.CustomerInfo.PersonName> personName) {
                this.personName = personName;
            }

            /**
             * <p>
             * Java class for anonymous complex type.
             *
             * <p>
             * The following schema fragment specifies the expected content
             * contained within this class.
             *
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="ContactNumber" maxOccurs="unbounded">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="InsertAfter" type="{http://www.w3.org/2001/XMLSchema}integer" />
             *                 &lt;attribute name="LocationCode" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="NameNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="Phone" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="PhoneUseType" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
                "contactNumber"
            })
            public static class ContactNumbers {

                @XmlElement(name = "ContactNumber", required = true)
                protected List<PassengerDetailsRQ.TravelItineraryAddInfoRQ.CustomerInfo.ContactNumbers.ContactNumber> contactNumber;

                /**
                 * Gets the value of the contactNumber property.
                 *
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object. This is
                 * why there is not a <CODE>set</CODE> method for the
                 * contactNumber property.
                 *
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getContactNumber().add(newItem);
                 * </pre>
                 *
                 *
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link PassengerDetailsRQ.TravelItineraryAddInfoRQ.CustomerInfo.ContactNumbers.ContactNumber }
                 *
                 *
                 */
                public List<PassengerDetailsRQ.TravelItineraryAddInfoRQ.CustomerInfo.ContactNumbers.ContactNumber> getContactNumber() {
                    if (contactNumber == null) {
                        contactNumber = new ArrayList<PassengerDetailsRQ.TravelItineraryAddInfoRQ.CustomerInfo.ContactNumbers.ContactNumber>();
                    }
                    return this.contactNumber;
                }

                public void setContactNumber(List<PassengerDetailsRQ.TravelItineraryAddInfoRQ.CustomerInfo.ContactNumbers.ContactNumber> contactNumber) {
                    this.contactNumber = contactNumber;
                }

                /**
                 * <p>
                 * Java class for anonymous complex type.
                 *
                 * <p>
                 * The following schema fragment specifies the expected content
                 * contained within this class.
                 *
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;attribute name="InsertAfter" type="{http://www.w3.org/2001/XMLSchema}integer" />
                 *       &lt;attribute name="LocationCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="NameNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="Phone" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="PhoneUseType" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 *
                 *
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class ContactNumber {

                    @XmlAttribute(name = "InsertAfter")
                    protected BigInteger insertAfter;
                    @XmlAttribute(name = "LocationCode")
                    protected String locationCode;
                    @XmlAttribute(name = "NameNumber")
                    protected String nameNumber;
                    @XmlAttribute(name = "Phone", required = true)
                    protected String phone;
                    @XmlAttribute(name = "PhoneUseType", required = true)
                    protected String phoneUseType;

                    /**
                     * Gets the value of the insertAfter property.
                     *
                     * @return possible object is {@link BigInteger }
                     *
                     */
                    public BigInteger getInsertAfter() {
                        return insertAfter;
                    }

                    /**
                     * Sets the value of the insertAfter property.
                     *
                     * @param value allowed object is {@link BigInteger }
                     *
                     */
                    public void setInsertAfter(BigInteger value) {
                        this.insertAfter = value;
                    }

                    /**
                     * Gets the value of the locationCode property.
                     *
                     * @return possible object is {@link String }
                     *
                     */
                    public String getLocationCode() {
                        return locationCode;
                    }

                    /**
                     * Sets the value of the locationCode property.
                     *
                     * @param value allowed object is {@link String }
                     *
                     */
                    public void setLocationCode(String value) {
                        this.locationCode = value;
                    }

                    /**
                     * Gets the value of the nameNumber property.
                     *
                     * @return possible object is {@link String }
                     *
                     */
                    public String getNameNumber() {
                        return nameNumber;
                    }

                    /**
                     * Sets the value of the nameNumber property.
                     *
                     * @param value allowed object is {@link String }
                     *
                     */
                    public void setNameNumber(String value) {
                        this.nameNumber = value;
                    }

                    /**
                     * Gets the value of the phone property.
                     *
                     * @return possible object is {@link String }
                     *
                     */
                    public String getPhone() {
                        return phone;
                    }

                    /**
                     * Sets the value of the phone property.
                     *
                     * @param value allowed object is {@link String }
                     *
                     */
                    public void setPhone(String value) {
                        this.phone = value;
                    }

                    /**
                     * Gets the value of the phoneUseType property.
                     *
                     * @return possible object is {@link String }
                     *
                     */
                    public String getPhoneUseType() {
                        return phoneUseType;
                    }

                    /**
                     * Sets the value of the phoneUseType property.
                     *
                     * @param value allowed object is {@link String }
                     *
                     */
                    public void setPhoneUseType(String value) {
                        this.phoneUseType = value;
                    }

                }

            }

            /**
             * <p>
             * Java class for anonymous complex type.
             *
             * <p>
             * The following schema fragment specifies the expected content
             * contained within this class.
             *
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                "id"
            })
            public static class Corporate {

                @XmlElement(name = "ID", required = true)
                protected String id;

                /**
                 * Gets the value of the id property.
                 *
                 * @return possible object is {@link String }
                 *
                 */
                public String getID() {
                    return id;
                }

                /**
                 * Sets the value of the id property.
                 *
                 * @param value allowed object is {@link String }
                 *
                 */
                public void setID(String value) {
                    this.id = value;
                }

            }

            /**
             * <p>
             * Java class for anonymous complex type.
             *
             * <p>
             * The following schema fragment specifies the expected content
             * contained within this class.
             *
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;attribute name="MembershipID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="NameNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="ProgramID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="SegmentNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="TravelingCarrierCode" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class CustLoyalty {

                @XmlAttribute(name = "MembershipID", required = true)
                protected String membershipID;
                @XmlAttribute(name = "NameNumber")
                protected String nameNumber;
                @XmlAttribute(name = "ProgramID", required = true)
                protected String programID;
                @XmlAttribute(name = "SegmentNumber")
                protected String segmentNumber;
                @XmlAttribute(name = "TravelingCarrierCode")
                protected String travelingCarrierCode;

                /**
                 * Gets the value of the membershipID property.
                 *
                 * @return possible object is {@link String }
                 *
                 */
                public String getMembershipID() {
                    return membershipID;
                }

                /**
                 * Sets the value of the membershipID property.
                 *
                 * @param value allowed object is {@link String }
                 *
                 */
                public void setMembershipID(String value) {
                    this.membershipID = value;
                }

                /**
                 * Gets the value of the nameNumber property.
                 *
                 * @return possible object is {@link String }
                 *
                 */
                public String getNameNumber() {
                    return nameNumber;
                }

                /**
                 * Sets the value of the nameNumber property.
                 *
                 * @param value allowed object is {@link String }
                 *
                 */
                public void setNameNumber(String value) {
                    this.nameNumber = value;
                }

                /**
                 * Gets the value of the programID property.
                 *
                 * @return possible object is {@link String }
                 *
                 */
                public String getProgramID() {
                    return programID;
                }

                /**
                 * Sets the value of the programID property.
                 *
                 * @param value allowed object is {@link String }
                 *
                 */
                public void setProgramID(String value) {
                    this.programID = value;
                }

                /**
                 * Gets the value of the segmentNumber property.
                 *
                 * @return possible object is {@link String }
                 *
                 */
                public String getSegmentNumber() {
                    return segmentNumber;
                }

                /**
                 * Sets the value of the segmentNumber property.
                 *
                 * @param value allowed object is {@link String }
                 *
                 */
                public void setSegmentNumber(String value) {
                    this.segmentNumber = value;
                }

                /**
                 * Gets the value of the travelingCarrierCode property.
                 *
                 * @return possible object is {@link String }
                 *
                 */
                public String getTravelingCarrierCode() {
                    return travelingCarrierCode;
                }

                /**
                 * Sets the value of the travelingCarrierCode property.
                 *
                 * @param value allowed object is {@link String }
                 *
                 */
                public void setTravelingCarrierCode(String value) {
                    this.travelingCarrierCode = value;
                }

            }

            /**
             * <p>
             * Java class for anonymous complex type.
             *
             * <p>
             * The following schema fragment specifies the expected content
             * contained within this class.
             *
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;attribute name="Address" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="NameNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="ShortText" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="Type">
             *         &lt;simpleType>
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *             &lt;enumeration value="BC"/>
             *             &lt;enumeration value="CC"/>
             *             &lt;enumeration value="FR"/>
             *             &lt;enumeration value="TO"/>
             *           &lt;/restriction>
             *         &lt;/simpleType>
             *       &lt;/attribute>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Email {

                @XmlAttribute(name = "Address", required = true)
                protected String address;
                @XmlAttribute(name = "NameNumber")
                protected String nameNumber;
                @XmlAttribute(name = "ShortText")
                protected String shortText;
                @XmlAttribute(name = "Type")
                protected String type;

                /**
                 * Gets the value of the address property.
                 *
                 * @return possible object is {@link String }
                 *
                 */
                public String getAddress() {
                    return address;
                }

                /**
                 * Sets the value of the address property.
                 *
                 * @param value allowed object is {@link String }
                 *
                 */
                public void setAddress(String value) {
                    this.address = value;
                }

                /**
                 * Gets the value of the nameNumber property.
                 *
                 * @return possible object is {@link String }
                 *
                 */
                public String getNameNumber() {
                    return nameNumber;
                }

                /**
                 * Sets the value of the nameNumber property.
                 *
                 * @param value allowed object is {@link String }
                 *
                 */
                public void setNameNumber(String value) {
                    this.nameNumber = value;
                }

                /**
                 * Gets the value of the shortText property.
                 *
                 * @return possible object is {@link String }
                 *
                 */
                public String getShortText() {
                    return shortText;
                }

                /**
                 * Sets the value of the shortText property.
                 *
                 * @param value allowed object is {@link String }
                 *
                 */
                public void setShortText(String value) {
                    this.shortText = value;
                }

                /**
                 * Gets the value of the type property.
                 *
                 * @return possible object is {@link String }
                 *
                 */
                public String getType() {
                    return type;
                }

                /**
                 * Sets the value of the type property.
                 *
                 * @param value allowed object is {@link String }
                 *
                 */
                public void setType(String value) {
                    this.type = value;
                }

            }

            /**
             * <p>
             * Java class for anonymous complex type.
             *
             * <p>
             * The following schema fragment specifies the expected content
             * contained within this class.
             *
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="GivenName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="GroupInfo" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="VendorPrefs" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="Airline">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                   &lt;/restriction>
             *                                 &lt;/complexContent>
             *                               &lt;/complexType>
             *                             &lt;/element>
             *                           &lt;/sequence>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                 &lt;/sequence>
             *                 &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="NumSeatsRemaining" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="Surname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *       &lt;/sequence>
             *       &lt;attribute name="Infant" type="{http://www.w3.org/2001/XMLSchema}boolean" />
             *       &lt;attribute name="NameNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="NameReference" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="PassengerType" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "givenName",
                "groupInfo",
                "surname"
            })
            public static class PersonName {

                @XmlElement(name = "GivenName")
                protected String givenName;
                @XmlElement(name = "GroupInfo")
                protected PassengerDetailsRQ.TravelItineraryAddInfoRQ.CustomerInfo.PersonName.GroupInfo groupInfo;
                @XmlElement(name = "Surname")
                protected String surname;
                @XmlAttribute(name = "Infant")
                protected Boolean infant;
                @XmlAttribute(name = "NameNumber")
                protected String nameNumber;
                @XmlAttribute(name = "NameReference")
                protected String nameReference;
                @XmlAttribute(name = "PassengerType")
                protected String passengerType;

                /**
                 * Gets the value of the givenName property.
                 *
                 * @return possible object is {@link String }
                 *
                 */
                public String getGivenName() {
                    return givenName;
                }

                /**
                 * Sets the value of the givenName property.
                 *
                 * @param value allowed object is {@link String }
                 *
                 */
                public void setGivenName(String value) {
                    this.givenName = value;
                }

                /**
                 * Gets the value of the groupInfo property.
                 *
                 * @return possible object is
                 *     {@link PassengerDetailsRQ.TravelItineraryAddInfoRQ.CustomerInfo.PersonName.GroupInfo }
                 *
                 */
                public PassengerDetailsRQ.TravelItineraryAddInfoRQ.CustomerInfo.PersonName.GroupInfo getGroupInfo() {
                    return groupInfo;
                }

                /**
                 * Sets the value of the groupInfo property.
                 *
                 * @param value allowed object is
                 *     {@link PassengerDetailsRQ.TravelItineraryAddInfoRQ.CustomerInfo.PersonName.GroupInfo }
                 *
                 */
                public void setGroupInfo(PassengerDetailsRQ.TravelItineraryAddInfoRQ.CustomerInfo.PersonName.GroupInfo value) {
                    this.groupInfo = value;
                }

                /**
                 * Gets the value of the surname property.
                 *
                 * @return possible object is {@link String }
                 *
                 */
                public String getSurname() {
                    return surname;
                }

                /**
                 * Sets the value of the surname property.
                 *
                 * @param value allowed object is {@link String }
                 *
                 */
                public void setSurname(String value) {
                    this.surname = value;
                }

                /**
                 * Gets the value of the infant property.
                 *
                 * @return possible object is {@link Boolean }
                 *
                 */
                public Boolean isInfant() {
                    return infant;
                }

                /**
                 * Sets the value of the infant property.
                 *
                 * @param value allowed object is {@link Boolean }
                 *
                 */
                public void setInfant(Boolean value) {
                    this.infant = value;
                }

                /**
                 * Gets the value of the nameNumber property.
                 *
                 * @return possible object is {@link String }
                 *
                 */
                public String getNameNumber() {
                    return nameNumber;
                }

                /**
                 * Sets the value of the nameNumber property.
                 *
                 * @param value allowed object is {@link String }
                 *
                 */
                public void setNameNumber(String value) {
                    this.nameNumber = value;
                }

                /**
                 * Gets the value of the nameReference property.
                 *
                 * @return possible object is {@link String }
                 *
                 */
                public String getNameReference() {
                    return nameReference;
                }

                /**
                 * Sets the value of the nameReference property.
                 *
                 * @param value allowed object is {@link String }
                 *
                 */
                public void setNameReference(String value) {
                    this.nameReference = value;
                }

                /**
                 * Gets the value of the passengerType property.
                 *
                 * @return possible object is {@link String }
                 *
                 */
                public String getPassengerType() {
                    return passengerType;
                }

                /**
                 * Sets the value of the passengerType property.
                 *
                 * @param value allowed object is {@link String }
                 *
                 */
                public void setPassengerType(String value) {
                    this.passengerType = value;
                }

                /**
                 * <p>
                 * Java class for anonymous complex type.
                 *
                 * <p>
                 * The following schema fragment specifies the expected content
                 * contained within this class.
                 *
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="VendorPrefs" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="Airline">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
                 *       &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="NumSeatsRemaining" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 *
                 *
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "vendorPrefs"
                })
                public static class GroupInfo {

                    @XmlElement(name = "VendorPrefs")
                    protected PassengerDetailsRQ.TravelItineraryAddInfoRQ.CustomerInfo.PersonName.GroupInfo.VendorPrefs vendorPrefs;
                    @XmlAttribute(name = "Name", required = true)
                    protected String name;
                    @XmlAttribute(name = "NumSeatsRemaining", required = true)
                    protected BigInteger numSeatsRemaining;

                    /**
                     * Gets the value of the vendorPrefs property.
                     *
                     * @return possible object is
                     *     {@link PassengerDetailsRQ.TravelItineraryAddInfoRQ.CustomerInfo.PersonName.GroupInfo.VendorPrefs }
                     *
                     */
                    public PassengerDetailsRQ.TravelItineraryAddInfoRQ.CustomerInfo.PersonName.GroupInfo.VendorPrefs getVendorPrefs() {
                        return vendorPrefs;
                    }

                    /**
                     * Sets the value of the vendorPrefs property.
                     *
                     * @param value allowed object is
                     *     {@link PassengerDetailsRQ.TravelItineraryAddInfoRQ.CustomerInfo.PersonName.GroupInfo.VendorPrefs }
                     *
                     */
                    public void setVendorPrefs(PassengerDetailsRQ.TravelItineraryAddInfoRQ.CustomerInfo.PersonName.GroupInfo.VendorPrefs value) {
                        this.vendorPrefs = value;
                    }

                    /**
                     * Gets the value of the name property.
                     *
                     * @return possible object is {@link String }
                     *
                     */
                    public String getName() {
                        return name;
                    }

                    /**
                     * Sets the value of the name property.
                     *
                     * @param value allowed object is {@link String }
                     *
                     */
                    public void setName(String value) {
                        this.name = value;
                    }

                    /**
                     * Gets the value of the numSeatsRemaining property.
                     *
                     * @return possible object is {@link BigInteger }
                     *
                     */
                    public BigInteger getNumSeatsRemaining() {
                        return numSeatsRemaining;
                    }

                    /**
                     * Sets the value of the numSeatsRemaining property.
                     *
                     * @param value allowed object is {@link BigInteger }
                     *
                     */
                    public void setNumSeatsRemaining(BigInteger value) {
                        this.numSeatsRemaining = value;
                    }

                    /**
                     * <p>
                     * Java class for anonymous complex type.
                     *
                     * <p>
                     * The following schema fragment specifies the expected
                     * content contained within this class.
                     *
                     * <pre>
                     * &lt;complexType>
                     *   &lt;complexContent>
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *       &lt;sequence>
                     *         &lt;element name="Airline">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
                        "airline"
                    })
                    public static class VendorPrefs {

                        @XmlElement(name = "Airline", required = true)
                        protected PassengerDetailsRQ.TravelItineraryAddInfoRQ.CustomerInfo.PersonName.GroupInfo.VendorPrefs.Airline airline;

                        /**
                         * Gets the value of the airline property.
                         *
                         * @return possible object is
                         *     {@link PassengerDetailsRQ.TravelItineraryAddInfoRQ.CustomerInfo.PersonName.GroupInfo.VendorPrefs.Airline }
                         *
                         */
                        public PassengerDetailsRQ.TravelItineraryAddInfoRQ.CustomerInfo.PersonName.GroupInfo.VendorPrefs.Airline getAirline() {
                            return airline;
                        }

                        /**
                         * Sets the value of the airline property.
                         *
                         * @param value allowed object is
                         *     {@link PassengerDetailsRQ.TravelItineraryAddInfoRQ.CustomerInfo.PersonName.GroupInfo.VendorPrefs.Airline }
                         *
                         */
                        public void setAirline(PassengerDetailsRQ.TravelItineraryAddInfoRQ.CustomerInfo.PersonName.GroupInfo.VendorPrefs.Airline value) {
                            this.airline = value;
                        }

                        /**
                         * <p>
                         * Java class for anonymous complex type.
                         *
                         * <p>
                         * The following schema fragment specifies the expected
                         * content contained within this class.
                         *
                         * <pre>
                         * &lt;complexType>
                         *   &lt;complexContent>
                         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *       &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
                         *     &lt;/restriction>
                         *   &lt;/complexContent>
                         * &lt;/complexType>
                         * </pre>
                         *
                         *
                         */
                        @XmlAccessorType(XmlAccessType.FIELD)
                        @XmlType(name = "")
                        public static class Airline {

                            @XmlAttribute(name = "Code", required = true)
                            protected String code;

                            /**
                             * Gets the value of the code property.
                             *
                             * @return possible object is {@link String }
                             *
                             */
                            public String getCode() {
                                return code;
                            }

                            /**
                             * Sets the value of the code property.
                             *
                             * @param value allowed object is {@link String }
                             *
                             */
                            public void setCode(String value) {
                                this.code = value;
                            }

                        }

                    }

                }

            }

        }

    }

}
