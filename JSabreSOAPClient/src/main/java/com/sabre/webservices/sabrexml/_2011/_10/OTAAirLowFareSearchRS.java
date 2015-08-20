
package com.sabre.webservices.sabrexml._2011._10;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
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
 *         &lt;element name="PricedItineraries" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PricedItinerary" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="AirItineraryPricingInfo" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="AncillaryFees" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="AncillaryFeeGroup" maxOccurs="unbounded" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="AncillaryFeeItem" maxOccurs="unbounded" minOccurs="0">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                   &lt;attribute name="Carrier" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                   &lt;attribute name="Date" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                   &lt;attribute name="Description" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                   &lt;attribute name="DestinationAirport" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                   &lt;attribute name="EndSegment" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                   &lt;attribute name="OriginAirport" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                   &lt;attribute name="PassengerCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                   &lt;attribute name="StartSegment" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                 &lt;/restriction>
 *                                                               &lt;/complexContent>
 *                                                             &lt;/complexType>
 *                                                           &lt;/element>
 *                                                         &lt;/sequence>
 *                                                         &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                         &lt;attribute name="Message" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                         &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                               &lt;attribute name="Message" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="FareCalculation" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="ItinTotalFare" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="BaseFare" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                         &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="Commission" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                         &lt;attribute name="Percent" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="EquivFare" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                         &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="Taxes" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="Tax" maxOccurs="unbounded" minOccurs="0">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                   &lt;attribute name="TaxCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                   &lt;attribute name="TaxName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                 &lt;/restriction>
 *                                                               &lt;/complexContent>
 *                                                             &lt;/complexType>
 *                                                           &lt;/element>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="TotalFare" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                         &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="Warnings" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="Warning" maxOccurs="unbounded" minOccurs="0">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;attribute name="ShortText" type="{http://www.w3.org/2001/XMLSchema}string" />
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
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="PassengerTypeQuantity" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="Group" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="Quantity" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="PTC_FareBreakdown" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="FareBasis" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                         &lt;attribute name="CorporateID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                         &lt;attribute name="FarePassengerType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                         &lt;attribute name="FareType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                         &lt;attribute name="GlobalInd" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                         &lt;attribute name="Market" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                         &lt;attribute name="PrivateFareInd" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                         &lt;attribute name="TicketDesignator" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="Surcharges" maxOccurs="unbounded" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;simpleContent>
 *                                                       &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                                         &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                         &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                       &lt;/extension>
 *                                                     &lt;/simpleContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="TicketingFees" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="FeeInformation" maxOccurs="unbounded" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}string" />
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
 *                             &lt;element name="HeaderInformation" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="LastTicketingDate" type="{http://webservices.sabre.com/sabreXML/2011/10}dateOrTime" minOccurs="0"/>
 *                                       &lt;element name="SpanishLargeFamilyDiscountLevel" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                                       &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                                       &lt;element name="ValidInterline" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="ValidatingCarrier" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="OriginDestinationOption" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="FlightSegment" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="DestinationLocation" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;attribute name="LocationCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="DisclosureAirline" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="Equipment" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;attribute name="AirEquipType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="FlightDetails" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;attribute name="TrafficRestrictionCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="IntermediatePointInfo" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="FlightSegment" maxOccurs="unbounded" minOccurs="0">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;sequence>
 *                                                                     &lt;element name="Equipment" minOccurs="0">
 *                                                                       &lt;complexType>
 *                                                                         &lt;complexContent>
 *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                             &lt;attribute name="AirEquipType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                           &lt;/restriction>
 *                                                                         &lt;/complexContent>
 *                                                                       &lt;/complexType>
 *                                                                     &lt;/element>
 *                                                                     &lt;element name="IntermediateLocation" minOccurs="0">
 *                                                                       &lt;complexType>
 *                                                                         &lt;complexContent>
 *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                             &lt;attribute name="LocationCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                           &lt;/restriction>
 *                                                                         &lt;/complexContent>
 *                                                                       &lt;/complexType>
 *                                                                     &lt;/element>
 *                                                                   &lt;/sequence>
 *                                                                   &lt;attribute name="ArrivalDateTime" type="{http://webservices.sabre.com/sabreXML/2011/10}dateTime" />
 *                                                                   &lt;attribute name="DepartureDateTime" type="{http://webservices.sabre.com/sabreXML/2011/10}dateTime" />
 *                                                                   &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                   &lt;attribute name="ElapsedTime" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                   &lt;attribute name="IntermediateTimeZone" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                   &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                 &lt;/restriction>
 *                                                               &lt;/complexContent>
 *                                                             &lt;/complexType>
 *                                                           &lt;/element>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="MarketingAirline" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                         &lt;attribute name="FlightNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="MarriageGrp" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="Meal" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;attribute name="MealCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="OperatingAirline" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                         &lt;attribute name="CompanyShortName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="OriginLocation" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;attribute name="LocationCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                               &lt;attribute name="ArrivalDateTime" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="ConnectionInd" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="DepartureDateTime" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="DestinationTimeZone" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="DivideInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                               &lt;attribute name="ElapsedTime" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="eTicket" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                               &lt;attribute name="FlightNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="MarketingCabin" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="OnTimeRate" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="OnTimePercent" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="OriginTimeZone" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="ResBookDesigCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="SmokingAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                               &lt;attribute name="StopQuantity" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="CustomizeRoutingOption" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="TotalAmount" type="{http://www.w3.org/2001/XMLSchema}string" />
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
 *       &lt;attribute name="Version" type="{http://www.w3.org/2001/XMLSchema}string" fixed="2.3.0" />
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
    "pricedItineraries"
})
@XmlRootElement(name = "OTA_AirLowFareSearchRS")
public class OTAAirLowFareSearchRS {

    @XmlElement(name = "ApplicationResults", namespace = "http://services.sabre.com/STL/v01", required = true)
    protected ApplicationResults applicationResults;
    @XmlElement(name = "PricedItineraries")
    protected OTAAirLowFareSearchRS.PricedItineraries pricedItineraries;
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
     * Gets the value of the pricedItineraries property.
     * 
     * @return
     *     possible object is
     *     {@link OTAAirLowFareSearchRS.PricedItineraries }
     *     
     */
    public OTAAirLowFareSearchRS.PricedItineraries getPricedItineraries() {
        return pricedItineraries;
    }

    /**
     * Sets the value of the pricedItineraries property.
     * 
     * @param value
     *     allowed object is
     *     {@link OTAAirLowFareSearchRS.PricedItineraries }
     *     
     */
    public void setPricedItineraries(OTAAirLowFareSearchRS.PricedItineraries value) {
        this.pricedItineraries = value;
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
     *         &lt;element name="PricedItinerary" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="AirItineraryPricingInfo" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="AncillaryFees" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="AncillaryFeeGroup" maxOccurs="unbounded" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="AncillaryFeeItem" maxOccurs="unbounded" minOccurs="0">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                         &lt;attribute name="Carrier" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                         &lt;attribute name="Date" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                         &lt;attribute name="Description" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                         &lt;attribute name="DestinationAirport" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                         &lt;attribute name="EndSegment" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                         &lt;attribute name="OriginAirport" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                         &lt;attribute name="PassengerCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                         &lt;attribute name="StartSegment" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                       &lt;/restriction>
     *                                                     &lt;/complexContent>
     *                                                   &lt;/complexType>
     *                                                 &lt;/element>
     *                                               &lt;/sequence>
     *                                               &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                               &lt;attribute name="Message" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                               &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                     &lt;attribute name="Message" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="FareCalculation" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="ItinTotalFare" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="BaseFare" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                               &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="Commission" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                               &lt;attribute name="Percent" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="EquivFare" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                               &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="Taxes" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="Tax" maxOccurs="unbounded" minOccurs="0">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                         &lt;attribute name="TaxCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                         &lt;attribute name="TaxName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                       &lt;/restriction>
     *                                                     &lt;/complexContent>
     *                                                   &lt;/complexType>
     *                                                 &lt;/element>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="TotalFare" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                               &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="Warnings" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="Warning" maxOccurs="unbounded" minOccurs="0">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;attribute name="ShortText" type="{http://www.w3.org/2001/XMLSchema}string" />
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
     *                             &lt;element name="PassengerTypeQuantity" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="Group" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="Quantity" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="PTC_FareBreakdown" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="FareBasis" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                               &lt;attribute name="CorporateID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                               &lt;attribute name="FarePassengerType" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                               &lt;attribute name="FareType" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                               &lt;attribute name="GlobalInd" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                               &lt;attribute name="Market" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                               &lt;attribute name="PrivateFareInd" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                               &lt;attribute name="TicketDesignator" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="Surcharges" maxOccurs="unbounded" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;simpleContent>
     *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                                               &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                               &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                             &lt;/extension>
     *                                           &lt;/simpleContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="TicketingFees" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="FeeInformation" maxOccurs="unbounded" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}string" />
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
     *                   &lt;element name="HeaderInformation" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="LastTicketingDate" type="{http://webservices.sabre.com/sabreXML/2011/10}dateOrTime" minOccurs="0"/>
     *                             &lt;element name="SpanishLargeFamilyDiscountLevel" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
     *                             &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
     *                             &lt;element name="ValidInterline" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="ValidatingCarrier" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="OriginDestinationOption" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="FlightSegment" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="DestinationLocation" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;attribute name="LocationCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="DisclosureAirline" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="Equipment" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;attribute name="AirEquipType" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="FlightDetails" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;attribute name="TrafficRestrictionCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="IntermediatePointInfo" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="FlightSegment" maxOccurs="unbounded" minOccurs="0">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;sequence>
     *                                                           &lt;element name="Equipment" minOccurs="0">
     *                                                             &lt;complexType>
     *                                                               &lt;complexContent>
     *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                   &lt;attribute name="AirEquipType" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                                 &lt;/restriction>
     *                                                               &lt;/complexContent>
     *                                                             &lt;/complexType>
     *                                                           &lt;/element>
     *                                                           &lt;element name="IntermediateLocation" minOccurs="0">
     *                                                             &lt;complexType>
     *                                                               &lt;complexContent>
     *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                   &lt;attribute name="LocationCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                                 &lt;/restriction>
     *                                                               &lt;/complexContent>
     *                                                             &lt;/complexType>
     *                                                           &lt;/element>
     *                                                         &lt;/sequence>
     *                                                         &lt;attribute name="ArrivalDateTime" type="{http://webservices.sabre.com/sabreXML/2011/10}dateTime" />
     *                                                         &lt;attribute name="DepartureDateTime" type="{http://webservices.sabre.com/sabreXML/2011/10}dateTime" />
     *                                                         &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                         &lt;attribute name="ElapsedTime" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                         &lt;attribute name="IntermediateTimeZone" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                         &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                       &lt;/restriction>
     *                                                     &lt;/complexContent>
     *                                                   &lt;/complexType>
     *                                                 &lt;/element>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="MarketingAirline" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                               &lt;attribute name="FlightNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="MarriageGrp" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="Meal" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;attribute name="MealCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="OperatingAirline" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                               &lt;attribute name="CompanyShortName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="OriginLocation" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;attribute name="LocationCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                     &lt;attribute name="ArrivalDateTime" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="ConnectionInd" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="DepartureDateTime" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="DestinationTimeZone" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="DivideInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                                     &lt;attribute name="ElapsedTime" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="eTicket" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                                     &lt;attribute name="FlightNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="MarketingCabin" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="OnTimeRate" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="OnTimePercent" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="OriginTimeZone" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="ResBookDesigCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="SmokingAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                                     &lt;attribute name="StopQuantity" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                           &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="CustomizeRoutingOption" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="TotalAmount" type="{http://www.w3.org/2001/XMLSchema}string" />
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
        "pricedItinerary"
    })
    public static class PricedItineraries {

        @XmlElement(name = "PricedItinerary")
        protected List<OTAAirLowFareSearchRS.PricedItineraries.PricedItinerary> pricedItinerary;

        /**
         * Gets the value of the pricedItinerary property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pricedItinerary property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPricedItinerary().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link OTAAirLowFareSearchRS.PricedItineraries.PricedItinerary }
         * 
         * 
         */
        public List<OTAAirLowFareSearchRS.PricedItineraries.PricedItinerary> getPricedItinerary() {
            if (pricedItinerary == null) {
                pricedItinerary = new ArrayList<OTAAirLowFareSearchRS.PricedItineraries.PricedItinerary>();
            }
            return this.pricedItinerary;
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
         *         &lt;element name="AirItineraryPricingInfo" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="AncillaryFees" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="AncillaryFeeGroup" maxOccurs="unbounded" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="AncillaryFeeItem" maxOccurs="unbounded" minOccurs="0">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                               &lt;attribute name="Carrier" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                               &lt;attribute name="Date" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                               &lt;attribute name="Description" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                               &lt;attribute name="DestinationAirport" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                               &lt;attribute name="EndSegment" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                               &lt;attribute name="OriginAirport" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                               &lt;attribute name="PassengerCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                               &lt;attribute name="StartSegment" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                             &lt;/restriction>
         *                                           &lt;/complexContent>
         *                                         &lt;/complexType>
         *                                       &lt;/element>
         *                                     &lt;/sequence>
         *                                     &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                     &lt;attribute name="Message" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                     &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                           &lt;/sequence>
         *                           &lt;attribute name="Message" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="FareCalculation" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="ItinTotalFare" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="BaseFare" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                     &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="Commission" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                     &lt;attribute name="Percent" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="EquivFare" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                     &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="Taxes" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="Tax" maxOccurs="unbounded" minOccurs="0">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                               &lt;attribute name="TaxCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                               &lt;attribute name="TaxName" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                             &lt;/restriction>
         *                                           &lt;/complexContent>
         *                                         &lt;/complexType>
         *                                       &lt;/element>
         *                                     &lt;/sequence>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="TotalFare" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                     &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="Warnings" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="Warning" maxOccurs="unbounded" minOccurs="0">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;attribute name="ShortText" type="{http://www.w3.org/2001/XMLSchema}string" />
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
         *                   &lt;element name="PassengerTypeQuantity" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="Group" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="Quantity" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="PTC_FareBreakdown" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="FareBasis" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                     &lt;attribute name="CorporateID" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                     &lt;attribute name="FarePassengerType" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                     &lt;attribute name="FareType" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                     &lt;attribute name="GlobalInd" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                     &lt;attribute name="Market" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                     &lt;attribute name="PrivateFareInd" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                     &lt;attribute name="TicketDesignator" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="Surcharges" maxOccurs="unbounded" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;simpleContent>
         *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                                     &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                     &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                   &lt;/extension>
         *                                 &lt;/simpleContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="TicketingFees" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="FeeInformation" maxOccurs="unbounded" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}string" />
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
         *         &lt;element name="HeaderInformation" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="LastTicketingDate" type="{http://webservices.sabre.com/sabreXML/2011/10}dateOrTime" minOccurs="0"/>
         *                   &lt;element name="SpanishLargeFamilyDiscountLevel" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
         *                   &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
         *                   &lt;element name="ValidInterline" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="ValidatingCarrier" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="OriginDestinationOption" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="FlightSegment" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="DestinationLocation" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;attribute name="LocationCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="DisclosureAirline" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="Equipment" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;attribute name="AirEquipType" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="FlightDetails" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;attribute name="TrafficRestrictionCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="IntermediatePointInfo" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="FlightSegment" maxOccurs="unbounded" minOccurs="0">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;sequence>
         *                                                 &lt;element name="Equipment" minOccurs="0">
         *                                                   &lt;complexType>
         *                                                     &lt;complexContent>
         *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                         &lt;attribute name="AirEquipType" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                                       &lt;/restriction>
         *                                                     &lt;/complexContent>
         *                                                   &lt;/complexType>
         *                                                 &lt;/element>
         *                                                 &lt;element name="IntermediateLocation" minOccurs="0">
         *                                                   &lt;complexType>
         *                                                     &lt;complexContent>
         *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                         &lt;attribute name="LocationCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                                       &lt;/restriction>
         *                                                     &lt;/complexContent>
         *                                                   &lt;/complexType>
         *                                                 &lt;/element>
         *                                               &lt;/sequence>
         *                                               &lt;attribute name="ArrivalDateTime" type="{http://webservices.sabre.com/sabreXML/2011/10}dateTime" />
         *                                               &lt;attribute name="DepartureDateTime" type="{http://webservices.sabre.com/sabreXML/2011/10}dateTime" />
         *                                               &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                               &lt;attribute name="ElapsedTime" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                               &lt;attribute name="IntermediateTimeZone" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                               &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                             &lt;/restriction>
         *                                           &lt;/complexContent>
         *                                         &lt;/complexType>
         *                                       &lt;/element>
         *                                     &lt;/sequence>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="MarketingAirline" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                     &lt;attribute name="FlightNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="MarriageGrp" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="Meal" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;attribute name="MealCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="OperatingAirline" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                     &lt;attribute name="CompanyShortName" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="OriginLocation" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;attribute name="LocationCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                           &lt;/sequence>
         *                           &lt;attribute name="ArrivalDateTime" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="ConnectionInd" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="DepartureDateTime" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="DestinationTimeZone" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="DivideInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *                           &lt;attribute name="ElapsedTime" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="eTicket" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *                           &lt;attribute name="FlightNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="MarketingCabin" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="OnTimeRate" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="OnTimePercent" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="OriginTimeZone" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="ResBookDesigCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="SmokingAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *                           &lt;attribute name="StopQuantity" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *                 &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="CustomizeRoutingOption" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="TotalAmount" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "airItineraryPricingInfo",
            "headerInformation",
            "originDestinationOption"
        })
        public static class PricedItinerary {

            @XmlElement(name = "AirItineraryPricingInfo")
            protected List<OTAAirLowFareSearchRS.PricedItineraries.PricedItinerary.AirItineraryPricingInfo> airItineraryPricingInfo;
            @XmlElement(name = "HeaderInformation")
            protected OTAAirLowFareSearchRS.PricedItineraries.PricedItinerary.HeaderInformation headerInformation;
            @XmlElement(name = "OriginDestinationOption")
            protected List<OTAAirLowFareSearchRS.PricedItineraries.PricedItinerary.OriginDestinationOption> originDestinationOption;
            @XmlAttribute(name = "CurrencyCode")
            protected String currencyCode;
            @XmlAttribute(name = "CustomizeRoutingOption")
            protected String customizeRoutingOption;
            @XmlAttribute(name = "RPH")
            protected String rph;
            @XmlAttribute(name = "TotalAmount")
            protected String totalAmount;

            /**
             * Gets the value of the airItineraryPricingInfo property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the airItineraryPricingInfo property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getAirItineraryPricingInfo().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link OTAAirLowFareSearchRS.PricedItineraries.PricedItinerary.AirItineraryPricingInfo }
             * 
             * 
             */
            public List<OTAAirLowFareSearchRS.PricedItineraries.PricedItinerary.AirItineraryPricingInfo> getAirItineraryPricingInfo() {
                if (airItineraryPricingInfo == null) {
                    airItineraryPricingInfo = new ArrayList<OTAAirLowFareSearchRS.PricedItineraries.PricedItinerary.AirItineraryPricingInfo>();
                }
                return this.airItineraryPricingInfo;
            }

            /**
             * Gets the value of the headerInformation property.
             * 
             * @return
             *     possible object is
             *     {@link OTAAirLowFareSearchRS.PricedItineraries.PricedItinerary.HeaderInformation }
             *     
             */
            public OTAAirLowFareSearchRS.PricedItineraries.PricedItinerary.HeaderInformation getHeaderInformation() {
                return headerInformation;
            }

            /**
             * Sets the value of the headerInformation property.
             * 
             * @param value
             *     allowed object is
             *     {@link OTAAirLowFareSearchRS.PricedItineraries.PricedItinerary.HeaderInformation }
             *     
             */
            public void setHeaderInformation(OTAAirLowFareSearchRS.PricedItineraries.PricedItinerary.HeaderInformation value) {
                this.headerInformation = value;
            }

            /**
             * Gets the value of the originDestinationOption property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the originDestinationOption property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getOriginDestinationOption().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link OTAAirLowFareSearchRS.PricedItineraries.PricedItinerary.OriginDestinationOption }
             * 
             * 
             */
            public List<OTAAirLowFareSearchRS.PricedItineraries.PricedItinerary.OriginDestinationOption> getOriginDestinationOption() {
                if (originDestinationOption == null) {
                    originDestinationOption = new ArrayList<OTAAirLowFareSearchRS.PricedItineraries.PricedItinerary.OriginDestinationOption>();
                }
                return this.originDestinationOption;
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
             * Gets the value of the customizeRoutingOption property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCustomizeRoutingOption() {
                return customizeRoutingOption;
            }

            /**
             * Sets the value of the customizeRoutingOption property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCustomizeRoutingOption(String value) {
                this.customizeRoutingOption = value;
            }

            /**
             * Gets the value of the rph property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRPH() {
                return rph;
            }

            /**
             * Sets the value of the rph property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRPH(String value) {
                this.rph = value;
            }

            /**
             * Gets the value of the totalAmount property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTotalAmount() {
                return totalAmount;
            }

            /**
             * Sets the value of the totalAmount property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTotalAmount(String value) {
                this.totalAmount = value;
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
             *         &lt;element name="AncillaryFees" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="AncillaryFeeGroup" maxOccurs="unbounded" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="AncillaryFeeItem" maxOccurs="unbounded" minOccurs="0">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                     &lt;attribute name="Carrier" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                     &lt;attribute name="Date" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                     &lt;attribute name="Description" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                     &lt;attribute name="DestinationAirport" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                     &lt;attribute name="EndSegment" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                     &lt;attribute name="OriginAirport" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                     &lt;attribute name="PassengerCode" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                     &lt;attribute name="StartSegment" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                   &lt;/restriction>
             *                                 &lt;/complexContent>
             *                               &lt;/complexType>
             *                             &lt;/element>
             *                           &lt;/sequence>
             *                           &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                           &lt;attribute name="Message" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                           &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                 &lt;/sequence>
             *                 &lt;attribute name="Message" type="{http://www.w3.org/2001/XMLSchema}string" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="FareCalculation" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="ItinTotalFare" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="BaseFare" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                           &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="Commission" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                           &lt;attribute name="Percent" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="EquivFare" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                           &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="Taxes" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="Tax" maxOccurs="unbounded" minOccurs="0">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                     &lt;attribute name="TaxCode" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                     &lt;attribute name="TaxName" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                   &lt;/restriction>
             *                                 &lt;/complexContent>
             *                               &lt;/complexType>
             *                             &lt;/element>
             *                           &lt;/sequence>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="TotalFare" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                           &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="Warnings" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="Warning" maxOccurs="unbounded" minOccurs="0">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;attribute name="ShortText" type="{http://www.w3.org/2001/XMLSchema}string" />
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
             *         &lt;element name="PassengerTypeQuantity" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="Group" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="Quantity" type="{http://www.w3.org/2001/XMLSchema}string" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="PTC_FareBreakdown" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="FareBasis" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                           &lt;attribute name="CorporateID" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                           &lt;attribute name="FarePassengerType" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                           &lt;attribute name="FareType" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                           &lt;attribute name="GlobalInd" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                           &lt;attribute name="Market" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                           &lt;attribute name="PrivateFareInd" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                           &lt;attribute name="TicketDesignator" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="Surcharges" maxOccurs="unbounded" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;simpleContent>
             *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *                           &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                           &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                         &lt;/extension>
             *                       &lt;/simpleContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="TicketingFees" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="FeeInformation" maxOccurs="unbounded" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}string" />
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
                "ancillaryFees",
                "fareCalculation",
                "itinTotalFare",
                "passengerTypeQuantity",
                "ptcFareBreakdown",
                "ticketingFees"
            })
            public static class AirItineraryPricingInfo {

                @XmlElement(name = "AncillaryFees")
                protected OTAAirLowFareSearchRS.PricedItineraries.PricedItinerary.AirItineraryPricingInfo.AncillaryFees ancillaryFees;
                @XmlElement(name = "FareCalculation")
                protected OTAAirLowFareSearchRS.PricedItineraries.PricedItinerary.AirItineraryPricingInfo.FareCalculation fareCalculation;
                @XmlElement(name = "ItinTotalFare")
                protected OTAAirLowFareSearchRS.PricedItineraries.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare itinTotalFare;
                @XmlElement(name = "PassengerTypeQuantity")
                protected OTAAirLowFareSearchRS.PricedItineraries.PricedItinerary.AirItineraryPricingInfo.PassengerTypeQuantity passengerTypeQuantity;
                @XmlElement(name = "PTC_FareBreakdown")
                protected List<OTAAirLowFareSearchRS.PricedItineraries.PricedItinerary.AirItineraryPricingInfo.PTCFareBreakdown> ptcFareBreakdown;
                @XmlElement(name = "TicketingFees")
                protected OTAAirLowFareSearchRS.PricedItineraries.PricedItinerary.AirItineraryPricingInfo.TicketingFees ticketingFees;

                /**
                 * Gets the value of the ancillaryFees property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link OTAAirLowFareSearchRS.PricedItineraries.PricedItinerary.AirItineraryPricingInfo.AncillaryFees }
                 *     
                 */
                public OTAAirLowFareSearchRS.PricedItineraries.PricedItinerary.AirItineraryPricingInfo.AncillaryFees getAncillaryFees() {
                    return ancillaryFees;
                }

                /**
                 * Sets the value of the ancillaryFees property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link OTAAirLowFareSearchRS.PricedItineraries.PricedItinerary.AirItineraryPricingInfo.AncillaryFees }
                 *     
                 */
                public void setAncillaryFees(OTAAirLowFareSearchRS.PricedItineraries.PricedItinerary.AirItineraryPricingInfo.AncillaryFees value) {
                    this.ancillaryFees = value;
                }

                /**
                 * Gets the value of the fareCalculation property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link OTAAirLowFareSearchRS.PricedItineraries.PricedItinerary.AirItineraryPricingInfo.FareCalculation }
                 *     
                 */
                public OTAAirLowFareSearchRS.PricedItineraries.PricedItinerary.AirItineraryPricingInfo.FareCalculation getFareCalculation() {
                    return fareCalculation;
                }

                /**
                 * Sets the value of the fareCalculation property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link OTAAirLowFareSearchRS.PricedItineraries.PricedItinerary.AirItineraryPricingInfo.FareCalculation }
                 *     
                 */
                public void setFareCalculation(OTAAirLowFareSearchRS.PricedItineraries.PricedItinerary.AirItineraryPricingInfo.FareCalculation value) {
                    this.fareCalculation = value;
                }

                /**
                 * Gets the value of the itinTotalFare property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link OTAAirLowFareSearchRS.PricedItineraries.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare }
                 *     
                 */
                public OTAAirLowFareSearchRS.PricedItineraries.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare getItinTotalFare() {
                    return itinTotalFare;
                }

                /**
                 * Sets the value of the itinTotalFare property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link OTAAirLowFareSearchRS.PricedItineraries.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare }
                 *     
                 */
                public void setItinTotalFare(OTAAirLowFareSearchRS.PricedItineraries.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare value) {
                    this.itinTotalFare = value;
                }

                /**
                 * Gets the value of the passengerTypeQuantity property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link OTAAirLowFareSearchRS.PricedItineraries.PricedItinerary.AirItineraryPricingInfo.PassengerTypeQuantity }
                 *     
                 */
                public OTAAirLowFareSearchRS.PricedItineraries.PricedItinerary.AirItineraryPricingInfo.PassengerTypeQuantity getPassengerTypeQuantity() {
                    return passengerTypeQuantity;
                }

                /**
                 * Sets the value of the passengerTypeQuantity property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link OTAAirLowFareSearchRS.PricedItineraries.PricedItinerary.AirItineraryPricingInfo.PassengerTypeQuantity }
                 *     
                 */
                public void setPassengerTypeQuantity(OTAAirLowFareSearchRS.PricedItineraries.PricedItinerary.AirItineraryPricingInfo.PassengerTypeQuantity value) {
                    this.passengerTypeQuantity = value;
                }

                /**
                 * Gets the value of the ptcFareBreakdown property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the ptcFareBreakdown property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getPTCFareBreakdown().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link OTAAirLowFareSearchRS.PricedItineraries.PricedItinerary.AirItineraryPricingInfo.PTCFareBreakdown }
                 * 
                 * 
                 */
                public List<OTAAirLowFareSearchRS.PricedItineraries.PricedItinerary.AirItineraryPricingInfo.PTCFareBreakdown> getPTCFareBreakdown() {
                    if (ptcFareBreakdown == null) {
                        ptcFareBreakdown = new ArrayList<OTAAirLowFareSearchRS.PricedItineraries.PricedItinerary.AirItineraryPricingInfo.PTCFareBreakdown>();
                    }
                    return this.ptcFareBreakdown;
                }

                /**
                 * Gets the value of the ticketingFees property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link OTAAirLowFareSearchRS.PricedItineraries.PricedItinerary.AirItineraryPricingInfo.TicketingFees }
                 *     
                 */
                public OTAAirLowFareSearchRS.PricedItineraries.PricedItinerary.AirItineraryPricingInfo.TicketingFees getTicketingFees() {
                    return ticketingFees;
                }

                /**
                 * Sets the value of the ticketingFees property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link OTAAirLowFareSearchRS.PricedItineraries.PricedItinerary.AirItineraryPricingInfo.TicketingFees }
                 *     
                 */
                public void setTicketingFees(OTAAirLowFareSearchRS.PricedItineraries.PricedItinerary.AirItineraryPricingInfo.TicketingFees value) {
                    this.ticketingFees = value;
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
                 *         &lt;element name="AncillaryFeeGroup" maxOccurs="unbounded" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="AncillaryFeeItem" maxOccurs="unbounded" minOccurs="0">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                           &lt;attribute name="Carrier" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                           &lt;attribute name="Date" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                           &lt;attribute name="Description" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                           &lt;attribute name="DestinationAirport" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                           &lt;attribute name="EndSegment" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                           &lt;attribute name="OriginAirport" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                           &lt;attribute name="PassengerCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                           &lt;attribute name="StartSegment" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                         &lt;/restriction>
                 *                       &lt;/complexContent>
                 *                     &lt;/complexType>
                 *                   &lt;/element>
                 *                 &lt;/sequence>
                 *                 &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                 &lt;attribute name="Message" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *       &lt;/sequence>
                 *       &lt;attribute name="Message" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "ancillaryFeeGroup"
                })
                public static class AncillaryFees {

                    @XmlElement(name = "AncillaryFeeGroup")
                    protected List<OTAAirLowFareSearchRS.PricedItineraries.PricedItinerary.AirItineraryPricingInfo.AncillaryFees.AncillaryFeeGroup> ancillaryFeeGroup;
                    @XmlAttribute(name = "Message")
                    protected String message;

                    /**
                     * Gets the value of the ancillaryFeeGroup property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the ancillaryFeeGroup property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getAncillaryFeeGroup().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link OTAAirLowFareSearchRS.PricedItineraries.PricedItinerary.AirItineraryPricingInfo.AncillaryFees.AncillaryFeeGroup }
                     * 
                     * 
                     */
                    public List<OTAAirLowFareSearchRS.PricedItineraries.PricedItinerary.AirItineraryPricingInfo.AncillaryFees.AncillaryFeeGroup> getAncillaryFeeGroup() {
                        if (ancillaryFeeGroup == null) {
                            ancillaryFeeGroup = new ArrayList<OTAAirLowFareSearchRS.PricedItineraries.PricedItinerary.AirItineraryPricingInfo.AncillaryFees.AncillaryFeeGroup>();
                        }
                        return this.ancillaryFeeGroup;
                    }

                    /**
                     * Gets the value of the message property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getMessage() {
                        return message;
                    }

                    /**
                     * Sets the value of the message property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setMessage(String value) {
                        this.message = value;
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
                     *         &lt;element name="AncillaryFeeItem" maxOccurs="unbounded" minOccurs="0">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *                 &lt;attribute name="Carrier" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *                 &lt;attribute name="Date" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *                 &lt;attribute name="Description" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *                 &lt;attribute name="DestinationAirport" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *                 &lt;attribute name="EndSegment" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *                 &lt;attribute name="OriginAirport" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *                 &lt;attribute name="PassengerCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *                 &lt;attribute name="StartSegment" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *               &lt;/restriction>
                     *             &lt;/complexContent>
                     *           &lt;/complexType>
                     *         &lt;/element>
                     *       &lt;/sequence>
                     *       &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *       &lt;attribute name="Message" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "ancillaryFeeItem"
                    })
                    public static class AncillaryFeeGroup {

                        @XmlElement(name = "AncillaryFeeItem")
                        protected List<OTAAirLowFareSearchRS.PricedItineraries.PricedItinerary.AirItineraryPricingInfo.AncillaryFees.AncillaryFeeGroup.AncillaryFeeItem> ancillaryFeeItem;
                        @XmlAttribute(name = "Code")
                        protected String code;
                        @XmlAttribute(name = "Message")
                        protected String message;
                        @XmlAttribute(name = "Name")
                        protected String name;

                        /**
                         * Gets the value of the ancillaryFeeItem property.
                         * 
                         * <p>
                         * This accessor method returns a reference to the live list,
                         * not a snapshot. Therefore any modification you make to the
                         * returned list will be present inside the JAXB object.
                         * This is why there is not a <CODE>set</CODE> method for the ancillaryFeeItem property.
                         * 
                         * <p>
                         * For example, to add a new item, do as follows:
                         * <pre>
                         *    getAncillaryFeeItem().add(newItem);
                         * </pre>
                         * 
                         * 
                         * <p>
                         * Objects of the following type(s) are allowed in the list
                         * {@link OTAAirLowFareSearchRS.PricedItineraries.PricedItinerary.AirItineraryPricingInfo.AncillaryFees.AncillaryFeeGroup.AncillaryFeeItem }
                         * 
                         * 
                         */
                        public List<OTAAirLowFareSearchRS.PricedItineraries.PricedItinerary.AirItineraryPricingInfo.AncillaryFees.AncillaryFeeGroup.AncillaryFeeItem> getAncillaryFeeItem() {
                            if (ancillaryFeeItem == null) {
                                ancillaryFeeItem = new ArrayList<OTAAirLowFareSearchRS.PricedItineraries.PricedItinerary.AirItineraryPricingInfo.AncillaryFees.AncillaryFeeGroup.AncillaryFeeItem>();
                            }
                            return this.ancillaryFeeItem;
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

                        /**
                         * Gets the value of the message property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getMessage() {
                            return message;
                        }

                        /**
                         * Sets the value of the message property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setMessage(String value) {
                            this.message = value;
                        }

                        /**
                         * Gets the value of the name property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getName() {
                            return name;
                        }

                        /**
                         * Sets the value of the name property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setName(String value) {
                            this.name = value;
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
                         *       &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}string" />
                         *       &lt;attribute name="Carrier" type="{http://www.w3.org/2001/XMLSchema}string" />
                         *       &lt;attribute name="Date" type="{http://www.w3.org/2001/XMLSchema}string" />
                         *       &lt;attribute name="Description" type="{http://www.w3.org/2001/XMLSchema}string" />
                         *       &lt;attribute name="DestinationAirport" type="{http://www.w3.org/2001/XMLSchema}string" />
                         *       &lt;attribute name="EndSegment" type="{http://www.w3.org/2001/XMLSchema}string" />
                         *       &lt;attribute name="OriginAirport" type="{http://www.w3.org/2001/XMLSchema}string" />
                         *       &lt;attribute name="PassengerCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                         *       &lt;attribute name="StartSegment" type="{http://www.w3.org/2001/XMLSchema}string" />
                         *     &lt;/restriction>
                         *   &lt;/complexContent>
                         * &lt;/complexType>
                         * </pre>
                         * 
                         * 
                         */
                        @XmlAccessorType(XmlAccessType.FIELD)
                        @XmlType(name = "")
                        public static class AncillaryFeeItem {

                            @XmlAttribute(name = "Amount")
                            protected String amount;
                            @XmlAttribute(name = "Carrier")
                            protected String carrier;
                            @XmlAttribute(name = "Date")
                            protected String date;
                            @XmlAttribute(name = "Description")
                            protected String description;
                            @XmlAttribute(name = "DestinationAirport")
                            protected String destinationAirport;
                            @XmlAttribute(name = "EndSegment")
                            protected String endSegment;
                            @XmlAttribute(name = "OriginAirport")
                            protected String originAirport;
                            @XmlAttribute(name = "PassengerCode")
                            protected String passengerCode;
                            @XmlAttribute(name = "StartSegment")
                            protected String startSegment;

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
                             * Gets the value of the carrier property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getCarrier() {
                                return carrier;
                            }

                            /**
                             * Sets the value of the carrier property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setCarrier(String value) {
                                this.carrier = value;
                            }

                            /**
                             * Gets the value of the date property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getDate() {
                                return date;
                            }

                            /**
                             * Sets the value of the date property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setDate(String value) {
                                this.date = value;
                            }

                            /**
                             * Gets the value of the description property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getDescription() {
                                return description;
                            }

                            /**
                             * Sets the value of the description property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setDescription(String value) {
                                this.description = value;
                            }

                            /**
                             * Gets the value of the destinationAirport property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getDestinationAirport() {
                                return destinationAirport;
                            }

                            /**
                             * Sets the value of the destinationAirport property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setDestinationAirport(String value) {
                                this.destinationAirport = value;
                            }

                            /**
                             * Gets the value of the endSegment property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getEndSegment() {
                                return endSegment;
                            }

                            /**
                             * Sets the value of the endSegment property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setEndSegment(String value) {
                                this.endSegment = value;
                            }

                            /**
                             * Gets the value of the originAirport property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getOriginAirport() {
                                return originAirport;
                            }

                            /**
                             * Sets the value of the originAirport property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setOriginAirport(String value) {
                                this.originAirport = value;
                            }

                            /**
                             * Gets the value of the passengerCode property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getPassengerCode() {
                                return passengerCode;
                            }

                            /**
                             * Sets the value of the passengerCode property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setPassengerCode(String value) {
                                this.passengerCode = value;
                            }

                            /**
                             * Gets the value of the startSegment property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getStartSegment() {
                                return startSegment;
                            }

                            /**
                             * Sets the value of the startSegment property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setStartSegment(String value) {
                                this.startSegment = value;
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
                 *         &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                    "text"
                })
                public static class FareCalculation {

                    @XmlElement(name = "Text")
                    protected String text;

                    /**
                     * Gets the value of the text property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getText() {
                        return text;
                    }

                    /**
                     * Sets the value of the text property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setText(String value) {
                        this.text = value;
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
                 *         &lt;element name="BaseFare" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                 &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="Commission" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                 &lt;attribute name="Percent" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="EquivFare" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                 &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="Taxes" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="Tax" maxOccurs="unbounded" minOccurs="0">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                           &lt;attribute name="TaxCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                           &lt;attribute name="TaxName" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                         &lt;/restriction>
                 *                       &lt;/complexContent>
                 *                     &lt;/complexType>
                 *                   &lt;/element>
                 *                 &lt;/sequence>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="TotalFare" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                 &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="Warnings" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="Warning" maxOccurs="unbounded" minOccurs="0">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;attribute name="ShortText" type="{http://www.w3.org/2001/XMLSchema}string" />
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
                    "baseFare",
                    "commission",
                    "equivFare",
                    "taxes",
                    "totalFare",
                    "warnings"
                })
                public static class ItinTotalFare {

                    @XmlElement(name = "BaseFare")
                    protected OTAAirLowFareSearchRS.PricedItineraries.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.BaseFare baseFare;
                    @XmlElement(name = "Commission")
                    protected OTAAirLowFareSearchRS.PricedItineraries.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.Commission commission;
                    @XmlElement(name = "EquivFare")
                    protected OTAAirLowFareSearchRS.PricedItineraries.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.EquivFare equivFare;
                    @XmlElement(name = "Taxes")
                    protected OTAAirLowFareSearchRS.PricedItineraries.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.Taxes taxes;
                    @XmlElement(name = "TotalFare")
                    protected OTAAirLowFareSearchRS.PricedItineraries.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.TotalFare totalFare;
                    @XmlElement(name = "Warnings")
                    protected OTAAirLowFareSearchRS.PricedItineraries.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.Warnings warnings;

                    /**
                     * Gets the value of the baseFare property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link OTAAirLowFareSearchRS.PricedItineraries.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.BaseFare }
                     *     
                     */
                    public OTAAirLowFareSearchRS.PricedItineraries.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.BaseFare getBaseFare() {
                        return baseFare;
                    }

                    /**
                     * Sets the value of the baseFare property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link OTAAirLowFareSearchRS.PricedItineraries.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.BaseFare }
                     *     
                     */
                    public void setBaseFare(OTAAirLowFareSearchRS.PricedItineraries.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.BaseFare value) {
                        this.baseFare = value;
                    }

                    /**
                     * Gets the value of the commission property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link OTAAirLowFareSearchRS.PricedItineraries.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.Commission }
                     *     
                     */
                    public OTAAirLowFareSearchRS.PricedItineraries.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.Commission getCommission() {
                        return commission;
                    }

                    /**
                     * Sets the value of the commission property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link OTAAirLowFareSearchRS.PricedItineraries.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.Commission }
                     *     
                     */
                    public void setCommission(OTAAirLowFareSearchRS.PricedItineraries.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.Commission value) {
                        this.commission = value;
                    }

                    /**
                     * Gets the value of the equivFare property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link OTAAirLowFareSearchRS.PricedItineraries.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.EquivFare }
                     *     
                     */
                    public OTAAirLowFareSearchRS.PricedItineraries.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.EquivFare getEquivFare() {
                        return equivFare;
                    }

                    /**
                     * Sets the value of the equivFare property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link OTAAirLowFareSearchRS.PricedItineraries.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.EquivFare }
                     *     
                     */
                    public void setEquivFare(OTAAirLowFareSearchRS.PricedItineraries.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.EquivFare value) {
                        this.equivFare = value;
                    }

                    /**
                     * Gets the value of the taxes property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link OTAAirLowFareSearchRS.PricedItineraries.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.Taxes }
                     *     
                     */
                    public OTAAirLowFareSearchRS.PricedItineraries.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.Taxes getTaxes() {
                        return taxes;
                    }

                    /**
                     * Sets the value of the taxes property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link OTAAirLowFareSearchRS.PricedItineraries.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.Taxes }
                     *     
                     */
                    public void setTaxes(OTAAirLowFareSearchRS.PricedItineraries.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.Taxes value) {
                        this.taxes = value;
                    }

                    /**
                     * Gets the value of the totalFare property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link OTAAirLowFareSearchRS.PricedItineraries.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.TotalFare }
                     *     
                     */
                    public OTAAirLowFareSearchRS.PricedItineraries.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.TotalFare getTotalFare() {
                        return totalFare;
                    }

                    /**
                     * Sets the value of the totalFare property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link OTAAirLowFareSearchRS.PricedItineraries.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.TotalFare }
                     *     
                     */
                    public void setTotalFare(OTAAirLowFareSearchRS.PricedItineraries.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.TotalFare value) {
                        this.totalFare = value;
                    }

                    /**
                     * Gets the value of the warnings property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link OTAAirLowFareSearchRS.PricedItineraries.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.Warnings }
                     *     
                     */
                    public OTAAirLowFareSearchRS.PricedItineraries.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.Warnings getWarnings() {
                        return warnings;
                    }

                    /**
                     * Sets the value of the warnings property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link OTAAirLowFareSearchRS.PricedItineraries.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.Warnings }
                     *     
                     */
                    public void setWarnings(OTAAirLowFareSearchRS.PricedItineraries.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.Warnings value) {
                        this.warnings = value;
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
                     *       &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *       &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class BaseFare {

                        @XmlAttribute(name = "Amount")
                        protected String amount;
                        @XmlAttribute(name = "CurrencyCode")
                        protected String currencyCode;

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
                     *       &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *       &lt;attribute name="Percent" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class Commission {

                        @XmlAttribute(name = "Amount")
                        protected String amount;
                        @XmlAttribute(name = "Percent")
                        protected String percent;

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
                         * Gets the value of the percent property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getPercent() {
                            return percent;
                        }

                        /**
                         * Sets the value of the percent property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setPercent(String value) {
                            this.percent = value;
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
                     *       &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *       &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class EquivFare {

                        @XmlAttribute(name = "Amount")
                        protected String amount;
                        @XmlAttribute(name = "CurrencyCode")
                        protected String currencyCode;

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
                     *         &lt;element name="Tax" maxOccurs="unbounded" minOccurs="0">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *                 &lt;attribute name="TaxCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *                 &lt;attribute name="TaxName" type="{http://www.w3.org/2001/XMLSchema}string" />
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
                        "tax"
                    })
                    public static class Taxes {

                        @XmlElement(name = "Tax")
                        protected List<OTAAirLowFareSearchRS.PricedItineraries.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.Taxes.Tax> tax;

                        /**
                         * Gets the value of the tax property.
                         * 
                         * <p>
                         * This accessor method returns a reference to the live list,
                         * not a snapshot. Therefore any modification you make to the
                         * returned list will be present inside the JAXB object.
                         * This is why there is not a <CODE>set</CODE> method for the tax property.
                         * 
                         * <p>
                         * For example, to add a new item, do as follows:
                         * <pre>
                         *    getTax().add(newItem);
                         * </pre>
                         * 
                         * 
                         * <p>
                         * Objects of the following type(s) are allowed in the list
                         * {@link OTAAirLowFareSearchRS.PricedItineraries.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.Taxes.Tax }
                         * 
                         * 
                         */
                        public List<OTAAirLowFareSearchRS.PricedItineraries.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.Taxes.Tax> getTax() {
                            if (tax == null) {
                                tax = new ArrayList<OTAAirLowFareSearchRS.PricedItineraries.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.Taxes.Tax>();
                            }
                            return this.tax;
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
                         *       &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}string" />
                         *       &lt;attribute name="TaxCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                         *       &lt;attribute name="TaxName" type="{http://www.w3.org/2001/XMLSchema}string" />
                         *     &lt;/restriction>
                         *   &lt;/complexContent>
                         * &lt;/complexType>
                         * </pre>
                         * 
                         * 
                         */
                        @XmlAccessorType(XmlAccessType.FIELD)
                        @XmlType(name = "")
                        public static class Tax {

                            @XmlAttribute(name = "Amount")
                            protected String amount;
                            @XmlAttribute(name = "TaxCode")
                            protected String taxCode;
                            @XmlAttribute(name = "TaxName")
                            protected String taxName;

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
                             * Gets the value of the taxCode property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getTaxCode() {
                                return taxCode;
                            }

                            /**
                             * Sets the value of the taxCode property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setTaxCode(String value) {
                                this.taxCode = value;
                            }

                            /**
                             * Gets the value of the taxName property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getTaxName() {
                                return taxName;
                            }

                            /**
                             * Sets the value of the taxName property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setTaxName(String value) {
                                this.taxName = value;
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
                     *       &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *       &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class TotalFare {

                        @XmlAttribute(name = "Amount")
                        protected String amount;
                        @XmlAttribute(name = "CurrencyCode")
                        protected String currencyCode;

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
                     *         &lt;element name="Warning" maxOccurs="unbounded" minOccurs="0">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;attribute name="ShortText" type="{http://www.w3.org/2001/XMLSchema}string" />
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
                        "warning"
                    })
                    public static class Warnings {

                        @XmlElement(name = "Warning")
                        protected List<OTAAirLowFareSearchRS.PricedItineraries.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.Warnings.Warning> warning;

                        /**
                         * Gets the value of the warning property.
                         * 
                         * <p>
                         * This accessor method returns a reference to the live list,
                         * not a snapshot. Therefore any modification you make to the
                         * returned list will be present inside the JAXB object.
                         * This is why there is not a <CODE>set</CODE> method for the warning property.
                         * 
                         * <p>
                         * For example, to add a new item, do as follows:
                         * <pre>
                         *    getWarning().add(newItem);
                         * </pre>
                         * 
                         * 
                         * <p>
                         * Objects of the following type(s) are allowed in the list
                         * {@link OTAAirLowFareSearchRS.PricedItineraries.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.Warnings.Warning }
                         * 
                         * 
                         */
                        public List<OTAAirLowFareSearchRS.PricedItineraries.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.Warnings.Warning> getWarning() {
                            if (warning == null) {
                                warning = new ArrayList<OTAAirLowFareSearchRS.PricedItineraries.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.Warnings.Warning>();
                            }
                            return this.warning;
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
                         *       &lt;attribute name="ShortText" type="{http://www.w3.org/2001/XMLSchema}string" />
                         *     &lt;/restriction>
                         *   &lt;/complexContent>
                         * &lt;/complexType>
                         * </pre>
                         * 
                         * 
                         */
                        @XmlAccessorType(XmlAccessType.FIELD)
                        @XmlType(name = "")
                        public static class Warning {

                            @XmlAttribute(name = "ShortText")
                            protected String shortText;

                            /**
                             * Gets the value of the shortText property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getShortText() {
                                return shortText;
                            }

                            /**
                             * Sets the value of the shortText property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setShortText(String value) {
                                this.shortText = value;
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
                 *       &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="Group" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="Quantity" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class PassengerTypeQuantity {

                    @XmlAttribute(name = "Code")
                    protected String code;
                    @XmlAttribute(name = "Group")
                    protected String group;
                    @XmlAttribute(name = "Quantity")
                    protected String quantity;

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
                     * Gets the value of the group property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getGroup() {
                        return group;
                    }

                    /**
                     * Sets the value of the group property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setGroup(String value) {
                        this.group = value;
                    }

                    /**
                     * Gets the value of the quantity property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getQuantity() {
                        return quantity;
                    }

                    /**
                     * Sets the value of the quantity property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setQuantity(String value) {
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
                 *         &lt;element name="FareBasis" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                 &lt;attribute name="CorporateID" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                 &lt;attribute name="FarePassengerType" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                 &lt;attribute name="FareType" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                 &lt;attribute name="GlobalInd" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                 &lt;attribute name="Market" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                 &lt;attribute name="PrivateFareInd" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                 &lt;attribute name="TicketDesignator" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="Surcharges" maxOccurs="unbounded" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;simpleContent>
                 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                 *                 &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                 &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *               &lt;/extension>
                 *             &lt;/simpleContent>
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
                    "fareBasis",
                    "surcharges"
                })
                public static class PTCFareBreakdown {

                    @XmlElement(name = "FareBasis")
                    protected OTAAirLowFareSearchRS.PricedItineraries.PricedItinerary.AirItineraryPricingInfo.PTCFareBreakdown.FareBasis fareBasis;
                    @XmlElement(name = "Surcharges")
                    protected List<OTAAirLowFareSearchRS.PricedItineraries.PricedItinerary.AirItineraryPricingInfo.PTCFareBreakdown.Surcharges> surcharges;

                    /**
                     * Gets the value of the fareBasis property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link OTAAirLowFareSearchRS.PricedItineraries.PricedItinerary.AirItineraryPricingInfo.PTCFareBreakdown.FareBasis }
                     *     
                     */
                    public OTAAirLowFareSearchRS.PricedItineraries.PricedItinerary.AirItineraryPricingInfo.PTCFareBreakdown.FareBasis getFareBasis() {
                        return fareBasis;
                    }

                    /**
                     * Sets the value of the fareBasis property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link OTAAirLowFareSearchRS.PricedItineraries.PricedItinerary.AirItineraryPricingInfo.PTCFareBreakdown.FareBasis }
                     *     
                     */
                    public void setFareBasis(OTAAirLowFareSearchRS.PricedItineraries.PricedItinerary.AirItineraryPricingInfo.PTCFareBreakdown.FareBasis value) {
                        this.fareBasis = value;
                    }

                    /**
                     * Gets the value of the surcharges property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the surcharges property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getSurcharges().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link OTAAirLowFareSearchRS.PricedItineraries.PricedItinerary.AirItineraryPricingInfo.PTCFareBreakdown.Surcharges }
                     * 
                     * 
                     */
                    public List<OTAAirLowFareSearchRS.PricedItineraries.PricedItinerary.AirItineraryPricingInfo.PTCFareBreakdown.Surcharges> getSurcharges() {
                        if (surcharges == null) {
                            surcharges = new ArrayList<OTAAirLowFareSearchRS.PricedItineraries.PricedItinerary.AirItineraryPricingInfo.PTCFareBreakdown.Surcharges>();
                        }
                        return this.surcharges;
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
                     *       &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *       &lt;attribute name="CorporateID" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *       &lt;attribute name="FarePassengerType" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *       &lt;attribute name="FareType" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *       &lt;attribute name="GlobalInd" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *       &lt;attribute name="Market" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *       &lt;attribute name="PrivateFareInd" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *       &lt;attribute name="TicketDesignator" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class FareBasis {

                        @XmlAttribute(name = "Code")
                        protected String code;
                        @XmlAttribute(name = "CorporateID")
                        protected String corporateID;
                        @XmlAttribute(name = "FarePassengerType")
                        protected String farePassengerType;
                        @XmlAttribute(name = "FareType")
                        protected String fareType;
                        @XmlAttribute(name = "GlobalInd")
                        protected String globalInd;
                        @XmlAttribute(name = "Market")
                        protected String market;
                        @XmlAttribute(name = "PrivateFareInd")
                        protected String privateFareInd;
                        @XmlAttribute(name = "TicketDesignator")
                        protected String ticketDesignator;

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
                         * Gets the value of the corporateID property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getCorporateID() {
                            return corporateID;
                        }

                        /**
                         * Sets the value of the corporateID property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setCorporateID(String value) {
                            this.corporateID = value;
                        }

                        /**
                         * Gets the value of the farePassengerType property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getFarePassengerType() {
                            return farePassengerType;
                        }

                        /**
                         * Sets the value of the farePassengerType property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setFarePassengerType(String value) {
                            this.farePassengerType = value;
                        }

                        /**
                         * Gets the value of the fareType property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getFareType() {
                            return fareType;
                        }

                        /**
                         * Sets the value of the fareType property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setFareType(String value) {
                            this.fareType = value;
                        }

                        /**
                         * Gets the value of the globalInd property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getGlobalInd() {
                            return globalInd;
                        }

                        /**
                         * Sets the value of the globalInd property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setGlobalInd(String value) {
                            this.globalInd = value;
                        }

                        /**
                         * Gets the value of the market property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getMarket() {
                            return market;
                        }

                        /**
                         * Sets the value of the market property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setMarket(String value) {
                            this.market = value;
                        }

                        /**
                         * Gets the value of the privateFareInd property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getPrivateFareInd() {
                            return privateFareInd;
                        }

                        /**
                         * Sets the value of the privateFareInd property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setPrivateFareInd(String value) {
                            this.privateFareInd = value;
                        }

                        /**
                         * Gets the value of the ticketDesignator property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getTicketDesignator() {
                            return ticketDesignator;
                        }

                        /**
                         * Sets the value of the ticketDesignator property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setTicketDesignator(String value) {
                            this.ticketDesignator = value;
                        }

                    }


                    /**
                     * <p>Java class for anonymous complex type.
                     * 
                     * <p>The following schema fragment specifies the expected content contained within this class.
                     * 
                     * <pre>
                     * &lt;complexType>
                     *   &lt;simpleContent>
                     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                     *       &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *       &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *     &lt;/extension>
                     *   &lt;/simpleContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "value"
                    })
                    public static class Surcharges {

                        @XmlValue
                        protected String value;
                        @XmlAttribute(name = "Ind")
                        protected String ind;
                        @XmlAttribute(name = "Type")
                        protected String type;

                        /**
                         * Gets the value of the value property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getValue() {
                            return value;
                        }

                        /**
                         * Sets the value of the value property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setValue(String value) {
                            this.value = value;
                        }

                        /**
                         * Gets the value of the ind property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getInd() {
                            return ind;
                        }

                        /**
                         * Sets the value of the ind property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setInd(String value) {
                            this.ind = value;
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
                 *         &lt;element name="FeeInformation" maxOccurs="unbounded" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}string" />
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
                    "feeInformation"
                })
                public static class TicketingFees {

                    @XmlElement(name = "FeeInformation")
                    protected List<OTAAirLowFareSearchRS.PricedItineraries.PricedItinerary.AirItineraryPricingInfo.TicketingFees.FeeInformation> feeInformation;

                    /**
                     * Gets the value of the feeInformation property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the feeInformation property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getFeeInformation().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link OTAAirLowFareSearchRS.PricedItineraries.PricedItinerary.AirItineraryPricingInfo.TicketingFees.FeeInformation }
                     * 
                     * 
                     */
                    public List<OTAAirLowFareSearchRS.PricedItineraries.PricedItinerary.AirItineraryPricingInfo.TicketingFees.FeeInformation> getFeeInformation() {
                        if (feeInformation == null) {
                            feeInformation = new ArrayList<OTAAirLowFareSearchRS.PricedItineraries.PricedItinerary.AirItineraryPricingInfo.TicketingFees.FeeInformation>();
                        }
                        return this.feeInformation;
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
                     *       &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class FeeInformation {

                        @XmlAttribute(name = "Amount")
                        protected String amount;

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
             *         &lt;element name="LastTicketingDate" type="{http://webservices.sabre.com/sabreXML/2011/10}dateOrTime" minOccurs="0"/>
             *         &lt;element name="SpanishLargeFamilyDiscountLevel" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
             *         &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
             *         &lt;element name="ValidInterline" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="ValidatingCarrier" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
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
                "lastTicketingDate",
                "spanishLargeFamilyDiscountLevel",
                "text",
                "validInterline",
                "validatingCarrier"
            })
            public static class HeaderInformation {

                @XmlElement(name = "LastTicketingDate")
                protected String lastTicketingDate;
                @XmlElement(name = "SpanishLargeFamilyDiscountLevel")
                protected List<String> spanishLargeFamilyDiscountLevel;
                @XmlElement(name = "Text")
                protected List<String> text;
                @XmlElement(name = "ValidInterline")
                protected OTAAirLowFareSearchRS.PricedItineraries.PricedItinerary.HeaderInformation.ValidInterline validInterline;
                @XmlElement(name = "ValidatingCarrier")
                protected OTAAirLowFareSearchRS.PricedItineraries.PricedItinerary.HeaderInformation.ValidatingCarrier validatingCarrier;

                /**
                 * Gets the value of the lastTicketingDate property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getLastTicketingDate() {
                    return lastTicketingDate;
                }

                /**
                 * Sets the value of the lastTicketingDate property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setLastTicketingDate(String value) {
                    this.lastTicketingDate = value;
                }

                /**
                 * Gets the value of the spanishLargeFamilyDiscountLevel property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the spanishLargeFamilyDiscountLevel property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getSpanishLargeFamilyDiscountLevel().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link String }
                 * 
                 * 
                 */
                public List<String> getSpanishLargeFamilyDiscountLevel() {
                    if (spanishLargeFamilyDiscountLevel == null) {
                        spanishLargeFamilyDiscountLevel = new ArrayList<String>();
                    }
                    return this.spanishLargeFamilyDiscountLevel;
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
                 * Gets the value of the validInterline property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link OTAAirLowFareSearchRS.PricedItineraries.PricedItinerary.HeaderInformation.ValidInterline }
                 *     
                 */
                public OTAAirLowFareSearchRS.PricedItineraries.PricedItinerary.HeaderInformation.ValidInterline getValidInterline() {
                    return validInterline;
                }

                /**
                 * Sets the value of the validInterline property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link OTAAirLowFareSearchRS.PricedItineraries.PricedItinerary.HeaderInformation.ValidInterline }
                 *     
                 */
                public void setValidInterline(OTAAirLowFareSearchRS.PricedItineraries.PricedItinerary.HeaderInformation.ValidInterline value) {
                    this.validInterline = value;
                }

                /**
                 * Gets the value of the validatingCarrier property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link OTAAirLowFareSearchRS.PricedItineraries.PricedItinerary.HeaderInformation.ValidatingCarrier }
                 *     
                 */
                public OTAAirLowFareSearchRS.PricedItineraries.PricedItinerary.HeaderInformation.ValidatingCarrier getValidatingCarrier() {
                    return validatingCarrier;
                }

                /**
                 * Sets the value of the validatingCarrier property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link OTAAirLowFareSearchRS.PricedItineraries.PricedItinerary.HeaderInformation.ValidatingCarrier }
                 *     
                 */
                public void setValidatingCarrier(OTAAirLowFareSearchRS.PricedItineraries.PricedItinerary.HeaderInformation.ValidatingCarrier value) {
                    this.validatingCarrier = value;
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
                 *       &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class ValidatingCarrier {

                    @XmlAttribute(name = "Code")
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
                 *       &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class ValidInterline {

                    @XmlAttribute(name = "Ind")
                    protected Boolean ind;

                    /**
                     * Gets the value of the ind property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Boolean }
                     *     
                     */
                    public Boolean isInd() {
                        return ind;
                    }

                    /**
                     * Sets the value of the ind property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Boolean }
                     *     
                     */
                    public void setInd(Boolean value) {
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
             *         &lt;element name="FlightSegment" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="DestinationLocation" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;attribute name="LocationCode" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="DisclosureAirline" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="Equipment" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;attribute name="AirEquipType" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="FlightDetails" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;attribute name="TrafficRestrictionCode" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="IntermediatePointInfo" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="FlightSegment" maxOccurs="unbounded" minOccurs="0">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;sequence>
             *                                       &lt;element name="Equipment" minOccurs="0">
             *                                         &lt;complexType>
             *                                           &lt;complexContent>
             *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                               &lt;attribute name="AirEquipType" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                             &lt;/restriction>
             *                                           &lt;/complexContent>
             *                                         &lt;/complexType>
             *                                       &lt;/element>
             *                                       &lt;element name="IntermediateLocation" minOccurs="0">
             *                                         &lt;complexType>
             *                                           &lt;complexContent>
             *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                               &lt;attribute name="LocationCode" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                             &lt;/restriction>
             *                                           &lt;/complexContent>
             *                                         &lt;/complexType>
             *                                       &lt;/element>
             *                                     &lt;/sequence>
             *                                     &lt;attribute name="ArrivalDateTime" type="{http://webservices.sabre.com/sabreXML/2011/10}dateTime" />
             *                                     &lt;attribute name="DepartureDateTime" type="{http://webservices.sabre.com/sabreXML/2011/10}dateTime" />
             *                                     &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                     &lt;attribute name="ElapsedTime" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                     &lt;attribute name="IntermediateTimeZone" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                     &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                   &lt;/restriction>
             *                                 &lt;/complexContent>
             *                               &lt;/complexType>
             *                             &lt;/element>
             *                           &lt;/sequence>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="MarketingAirline" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                           &lt;attribute name="FlightNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="MarriageGrp" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="Meal" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;attribute name="MealCode" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="OperatingAirline" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                           &lt;attribute name="CompanyShortName" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="OriginLocation" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;attribute name="LocationCode" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                 &lt;/sequence>
             *                 &lt;attribute name="ArrivalDateTime" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="ConnectionInd" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="DepartureDateTime" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="DestinationTimeZone" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="DivideInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
             *                 &lt;attribute name="ElapsedTime" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="eTicket" type="{http://www.w3.org/2001/XMLSchema}boolean" />
             *                 &lt;attribute name="FlightNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="MarketingCabin" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="OnTimeRate" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="OnTimePercent" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="OriginTimeZone" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="ResBookDesigCode" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="SmokingAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean" />
             *                 &lt;attribute name="StopQuantity" type="{http://www.w3.org/2001/XMLSchema}string" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *       &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" />
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
            public static class OriginDestinationOption {

                @XmlElement(name = "FlightSegment")
                protected List<OTAAirLowFareSearchRS.PricedItineraries.PricedItinerary.OriginDestinationOption.FlightSegment> flightSegment;
                @XmlAttribute(name = "RPH")
                protected String rph;

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
                 * {@link OTAAirLowFareSearchRS.PricedItineraries.PricedItinerary.OriginDestinationOption.FlightSegment }
                 * 
                 * 
                 */
                public List<OTAAirLowFareSearchRS.PricedItineraries.PricedItinerary.OriginDestinationOption.FlightSegment> getFlightSegment() {
                    if (flightSegment == null) {
                        flightSegment = new ArrayList<OTAAirLowFareSearchRS.PricedItineraries.PricedItinerary.OriginDestinationOption.FlightSegment>();
                    }
                    return this.flightSegment;
                }

                /**
                 * Gets the value of the rph property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getRPH() {
                    return rph;
                }

                /**
                 * Sets the value of the rph property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setRPH(String value) {
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
                 *         &lt;element name="DestinationLocation" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;attribute name="LocationCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="DisclosureAirline" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="Equipment" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;attribute name="AirEquipType" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="FlightDetails" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;attribute name="TrafficRestrictionCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="IntermediatePointInfo" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="FlightSegment" maxOccurs="unbounded" minOccurs="0">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;sequence>
                 *                             &lt;element name="Equipment" minOccurs="0">
                 *                               &lt;complexType>
                 *                                 &lt;complexContent>
                 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                                     &lt;attribute name="AirEquipType" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                                   &lt;/restriction>
                 *                                 &lt;/complexContent>
                 *                               &lt;/complexType>
                 *                             &lt;/element>
                 *                             &lt;element name="IntermediateLocation" minOccurs="0">
                 *                               &lt;complexType>
                 *                                 &lt;complexContent>
                 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                                     &lt;attribute name="LocationCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                                   &lt;/restriction>
                 *                                 &lt;/complexContent>
                 *                               &lt;/complexType>
                 *                             &lt;/element>
                 *                           &lt;/sequence>
                 *                           &lt;attribute name="ArrivalDateTime" type="{http://webservices.sabre.com/sabreXML/2011/10}dateTime" />
                 *                           &lt;attribute name="DepartureDateTime" type="{http://webservices.sabre.com/sabreXML/2011/10}dateTime" />
                 *                           &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                           &lt;attribute name="ElapsedTime" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                           &lt;attribute name="IntermediateTimeZone" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                           &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                         &lt;/restriction>
                 *                       &lt;/complexContent>
                 *                     &lt;/complexType>
                 *                   &lt;/element>
                 *                 &lt;/sequence>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="MarketingAirline" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                 &lt;attribute name="FlightNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="MarriageGrp" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="Meal" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;attribute name="MealCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="OperatingAirline" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                 &lt;attribute name="CompanyShortName" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="OriginLocation" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;attribute name="LocationCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *       &lt;/sequence>
                 *       &lt;attribute name="ArrivalDateTime" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="ConnectionInd" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="DepartureDateTime" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="DestinationTimeZone" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="DivideInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
                 *       &lt;attribute name="ElapsedTime" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="eTicket" type="{http://www.w3.org/2001/XMLSchema}boolean" />
                 *       &lt;attribute name="FlightNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="MarketingCabin" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="OnTimeRate" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="OnTimePercent" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="OriginTimeZone" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="ResBookDesigCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="SmokingAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean" />
                 *       &lt;attribute name="StopQuantity" type="{http://www.w3.org/2001/XMLSchema}string" />
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
                    "disclosureAirline",
                    "equipment",
                    "flightDetails",
                    "intermediatePointInfo",
                    "marketingAirline",
                    "marriageGrp",
                    "meal",
                    "operatingAirline",
                    "originLocation"
                })
                public static class FlightSegment {

                    @XmlElement(name = "DestinationLocation")
                    protected OTAAirLowFareSearchRS.PricedItineraries.PricedItinerary.OriginDestinationOption.FlightSegment.DestinationLocation destinationLocation;
                    @XmlElement(name = "DisclosureAirline")
                    protected OTAAirLowFareSearchRS.PricedItineraries.PricedItinerary.OriginDestinationOption.FlightSegment.DisclosureAirline disclosureAirline;
                    @XmlElement(name = "Equipment")
                    protected OTAAirLowFareSearchRS.PricedItineraries.PricedItinerary.OriginDestinationOption.FlightSegment.Equipment equipment;
                    @XmlElement(name = "FlightDetails")
                    protected OTAAirLowFareSearchRS.PricedItineraries.PricedItinerary.OriginDestinationOption.FlightSegment.FlightDetails flightDetails;
                    @XmlElement(name = "IntermediatePointInfo")
                    protected OTAAirLowFareSearchRS.PricedItineraries.PricedItinerary.OriginDestinationOption.FlightSegment.IntermediatePointInfo intermediatePointInfo;
                    @XmlElement(name = "MarketingAirline")
                    protected OTAAirLowFareSearchRS.PricedItineraries.PricedItinerary.OriginDestinationOption.FlightSegment.MarketingAirline marketingAirline;
                    @XmlElement(name = "MarriageGrp")
                    protected OTAAirLowFareSearchRS.PricedItineraries.PricedItinerary.OriginDestinationOption.FlightSegment.MarriageGrp marriageGrp;
                    @XmlElement(name = "Meal")
                    protected OTAAirLowFareSearchRS.PricedItineraries.PricedItinerary.OriginDestinationOption.FlightSegment.Meal meal;
                    @XmlElement(name = "OperatingAirline")
                    protected OTAAirLowFareSearchRS.PricedItineraries.PricedItinerary.OriginDestinationOption.FlightSegment.OperatingAirline operatingAirline;
                    @XmlElement(name = "OriginLocation")
                    protected OTAAirLowFareSearchRS.PricedItineraries.PricedItinerary.OriginDestinationOption.FlightSegment.OriginLocation originLocation;
                    @XmlAttribute(name = "ArrivalDateTime")
                    protected String arrivalDateTime;
                    @XmlAttribute(name = "ConnectionInd")
                    protected String connectionInd;
                    @XmlAttribute(name = "DepartureDateTime")
                    protected String departureDateTime;
                    @XmlAttribute(name = "DestinationTimeZone")
                    protected String destinationTimeZone;
                    @XmlAttribute(name = "DivideInd")
                    protected Boolean divideInd;
                    @XmlAttribute(name = "ElapsedTime")
                    protected String elapsedTime;
                    @XmlAttribute(name = "eTicket")
                    protected Boolean eTicket;
                    @XmlAttribute(name = "FlightNumber")
                    protected String flightNumber;
                    @XmlAttribute(name = "MarketingCabin")
                    protected String marketingCabin;
                    @XmlAttribute(name = "OnTimeRate")
                    protected String onTimeRate;
                    @XmlAttribute(name = "OnTimePercent")
                    protected String onTimePercent;
                    @XmlAttribute(name = "OriginTimeZone")
                    protected String originTimeZone;
                    @XmlAttribute(name = "ResBookDesigCode")
                    protected String resBookDesigCode;
                    @XmlAttribute(name = "RPH")
                    protected String rph;
                    @XmlAttribute(name = "SmokingAllowed")
                    protected Boolean smokingAllowed;
                    @XmlAttribute(name = "StopQuantity")
                    protected String stopQuantity;

                    /**
                     * Gets the value of the destinationLocation property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link OTAAirLowFareSearchRS.PricedItineraries.PricedItinerary.OriginDestinationOption.FlightSegment.DestinationLocation }
                     *     
                     */
                    public OTAAirLowFareSearchRS.PricedItineraries.PricedItinerary.OriginDestinationOption.FlightSegment.DestinationLocation getDestinationLocation() {
                        return destinationLocation;
                    }

                    /**
                     * Sets the value of the destinationLocation property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link OTAAirLowFareSearchRS.PricedItineraries.PricedItinerary.OriginDestinationOption.FlightSegment.DestinationLocation }
                     *     
                     */
                    public void setDestinationLocation(OTAAirLowFareSearchRS.PricedItineraries.PricedItinerary.OriginDestinationOption.FlightSegment.DestinationLocation value) {
                        this.destinationLocation = value;
                    }

                    /**
                     * Gets the value of the disclosureAirline property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link OTAAirLowFareSearchRS.PricedItineraries.PricedItinerary.OriginDestinationOption.FlightSegment.DisclosureAirline }
                     *     
                     */
                    public OTAAirLowFareSearchRS.PricedItineraries.PricedItinerary.OriginDestinationOption.FlightSegment.DisclosureAirline getDisclosureAirline() {
                        return disclosureAirline;
                    }

                    /**
                     * Sets the value of the disclosureAirline property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link OTAAirLowFareSearchRS.PricedItineraries.PricedItinerary.OriginDestinationOption.FlightSegment.DisclosureAirline }
                     *     
                     */
                    public void setDisclosureAirline(OTAAirLowFareSearchRS.PricedItineraries.PricedItinerary.OriginDestinationOption.FlightSegment.DisclosureAirline value) {
                        this.disclosureAirline = value;
                    }

                    /**
                     * Gets the value of the equipment property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link OTAAirLowFareSearchRS.PricedItineraries.PricedItinerary.OriginDestinationOption.FlightSegment.Equipment }
                     *     
                     */
                    public OTAAirLowFareSearchRS.PricedItineraries.PricedItinerary.OriginDestinationOption.FlightSegment.Equipment getEquipment() {
                        return equipment;
                    }

                    /**
                     * Sets the value of the equipment property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link OTAAirLowFareSearchRS.PricedItineraries.PricedItinerary.OriginDestinationOption.FlightSegment.Equipment }
                     *     
                     */
                    public void setEquipment(OTAAirLowFareSearchRS.PricedItineraries.PricedItinerary.OriginDestinationOption.FlightSegment.Equipment value) {
                        this.equipment = value;
                    }

                    /**
                     * Gets the value of the flightDetails property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link OTAAirLowFareSearchRS.PricedItineraries.PricedItinerary.OriginDestinationOption.FlightSegment.FlightDetails }
                     *     
                     */
                    public OTAAirLowFareSearchRS.PricedItineraries.PricedItinerary.OriginDestinationOption.FlightSegment.FlightDetails getFlightDetails() {
                        return flightDetails;
                    }

                    /**
                     * Sets the value of the flightDetails property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link OTAAirLowFareSearchRS.PricedItineraries.PricedItinerary.OriginDestinationOption.FlightSegment.FlightDetails }
                     *     
                     */
                    public void setFlightDetails(OTAAirLowFareSearchRS.PricedItineraries.PricedItinerary.OriginDestinationOption.FlightSegment.FlightDetails value) {
                        this.flightDetails = value;
                    }

                    /**
                     * Gets the value of the intermediatePointInfo property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link OTAAirLowFareSearchRS.PricedItineraries.PricedItinerary.OriginDestinationOption.FlightSegment.IntermediatePointInfo }
                     *     
                     */
                    public OTAAirLowFareSearchRS.PricedItineraries.PricedItinerary.OriginDestinationOption.FlightSegment.IntermediatePointInfo getIntermediatePointInfo() {
                        return intermediatePointInfo;
                    }

                    /**
                     * Sets the value of the intermediatePointInfo property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link OTAAirLowFareSearchRS.PricedItineraries.PricedItinerary.OriginDestinationOption.FlightSegment.IntermediatePointInfo }
                     *     
                     */
                    public void setIntermediatePointInfo(OTAAirLowFareSearchRS.PricedItineraries.PricedItinerary.OriginDestinationOption.FlightSegment.IntermediatePointInfo value) {
                        this.intermediatePointInfo = value;
                    }

                    /**
                     * Gets the value of the marketingAirline property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link OTAAirLowFareSearchRS.PricedItineraries.PricedItinerary.OriginDestinationOption.FlightSegment.MarketingAirline }
                     *     
                     */
                    public OTAAirLowFareSearchRS.PricedItineraries.PricedItinerary.OriginDestinationOption.FlightSegment.MarketingAirline getMarketingAirline() {
                        return marketingAirline;
                    }

                    /**
                     * Sets the value of the marketingAirline property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link OTAAirLowFareSearchRS.PricedItineraries.PricedItinerary.OriginDestinationOption.FlightSegment.MarketingAirline }
                     *     
                     */
                    public void setMarketingAirline(OTAAirLowFareSearchRS.PricedItineraries.PricedItinerary.OriginDestinationOption.FlightSegment.MarketingAirline value) {
                        this.marketingAirline = value;
                    }

                    /**
                     * Gets the value of the marriageGrp property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link OTAAirLowFareSearchRS.PricedItineraries.PricedItinerary.OriginDestinationOption.FlightSegment.MarriageGrp }
                     *     
                     */
                    public OTAAirLowFareSearchRS.PricedItineraries.PricedItinerary.OriginDestinationOption.FlightSegment.MarriageGrp getMarriageGrp() {
                        return marriageGrp;
                    }

                    /**
                     * Sets the value of the marriageGrp property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link OTAAirLowFareSearchRS.PricedItineraries.PricedItinerary.OriginDestinationOption.FlightSegment.MarriageGrp }
                     *     
                     */
                    public void setMarriageGrp(OTAAirLowFareSearchRS.PricedItineraries.PricedItinerary.OriginDestinationOption.FlightSegment.MarriageGrp value) {
                        this.marriageGrp = value;
                    }

                    /**
                     * Gets the value of the meal property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link OTAAirLowFareSearchRS.PricedItineraries.PricedItinerary.OriginDestinationOption.FlightSegment.Meal }
                     *     
                     */
                    public OTAAirLowFareSearchRS.PricedItineraries.PricedItinerary.OriginDestinationOption.FlightSegment.Meal getMeal() {
                        return meal;
                    }

                    /**
                     * Sets the value of the meal property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link OTAAirLowFareSearchRS.PricedItineraries.PricedItinerary.OriginDestinationOption.FlightSegment.Meal }
                     *     
                     */
                    public void setMeal(OTAAirLowFareSearchRS.PricedItineraries.PricedItinerary.OriginDestinationOption.FlightSegment.Meal value) {
                        this.meal = value;
                    }

                    /**
                     * Gets the value of the operatingAirline property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link OTAAirLowFareSearchRS.PricedItineraries.PricedItinerary.OriginDestinationOption.FlightSegment.OperatingAirline }
                     *     
                     */
                    public OTAAirLowFareSearchRS.PricedItineraries.PricedItinerary.OriginDestinationOption.FlightSegment.OperatingAirline getOperatingAirline() {
                        return operatingAirline;
                    }

                    /**
                     * Sets the value of the operatingAirline property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link OTAAirLowFareSearchRS.PricedItineraries.PricedItinerary.OriginDestinationOption.FlightSegment.OperatingAirline }
                     *     
                     */
                    public void setOperatingAirline(OTAAirLowFareSearchRS.PricedItineraries.PricedItinerary.OriginDestinationOption.FlightSegment.OperatingAirline value) {
                        this.operatingAirline = value;
                    }

                    /**
                     * Gets the value of the originLocation property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link OTAAirLowFareSearchRS.PricedItineraries.PricedItinerary.OriginDestinationOption.FlightSegment.OriginLocation }
                     *     
                     */
                    public OTAAirLowFareSearchRS.PricedItineraries.PricedItinerary.OriginDestinationOption.FlightSegment.OriginLocation getOriginLocation() {
                        return originLocation;
                    }

                    /**
                     * Sets the value of the originLocation property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link OTAAirLowFareSearchRS.PricedItineraries.PricedItinerary.OriginDestinationOption.FlightSegment.OriginLocation }
                     *     
                     */
                    public void setOriginLocation(OTAAirLowFareSearchRS.PricedItineraries.PricedItinerary.OriginDestinationOption.FlightSegment.OriginLocation value) {
                        this.originLocation = value;
                    }

                    /**
                     * Gets the value of the arrivalDateTime property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getArrivalDateTime() {
                        return arrivalDateTime;
                    }

                    /**
                     * Sets the value of the arrivalDateTime property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setArrivalDateTime(String value) {
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
                     *     {@link String }
                     *     
                     */
                    public String getDepartureDateTime() {
                        return departureDateTime;
                    }

                    /**
                     * Sets the value of the departureDateTime property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setDepartureDateTime(String value) {
                        this.departureDateTime = value;
                    }

                    /**
                     * Gets the value of the destinationTimeZone property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getDestinationTimeZone() {
                        return destinationTimeZone;
                    }

                    /**
                     * Sets the value of the destinationTimeZone property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setDestinationTimeZone(String value) {
                        this.destinationTimeZone = value;
                    }

                    /**
                     * Gets the value of the divideInd property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Boolean }
                     *     
                     */
                    public Boolean isDivideInd() {
                        return divideInd;
                    }

                    /**
                     * Sets the value of the divideInd property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Boolean }
                     *     
                     */
                    public void setDivideInd(Boolean value) {
                        this.divideInd = value;
                    }

                    /**
                     * Gets the value of the elapsedTime property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getElapsedTime() {
                        return elapsedTime;
                    }

                    /**
                     * Sets the value of the elapsedTime property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setElapsedTime(String value) {
                        this.elapsedTime = value;
                    }

                    /**
                     * Gets the value of the eTicket property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Boolean }
                     *     
                     */
                    public Boolean isETicket() {
                        return eTicket;
                    }

                    /**
                     * Sets the value of the eTicket property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Boolean }
                     *     
                     */
                    public void setETicket(Boolean value) {
                        this.eTicket = value;
                    }

                    /**
                     * Gets the value of the flightNumber property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getFlightNumber() {
                        return flightNumber;
                    }

                    /**
                     * Sets the value of the flightNumber property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setFlightNumber(String value) {
                        this.flightNumber = value;
                    }

                    /**
                     * Gets the value of the marketingCabin property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getMarketingCabin() {
                        return marketingCabin;
                    }

                    /**
                     * Sets the value of the marketingCabin property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setMarketingCabin(String value) {
                        this.marketingCabin = value;
                    }

                    /**
                     * Gets the value of the onTimeRate property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getOnTimeRate() {
                        return onTimeRate;
                    }

                    /**
                     * Sets the value of the onTimeRate property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setOnTimeRate(String value) {
                        this.onTimeRate = value;
                    }

                    /**
                     * Gets the value of the onTimePercent property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getOnTimePercent() {
                        return onTimePercent;
                    }

                    /**
                     * Sets the value of the onTimePercent property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setOnTimePercent(String value) {
                        this.onTimePercent = value;
                    }

                    /**
                     * Gets the value of the originTimeZone property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getOriginTimeZone() {
                        return originTimeZone;
                    }

                    /**
                     * Sets the value of the originTimeZone property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setOriginTimeZone(String value) {
                        this.originTimeZone = value;
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
                     * Gets the value of the rph property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getRPH() {
                        return rph;
                    }

                    /**
                     * Sets the value of the rph property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setRPH(String value) {
                        this.rph = value;
                    }

                    /**
                     * Gets the value of the smokingAllowed property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Boolean }
                     *     
                     */
                    public Boolean isSmokingAllowed() {
                        return smokingAllowed;
                    }

                    /**
                     * Sets the value of the smokingAllowed property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Boolean }
                     *     
                     */
                    public void setSmokingAllowed(Boolean value) {
                        this.smokingAllowed = value;
                    }

                    /**
                     * Gets the value of the stopQuantity property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getStopQuantity() {
                        return stopQuantity;
                    }

                    /**
                     * Sets the value of the stopQuantity property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setStopQuantity(String value) {
                        this.stopQuantity = value;
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
                     *       &lt;attribute name="LocationCode" type="{http://www.w3.org/2001/XMLSchema}string" />
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

                        @XmlAttribute(name = "LocationCode")
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
                     *       &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class DisclosureAirline {

                        @XmlAttribute(name = "Code")
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
                     *       &lt;attribute name="AirEquipType" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class Equipment {

                        @XmlAttribute(name = "AirEquipType")
                        protected String airEquipType;

                        /**
                         * Gets the value of the airEquipType property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getAirEquipType() {
                            return airEquipType;
                        }

                        /**
                         * Sets the value of the airEquipType property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setAirEquipType(String value) {
                            this.airEquipType = value;
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
                     *       &lt;attribute name="TrafficRestrictionCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class FlightDetails {

                        @XmlAttribute(name = "TrafficRestrictionCode")
                        protected String trafficRestrictionCode;

                        /**
                         * Gets the value of the trafficRestrictionCode property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getTrafficRestrictionCode() {
                            return trafficRestrictionCode;
                        }

                        /**
                         * Sets the value of the trafficRestrictionCode property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setTrafficRestrictionCode(String value) {
                            this.trafficRestrictionCode = value;
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
                     *         &lt;element name="FlightSegment" maxOccurs="unbounded" minOccurs="0">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;sequence>
                     *                   &lt;element name="Equipment" minOccurs="0">
                     *                     &lt;complexType>
                     *                       &lt;complexContent>
                     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                           &lt;attribute name="AirEquipType" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *                         &lt;/restriction>
                     *                       &lt;/complexContent>
                     *                     &lt;/complexType>
                     *                   &lt;/element>
                     *                   &lt;element name="IntermediateLocation" minOccurs="0">
                     *                     &lt;complexType>
                     *                       &lt;complexContent>
                     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                           &lt;attribute name="LocationCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *                         &lt;/restriction>
                     *                       &lt;/complexContent>
                     *                     &lt;/complexType>
                     *                   &lt;/element>
                     *                 &lt;/sequence>
                     *                 &lt;attribute name="ArrivalDateTime" type="{http://webservices.sabre.com/sabreXML/2011/10}dateTime" />
                     *                 &lt;attribute name="DepartureDateTime" type="{http://webservices.sabre.com/sabreXML/2011/10}dateTime" />
                     *                 &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *                 &lt;attribute name="ElapsedTime" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *                 &lt;attribute name="IntermediateTimeZone" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *                 &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" />
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
                        //"flightSegment"
                    })
                    public static class IntermediatePointInfo {

                       /* @XmlElement(name = "FlightSegment")
                        protected List<OTAAirLowFareSearchRS.PricedItineraries.PricedItinerary.OriginDestinationOption.FlightSegment.IntermediatePointInfo.FlightSegment> flightSegment;
*/
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
                         * {@link OTAAirLowFareSearchRS.PricedItineraries.PricedItinerary.OriginDestinationOption.FlightSegment.IntermediatePointInfo.FlightSegment }
                         * 
                         * 
                         */
                        /*public List<OTAAirLowFareSearchRS.PricedItineraries.PricedItinerary.OriginDestinationOption.FlightSegment.IntermediatePointInfo.FlightSegment> getFlightSegment() {
                            if (flightSegment == null) {
                                flightSegment = new ArrayList<OTAAirLowFareSearchRS.PricedItineraries.PricedItinerary.OriginDestinationOption.FlightSegment.IntermediatePointInfo.FlightSegment>();
                            }
                            return this.flightSegment;
                        }*/



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
                     *       &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *       &lt;attribute name="FlightNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class MarketingAirline {

                        @XmlAttribute(name = "Code")
                        protected String code;
                        @XmlAttribute(name = "FlightNumber")
                        protected String flightNumber;

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
                         * Gets the value of the flightNumber property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getFlightNumber() {
                            return flightNumber;
                        }

                        /**
                         * Sets the value of the flightNumber property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setFlightNumber(String value) {
                            this.flightNumber = value;
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
                     *       &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class MarriageGrp {

                        @XmlAttribute(name = "Ind")
                        protected String ind;

                        /**
                         * Gets the value of the ind property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getInd() {
                            return ind;
                        }

                        /**
                         * Sets the value of the ind property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setInd(String value) {
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
                     *       &lt;attribute name="MealCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class Meal {

                        @XmlAttribute(name = "MealCode")
                        protected String mealCode;

                        /**
                         * Gets the value of the mealCode property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getMealCode() {
                            return mealCode;
                        }

                        /**
                         * Sets the value of the mealCode property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setMealCode(String value) {
                            this.mealCode = value;
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
                     *       &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *       &lt;attribute name="CompanyShortName" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class OperatingAirline {

                        @XmlAttribute(name = "Code")
                        protected String code;
                        @XmlAttribute(name = "CompanyShortName")
                        protected String companyShortName;

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
                         * Gets the value of the companyShortName property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getCompanyShortName() {
                            return companyShortName;
                        }

                        /**
                         * Sets the value of the companyShortName property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setCompanyShortName(String value) {
                            this.companyShortName = value;
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
                     *       &lt;attribute name="LocationCode" type="{http://www.w3.org/2001/XMLSchema}string" />
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

                        @XmlAttribute(name = "LocationCode")
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

            }

        }

    }

}
