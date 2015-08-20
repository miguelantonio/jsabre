
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
 *         &lt;element name="OriginDestinationInformation" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="FlightSegment" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="DestinationLocation">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="LocationCode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="OriginLocation">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="LocationCode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="SisterDestinationLocation" maxOccurs="3" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="LocationCode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="SisterDestinationMileage" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="Number" use="required">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                                           &lt;minInclusive value="1"/>
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="SisterOriginLocation" maxOccurs="3" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="LocationCode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="SisterOriginMileage" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="Number" use="required">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                                           &lt;minInclusive value="1"/>
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attribute name="ArrivalDateTime" type="{http://webservices.sabre.com/sabreXML/2011/10}fullDateTime" />
 *                           &lt;attribute name="ConnectionInd" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="DepartureDateTime" type="{http://webservices.sabre.com/sabreXML/2011/10}fullDateTime" />
 *                           &lt;attribute name="ResBookDesigCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="RPH">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                       &lt;minInclusive value="0"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PriceRequestInformation">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="OptionalQualifiers">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="FlightQualifiers" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="AlternateAirports" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="AlternateAirportCities" maxOccurs="unbounded" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="AlternateLocation" maxOccurs="3">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;attribute name="LocationCode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                 &lt;/restriction>
 *                                                               &lt;/complexContent>
 *                                                             &lt;/complexType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="SpecifiedLocation">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;attribute name="LocationCode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                 &lt;/restriction>
 *                                                               &lt;/complexContent>
 *                                                             &lt;/complexType>
 *                                                           &lt;/element>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="AlternateAirportMileage" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;attribute name="Number" use="required">
 *                                                           &lt;simpleType>
 *                                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                                                               &lt;minInclusive value="1"/>
 *                                                             &lt;/restriction>
 *                                                           &lt;/simpleType>
 *                                                         &lt;/attribute>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="LongConnections" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                               &lt;attribute name="MCT_Override">
 *                                                 &lt;simpleType>
 *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                                                     &lt;minInclusive value="780"/>
 *                                                     &lt;maxInclusive value="1439"/>
 *                                                   &lt;/restriction>
 *                                                 &lt;/simpleType>
 *                                               &lt;/attribute>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="Routing" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="RoutingLeg" maxOccurs="unbounded">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="ConnectPoint" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                                                           &lt;element name="InboundCarrier" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                               &lt;attribute name="AddWildcards" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                               &lt;attribute name="RPH" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="VendorPrefs" maxOccurs="2" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="Airline" maxOccurs="20">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                         &lt;attribute name="RPH">
 *                                                           &lt;simpleType>
 *                                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                                                               &lt;minInclusive value="0"/>
 *                                                             &lt;/restriction>
 *                                                           &lt;/simpleType>
 *                                                         &lt;/attribute>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                               &lt;attribute name="Exclude" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="AvailableFlightsOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                     &lt;attribute name="DisableJumpCabinLogic" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                     &lt;attribute name="NumStops">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                                           &lt;minInclusive value="0"/>
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                     &lt;attribute name="OnlineOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="MiscQualifiers" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="AirExtras" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="CustLoyalty" maxOccurs="unbounded" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;attribute name="ProgramID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                         &lt;attribute name="TierLevel" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="Qualifier" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                               &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                               &lt;attribute name="Summary" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="Indicators" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="MinMaxStay">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="RefundPenalty">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="ResTicketing">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="RetainFare">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="TravelPolicy">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="Priority" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="DirectFlights">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;attribute name="Priority" use="required">
 *                                                           &lt;simpleType>
 *                                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                                                               &lt;minInclusive value="1"/>
 *                                                               &lt;maxInclusive value="4"/>
 *                                                             &lt;/restriction>
 *                                                           &lt;/simpleType>
 *                                                         &lt;/attribute>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="Price">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;attribute name="Priority" use="required">
 *                                                           &lt;simpleType>
 *                                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                                                               &lt;minInclusive value="1"/>
 *                                                               &lt;maxInclusive value="4"/>
 *                                                             &lt;/restriction>
 *                                                           &lt;/simpleType>
 *                                                         &lt;/attribute>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="Time">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;attribute name="Priority" use="required">
 *                                                           &lt;simpleType>
 *                                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                                                               &lt;minInclusive value="1"/>
 *                                                               &lt;maxInclusive value="4"/>
 *                                                             &lt;/restriction>
 *                                                           &lt;/simpleType>
 *                                                         &lt;/attribute>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="Vendor">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;attribute name="Priority" use="required">
 *                                                           &lt;simpleType>
 *                                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                                                               &lt;minInclusive value="1"/>
 *                                                               &lt;maxInclusive value="4"/>
 *                                                             &lt;/restriction>
 *                                                           &lt;/simpleType>
 *                                                         &lt;/attribute>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="ValidInterlineTicket" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="PricingQualifiers">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Account" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="Corporate" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *                                               &lt;/sequence>
 *                                               &lt;attribute name="Force" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="FareOptions" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="Private" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                               &lt;attribute name="Public" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="PassengerStatus" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="CityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="CountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="StateCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                               &lt;attribute name="Type" use="required">
 *                                                 &lt;simpleType>
 *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                     &lt;enumeration value="E"/>
 *                                                     &lt;enumeration value="N"/>
 *                                                     &lt;enumeration value="R"/>
 *                                                   &lt;/restriction>
 *                                                 &lt;/simpleType>
 *                                               &lt;/attribute>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="PassengerType" maxOccurs="4">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="Force" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                               &lt;attribute name="Quantity" use="required">
 *                                                 &lt;simpleType>
 *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                                                     &lt;minInclusive value="0"/>
 *                                                   &lt;/restriction>
 *                                                 &lt;/simpleType>
 *                                               &lt;/attribute>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="PurchaseDate" type="{http://webservices.sabre.com/sabreXML/2011/10}fullDate" minOccurs="0"/>
 *                                       &lt;element name="SpanishLargeFamilyDiscountLevel" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;enumeration value="1"/>
 *                                             &lt;enumeration value="2"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="Taxes" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="TaxExempt" maxOccurs="9" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="TaxOverride" maxOccurs="9" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;attribute name="Amount" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                         &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                               &lt;attribute name="NoTax" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="TimeQualifiers" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="ArrivalTime" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="NumHours">
 *                                                 &lt;simpleType>
 *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                                                     &lt;minInclusive value="0"/>
 *                                                     &lt;maxInclusive value="72"/>
 *                                                   &lt;/restriction>
 *                                                 &lt;/simpleType>
 *                                               &lt;/attribute>
 *                                               &lt;attribute name="WindowAfter" type="{http://webservices.sabre.com/sabreXML/2011/10}shortTime" />
 *                                               &lt;attribute name="WindowBefore" type="{http://webservices.sabre.com/sabreXML/2011/10}shortTime" />
 *                                               &lt;attribute name="RPH">
 *                                                 &lt;simpleType>
 *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                                                     &lt;minInclusive value="0"/>
 *                                                   &lt;/restriction>
 *                                                 &lt;/simpleType>
 *                                               &lt;/attribute>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="DepartureTime" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="WindowAfter" use="required" type="{http://webservices.sabre.com/sabreXML/2011/10}shortTime" />
 *                                               &lt;attribute name="WindowBefore" use="required" type="{http://webservices.sabre.com/sabreXML/2011/10}shortTime" />
 *                                               &lt;attribute name="RPH">
 *                                                 &lt;simpleType>
 *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                                                     &lt;minInclusive value="0"/>
 *                                                   &lt;/restriction>
 *                                                 &lt;/simpleType>
 *                                               &lt;/attribute>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="NumHours">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                                           &lt;minInclusive value="0"/>
 *                                           &lt;maxInclusive value="9"/>
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
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
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
    "originDestinationInformation",
    "priceRequestInformation"
})
@XmlRootElement(name = "OTA_AirLowFareSearchRQ")
public class OTAAirLowFareSearchRQ {

    @XmlElement(name = "OriginDestinationInformation", required = true)
    protected List<OTAAirLowFareSearchRQ.OriginDestinationInformation> originDestinationInformation;
    @XmlElement(name = "PriceRequestInformation", required = true)
    protected OTAAirLowFareSearchRQ.PriceRequestInformation priceRequestInformation;
    @XmlAttribute(name = "TimeStamp")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timeStamp;
    @XmlAttribute(name = "Version", required = true)
    protected String version;

    /**
     * Gets the value of the originDestinationInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the originDestinationInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOriginDestinationInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OTAAirLowFareSearchRQ.OriginDestinationInformation }
     * 
     * 
     */
    public List<OTAAirLowFareSearchRQ.OriginDestinationInformation> getOriginDestinationInformation() {
        if (originDestinationInformation == null) {
            originDestinationInformation = new ArrayList<OTAAirLowFareSearchRQ.OriginDestinationInformation>();
        }
        return this.originDestinationInformation;
    }
    
    public void setOriginDestinationInformation(List<OTAAirLowFareSearchRQ.OriginDestinationInformation> o) {
        this.originDestinationInformation = o;
    }

    /**
     * Gets the value of the priceRequestInformation property.
     * 
     * @return
     *     possible object is
     *     {@link OTAAirLowFareSearchRQ.PriceRequestInformation }
     *     
     */
    public OTAAirLowFareSearchRQ.PriceRequestInformation getPriceRequestInformation() {
        return priceRequestInformation;
    }

    /**
     * Sets the value of the priceRequestInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link OTAAirLowFareSearchRQ.PriceRequestInformation }
     *     
     */
    public void setPriceRequestInformation(OTAAirLowFareSearchRQ.PriceRequestInformation value) {
        this.priceRequestInformation = value;
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
            return "2.3.0";
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
     *         &lt;element name="FlightSegment" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="DestinationLocation">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="LocationCode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="OriginLocation">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="LocationCode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="SisterDestinationLocation" maxOccurs="3" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="LocationCode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="SisterDestinationMileage" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="Number" use="required">
     *                             &lt;simpleType>
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *                                 &lt;minInclusive value="1"/>
     *                               &lt;/restriction>
     *                             &lt;/simpleType>
     *                           &lt;/attribute>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="SisterOriginLocation" maxOccurs="3" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="LocationCode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="SisterOriginMileage" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="Number" use="required">
     *                             &lt;simpleType>
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *                                 &lt;minInclusive value="1"/>
     *                               &lt;/restriction>
     *                             &lt;/simpleType>
     *                           &lt;/attribute>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="ArrivalDateTime" type="{http://webservices.sabre.com/sabreXML/2011/10}fullDateTime" />
     *                 &lt;attribute name="ConnectionInd" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="DepartureDateTime" type="{http://webservices.sabre.com/sabreXML/2011/10}fullDateTime" />
     *                 &lt;attribute name="ResBookDesigCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="RPH">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *             &lt;minInclusive value="0"/>
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
        "flightSegment"
    })
    public static class OriginDestinationInformation {

        @XmlElement(name = "FlightSegment", required = true)
        protected List<OTAAirLowFareSearchRQ.OriginDestinationInformation.FlightSegment> flightSegment;
        @XmlAttribute(name = "RPH")
        protected BigInteger rph;

        /**
         * Gets the value of the flightSegment property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the flightSegment property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFlightSegment().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link OTAAirLowFareSearchRQ.OriginDestinationInformation.FlightSegment }
         * 
         * 
         */
        public List<OTAAirLowFareSearchRQ.OriginDestinationInformation.FlightSegment> getFlightSegment() {
            if (flightSegment == null) {
                flightSegment = new ArrayList<OTAAirLowFareSearchRQ.OriginDestinationInformation.FlightSegment>();
            }
            return this.flightSegment;
        }
        
        public void setFlightSegment(List<OTAAirLowFareSearchRQ.OriginDestinationInformation.FlightSegment> flightSegment) {
            this.flightSegment = flightSegment;
        }

        /**
         * Gets the value of the rph property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getRPH() {
            return rph;
        }

        /**
         * Sets the value of the rph property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setRPH(BigInteger value) {
            this.rph = value;
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
         *         &lt;element name="DestinationLocation">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="LocationCode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="OriginLocation">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="LocationCode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="SisterDestinationLocation" maxOccurs="3" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="LocationCode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="SisterDestinationMileage" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="Number" use="required">
         *                   &lt;simpleType>
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
         *                       &lt;minInclusive value="1"/>
         *                     &lt;/restriction>
         *                   &lt;/simpleType>
         *                 &lt;/attribute>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="SisterOriginLocation" maxOccurs="3" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="LocationCode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="SisterOriginMileage" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="Number" use="required">
         *                   &lt;simpleType>
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
         *                       &lt;minInclusive value="1"/>
         *                     &lt;/restriction>
         *                   &lt;/simpleType>
         *                 &lt;/attribute>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="ArrivalDateTime" type="{http://webservices.sabre.com/sabreXML/2011/10}fullDateTime" />
         *       &lt;attribute name="ConnectionInd" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="DepartureDateTime" type="{http://webservices.sabre.com/sabreXML/2011/10}fullDateTime" />
         *       &lt;attribute name="ResBookDesigCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "destinationLocation",
            "originLocation",
            "sisterDestinationLocation",
            "sisterDestinationMileage",
            "sisterOriginLocation",
            "sisterOriginMileage"
        })
        public static class FlightSegment {

            @XmlElement(name = "DestinationLocation", required = true)
            protected OTAAirLowFareSearchRQ.OriginDestinationInformation.FlightSegment.DestinationLocation destinationLocation;
            @XmlElement(name = "OriginLocation", required = true)
            protected OTAAirLowFareSearchRQ.OriginDestinationInformation.FlightSegment.OriginLocation originLocation;
            @XmlElement(name = "SisterDestinationLocation")
            protected List<OTAAirLowFareSearchRQ.OriginDestinationInformation.FlightSegment.SisterDestinationLocation> sisterDestinationLocation;
            @XmlElement(name = "SisterDestinationMileage")
            protected OTAAirLowFareSearchRQ.OriginDestinationInformation.FlightSegment.SisterDestinationMileage sisterDestinationMileage;
            @XmlElement(name = "SisterOriginLocation")
            protected List<OTAAirLowFareSearchRQ.OriginDestinationInformation.FlightSegment.SisterOriginLocation> sisterOriginLocation;
            @XmlElement(name = "SisterOriginMileage")
            protected OTAAirLowFareSearchRQ.OriginDestinationInformation.FlightSegment.SisterOriginMileage sisterOriginMileage;
            @XmlAttribute(name = "ArrivalDateTime")
            protected /*XMLGregorianCalendar*/ String arrivalDateTime;
            @XmlAttribute(name = "ConnectionInd")
            protected String connectionInd;
            @XmlAttribute(name = "DepartureDateTime")
            protected /*XMLGregorianCalendar*/ String departureDateTime;
            @XmlAttribute(name = "ResBookDesigCode")
            protected String resBookDesigCode;

            /**
             * Gets the value of the destinationLocation property.
             * 
             * @return
             *     possible object is
             *     {@link OTAAirLowFareSearchRQ.OriginDestinationInformation.FlightSegment.DestinationLocation }
             *     
             */
            public OTAAirLowFareSearchRQ.OriginDestinationInformation.FlightSegment.DestinationLocation getDestinationLocation() {
                return destinationLocation;
            }

            /**
             * Sets the value of the destinationLocation property.
             * 
             * @param value
             *     allowed object is
             *     {@link OTAAirLowFareSearchRQ.OriginDestinationInformation.FlightSegment.DestinationLocation }
             *     
             */
            public void setDestinationLocation(OTAAirLowFareSearchRQ.OriginDestinationInformation.FlightSegment.DestinationLocation value) {
                this.destinationLocation = value;
            }

            /**
             * Gets the value of the originLocation property.
             * 
             * @return
             *     possible object is
             *     {@link OTAAirLowFareSearchRQ.OriginDestinationInformation.FlightSegment.OriginLocation }
             *     
             */
            public OTAAirLowFareSearchRQ.OriginDestinationInformation.FlightSegment.OriginLocation getOriginLocation() {
                return originLocation;
            }

            /**
             * Sets the value of the originLocation property.
             * 
             * @param value
             *     allowed object is
             *     {@link OTAAirLowFareSearchRQ.OriginDestinationInformation.FlightSegment.OriginLocation }
             *     
             */
            public void setOriginLocation(OTAAirLowFareSearchRQ.OriginDestinationInformation.FlightSegment.OriginLocation value) {
                this.originLocation = value;
            }

            /**
             * Gets the value of the sisterDestinationLocation property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the sisterDestinationLocation property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getSisterDestinationLocation().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link OTAAirLowFareSearchRQ.OriginDestinationInformation.FlightSegment.SisterDestinationLocation }
             * 
             * 
             */
            public List<OTAAirLowFareSearchRQ.OriginDestinationInformation.FlightSegment.SisterDestinationLocation> getSisterDestinationLocation() {
                if (sisterDestinationLocation == null) {
                    sisterDestinationLocation = new ArrayList<OTAAirLowFareSearchRQ.OriginDestinationInformation.FlightSegment.SisterDestinationLocation>();
                }
                return this.sisterDestinationLocation;
            }

            /**
             * Gets the value of the sisterDestinationMileage property.
             * 
             * @return
             *     possible object is
             *     {@link OTAAirLowFareSearchRQ.OriginDestinationInformation.FlightSegment.SisterDestinationMileage }
             *     
             */
            public OTAAirLowFareSearchRQ.OriginDestinationInformation.FlightSegment.SisterDestinationMileage getSisterDestinationMileage() {
                return sisterDestinationMileage;
            }

            /**
             * Sets the value of the sisterDestinationMileage property.
             * 
             * @param value
             *     allowed object is
             *     {@link OTAAirLowFareSearchRQ.OriginDestinationInformation.FlightSegment.SisterDestinationMileage }
             *     
             */
            public void setSisterDestinationMileage(OTAAirLowFareSearchRQ.OriginDestinationInformation.FlightSegment.SisterDestinationMileage value) {
                this.sisterDestinationMileage = value;
            }

            /**
             * Gets the value of the sisterOriginLocation property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the sisterOriginLocation property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getSisterOriginLocation().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link OTAAirLowFareSearchRQ.OriginDestinationInformation.FlightSegment.SisterOriginLocation }
             * 
             * 
             */
            public List<OTAAirLowFareSearchRQ.OriginDestinationInformation.FlightSegment.SisterOriginLocation> getSisterOriginLocation() {
                if (sisterOriginLocation == null) {
                    sisterOriginLocation = new ArrayList<OTAAirLowFareSearchRQ.OriginDestinationInformation.FlightSegment.SisterOriginLocation>();
                }
                return this.sisterOriginLocation;
            }

            /**
             * Gets the value of the sisterOriginMileage property.
             * 
             * @return
             *     possible object is
             *     {@link OTAAirLowFareSearchRQ.OriginDestinationInformation.FlightSegment.SisterOriginMileage }
             *     
             */
            public OTAAirLowFareSearchRQ.OriginDestinationInformation.FlightSegment.SisterOriginMileage getSisterOriginMileage() {
                return sisterOriginMileage;
            }

            /**
             * Sets the value of the sisterOriginMileage property.
             * 
             * @param value
             *     allowed object is
             *     {@link OTAAirLowFareSearchRQ.OriginDestinationInformation.FlightSegment.SisterOriginMileage }
             *     
             */
            public void setSisterOriginMileage(OTAAirLowFareSearchRQ.OriginDestinationInformation.FlightSegment.SisterOriginMileage value) {
                this.sisterOriginMileage = value;
            }

            /**
             * Gets the value of the arrivalDateTime property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public /*XMLGregorianCalendar*/ String getArrivalDateTime() {
                return arrivalDateTime;
            }

            /**
             * Sets the value of the arrivalDateTime property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setArrivalDateTime(/*XMLGregorianCalendar*/ String value) {
                this.arrivalDateTime = value;
            }

            /**
             * Gets the value of the connectionInd property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getConnectionInd() {
                return connectionInd;
            }

            /**
             * Sets the value of the connectionInd property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setConnectionInd(String value) {
                this.connectionInd = value;
            }

            /**
             * Gets the value of the departureDateTime property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public /*XMLGregorianCalendar*/ String getDepartureDateTime() {
                return departureDateTime;
            }

            /**
             * Sets the value of the departureDateTime property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setDepartureDateTime(/*XMLGregorianCalendar*/ String value) {
                this.departureDateTime = value;
            }

            /**
             * Gets the value of the resBookDesigCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getResBookDesigCode() {
                return resBookDesigCode;
            }

            /**
             * Sets the value of the resBookDesigCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setResBookDesigCode(String value) {
                this.resBookDesigCode = value;
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
            public static class DestinationLocation {

                @XmlAttribute(name = "LocationCode", required = true)
                protected String locationCode;

                /**
                 * Gets the value of the locationCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getLocationCode() {
                    return locationCode;
                }

                /**
                 * Sets the value of the locationCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setLocationCode(String value) {
                    this.locationCode = value;
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
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getLocationCode() {
                    return locationCode;
                }

                /**
                 * Sets the value of the locationCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setLocationCode(String value) {
                    this.locationCode = value;
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
            public static class SisterDestinationLocation {

                @XmlAttribute(name = "LocationCode", required = true)
                protected String locationCode;

                /**
                 * Gets the value of the locationCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getLocationCode() {
                    return locationCode;
                }

                /**
                 * Sets the value of the locationCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setLocationCode(String value) {
                    this.locationCode = value;
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
             *       &lt;attribute name="Number" use="required">
             *         &lt;simpleType>
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
             *             &lt;minInclusive value="1"/>
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
            public static class SisterDestinationMileage {

                @XmlAttribute(name = "Number", required = true)
                protected BigInteger number;

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


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
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
            public static class SisterOriginLocation {

                @XmlAttribute(name = "LocationCode", required = true)
                protected String locationCode;

                /**
                 * Gets the value of the locationCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getLocationCode() {
                    return locationCode;
                }

                /**
                 * Sets the value of the locationCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setLocationCode(String value) {
                    this.locationCode = value;
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
             *       &lt;attribute name="Number" use="required">
             *         &lt;simpleType>
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
             *             &lt;minInclusive value="1"/>
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
            public static class SisterOriginMileage {

                @XmlAttribute(name = "Number", required = true)
                protected BigInteger number;

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
     *         &lt;element name="OptionalQualifiers">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="FlightQualifiers" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="AlternateAirports" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="AlternateAirportCities" maxOccurs="unbounded" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="AlternateLocation" maxOccurs="3">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;attribute name="LocationCode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                       &lt;/restriction>
     *                                                     &lt;/complexContent>
     *                                                   &lt;/complexType>
     *                                                 &lt;/element>
     *                                                 &lt;element name="SpecifiedLocation">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;attribute name="LocationCode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                       &lt;/restriction>
     *                                                     &lt;/complexContent>
     *                                                   &lt;/complexType>
     *                                                 &lt;/element>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="AlternateAirportMileage" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;attribute name="Number" use="required">
     *                                                 &lt;simpleType>
     *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *                                                     &lt;minInclusive value="1"/>
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
     *                             &lt;element name="LongConnections" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                                     &lt;attribute name="MCT_Override">
     *                                       &lt;simpleType>
     *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *                                           &lt;minInclusive value="780"/>
     *                                           &lt;maxInclusive value="1439"/>
     *                                         &lt;/restriction>
     *                                       &lt;/simpleType>
     *                                     &lt;/attribute>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="Routing" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="RoutingLeg" maxOccurs="unbounded">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="ConnectPoint" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
     *                                                 &lt;element name="InboundCarrier" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                     &lt;attribute name="AddWildcards" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                                     &lt;attribute name="RPH" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="VendorPrefs" maxOccurs="2" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="Airline" maxOccurs="20">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                               &lt;attribute name="RPH">
     *                                                 &lt;simpleType>
     *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *                                                     &lt;minInclusive value="0"/>
     *                                                   &lt;/restriction>
     *                                                 &lt;/simpleType>
     *                                               &lt;/attribute>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                     &lt;attribute name="Exclude" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                           &lt;attribute name="AvailableFlightsOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                           &lt;attribute name="DisableJumpCabinLogic" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                           &lt;attribute name="NumStops">
     *                             &lt;simpleType>
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *                                 &lt;minInclusive value="0"/>
     *                               &lt;/restriction>
     *                             &lt;/simpleType>
     *                           &lt;/attribute>
     *                           &lt;attribute name="OnlineOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="MiscQualifiers" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="AirExtras" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="CustLoyalty" maxOccurs="unbounded" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;attribute name="ProgramID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                               &lt;attribute name="TierLevel" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="Qualifier" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                     &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                                     &lt;attribute name="Summary" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="Indicators" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="MinMaxStay">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="RefundPenalty">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="ResTicketing">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="RetainFare">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="TravelPolicy">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="Priority" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="DirectFlights">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;attribute name="Priority" use="required">
     *                                                 &lt;simpleType>
     *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *                                                     &lt;minInclusive value="1"/>
     *                                                     &lt;maxInclusive value="4"/>
     *                                                   &lt;/restriction>
     *                                                 &lt;/simpleType>
     *                                               &lt;/attribute>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="Price">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;attribute name="Priority" use="required">
     *                                                 &lt;simpleType>
     *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *                                                     &lt;minInclusive value="1"/>
     *                                                     &lt;maxInclusive value="4"/>
     *                                                   &lt;/restriction>
     *                                                 &lt;/simpleType>
     *                                               &lt;/attribute>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="Time">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;attribute name="Priority" use="required">
     *                                                 &lt;simpleType>
     *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *                                                     &lt;minInclusive value="1"/>
     *                                                     &lt;maxInclusive value="4"/>
     *                                                   &lt;/restriction>
     *                                                 &lt;/simpleType>
     *                                               &lt;/attribute>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="Vendor">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;attribute name="Priority" use="required">
     *                                                 &lt;simpleType>
     *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *                                                     &lt;minInclusive value="1"/>
     *                                                     &lt;maxInclusive value="4"/>
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
     *                             &lt;element name="ValidInterlineTicket" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="PricingQualifiers">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Account" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
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
     *                                       &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
     *                                     &lt;/sequence>
     *                                     &lt;attribute name="Force" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="FareOptions" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="Private" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                                     &lt;attribute name="Public" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="PassengerStatus" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="CityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="CountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="StateCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                     &lt;attribute name="Type" use="required">
     *                                       &lt;simpleType>
     *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                           &lt;enumeration value="E"/>
     *                                           &lt;enumeration value="N"/>
     *                                           &lt;enumeration value="R"/>
     *                                         &lt;/restriction>
     *                                       &lt;/simpleType>
     *                                     &lt;/attribute>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="PassengerType" maxOccurs="4">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="Force" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                                     &lt;attribute name="Quantity" use="required">
     *                                       &lt;simpleType>
     *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *                                           &lt;minInclusive value="0"/>
     *                                         &lt;/restriction>
     *                                       &lt;/simpleType>
     *                                     &lt;/attribute>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="PurchaseDate" type="{http://webservices.sabre.com/sabreXML/2011/10}fullDate" minOccurs="0"/>
     *                             &lt;element name="SpanishLargeFamilyDiscountLevel" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;enumeration value="1"/>
     *                                   &lt;enumeration value="2"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="Taxes" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="TaxExempt" maxOccurs="9" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="TaxOverride" maxOccurs="9" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;attribute name="Amount" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                               &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                     &lt;attribute name="NoTax" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                           &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="TimeQualifiers" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="ArrivalTime" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="NumHours">
     *                                       &lt;simpleType>
     *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *                                           &lt;minInclusive value="0"/>
     *                                           &lt;maxInclusive value="72"/>
     *                                         &lt;/restriction>
     *                                       &lt;/simpleType>
     *                                     &lt;/attribute>
     *                                     &lt;attribute name="WindowAfter" type="{http://webservices.sabre.com/sabreXML/2011/10}shortTime" />
     *                                     &lt;attribute name="WindowBefore" type="{http://webservices.sabre.com/sabreXML/2011/10}shortTime" />
     *                                     &lt;attribute name="RPH">
     *                                       &lt;simpleType>
     *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *                                           &lt;minInclusive value="0"/>
     *                                         &lt;/restriction>
     *                                       &lt;/simpleType>
     *                                     &lt;/attribute>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="DepartureTime" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="WindowAfter" use="required" type="{http://webservices.sabre.com/sabreXML/2011/10}shortTime" />
     *                                     &lt;attribute name="WindowBefore" use="required" type="{http://webservices.sabre.com/sabreXML/2011/10}shortTime" />
     *                                     &lt;attribute name="RPH">
     *                                       &lt;simpleType>
     *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *                                           &lt;minInclusive value="0"/>
     *                                         &lt;/restriction>
     *                                       &lt;/simpleType>
     *                                     &lt;/attribute>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                           &lt;attribute name="NumHours">
     *                             &lt;simpleType>
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *                                 &lt;minInclusive value="0"/>
     *                                 &lt;maxInclusive value="9"/>
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
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "optionalQualifiers"
    })
    public static class PriceRequestInformation {

        @XmlElement(name = "OptionalQualifiers", required = true)
        protected OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers optionalQualifiers;

        /**
         * Gets the value of the optionalQualifiers property.
         * 
         * @return
         *     possible object is
         *     {@link OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers }
         *     
         */
        public OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers getOptionalQualifiers() {
            return optionalQualifiers;
        }

        /**
         * Sets the value of the optionalQualifiers property.
         * 
         * @param value
         *     allowed object is
         *     {@link OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers }
         *     
         */
        public void setOptionalQualifiers(OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers value) {
            this.optionalQualifiers = value;
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
         *         &lt;element name="FlightQualifiers" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="AlternateAirports" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="AlternateAirportCities" maxOccurs="unbounded" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="AlternateLocation" maxOccurs="3">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;attribute name="LocationCode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                             &lt;/restriction>
         *                                           &lt;/complexContent>
         *                                         &lt;/complexType>
         *                                       &lt;/element>
         *                                       &lt;element name="SpecifiedLocation">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;attribute name="LocationCode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                             &lt;/restriction>
         *                                           &lt;/complexContent>
         *                                         &lt;/complexType>
         *                                       &lt;/element>
         *                                     &lt;/sequence>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="AlternateAirportMileage" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;attribute name="Number" use="required">
         *                                       &lt;simpleType>
         *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
         *                                           &lt;minInclusive value="1"/>
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
         *                   &lt;element name="LongConnections" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *                           &lt;attribute name="MCT_Override">
         *                             &lt;simpleType>
         *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
         *                                 &lt;minInclusive value="780"/>
         *                                 &lt;maxInclusive value="1439"/>
         *                               &lt;/restriction>
         *                             &lt;/simpleType>
         *                           &lt;/attribute>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="Routing" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="RoutingLeg" maxOccurs="unbounded">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="ConnectPoint" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
         *                                       &lt;element name="InboundCarrier" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
         *                                     &lt;/sequence>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                           &lt;/sequence>
         *                           &lt;attribute name="AddWildcards" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *                           &lt;attribute name="RPH" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="VendorPrefs" maxOccurs="2" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="Airline" maxOccurs="20">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                     &lt;attribute name="RPH">
         *                                       &lt;simpleType>
         *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
         *                                           &lt;minInclusive value="0"/>
         *                                         &lt;/restriction>
         *                                       &lt;/simpleType>
         *                                     &lt;/attribute>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                           &lt;/sequence>
         *                           &lt;attribute name="Exclude" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *                 &lt;attribute name="AvailableFlightsOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *                 &lt;attribute name="DisableJumpCabinLogic" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *                 &lt;attribute name="NumStops">
         *                   &lt;simpleType>
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
         *                       &lt;minInclusive value="0"/>
         *                     &lt;/restriction>
         *                   &lt;/simpleType>
         *                 &lt;/attribute>
         *                 &lt;attribute name="OnlineOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="MiscQualifiers" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="AirExtras" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="CustLoyalty" maxOccurs="unbounded" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;attribute name="ProgramID" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                     &lt;attribute name="TierLevel" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="Qualifier" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
         *                           &lt;/sequence>
         *                           &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *                           &lt;attribute name="Summary" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="Indicators" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="MinMaxStay">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="RefundPenalty">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="ResTicketing">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="RetainFare">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="TravelPolicy">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="Priority" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="DirectFlights">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;attribute name="Priority" use="required">
         *                                       &lt;simpleType>
         *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
         *                                           &lt;minInclusive value="1"/>
         *                                           &lt;maxInclusive value="4"/>
         *                                         &lt;/restriction>
         *                                       &lt;/simpleType>
         *                                     &lt;/attribute>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="Price">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;attribute name="Priority" use="required">
         *                                       &lt;simpleType>
         *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
         *                                           &lt;minInclusive value="1"/>
         *                                           &lt;maxInclusive value="4"/>
         *                                         &lt;/restriction>
         *                                       &lt;/simpleType>
         *                                     &lt;/attribute>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="Time">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;attribute name="Priority" use="required">
         *                                       &lt;simpleType>
         *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
         *                                           &lt;minInclusive value="1"/>
         *                                           &lt;maxInclusive value="4"/>
         *                                         &lt;/restriction>
         *                                       &lt;/simpleType>
         *                                     &lt;/attribute>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="Vendor">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;attribute name="Priority" use="required">
         *                                       &lt;simpleType>
         *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
         *                                           &lt;minInclusive value="1"/>
         *                                           &lt;maxInclusive value="4"/>
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
         *                   &lt;element name="ValidInterlineTicket" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="PricingQualifiers">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Account" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
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
         *                             &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
         *                           &lt;/sequence>
         *                           &lt;attribute name="Force" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="FareOptions" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attribute name="Private" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *                           &lt;attribute name="Public" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="PassengerStatus" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="CityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="CountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="StateCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                           &lt;/sequence>
         *                           &lt;attribute name="Type" use="required">
         *                             &lt;simpleType>
         *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                 &lt;enumeration value="E"/>
         *                                 &lt;enumeration value="N"/>
         *                                 &lt;enumeration value="R"/>
         *                               &lt;/restriction>
         *                             &lt;/simpleType>
         *                           &lt;/attribute>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="PassengerType" maxOccurs="4">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="Force" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *                           &lt;attribute name="Quantity" use="required">
         *                             &lt;simpleType>
         *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
         *                                 &lt;minInclusive value="0"/>
         *                               &lt;/restriction>
         *                             &lt;/simpleType>
         *                           &lt;/attribute>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="PurchaseDate" type="{http://webservices.sabre.com/sabreXML/2011/10}fullDate" minOccurs="0"/>
         *                   &lt;element name="SpanishLargeFamilyDiscountLevel" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;enumeration value="1"/>
         *                         &lt;enumeration value="2"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="Taxes" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="TaxExempt" maxOccurs="9" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="TaxOverride" maxOccurs="9" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;attribute name="Amount" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                     &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                           &lt;/sequence>
         *                           &lt;attribute name="NoTax" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *                 &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="TimeQualifiers" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="ArrivalTime" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attribute name="NumHours">
         *                             &lt;simpleType>
         *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
         *                                 &lt;minInclusive value="0"/>
         *                                 &lt;maxInclusive value="72"/>
         *                               &lt;/restriction>
         *                             &lt;/simpleType>
         *                           &lt;/attribute>
         *                           &lt;attribute name="WindowAfter" type="{http://webservices.sabre.com/sabreXML/2011/10}shortTime" />
         *                           &lt;attribute name="WindowBefore" type="{http://webservices.sabre.com/sabreXML/2011/10}shortTime" />
         *                           &lt;attribute name="RPH">
         *                             &lt;simpleType>
         *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
         *                                 &lt;minInclusive value="0"/>
         *                               &lt;/restriction>
         *                             &lt;/simpleType>
         *                           &lt;/attribute>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="DepartureTime" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attribute name="WindowAfter" use="required" type="{http://webservices.sabre.com/sabreXML/2011/10}shortTime" />
         *                           &lt;attribute name="WindowBefore" use="required" type="{http://webservices.sabre.com/sabreXML/2011/10}shortTime" />
         *                           &lt;attribute name="RPH">
         *                             &lt;simpleType>
         *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
         *                                 &lt;minInclusive value="0"/>
         *                               &lt;/restriction>
         *                             &lt;/simpleType>
         *                           &lt;/attribute>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *                 &lt;attribute name="NumHours">
         *                   &lt;simpleType>
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
         *                       &lt;minInclusive value="0"/>
         *                       &lt;maxInclusive value="9"/>
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
            "flightQualifiers",
            "miscQualifiers",
            "pricingQualifiers",
            "timeQualifiers"
        })
        public static class OptionalQualifiers {

            @XmlElement(name = "FlightQualifiers")
            protected OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.FlightQualifiers flightQualifiers;
            @XmlElement(name = "MiscQualifiers")
            protected OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.MiscQualifiers miscQualifiers;
            @XmlElement(name = "PricingQualifiers", required = true)
            protected OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers pricingQualifiers;
            @XmlElement(name = "TimeQualifiers")
            protected OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.TimeQualifiers timeQualifiers;

            /**
             * Gets the value of the flightQualifiers property.
             * 
             * @return
             *     possible object is
             *     {@link OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.FlightQualifiers }
             *     
             */
            public OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.FlightQualifiers getFlightQualifiers() {
                return flightQualifiers;
            }

            /**
             * Sets the value of the flightQualifiers property.
             * 
             * @param value
             *     allowed object is
             *     {@link OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.FlightQualifiers }
             *     
             */
            public void setFlightQualifiers(OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.FlightQualifiers value) {
                this.flightQualifiers = value;
            }

            /**
             * Gets the value of the miscQualifiers property.
             * 
             * @return
             *     possible object is
             *     {@link OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.MiscQualifiers }
             *     
             */
            public OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.MiscQualifiers getMiscQualifiers() {
                return miscQualifiers;
            }

            /**
             * Sets the value of the miscQualifiers property.
             * 
             * @param value
             *     allowed object is
             *     {@link OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.MiscQualifiers }
             *     
             */
            public void setMiscQualifiers(OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.MiscQualifiers value) {
                this.miscQualifiers = value;
            }

            /**
             * Gets the value of the pricingQualifiers property.
             * 
             * @return
             *     possible object is
             *     {@link OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers }
             *     
             */
            public OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers getPricingQualifiers() {
                return pricingQualifiers;
            }

            /**
             * Sets the value of the pricingQualifiers property.
             * 
             * @param value
             *     allowed object is
             *     {@link OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers }
             *     
             */
            public void setPricingQualifiers(OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers value) {
                this.pricingQualifiers = value;
            }

            /**
             * Gets the value of the timeQualifiers property.
             * 
             * @return
             *     possible object is
             *     {@link OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.TimeQualifiers }
             *     
             */
            public OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.TimeQualifiers getTimeQualifiers() {
                return timeQualifiers;
            }

            /**
             * Sets the value of the timeQualifiers property.
             * 
             * @param value
             *     allowed object is
             *     {@link OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.TimeQualifiers }
             *     
             */
            public void setTimeQualifiers(OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.TimeQualifiers value) {
                this.timeQualifiers = value;
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
             *         &lt;element name="AlternateAirports" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="AlternateAirportCities" maxOccurs="unbounded" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="AlternateLocation" maxOccurs="3">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;attribute name="LocationCode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                   &lt;/restriction>
             *                                 &lt;/complexContent>
             *                               &lt;/complexType>
             *                             &lt;/element>
             *                             &lt;element name="SpecifiedLocation">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;attribute name="LocationCode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                   &lt;/restriction>
             *                                 &lt;/complexContent>
             *                               &lt;/complexType>
             *                             &lt;/element>
             *                           &lt;/sequence>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="AlternateAirportMileage" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;attribute name="Number" use="required">
             *                             &lt;simpleType>
             *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
             *                                 &lt;minInclusive value="1"/>
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
             *         &lt;element name="LongConnections" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
             *                 &lt;attribute name="MCT_Override">
             *                   &lt;simpleType>
             *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
             *                       &lt;minInclusive value="780"/>
             *                       &lt;maxInclusive value="1439"/>
             *                     &lt;/restriction>
             *                   &lt;/simpleType>
             *                 &lt;/attribute>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="Routing" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="RoutingLeg" maxOccurs="unbounded">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="ConnectPoint" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
             *                             &lt;element name="InboundCarrier" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
             *                           &lt;/sequence>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                 &lt;/sequence>
             *                 &lt;attribute name="AddWildcards" type="{http://www.w3.org/2001/XMLSchema}boolean" />
             *                 &lt;attribute name="RPH" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="VendorPrefs" maxOccurs="2" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="Airline" maxOccurs="20">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                           &lt;attribute name="RPH">
             *                             &lt;simpleType>
             *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
             *                                 &lt;minInclusive value="0"/>
             *                               &lt;/restriction>
             *                             &lt;/simpleType>
             *                           &lt;/attribute>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                 &lt;/sequence>
             *                 &lt;attribute name="Exclude" type="{http://www.w3.org/2001/XMLSchema}boolean" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *       &lt;attribute name="AvailableFlightsOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" />
             *       &lt;attribute name="DisableJumpCabinLogic" type="{http://www.w3.org/2001/XMLSchema}boolean" />
             *       &lt;attribute name="NumStops">
             *         &lt;simpleType>
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
             *             &lt;minInclusive value="0"/>
             *           &lt;/restriction>
             *         &lt;/simpleType>
             *       &lt;/attribute>
             *       &lt;attribute name="OnlineOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "alternateAirports",
                "longConnections",
                "routing",
                "vendorPrefs"
            })
            public static class FlightQualifiers {

                @XmlElement(name = "AlternateAirports")
                protected OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.FlightQualifiers.AlternateAirports alternateAirports;
                @XmlElement(name = "LongConnections")
                protected OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.FlightQualifiers.LongConnections longConnections;
                @XmlElement(name = "Routing")
                protected List<OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.FlightQualifiers.Routing> routing;
                @XmlElement(name = "VendorPrefs")
                protected List<OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.FlightQualifiers.VendorPrefs> vendorPrefs;
                @XmlAttribute(name = "AvailableFlightsOnly")
                protected Boolean availableFlightsOnly;
                @XmlAttribute(name = "DisableJumpCabinLogic")
                protected Boolean disableJumpCabinLogic;
                @XmlAttribute(name = "NumStops")
                protected BigInteger numStops;
                @XmlAttribute(name = "OnlineOnly")
                protected Boolean onlineOnly;

                /**
                 * Gets the value of the alternateAirports property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.FlightQualifiers.AlternateAirports }
                 *     
                 */
                public OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.FlightQualifiers.AlternateAirports getAlternateAirports() {
                    return alternateAirports;
                }

                /**
                 * Sets the value of the alternateAirports property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.FlightQualifiers.AlternateAirports }
                 *     
                 */
                public void setAlternateAirports(OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.FlightQualifiers.AlternateAirports value) {
                    this.alternateAirports = value;
                }

                /**
                 * Gets the value of the longConnections property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.FlightQualifiers.LongConnections }
                 *     
                 */
                public OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.FlightQualifiers.LongConnections getLongConnections() {
                    return longConnections;
                }

                /**
                 * Sets the value of the longConnections property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.FlightQualifiers.LongConnections }
                 *     
                 */
                public void setLongConnections(OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.FlightQualifiers.LongConnections value) {
                    this.longConnections = value;
                }

                /**
                 * Gets the value of the routing property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the routing property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getRouting().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.FlightQualifiers.Routing }
                 * 
                 * 
                 */
                public List<OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.FlightQualifiers.Routing> getRouting() {
                    if (routing == null) {
                        routing = new ArrayList<OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.FlightQualifiers.Routing>();
                    }
                    return this.routing;
                }

                /**
                 * Gets the value of the vendorPrefs property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the vendorPrefs property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getVendorPrefs().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.FlightQualifiers.VendorPrefs }
                 * 
                 * 
                 */
                public List<OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.FlightQualifiers.VendorPrefs> getVendorPrefs() {
                    if (vendorPrefs == null) {
                        vendorPrefs = new ArrayList<OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.FlightQualifiers.VendorPrefs>();
                    }
                    return this.vendorPrefs;
                }

                /**
                 * Gets the value of the availableFlightsOnly property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                public Boolean isAvailableFlightsOnly() {
                    return availableFlightsOnly;
                }

                /**
                 * Sets the value of the availableFlightsOnly property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                public void setAvailableFlightsOnly(Boolean value) {
                    this.availableFlightsOnly = value;
                }

                /**
                 * Gets the value of the disableJumpCabinLogic property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                public Boolean isDisableJumpCabinLogic() {
                    return disableJumpCabinLogic;
                }

                /**
                 * Sets the value of the disableJumpCabinLogic property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                public void setDisableJumpCabinLogic(Boolean value) {
                    this.disableJumpCabinLogic = value;
                }

                /**
                 * Gets the value of the numStops property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getNumStops() {
                    return numStops;
                }

                /**
                 * Sets the value of the numStops property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setNumStops(BigInteger value) {
                    this.numStops = value;
                }

                /**
                 * Gets the value of the onlineOnly property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                public Boolean isOnlineOnly() {
                    return onlineOnly;
                }

                /**
                 * Sets the value of the onlineOnly property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                public void setOnlineOnly(Boolean value) {
                    this.onlineOnly = value;
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
                 *         &lt;element name="AlternateAirportCities" maxOccurs="unbounded" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="AlternateLocation" maxOccurs="3">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;attribute name="LocationCode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                         &lt;/restriction>
                 *                       &lt;/complexContent>
                 *                     &lt;/complexType>
                 *                   &lt;/element>
                 *                   &lt;element name="SpecifiedLocation">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;attribute name="LocationCode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                         &lt;/restriction>
                 *                       &lt;/complexContent>
                 *                     &lt;/complexType>
                 *                   &lt;/element>
                 *                 &lt;/sequence>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="AlternateAirportMileage" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;attribute name="Number" use="required">
                 *                   &lt;simpleType>
                 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
                 *                       &lt;minInclusive value="1"/>
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
                    "alternateAirportCities",
                    "alternateAirportMileage"
                })
                public static class AlternateAirports {

                    @XmlElement(name = "AlternateAirportCities")
                    protected List<OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.FlightQualifiers.AlternateAirports.AlternateAirportCities> alternateAirportCities;
                    @XmlElement(name = "AlternateAirportMileage")
                    protected OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.FlightQualifiers.AlternateAirports.AlternateAirportMileage alternateAirportMileage;

                    /**
                     * Gets the value of the alternateAirportCities property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the alternateAirportCities property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getAlternateAirportCities().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.FlightQualifiers.AlternateAirports.AlternateAirportCities }
                     * 
                     * 
                     */
                    public List<OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.FlightQualifiers.AlternateAirports.AlternateAirportCities> getAlternateAirportCities() {
                        if (alternateAirportCities == null) {
                            alternateAirportCities = new ArrayList<OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.FlightQualifiers.AlternateAirports.AlternateAirportCities>();
                        }
                        return this.alternateAirportCities;
                    }

                    /**
                     * Gets the value of the alternateAirportMileage property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.FlightQualifiers.AlternateAirports.AlternateAirportMileage }
                     *     
                     */
                    public OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.FlightQualifiers.AlternateAirports.AlternateAirportMileage getAlternateAirportMileage() {
                        return alternateAirportMileage;
                    }

                    /**
                     * Sets the value of the alternateAirportMileage property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.FlightQualifiers.AlternateAirports.AlternateAirportMileage }
                     *     
                     */
                    public void setAlternateAirportMileage(OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.FlightQualifiers.AlternateAirports.AlternateAirportMileage value) {
                        this.alternateAirportMileage = value;
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
                     *         &lt;element name="AlternateLocation" maxOccurs="3">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;attribute name="LocationCode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *               &lt;/restriction>
                     *             &lt;/complexContent>
                     *           &lt;/complexType>
                     *         &lt;/element>
                     *         &lt;element name="SpecifiedLocation">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;attribute name="LocationCode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
                        "alternateLocation",
                        "specifiedLocation"
                    })
                    public static class AlternateAirportCities {

                        @XmlElement(name = "AlternateLocation", required = true)
                        protected List<OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.FlightQualifiers.AlternateAirports.AlternateAirportCities.AlternateLocation> alternateLocation;
                        @XmlElement(name = "SpecifiedLocation", required = true)
                        protected OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.FlightQualifiers.AlternateAirports.AlternateAirportCities.SpecifiedLocation specifiedLocation;

                        /**
                         * Gets the value of the alternateLocation property.
                         * 
                         * <p>
                         * This accessor method returns a reference to the live list,
                         * not a snapshot. Therefore any modification you make to the
                         * returned list will be present inside the JAXB object.
                         * This is why there is not a <CODE>set</CODE> method for the alternateLocation property.
                         * 
                         * <p>
                         * For example, to add a new item, do as follows:
                         * <pre>
                         *    getAlternateLocation().add(newItem);
                         * </pre>
                         * 
                         * 
                         * <p>
                         * Objects of the following type(s) are allowed in the list
                         * {@link OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.FlightQualifiers.AlternateAirports.AlternateAirportCities.AlternateLocation }
                         * 
                         * 
                         */
                        public List<OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.FlightQualifiers.AlternateAirports.AlternateAirportCities.AlternateLocation> getAlternateLocation() {
                            if (alternateLocation == null) {
                                alternateLocation = new ArrayList<OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.FlightQualifiers.AlternateAirports.AlternateAirportCities.AlternateLocation>();
                            }
                            return this.alternateLocation;
                        }

                        /**
                         * Gets the value of the specifiedLocation property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.FlightQualifiers.AlternateAirports.AlternateAirportCities.SpecifiedLocation }
                         *     
                         */
                        public OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.FlightQualifiers.AlternateAirports.AlternateAirportCities.SpecifiedLocation getSpecifiedLocation() {
                            return specifiedLocation;
                        }

                        /**
                         * Sets the value of the specifiedLocation property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.FlightQualifiers.AlternateAirports.AlternateAirportCities.SpecifiedLocation }
                         *     
                         */
                        public void setSpecifiedLocation(OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.FlightQualifiers.AlternateAirports.AlternateAirportCities.SpecifiedLocation value) {
                            this.specifiedLocation = value;
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
                        public static class AlternateLocation {

                            @XmlAttribute(name = "LocationCode", required = true)
                            protected String locationCode;

                            /**
                             * Gets the value of the locationCode property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getLocationCode() {
                                return locationCode;
                            }

                            /**
                             * Sets the value of the locationCode property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setLocationCode(String value) {
                                this.locationCode = value;
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
                        public static class SpecifiedLocation {

                            @XmlAttribute(name = "LocationCode", required = true)
                            protected String locationCode;

                            /**
                             * Gets the value of the locationCode property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getLocationCode() {
                                return locationCode;
                            }

                            /**
                             * Sets the value of the locationCode property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setLocationCode(String value) {
                                this.locationCode = value;
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
                     *       &lt;attribute name="Number" use="required">
                     *         &lt;simpleType>
                     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
                     *             &lt;minInclusive value="1"/>
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
                    public static class AlternateAirportMileage {

                        @XmlAttribute(name = "Number", required = true)
                        protected BigInteger number;

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
                 *       &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
                 *       &lt;attribute name="MCT_Override">
                 *         &lt;simpleType>
                 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
                 *             &lt;minInclusive value="780"/>
                 *             &lt;maxInclusive value="1439"/>
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
                public static class LongConnections {

                    @XmlAttribute(name = "Ind", required = true)
                    protected boolean ind;
                    @XmlAttribute(name = "MCT_Override")
                    protected Integer mctOverride;

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
                     * Gets the value of the mctOverride property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Integer }
                     *     
                     */
                    public Integer getMCTOverride() {
                        return mctOverride;
                    }

                    /**
                     * Sets the value of the mctOverride property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Integer }
                     *     
                     */
                    public void setMCTOverride(Integer value) {
                        this.mctOverride = value;
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
                 *         &lt;element name="RoutingLeg" maxOccurs="unbounded">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="ConnectPoint" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
                 *                   &lt;element name="InboundCarrier" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
                 *                 &lt;/sequence>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *       &lt;/sequence>
                 *       &lt;attribute name="AddWildcards" type="{http://www.w3.org/2001/XMLSchema}boolean" />
                 *       &lt;attribute name="RPH" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "routingLeg"
                })
                public static class Routing {

                    @XmlElement(name = "RoutingLeg", required = true)
                    protected List<OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.FlightQualifiers.Routing.RoutingLeg> routingLeg;
                    @XmlAttribute(name = "AddWildcards")
                    protected Boolean addWildcards;
                    @XmlAttribute(name = "RPH", required = true)
                    protected BigInteger rph;

                    /**
                     * Gets the value of the routingLeg property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the routingLeg property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getRoutingLeg().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.FlightQualifiers.Routing.RoutingLeg }
                     * 
                     * 
                     */
                    public List<OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.FlightQualifiers.Routing.RoutingLeg> getRoutingLeg() {
                        if (routingLeg == null) {
                            routingLeg = new ArrayList<OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.FlightQualifiers.Routing.RoutingLeg>();
                        }
                        return this.routingLeg;
                    }

                    /**
                     * Gets the value of the addWildcards property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Boolean }
                     *     
                     */
                    public Boolean isAddWildcards() {
                        return addWildcards;
                    }

                    /**
                     * Sets the value of the addWildcards property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Boolean }
                     *     
                     */
                    public void setAddWildcards(Boolean value) {
                        this.addWildcards = value;
                    }

                    /**
                     * Gets the value of the rph property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigInteger }
                     *     
                     */
                    public BigInteger getRPH() {
                        return rph;
                    }

                    /**
                     * Sets the value of the rph property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigInteger }
                     *     
                     */
                    public void setRPH(BigInteger value) {
                        this.rph = value;
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
                     *         &lt;element name="ConnectPoint" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
                     *         &lt;element name="InboundCarrier" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
                        "connectPoint",
                        "inboundCarrier"
                    })
                    public static class RoutingLeg {

                        @XmlElement(name = "ConnectPoint")
                        protected List<String> connectPoint;
                        @XmlElement(name = "InboundCarrier")
                        protected List<String> inboundCarrier;

                        /**
                         * Gets the value of the connectPoint property.
                         * 
                         * <p>
                         * This accessor method returns a reference to the live list,
                         * not a snapshot. Therefore any modification you make to the
                         * returned list will be present inside the JAXB object.
                         * This is why there is not a <CODE>set</CODE> method for the connectPoint property.
                         * 
                         * <p>
                         * For example, to add a new item, do as follows:
                         * <pre>
                         *    getConnectPoint().add(newItem);
                         * </pre>
                         * 
                         * 
                         * <p>
                         * Objects of the following type(s) are allowed in the list
                         * {@link String }
                         * 
                         * 
                         */
                        public List<String> getConnectPoint() {
                            if (connectPoint == null) {
                                connectPoint = new ArrayList<String>();
                            }
                            return this.connectPoint;
                        }

                        /**
                         * Gets the value of the inboundCarrier property.
                         * 
                         * <p>
                         * This accessor method returns a reference to the live list,
                         * not a snapshot. Therefore any modification you make to the
                         * returned list will be present inside the JAXB object.
                         * This is why there is not a <CODE>set</CODE> method for the inboundCarrier property.
                         * 
                         * <p>
                         * For example, to add a new item, do as follows:
                         * <pre>
                         *    getInboundCarrier().add(newItem);
                         * </pre>
                         * 
                         * 
                         * <p>
                         * Objects of the following type(s) are allowed in the list
                         * {@link String }
                         * 
                         * 
                         */
                        public List<String> getInboundCarrier() {
                            if (inboundCarrier == null) {
                                inboundCarrier = new ArrayList<String>();
                            }
                            return this.inboundCarrier;
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
                 *       &lt;sequence>
                 *         &lt;element name="Airline" maxOccurs="20">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                 &lt;attribute name="RPH">
                 *                   &lt;simpleType>
                 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
                 *                       &lt;minInclusive value="0"/>
                 *                     &lt;/restriction>
                 *                   &lt;/simpleType>
                 *                 &lt;/attribute>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *       &lt;/sequence>
                 *       &lt;attribute name="Exclude" type="{http://www.w3.org/2001/XMLSchema}boolean" />
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
                    protected List<OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.FlightQualifiers.VendorPrefs.Airline> airline;
                    @XmlAttribute(name = "Exclude")
                    protected Boolean exclude;

                    /**
                     * Gets the value of the airline property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the airline property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getAirline().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.FlightQualifiers.VendorPrefs.Airline }
                     * 
                     * 
                     */
                    public List<OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.FlightQualifiers.VendorPrefs.Airline> getAirline() {
                        if (airline == null) {
                            airline = new ArrayList<OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.FlightQualifiers.VendorPrefs.Airline>();
                        }
                        return this.airline;
                    }

                    /**
                     * Gets the value of the exclude property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Boolean }
                     *     
                     */
                    public Boolean isExclude() {
                        return exclude;
                    }

                    /**
                     * Sets the value of the exclude property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Boolean }
                     *     
                     */
                    public void setExclude(Boolean value) {
                        this.exclude = value;
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
                     *       &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *       &lt;attribute name="RPH">
                     *         &lt;simpleType>
                     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
                     *             &lt;minInclusive value="0"/>
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
                    public static class Airline {

                        @XmlAttribute(name = "Code", required = true)
                        protected String code;
                        @XmlAttribute(name = "RPH")
                        protected BigInteger rph;

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

                        /**
                         * Gets the value of the rph property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link BigInteger }
                         *     
                         */
                        public BigInteger getRPH() {
                            return rph;
                        }

                        /**
                         * Sets the value of the rph property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link BigInteger }
                         *     
                         */
                        public void setRPH(BigInteger value) {
                            this.rph = value;
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
             *       &lt;sequence>
             *         &lt;element name="AirExtras" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="CustLoyalty" maxOccurs="unbounded" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;attribute name="ProgramID" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                           &lt;attribute name="TierLevel" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="Qualifier" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
             *                 &lt;/sequence>
             *                 &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
             *                 &lt;attribute name="Summary" type="{http://www.w3.org/2001/XMLSchema}boolean" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="Indicators" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="MinMaxStay">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="RefundPenalty">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="ResTicketing">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="RetainFare">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="TravelPolicy">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="Priority" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="DirectFlights">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;attribute name="Priority" use="required">
             *                             &lt;simpleType>
             *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
             *                                 &lt;minInclusive value="1"/>
             *                                 &lt;maxInclusive value="4"/>
             *                               &lt;/restriction>
             *                             &lt;/simpleType>
             *                           &lt;/attribute>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="Price">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;attribute name="Priority" use="required">
             *                             &lt;simpleType>
             *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
             *                                 &lt;minInclusive value="1"/>
             *                                 &lt;maxInclusive value="4"/>
             *                               &lt;/restriction>
             *                             &lt;/simpleType>
             *                           &lt;/attribute>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="Time">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;attribute name="Priority" use="required">
             *                             &lt;simpleType>
             *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
             *                                 &lt;minInclusive value="1"/>
             *                                 &lt;maxInclusive value="4"/>
             *                               &lt;/restriction>
             *                             &lt;/simpleType>
             *                           &lt;/attribute>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="Vendor">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;attribute name="Priority" use="required">
             *                             &lt;simpleType>
             *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
             *                                 &lt;minInclusive value="1"/>
             *                                 &lt;maxInclusive value="4"/>
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
             *         &lt;element name="ValidInterlineTicket" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
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
                "airExtras",
                "indicators",
                "priority",
                "validInterlineTicket"
            })
            public static class MiscQualifiers {

                @XmlElement(name = "AirExtras")
                protected OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.MiscQualifiers.AirExtras airExtras;
                @XmlElement(name = "Indicators")
                protected OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.MiscQualifiers.Indicators indicators;
                @XmlElement(name = "Priority")
                protected OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.MiscQualifiers.Priority priority;
                @XmlElement(name = "ValidInterlineTicket")
                protected OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.MiscQualifiers.ValidInterlineTicket validInterlineTicket;

                /**
                 * Gets the value of the airExtras property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.MiscQualifiers.AirExtras }
                 *     
                 */
                public OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.MiscQualifiers.AirExtras getAirExtras() {
                    return airExtras;
                }

                /**
                 * Sets the value of the airExtras property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.MiscQualifiers.AirExtras }
                 *     
                 */
                public void setAirExtras(OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.MiscQualifiers.AirExtras value) {
                    this.airExtras = value;
                }

                /**
                 * Gets the value of the indicators property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.MiscQualifiers.Indicators }
                 *     
                 */
                public OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.MiscQualifiers.Indicators getIndicators() {
                    return indicators;
                }

                /**
                 * Sets the value of the indicators property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.MiscQualifiers.Indicators }
                 *     
                 */
                public void setIndicators(OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.MiscQualifiers.Indicators value) {
                    this.indicators = value;
                }

                /**
                 * Gets the value of the priority property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.MiscQualifiers.Priority }
                 *     
                 */
                public OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.MiscQualifiers.Priority getPriority() {
                    return priority;
                }

                /**
                 * Sets the value of the priority property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.MiscQualifiers.Priority }
                 *     
                 */
                public void setPriority(OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.MiscQualifiers.Priority value) {
                    this.priority = value;
                }

                /**
                 * Gets the value of the validInterlineTicket property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.MiscQualifiers.ValidInterlineTicket }
                 *     
                 */
                public OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.MiscQualifiers.ValidInterlineTicket getValidInterlineTicket() {
                    return validInterlineTicket;
                }

                /**
                 * Sets the value of the validInterlineTicket property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.MiscQualifiers.ValidInterlineTicket }
                 *     
                 */
                public void setValidInterlineTicket(OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.MiscQualifiers.ValidInterlineTicket value) {
                    this.validInterlineTicket = value;
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
                 *         &lt;element name="CustLoyalty" maxOccurs="unbounded" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;attribute name="ProgramID" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                 &lt;attribute name="TierLevel" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="Qualifier" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
                 *       &lt;/sequence>
                 *       &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
                 *       &lt;attribute name="Summary" type="{http://www.w3.org/2001/XMLSchema}boolean" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "custLoyalty",
                    "qualifier"
                })
                public static class AirExtras {

                    @XmlElement(name = "CustLoyalty")
                    protected List<OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.MiscQualifiers.AirExtras.CustLoyalty> custLoyalty;
                    @XmlElement(name = "Qualifier")
                    protected List<String> qualifier;
                    @XmlAttribute(name = "Ind", required = true)
                    protected boolean ind;
                    @XmlAttribute(name = "Summary")
                    protected Boolean summary;

                    /**
                     * Gets the value of the custLoyalty property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the custLoyalty property.
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
                     * {@link OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.MiscQualifiers.AirExtras.CustLoyalty }
                     * 
                     * 
                     */
                    public List<OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.MiscQualifiers.AirExtras.CustLoyalty> getCustLoyalty() {
                        if (custLoyalty == null) {
                            custLoyalty = new ArrayList<OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.MiscQualifiers.AirExtras.CustLoyalty>();
                        }
                        return this.custLoyalty;
                    }

                    /**
                     * Gets the value of the qualifier property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the qualifier property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getQualifier().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link String }
                     * 
                     * 
                     */
                    public List<String> getQualifier() {
                        if (qualifier == null) {
                            qualifier = new ArrayList<String>();
                        }
                        return this.qualifier;
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
                     * Gets the value of the summary property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Boolean }
                     *     
                     */
                    public Boolean isSummary() {
                        return summary;
                    }

                    /**
                     * Sets the value of the summary property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Boolean }
                     *     
                     */
                    public void setSummary(Boolean value) {
                        this.summary = value;
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
                     *       &lt;attribute name="ProgramID" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *       &lt;attribute name="TierLevel" type="{http://www.w3.org/2001/XMLSchema}string" />
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

                        @XmlAttribute(name = "ProgramID")
                        protected String programID;
                        @XmlAttribute(name = "TierLevel")
                        protected String tierLevel;

                        /**
                         * Gets the value of the programID property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getProgramID() {
                            return programID;
                        }

                        /**
                         * Sets the value of the programID property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setProgramID(String value) {
                            this.programID = value;
                        }

                        /**
                         * Gets the value of the tierLevel property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getTierLevel() {
                            return tierLevel;
                        }

                        /**
                         * Sets the value of the tierLevel property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setTierLevel(String value) {
                            this.tierLevel = value;
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
                 *       &lt;sequence>
                 *         &lt;element name="MinMaxStay">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="RefundPenalty">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="ResTicketing">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="RetainFare">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="TravelPolicy">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
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
                    "minMaxStay",
                    "refundPenalty",
                    "resTicketing",
                    "retainFare",
                    "travelPolicy"
                })
                public static class Indicators {

                    @XmlElement(name = "MinMaxStay", required = true)
                    protected OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.MiscQualifiers.Indicators.MinMaxStay minMaxStay;
                    @XmlElement(name = "RefundPenalty", required = true)
                    protected OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.MiscQualifiers.Indicators.RefundPenalty refundPenalty;
                    @XmlElement(name = "ResTicketing", required = true)
                    protected OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.MiscQualifiers.Indicators.ResTicketing resTicketing;
                    @XmlElement(name = "RetainFare", required = true)
                    protected OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.MiscQualifiers.Indicators.RetainFare retainFare;
                    @XmlElement(name = "TravelPolicy", required = true)
                    protected OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.MiscQualifiers.Indicators.TravelPolicy travelPolicy;

                    /**
                     * Gets the value of the minMaxStay property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.MiscQualifiers.Indicators.MinMaxStay }
                     *     
                     */
                    public OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.MiscQualifiers.Indicators.MinMaxStay getMinMaxStay() {
                        return minMaxStay;
                    }

                    /**
                     * Sets the value of the minMaxStay property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.MiscQualifiers.Indicators.MinMaxStay }
                     *     
                     */
                    public void setMinMaxStay(OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.MiscQualifiers.Indicators.MinMaxStay value) {
                        this.minMaxStay = value;
                    }

                    /**
                     * Gets the value of the refundPenalty property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.MiscQualifiers.Indicators.RefundPenalty }
                     *     
                     */
                    public OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.MiscQualifiers.Indicators.RefundPenalty getRefundPenalty() {
                        return refundPenalty;
                    }

                    /**
                     * Sets the value of the refundPenalty property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.MiscQualifiers.Indicators.RefundPenalty }
                     *     
                     */
                    public void setRefundPenalty(OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.MiscQualifiers.Indicators.RefundPenalty value) {
                        this.refundPenalty = value;
                    }

                    /**
                     * Gets the value of the resTicketing property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.MiscQualifiers.Indicators.ResTicketing }
                     *     
                     */
                    public OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.MiscQualifiers.Indicators.ResTicketing getResTicketing() {
                        return resTicketing;
                    }

                    /**
                     * Sets the value of the resTicketing property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.MiscQualifiers.Indicators.ResTicketing }
                     *     
                     */
                    public void setResTicketing(OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.MiscQualifiers.Indicators.ResTicketing value) {
                        this.resTicketing = value;
                    }

                    /**
                     * Gets the value of the retainFare property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.MiscQualifiers.Indicators.RetainFare }
                     *     
                     */
                    public OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.MiscQualifiers.Indicators.RetainFare getRetainFare() {
                        return retainFare;
                    }

                    /**
                     * Sets the value of the retainFare property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.MiscQualifiers.Indicators.RetainFare }
                     *     
                     */
                    public void setRetainFare(OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.MiscQualifiers.Indicators.RetainFare value) {
                        this.retainFare = value;
                    }

                    /**
                     * Gets the value of the travelPolicy property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.MiscQualifiers.Indicators.TravelPolicy }
                     *     
                     */
                    public OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.MiscQualifiers.Indicators.TravelPolicy getTravelPolicy() {
                        return travelPolicy;
                    }

                    /**
                     * Sets the value of the travelPolicy property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.MiscQualifiers.Indicators.TravelPolicy }
                     *     
                     */
                    public void setTravelPolicy(OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.MiscQualifiers.Indicators.TravelPolicy value) {
                        this.travelPolicy = value;
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
                    public static class MinMaxStay {

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
                    public static class RefundPenalty {

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
                    public static class ResTicketing {

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
                    public static class RetainFare {

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
                    public static class TravelPolicy {

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
                 *       &lt;sequence>
                 *         &lt;element name="DirectFlights">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;attribute name="Priority" use="required">
                 *                   &lt;simpleType>
                 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
                 *                       &lt;minInclusive value="1"/>
                 *                       &lt;maxInclusive value="4"/>
                 *                     &lt;/restriction>
                 *                   &lt;/simpleType>
                 *                 &lt;/attribute>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="Price">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;attribute name="Priority" use="required">
                 *                   &lt;simpleType>
                 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
                 *                       &lt;minInclusive value="1"/>
                 *                       &lt;maxInclusive value="4"/>
                 *                     &lt;/restriction>
                 *                   &lt;/simpleType>
                 *                 &lt;/attribute>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="Time">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;attribute name="Priority" use="required">
                 *                   &lt;simpleType>
                 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
                 *                       &lt;minInclusive value="1"/>
                 *                       &lt;maxInclusive value="4"/>
                 *                     &lt;/restriction>
                 *                   &lt;/simpleType>
                 *                 &lt;/attribute>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="Vendor">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;attribute name="Priority" use="required">
                 *                   &lt;simpleType>
                 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
                 *                       &lt;minInclusive value="1"/>
                 *                       &lt;maxInclusive value="4"/>
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
                    "directFlights",
                    "price",
                    "time",
                    "vendor"
                })
                public static class Priority {

                    @XmlElement(name = "DirectFlights", required = true)
                    protected OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.MiscQualifiers.Priority.DirectFlights directFlights;
                    @XmlElement(name = "Price", required = true)
                    protected OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.MiscQualifiers.Priority.Price price;
                    @XmlElement(name = "Time", required = true)
                    protected OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.MiscQualifiers.Priority.Time time;
                    @XmlElement(name = "Vendor", required = true)
                    protected OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.MiscQualifiers.Priority.Vendor vendor;

                    /**
                     * Gets the value of the directFlights property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.MiscQualifiers.Priority.DirectFlights }
                     *     
                     */
                    public OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.MiscQualifiers.Priority.DirectFlights getDirectFlights() {
                        return directFlights;
                    }

                    /**
                     * Sets the value of the directFlights property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.MiscQualifiers.Priority.DirectFlights }
                     *     
                     */
                    public void setDirectFlights(OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.MiscQualifiers.Priority.DirectFlights value) {
                        this.directFlights = value;
                    }

                    /**
                     * Gets the value of the price property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.MiscQualifiers.Priority.Price }
                     *     
                     */
                    public OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.MiscQualifiers.Priority.Price getPrice() {
                        return price;
                    }

                    /**
                     * Sets the value of the price property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.MiscQualifiers.Priority.Price }
                     *     
                     */
                    public void setPrice(OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.MiscQualifiers.Priority.Price value) {
                        this.price = value;
                    }

                    /**
                     * Gets the value of the time property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.MiscQualifiers.Priority.Time }
                     *     
                     */
                    public OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.MiscQualifiers.Priority.Time getTime() {
                        return time;
                    }

                    /**
                     * Sets the value of the time property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.MiscQualifiers.Priority.Time }
                     *     
                     */
                    public void setTime(OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.MiscQualifiers.Priority.Time value) {
                        this.time = value;
                    }

                    /**
                     * Gets the value of the vendor property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.MiscQualifiers.Priority.Vendor }
                     *     
                     */
                    public OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.MiscQualifiers.Priority.Vendor getVendor() {
                        return vendor;
                    }

                    /**
                     * Sets the value of the vendor property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.MiscQualifiers.Priority.Vendor }
                     *     
                     */
                    public void setVendor(OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.MiscQualifiers.Priority.Vendor value) {
                        this.vendor = value;
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
                     *       &lt;attribute name="Priority" use="required">
                     *         &lt;simpleType>
                     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
                     *             &lt;minInclusive value="1"/>
                     *             &lt;maxInclusive value="4"/>
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
                    public static class DirectFlights {

                        @XmlAttribute(name = "Priority", required = true)
                        protected int priority;

                        /**
                         * Gets the value of the priority property.
                         * 
                         */
                        public int getPriority() {
                            return priority;
                        }

                        /**
                         * Sets the value of the priority property.
                         * 
                         */
                        public void setPriority(int value) {
                            this.priority = value;
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
                     *       &lt;attribute name="Priority" use="required">
                     *         &lt;simpleType>
                     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
                     *             &lt;minInclusive value="1"/>
                     *             &lt;maxInclusive value="4"/>
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
                    public static class Price {

                        @XmlAttribute(name = "Priority", required = true)
                        protected int priority;

                        /**
                         * Gets the value of the priority property.
                         * 
                         */
                        public int getPriority() {
                            return priority;
                        }

                        /**
                         * Sets the value of the priority property.
                         * 
                         */
                        public void setPriority(int value) {
                            this.priority = value;
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
                     *       &lt;attribute name="Priority" use="required">
                     *         &lt;simpleType>
                     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
                     *             &lt;minInclusive value="1"/>
                     *             &lt;maxInclusive value="4"/>
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
                    public static class Time {

                        @XmlAttribute(name = "Priority", required = true)
                        protected int priority;

                        /**
                         * Gets the value of the priority property.
                         * 
                         */
                        public int getPriority() {
                            return priority;
                        }

                        /**
                         * Sets the value of the priority property.
                         * 
                         */
                        public void setPriority(int value) {
                            this.priority = value;
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
                     *       &lt;attribute name="Priority" use="required">
                     *         &lt;simpleType>
                     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
                     *             &lt;minInclusive value="1"/>
                     *             &lt;maxInclusive value="4"/>
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
                    public static class Vendor {

                        @XmlAttribute(name = "Priority", required = true)
                        protected int priority;

                        /**
                         * Gets the value of the priority property.
                         * 
                         */
                        public int getPriority() {
                            return priority;
                        }

                        /**
                         * Sets the value of the priority property.
                         * 
                         */
                        public void setPriority(int value) {
                            this.priority = value;
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
                public static class ValidInterlineTicket {

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
             *       &lt;sequence>
             *         &lt;element name="Account" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
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
             *                   &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
             *                 &lt;/sequence>
             *                 &lt;attribute name="Force" type="{http://www.w3.org/2001/XMLSchema}boolean" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="FareOptions" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="Private" type="{http://www.w3.org/2001/XMLSchema}boolean" />
             *                 &lt;attribute name="Public" type="{http://www.w3.org/2001/XMLSchema}boolean" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="PassengerStatus" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="CityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="CountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="StateCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                 &lt;/sequence>
             *                 &lt;attribute name="Type" use="required">
             *                   &lt;simpleType>
             *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                       &lt;enumeration value="E"/>
             *                       &lt;enumeration value="N"/>
             *                       &lt;enumeration value="R"/>
             *                     &lt;/restriction>
             *                   &lt;/simpleType>
             *                 &lt;/attribute>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="PassengerType" maxOccurs="4">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="Force" type="{http://www.w3.org/2001/XMLSchema}boolean" />
             *                 &lt;attribute name="Quantity" use="required">
             *                   &lt;simpleType>
             *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
             *                       &lt;minInclusive value="0"/>
             *                     &lt;/restriction>
             *                   &lt;/simpleType>
             *                 &lt;/attribute>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="PurchaseDate" type="{http://webservices.sabre.com/sabreXML/2011/10}fullDate" minOccurs="0"/>
             *         &lt;element name="SpanishLargeFamilyDiscountLevel" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;enumeration value="1"/>
             *               &lt;enumeration value="2"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="Taxes" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="TaxExempt" maxOccurs="9" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="TaxOverride" maxOccurs="9" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;attribute name="Amount" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                           &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                 &lt;/sequence>
             *                 &lt;attribute name="NoTax" type="{http://www.w3.org/2001/XMLSchema}boolean" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *       &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "account",
                "corporate",
                "fareOptions",
                "passengerStatus",
                "passengerType",
                "purchaseDate",
                "spanishLargeFamilyDiscountLevel",
                "taxes"
            })
            public static class PricingQualifiers {

                @XmlElement(name = "Account")
                protected OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.Account account;
                @XmlElement(name = "Corporate")
                protected OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.Corporate corporate;
                @XmlElement(name = "FareOptions")
                protected OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.FareOptions fareOptions;
                @XmlElement(name = "PassengerStatus")
                protected OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.PassengerStatus passengerStatus;
                @XmlElement(name = "PassengerType", required = true)
                protected List<OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.PassengerType> passengerType;
                @XmlElement(name = "PurchaseDate")
                protected XMLGregorianCalendar purchaseDate;
                @XmlElement(name = "SpanishLargeFamilyDiscountLevel")
                protected String spanishLargeFamilyDiscountLevel;
                @XmlElement(name = "Taxes")
                protected OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.Taxes taxes;
                @XmlAttribute(name = "CurrencyCode")
                protected String currencyCode;

                /**
                 * Gets the value of the account property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.Account }
                 *     
                 */
                public OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.Account getAccount() {
                    return account;
                }

                /**
                 * Sets the value of the account property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.Account }
                 *     
                 */
                public void setAccount(OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.Account value) {
                    this.account = value;
                }

                /**
                 * Gets the value of the corporate property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.Corporate }
                 *     
                 */
                public OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.Corporate getCorporate() {
                    return corporate;
                }

                /**
                 * Sets the value of the corporate property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.Corporate }
                 *     
                 */
                public void setCorporate(OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.Corporate value) {
                    this.corporate = value;
                }

                /**
                 * Gets the value of the fareOptions property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.FareOptions }
                 *     
                 */
                public OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.FareOptions getFareOptions() {
                    return fareOptions;
                }

                /**
                 * Sets the value of the fareOptions property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.FareOptions }
                 *     
                 */
                public void setFareOptions(OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.FareOptions value) {
                    this.fareOptions = value;
                }

                /**
                 * Gets the value of the passengerStatus property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.PassengerStatus }
                 *     
                 */
                public OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.PassengerStatus getPassengerStatus() {
                    return passengerStatus;
                }

                /**
                 * Sets the value of the passengerStatus property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.PassengerStatus }
                 *     
                 */
                public void setPassengerStatus(OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.PassengerStatus value) {
                    this.passengerStatus = value;
                }

                /**
                 * Gets the value of the passengerType property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the passengerType property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getPassengerType().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.PassengerType }
                 * 
                 * 
                 */
                public List<OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.PassengerType> getPassengerType() {
                    if (passengerType == null) {
                        passengerType = new ArrayList<OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.PassengerType>();
                    }
                    return this.passengerType;
                }
                
                public void setPassengerType(List<OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.PassengerType> passengerType) {
                    this.passengerType = passengerType;
                }

                /**
                 * Gets the value of the purchaseDate property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getPurchaseDate() {
                    return purchaseDate;
                }

                /**
                 * Sets the value of the purchaseDate property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setPurchaseDate(XMLGregorianCalendar value) {
                    this.purchaseDate = value;
                }

                /**
                 * Gets the value of the spanishLargeFamilyDiscountLevel property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSpanishLargeFamilyDiscountLevel() {
                    return spanishLargeFamilyDiscountLevel;
                }

                /**
                 * Sets the value of the spanishLargeFamilyDiscountLevel property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSpanishLargeFamilyDiscountLevel(String value) {
                    this.spanishLargeFamilyDiscountLevel = value;
                }

                /**
                 * Gets the value of the taxes property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.Taxes }
                 *     
                 */
                public OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.Taxes getTaxes() {
                    return taxes;
                }

                /**
                 * Sets the value of the taxes property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.Taxes }
                 *     
                 */
                public void setTaxes(OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.Taxes value) {
                    this.taxes = value;
                }

                /**
                 * Gets the value of the currencyCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCurrencyCode() {
                    return currencyCode;
                }

                /**
                 * Sets the value of the currencyCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCurrencyCode(String value) {
                    this.currencyCode = value;
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
                 *         &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
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
                    "code"
                })
                public static class Account {

                    @XmlElement(name = "Code", required = true)
                    protected List<String> code;

                    /**
                     * Gets the value of the code property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the code property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getCode().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link String }
                     * 
                     * 
                     */
                    public List<String> getCode() {
                        if (code == null) {
                            code = new ArrayList<String>();
                        }
                        return this.code;
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
                 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
                 *       &lt;/sequence>
                 *       &lt;attribute name="Force" type="{http://www.w3.org/2001/XMLSchema}boolean" />
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
                    protected List<String> id;
                    @XmlAttribute(name = "Force")
                    protected Boolean force;

                    /**
                     * Gets the value of the id property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the id property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getID().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link String }
                     * 
                     * 
                     */
                    public List<String> getID() {
                        if (id == null) {
                            id = new ArrayList<String>();
                        }
                        return this.id;
                    }

                    /**
                     * Gets the value of the force property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Boolean }
                     *     
                     */
                    public Boolean isForce() {
                        return force;
                    }

                    /**
                     * Sets the value of the force property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Boolean }
                     *     
                     */
                    public void setForce(Boolean value) {
                        this.force = value;
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
                 *       &lt;attribute name="Private" type="{http://www.w3.org/2001/XMLSchema}boolean" />
                 *       &lt;attribute name="Public" type="{http://www.w3.org/2001/XMLSchema}boolean" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class FareOptions {

                    @XmlAttribute(name = "Private")
                    protected Boolean _private;
                    @XmlAttribute(name = "Public")
                    protected Boolean _public;

                    /**
                     * Gets the value of the private property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Boolean }
                     *     
                     */
                    public Boolean isPrivate() {
                        return _private;
                    }

                    /**
                     * Sets the value of the private property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Boolean }
                     *     
                     */
                    public void setPrivate(Boolean value) {
                        this._private = value;
                    }

                    /**
                     * Gets the value of the public property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Boolean }
                     *     
                     */
                    public Boolean isPublic() {
                        return _public;
                    }

                    /**
                     * Sets the value of the public property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Boolean }
                     *     
                     */
                    public void setPublic(Boolean value) {
                        this._public = value;
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
                 *         &lt;element name="CityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="CountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="StateCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *       &lt;/sequence>
                 *       &lt;attribute name="Type" use="required">
                 *         &lt;simpleType>
                 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *             &lt;enumeration value="E"/>
                 *             &lt;enumeration value="N"/>
                 *             &lt;enumeration value="R"/>
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
                    "cityCode",
                    "countryCode",
                    "stateCode"
                })
                public static class PassengerStatus {

                    @XmlElement(name = "CityCode")
                    protected String cityCode;
                    @XmlElement(name = "CountryCode")
                    protected String countryCode;
                    @XmlElement(name = "StateCode")
                    protected String stateCode;
                    @XmlAttribute(name = "Type", required = true)
                    protected String type;

                    /**
                     * Gets the value of the cityCode property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCityCode() {
                        return cityCode;
                    }

                    /**
                     * Sets the value of the cityCode property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCityCode(String value) {
                        this.cityCode = value;
                    }

                    /**
                     * Gets the value of the countryCode property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCountryCode() {
                        return countryCode;
                    }

                    /**
                     * Sets the value of the countryCode property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCountryCode(String value) {
                        this.countryCode = value;
                    }

                    /**
                     * Gets the value of the stateCode property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getStateCode() {
                        return stateCode;
                    }

                    /**
                     * Sets the value of the stateCode property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setStateCode(String value) {
                        this.stateCode = value;
                    }

                    /**
                     * Gets the value of the type property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getType() {
                        return type;
                    }

                    /**
                     * Sets the value of the type property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setType(String value) {
                        this.type = value;
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
                 *       &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="Force" type="{http://www.w3.org/2001/XMLSchema}boolean" />
                 *       &lt;attribute name="Quantity" use="required">
                 *         &lt;simpleType>
                 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
                 *             &lt;minInclusive value="0"/>
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
                public static class PassengerType {

                    @XmlAttribute(name = "Code", required = true)
                    protected String code;
                    @XmlAttribute(name = "Force")
                    protected Boolean force;
                    @XmlAttribute(name = "Quantity", required = true)
                    protected BigInteger quantity;

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

                    /**
                     * Gets the value of the force property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Boolean }
                     *     
                     */
                    public Boolean isForce() {
                        return force;
                    }

                    /**
                     * Sets the value of the force property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Boolean }
                     *     
                     */
                    public void setForce(Boolean value) {
                        this.force = value;
                    }

                    /**
                     * Gets the value of the quantity property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigInteger }
                     *     
                     */
                    public BigInteger getQuantity() {
                        return quantity;
                    }

                    /**
                     * Sets the value of the quantity property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigInteger }
                     *     
                     */
                    public void setQuantity(BigInteger value) {
                        this.quantity = value;
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
                 *         &lt;element name="TaxExempt" maxOccurs="9" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="TaxOverride" maxOccurs="9" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;attribute name="Amount" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                 &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *       &lt;/sequence>
                 *       &lt;attribute name="NoTax" type="{http://www.w3.org/2001/XMLSchema}boolean" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "taxExempt",
                    "taxOverride"
                })
                public static class Taxes {

                    @XmlElement(name = "TaxExempt")
                    protected List<OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.Taxes.TaxExempt> taxExempt;
                    @XmlElement(name = "TaxOverride")
                    protected List<OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.Taxes.TaxOverride> taxOverride;
                    @XmlAttribute(name = "NoTax")
                    protected Boolean noTax;

                    /**
                     * Gets the value of the taxExempt property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the taxExempt property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getTaxExempt().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.Taxes.TaxExempt }
                     * 
                     * 
                     */
                    public List<OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.Taxes.TaxExempt> getTaxExempt() {
                        if (taxExempt == null) {
                            taxExempt = new ArrayList<OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.Taxes.TaxExempt>();
                        }
                        return this.taxExempt;
                    }

                    /**
                     * Gets the value of the taxOverride property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the taxOverride property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getTaxOverride().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.Taxes.TaxOverride }
                     * 
                     * 
                     */
                    public List<OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.Taxes.TaxOverride> getTaxOverride() {
                        if (taxOverride == null) {
                            taxOverride = new ArrayList<OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.Taxes.TaxOverride>();
                        }
                        return this.taxOverride;
                    }

                    /**
                     * Gets the value of the noTax property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Boolean }
                     *     
                     */
                    public Boolean isNoTax() {
                        return noTax;
                    }

                    /**
                     * Sets the value of the noTax property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Boolean }
                     *     
                     */
                    public void setNoTax(Boolean value) {
                        this.noTax = value;
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
                    public static class TaxExempt {

                        @XmlAttribute(name = "Code", required = true)
                        protected String code;

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


                    /**
                     * <p>Java class for anonymous complex type.
                     * 
                     * <p>The following schema fragment specifies the expected content contained within this class.
                     * 
                     * <pre>
                     * &lt;complexType>
                     *   &lt;complexContent>
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *       &lt;attribute name="Amount" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
                    public static class TaxOverride {

                        @XmlAttribute(name = "Amount", required = true)
                        protected String amount;
                        @XmlAttribute(name = "Code", required = true)
                        protected String code;

                        /**
                         * Gets the value of the amount property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getAmount() {
                            return amount;
                        }

                        /**
                         * Sets the value of the amount property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setAmount(String value) {
                            this.amount = value;
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
             *         &lt;element name="ArrivalTime" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="NumHours">
             *                   &lt;simpleType>
             *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
             *                       &lt;minInclusive value="0"/>
             *                       &lt;maxInclusive value="72"/>
             *                     &lt;/restriction>
             *                   &lt;/simpleType>
             *                 &lt;/attribute>
             *                 &lt;attribute name="WindowAfter" type="{http://webservices.sabre.com/sabreXML/2011/10}shortTime" />
             *                 &lt;attribute name="WindowBefore" type="{http://webservices.sabre.com/sabreXML/2011/10}shortTime" />
             *                 &lt;attribute name="RPH">
             *                   &lt;simpleType>
             *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
             *                       &lt;minInclusive value="0"/>
             *                     &lt;/restriction>
             *                   &lt;/simpleType>
             *                 &lt;/attribute>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="DepartureTime" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="WindowAfter" use="required" type="{http://webservices.sabre.com/sabreXML/2011/10}shortTime" />
             *                 &lt;attribute name="WindowBefore" use="required" type="{http://webservices.sabre.com/sabreXML/2011/10}shortTime" />
             *                 &lt;attribute name="RPH">
             *                   &lt;simpleType>
             *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
             *                       &lt;minInclusive value="0"/>
             *                     &lt;/restriction>
             *                   &lt;/simpleType>
             *                 &lt;/attribute>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *       &lt;attribute name="NumHours">
             *         &lt;simpleType>
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
             *             &lt;minInclusive value="0"/>
             *             &lt;maxInclusive value="9"/>
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
                "arrivalTime",
                "departureTime"
            })
            public static class TimeQualifiers {

                @XmlElement(name = "ArrivalTime")
                protected List<OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.TimeQualifiers.ArrivalTime> arrivalTime;
                @XmlElement(name = "DepartureTime")
                protected List<OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.TimeQualifiers.DepartureTime> departureTime;
                @XmlAttribute(name = "NumHours")
                protected Integer numHours;

                /**
                 * Gets the value of the arrivalTime property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the arrivalTime property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getArrivalTime().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.TimeQualifiers.ArrivalTime }
                 * 
                 * 
                 */
                public List<OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.TimeQualifiers.ArrivalTime> getArrivalTime() {
                    if (arrivalTime == null) {
                        arrivalTime = new ArrayList<OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.TimeQualifiers.ArrivalTime>();
                    }
                    return this.arrivalTime;
                }

                /**
                 * Gets the value of the departureTime property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the departureTime property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getDepartureTime().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.TimeQualifiers.DepartureTime }
                 * 
                 * 
                 */
                public List<OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.TimeQualifiers.DepartureTime> getDepartureTime() {
                    if (departureTime == null) {
                        departureTime = new ArrayList<OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.TimeQualifiers.DepartureTime>();
                    }
                    return this.departureTime;
                }

                /**
                 * Gets the value of the numHours property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public Integer getNumHours() {
                    return numHours;
                }

                /**
                 * Sets the value of the numHours property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setNumHours(Integer value) {
                    this.numHours = value;
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
                 *       &lt;attribute name="NumHours">
                 *         &lt;simpleType>
                 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
                 *             &lt;minInclusive value="0"/>
                 *             &lt;maxInclusive value="72"/>
                 *           &lt;/restriction>
                 *         &lt;/simpleType>
                 *       &lt;/attribute>
                 *       &lt;attribute name="WindowAfter" type="{http://webservices.sabre.com/sabreXML/2011/10}shortTime" />
                 *       &lt;attribute name="WindowBefore" type="{http://webservices.sabre.com/sabreXML/2011/10}shortTime" />
                 *       &lt;attribute name="RPH">
                 *         &lt;simpleType>
                 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
                 *             &lt;minInclusive value="0"/>
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
                public static class ArrivalTime {

                    @XmlAttribute(name = "NumHours")
                    protected Integer numHours;
                    @XmlAttribute(name = "WindowAfter")
                    protected String windowAfter;
                    @XmlAttribute(name = "WindowBefore")
                    protected String windowBefore;
                    @XmlAttribute(name = "RPH")
                    protected BigInteger rph;

                    /**
                     * Gets the value of the numHours property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Integer }
                     *     
                     */
                    public Integer getNumHours() {
                        return numHours;
                    }

                    /**
                     * Sets the value of the numHours property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Integer }
                     *     
                     */
                    public void setNumHours(Integer value) {
                        this.numHours = value;
                    }

                    /**
                     * Gets the value of the windowAfter property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getWindowAfter() {
                        return windowAfter;
                    }

                    /**
                     * Sets the value of the windowAfter property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setWindowAfter(String value) {
                        this.windowAfter = value;
                    }

                    /**
                     * Gets the value of the windowBefore property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getWindowBefore() {
                        return windowBefore;
                    }

                    /**
                     * Sets the value of the windowBefore property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setWindowBefore(String value) {
                        this.windowBefore = value;
                    }

                    /**
                     * Gets the value of the rph property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigInteger }
                     *     
                     */
                    public BigInteger getRPH() {
                        return rph;
                    }

                    /**
                     * Sets the value of the rph property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigInteger }
                     *     
                     */
                    public void setRPH(BigInteger value) {
                        this.rph = value;
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
                 *       &lt;attribute name="WindowAfter" use="required" type="{http://webservices.sabre.com/sabreXML/2011/10}shortTime" />
                 *       &lt;attribute name="WindowBefore" use="required" type="{http://webservices.sabre.com/sabreXML/2011/10}shortTime" />
                 *       &lt;attribute name="RPH">
                 *         &lt;simpleType>
                 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
                 *             &lt;minInclusive value="0"/>
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
                public static class DepartureTime {

                    @XmlAttribute(name = "WindowAfter", required = true)
                    protected String windowAfter;
                    @XmlAttribute(name = "WindowBefore", required = true)
                    protected String windowBefore;
                    @XmlAttribute(name = "RPH")
                    protected BigInteger rph;

                    /**
                     * Gets the value of the windowAfter property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getWindowAfter() {
                        return windowAfter;
                    }

                    /**
                     * Sets the value of the windowAfter property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setWindowAfter(String value) {
                        this.windowAfter = value;
                    }

                    /**
                     * Gets the value of the windowBefore property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getWindowBefore() {
                        return windowBefore;
                    }

                    /**
                     * Sets the value of the windowBefore property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setWindowBefore(String value) {
                        this.windowBefore = value;
                    }

                    /**
                     * Gets the value of the rph property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigInteger }
                     *     
                     */
                    public BigInteger getRPH() {
                        return rph;
                    }

                    /**
                     * Sets the value of the rph property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigInteger }
                     *     
                     */
                    public void setRPH(BigInteger value) {
                        this.rph = value;
                    }

                }

            }

        }

    }

}
