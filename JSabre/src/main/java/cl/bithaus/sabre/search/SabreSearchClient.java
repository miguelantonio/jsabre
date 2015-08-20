package cl.bithaus.sabre.search;

import cl.bithaus.sabre.AbstractSabreClient;
import cl.bithaus.sabre.SabreConstants;
import cl.bithaus.sabre.bo.SabreFlightSegment;
import cl.bithaus.sabre.bo.SabreSearchRequest;
import cl.bithaus.sabre.bo.SabreSearchResponse;
import cl.bithaus.sabre.bo.SabrePassengerPrice;
import cl.bithaus.sabre.exceptions.SabreException;
import com.sabre.services.stl_header.v120.CompletionCodes;
import com.sabre.webservices.sabrexml._2011._10.OTAAirLowFareSearchRQ;
import com.sabre.webservices.sabrexml._2011._10.OTAAirLowFareSearchRS;
import com.sabre.webservices.sabrexml._2011._10.OTAAirLowFareSearchRS.PricedItineraries.PricedItinerary;
import com.sabre.webservices.sabrexml._2011._10.OTAAirLowFareSearchRS.PricedItineraries.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare.Taxes.Tax;

import https.webservices_sabre_com.websvc.OTAAirLowFareSearchPortType;
import https.webservices_sabre_com.websvc.OTAAirLowFareSearchService;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.URL;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.ws.Holder;
import javax.xml.ws.soap.SOAPFaultException;
import org.ebxml.namespaces.messageheader.From;
import org.ebxml.namespaces.messageheader.MessageData;
import org.ebxml.namespaces.messageheader.MessageHeader;
import org.ebxml.namespaces.messageheader.PartyId;
import org.ebxml.namespaces.messageheader.To;
import org.xmlsoap.schemas.ws._2002._12.secext.Security;

/**
 *
 * @author Miguel A. Fuentes Buchholtz
 * @email miguel@variacode.com
 */
public class SabreSearchClient extends AbstractSabreClient {

    private final OTAAirLowFareSearchService serviceSearch = new OTAAirLowFareSearchService();
    private final OTAAirLowFareSearchPortType portSearch;

    private final String senderCompanyDomain;
    private final URL endpointURL;
    private final String IPCC;

    private final static String SEARCH_VERSION = "2.3.0";

    /**
     *
     * @param endpointURL
     * @param senderCompanyDomain
     * @param IPCC
     */
    public SabreSearchClient(URL endpointURL, String senderCompanyDomain, String IPCC) {
        this.endpointURL = endpointURL;
        this.senderCompanyDomain = senderCompanyDomain;
        this.IPCC = IPCC;
        this.portSearch = portAddContext(serviceSearch.getOTAAirLowFareSearchPortType(), endpointURL.toString());
    }

    /**
     *
     * @param request
     * @param token
     * @return
     */
    public List<SabreSearchResponse> search(SabreSearchRequest request, String token) {
        if (SabreConstants.DEBUG) {
            Logger.getLogger(SabreSearchClient.class.getName()).log(Level.INFO, "SEARCH USING SESSION TOKEN: " + token);
        }
        MessageHeader messageHeader = new MessageHeader();
        From from = new From();
        PartyId fromPartyId = new PartyId();
        fromPartyId.setType(PARTYID_TYPE);
        fromPartyId.setValue(this.senderCompanyDomain);
        from.setPartyId(Collections.singletonList(fromPartyId));
        To to = new To();
        PartyId toPartyId = new PartyId();
        toPartyId.setValue(this.endpointURL.getHost());
        toPartyId.setType(PARTYID_TYPE);
        to.setPartyId(Collections.singletonList(toPartyId));
        MessageData messageData = new MessageData();
        messageData.setMessageId(this.sequence.incrementAndGet() + "-" + System.currentTimeMillis() + "@" + this.senderCompanyDomain);
        messageData.setTimestamp(getSabreDateFormat().format(new Date()));//2003-12-09T11:15:12Z
        messageHeader.setConversationId(this.sequence.incrementAndGet() + "-" + System.currentTimeMillis() + "@" + this.senderCompanyDomain);
        messageHeader.setFrom(from);
        messageHeader.setTo(to);
        messageHeader.setAction("OTA_AirLowFareSearchLLSRQ");
        messageHeader.setCPAId(this.IPCC);
        messageHeader.setMessageData(messageData);
        messageHeader.setVersion(SEARCH_VERSION);

        Security security = new Security();
        security.setBinarySecurityToken(token);

        OTAAirLowFareSearchRQ.OriginDestinationInformation.FlightSegment.OriginLocation origin = new OTAAirLowFareSearchRQ.OriginDestinationInformation.FlightSegment.OriginLocation();
        origin.setLocationCode(request.getFrom());
        OTAAirLowFareSearchRQ.OriginDestinationInformation.FlightSegment.DestinationLocation destination = new OTAAirLowFareSearchRQ.OriginDestinationInformation.FlightSegment.DestinationLocation();
        destination.setLocationCode(request.getTo());

        OTAAirLowFareSearchRQ.OriginDestinationInformation.FlightSegment fsFrom = new OTAAirLowFareSearchRQ.OriginDestinationInformation.FlightSegment();
        fsFrom.setOriginLocation(origin);
        fsFrom.setDestinationLocation(destination);
        fsFrom.setDepartureDateTime(request.getDepartureDate() == null ? null : getSabreDateFormat().format(request.getDepartureDate()));

        List<OTAAirLowFareSearchRQ.OriginDestinationInformation.FlightSegment> segment1 = new ArrayList<OTAAirLowFareSearchRQ.OriginDestinationInformation.FlightSegment>();
        segment1.add(fsFrom);

        List<OTAAirLowFareSearchRQ.OriginDestinationInformation> odiList = new ArrayList<OTAAirLowFareSearchRQ.OriginDestinationInformation>();

        OTAAirLowFareSearchRQ.OriginDestinationInformation odi1 = new OTAAirLowFareSearchRQ.OriginDestinationInformation();
        odi1.setRPH(BigInteger.ONE);
        odi1.setFlightSegment(segment1);
        odiList.add(odi1);
        if (request.getReturnDate() != null) {
            OTAAirLowFareSearchRQ.OriginDestinationInformation.FlightSegment fsTo = new OTAAirLowFareSearchRQ.OriginDestinationInformation.FlightSegment();
            OTAAirLowFareSearchRQ.OriginDestinationInformation.FlightSegment.DestinationLocation toOrigin = new OTAAirLowFareSearchRQ.OriginDestinationInformation.FlightSegment.DestinationLocation();
            toOrigin.setLocationCode(request.getFrom());
            fsTo.setDestinationLocation(toOrigin);
            OTAAirLowFareSearchRQ.OriginDestinationInformation.FlightSegment.OriginLocation fromDestination = new OTAAirLowFareSearchRQ.OriginDestinationInformation.FlightSegment.OriginLocation();
            fromDestination.setLocationCode(request.getTo());
            fsTo.setOriginLocation(fromDestination);
            fsTo.setDepartureDateTime(request.getReturnDate() == null ? null : getSabreDateFormat().format(request.getReturnDate()));
            segment1.add(fsTo);
        }

        List<OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.PassengerType> passengers = new ArrayList<OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.PassengerType>();

        if (request.getAdults() > 0) {
            OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.PassengerType adults = new OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.PassengerType();
            adults.setCode(SabreConstants.PASSENGER_TYPE_ADULT);
            adults.setQuantity(BigInteger.valueOf(request.getAdults()));
            passengers.add(adults);
        }
        if (request.getChildren() > 0) {
            OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.PassengerType children = new OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.PassengerType();
            children.setCode(SabreConstants.PASSENGER_TYPE_CHILD);
            children.setQuantity(BigInteger.valueOf(request.getChildren()));
            passengers.add(children);
        }
        if (request.getInfants() > 0) {
            OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.PassengerType infants = new OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.PassengerType();
            infants.setCode(SabreConstants.PASSENGER_TYPE_INFANT);
            infants.setQuantity(BigInteger.valueOf(request.getInfants()));
            passengers.add(infants);
        }

        OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers pq = new OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers();
        pq.setPassengerType(passengers);

        OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers oq = new OTAAirLowFareSearchRQ.PriceRequestInformation.OptionalQualifiers();
        oq.setPricingQualifiers(pq);

        OTAAirLowFareSearchRQ.PriceRequestInformation priceRequest = new OTAAirLowFareSearchRQ.PriceRequestInformation();
        priceRequest.setOptionalQualifiers(oq);

        OTAAirLowFareSearchRQ otaRequest = new OTAAirLowFareSearchRQ();
        otaRequest.setOriginDestinationInformation(odiList);
        otaRequest.setPriceRequestInformation(priceRequest);
        otaRequest.setVersion(SEARCH_VERSION);
        OTAAirLowFareSearchRS result;
        try {
            result = this.portSearch.otaAirLowFareSearchRQ(new Holder<MessageHeader>(messageHeader), new Holder<Security>(security), otaRequest);
        } catch (SOAPFaultException e) {
            Logger.getLogger(SabreSearchClient.class.getName()).log(Level.SEVERE, null, e);
            return Collections.singletonList(super.generateErrorResponse(new SabreSearchResponse(), "Error en llamada a Sabre", e.getMessage(), e.toString()));
        }

        List<SabreSearchResponse> responses = new ArrayList<SabreSearchResponse>();
        if (result == null || result.getApplicationResults() == null || result.getPricedItineraries() == null
                || result.getPricedItineraries().getPricedItinerary() == null || result.getPricedItineraries().getPricedItinerary().isEmpty()
                || null == result.getApplicationResults().getStatus() || !result.getApplicationResults().getStatus().equals(CompletionCodes.COMPLETE)) {
            responses.add(super.generateErrorResponse(new SabreSearchResponse(), result == null ? null : result.getApplicationResults()));
            return responses;
        }
        for (PricedItinerary itinerary : result.getPricedItineraries().getPricedItinerary()) {
            SabreSearchResponse response = new SabreSearchResponse();
            response.setStatus(result.getApplicationResults().getStatus().value());
            if (itinerary.getAirItineraryPricingInfo() != null && !itinerary.getAirItineraryPricingInfo().isEmpty()) {
                List<SabrePassengerPrice> passengerPrices = new ArrayList<SabrePassengerPrice>();
                for (PricedItinerary.AirItineraryPricingInfo pi : itinerary.getAirItineraryPricingInfo()) {
                    List<cl.bithaus.sabre.bo.SabrePassengerPrice.Tax> taxes = new ArrayList<SabrePassengerPrice.Tax>();
                    BigDecimal taxTotal = BigDecimal.ZERO;
                    SabrePassengerPrice pp = new SabrePassengerPrice();
                    if (pi.getItinTotalFare().getTaxes() != null && pi.getItinTotalFare().getTaxes().getTax() != null) {
                        for (Tax tax : pi.getItinTotalFare().getTaxes().getTax()) {
                            cl.bithaus.sabre.bo.SabrePassengerPrice.Tax t = new cl.bithaus.sabre.bo.SabrePassengerPrice.Tax();
                            t.setAmount(safeStringToBigDecimal(tax.getAmount()));
                            t.setCode(tax.getTaxCode());
                            t.setDescription(tax.getTaxName());
                            taxes.add(t);
                            taxTotal = taxTotal.add(t.getAmount());
                        }
                    }
                    pp.setTotal(pi.getItinTotalFare() == null || pi.getItinTotalFare().getTotalFare() == null ? null : safeStringToBigDecimal(pi.getItinTotalFare().getTotalFare().getAmount()));
                    pp.setPriceBase(pi.getItinTotalFare() == null || pi.getItinTotalFare().getEquivFare() == null ? null : safeStringToBigDecimal(pi.getItinTotalFare().getEquivFare().getAmount()));
                    pp.setPassengerType(pi.getPassengerTypeQuantity() == null ? null : pi.getPassengerTypeQuantity().getCode());
                    pp.setPassengerQuantity(pi.getPassengerTypeQuantity() == null ? null : Integer.parseInt(pi.getPassengerTypeQuantity().getQuantity()));
                    pp.setPriceTaxes(taxes);
                    pp.setTaxesTotal(taxTotal);
                    passengerPrices.add(pp);
                }
                response.setPassengerPrice(passengerPrices);
            }
            response.setCurrency(itinerary.getCurrencyCode());
            response.setPrice(safeStringToBigDecimal(itinerary.getTotalAmount()));
            response.setAirline(itinerary.getHeaderInformation() == null || itinerary.getHeaderInformation().getValidInterline() == null ? null : itinerary.getHeaderInformation().getValidatingCarrier().getCode());
            if (itinerary.getOriginDestinationOption() != null) {
                for (PricedItinerary.OriginDestinationOption option : itinerary.getOriginDestinationOption()) {
                    if (option.getRPH().equals("1")) {//IDA
                        List<SabreFlightSegment> departureSegments = new ArrayList<SabreFlightSegment>();
                        for (PricedItinerary.OriginDestinationOption.FlightSegment segment : option.getFlightSegment()) {
                            departureSegments.add(toSabreFlightSegment(segment));
                        }
                        response.setDepartureFlight(departureSegments);
                    } else if (option.getRPH().equals("2")) {//VUELTA
                        List<SabreFlightSegment> returnSegments = new ArrayList<SabreFlightSegment>();
                        for (PricedItinerary.OriginDestinationOption.FlightSegment segment : option.getFlightSegment()) {
                            returnSegments.add(toSabreFlightSegment(segment));
                        }
                        response.setReturnFlight(returnSegments);
                    } else {
                        Logger.getLogger(SabreSearchClient.class.getName()).log(Level.SEVERE, null, new SabreException("Se encontraron mas FlightSegments de lo normal para " + request.toString()));
                    }
                }
            }
            response.setFrom(request.getFrom());
            response.setDepartureDate(request.getDepartureDate());
            responses.add(response);
        }
        return responses;
    }

    private SabreFlightSegment toSabreFlightSegment(PricedItinerary.OriginDestinationOption.FlightSegment segment) {
        SabreFlightSegment s = new SabreFlightSegment();
        if (segment != null) {
            s.setFrom(segment.getOriginLocation() == null ? null : segment.getOriginLocation().getLocationCode());
            s.setTo(segment.getDestinationLocation() == null ? null : segment.getDestinationLocation().getLocationCode());
            try {
                s.setArrival(segment.getArrivalDateTime() == null ? null : getSabreDateFormatNoSecond().parse(segment.getArrivalDateTime()));
            } catch (ParseException ex) {
                Logger.getLogger(SabreSearchClient.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                s.setDeparture(segment.getDepartureDateTime() == null ? null : getSabreDateFormatNoSecond().parse(segment.getDepartureDateTime()));
            } catch (ParseException ex) {
                Logger.getLogger(SabreSearchClient.class.getName()).log(Level.SEVERE, null, ex);
            }
            s.setElapsedTime(safeStringToBigDecimal(segment.getElapsedTime()));
            s.setMeal(segment.getMeal() == null ? Collections.EMPTY_LIST : Collections.singletonList(segment.getMeal().getMealCode()));
            s.setMarriageGrp(segment.getMarriageGrp() == null ? null : segment.getMarriageGrp().getInd());
            s.setResBookDesigCode(segment.getResBookDesigCode());
            s.setEquipmentCode(segment.getEquipment() == null ? null : segment.getEquipment().getAirEquipType());
            s.setMarketingAirline(segment.getMarketingAirline() == null ? null : segment.getMarketingAirline().getCode());
            s.setMarketingAirlineFlightNumber(segment.getMarketingAirline() == null ? null : segment.getMarketingAirline().getFlightNumber());
            s.setCabin(segment.getMarketingCabin());
            s.setAirline(segment.getOperatingAirline().getCode());
            s.setArrivalTimeZone(segment.getDestinationTimeZone());
            s.setDuration(Integer.parseInt(segment.getElapsedTime()));
            s.setFlightNumber(segment.getFlightNumber());
            s.setDepartureTimeZone(segment.getOriginTimeZone());
        }
        return s;
    }
}
