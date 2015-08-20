package cl.bithaus.sabre.book;

import cl.bithaus.sabre.AbstractSabreClient;
import cl.bithaus.sabre.JSabre;
import cl.bithaus.sabre.SabreConstants;
import cl.bithaus.sabre.bo.SabreBookRequest;
import cl.bithaus.sabre.bo.SabreBookResponse;
import cl.bithaus.sabre.bo.SabreCancelResponse;
import cl.bithaus.sabre.bo.SabreFlightSegment;
import cl.bithaus.sabre.bo.SabrePassengerInformation;
import cl.bithaus.sabre.bo.SabrePassengerPrice;
import cl.bithaus.sabre.bo.SabreSearchResponse;
import cl.bithaus.sabre.exceptions.SabreException;
import com.sabre.services.stl_header.v120.CompletionCodes;
import com.sabre.webservices.sabrexml._2011._10.EndTransactionRQ;
import com.sabre.webservices.sabrexml._2011._10.EndTransactionRS;
import com.sabre.webservices.sabrexml._2011._10.EnhancedAirBookRQ;
import com.sabre.webservices.sabrexml._2011._10.EnhancedAirBookRS;
import com.sabre.webservices.sabrexml._2011._10.EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary;
import com.sabre.webservices.sabrexml._2011._10.OTACancelRQ;
import com.sabre.webservices.sabrexml._2011._10.OTACancelRS;
import com.sabre.webservices.sabrexml._2011._10.PassengerDetailsRQ;
import com.sabre.webservices.sabrexml._2011._10.PassengerDetailsRQ.TravelItineraryAddInfoRQ.CustomerInfo.ContactNumbers.ContactNumber;
import com.sabre.webservices.sabrexml._2011._10.PassengerDetailsRS;
import com.sabre.webservices.sabrexml._2011._10.PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary;
import com.sabre.webservices.sabrexml._2011._10.PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.AirItineraryPricingInfo.PTCFareBreakdown.FareBasis;
import com.sabre.webservices.sabrexml._2011._10.TravelItineraryReadRQ;
import com.sabre.webservices.sabrexml._2011._10.TravelItineraryReadRS;
import com.sabre.webservices.sabrexml._2011._10.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item;
import com.sabre.webservices.sabrexml._2011._10.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.FlightSegment;
import https.webservices_sabre_com.websvc.EndTransactionPortType;
import https.webservices_sabre_com.websvc.EndTransactionService;
import https.webservices_sabre_com.websvc.EnhancedAirBookPortType;
import https.webservices_sabre_com.websvc.EnhancedAirBookService;
import https.webservices_sabre_com.websvc.OTACancelPortType;
import https.webservices_sabre_com.websvc.OTACancelService;
import https.webservices_sabre_com.websvc.PassengerDetailsPortType;
import https.webservices_sabre_com.websvc.PassengerDetailsService;
import https.webservices_sabre_com.websvc.TravelItineraryReadPortType;
import https.webservices_sabre_com.websvc.TravelItineraryReadService;
import java.math.BigInteger;
import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.ws.Holder;
import javax.xml.ws.soap.SOAPFaultException;
import org.ebxml.namespaces.messageheader.From;
import org.ebxml.namespaces.messageheader.MessageData;
import org.ebxml.namespaces.messageheader.MessageHeader;
import org.ebxml.namespaces.messageheader.PartyId;
import org.ebxml.namespaces.messageheader.Service;
import org.ebxml.namespaces.messageheader.To;
import org.xmlsoap.schemas.ws._2002._12.secext.Security;

/**
 *
 * @author Miguel A. Fuentes Buchholtz
 * @email miguel@variacode.com
 */
public class SabreBookClient extends AbstractSabreClient {

    private final static SimpleDateFormat DATEFORMAT_BOOK = new SimpleDateFormat("MM-dd");

    private final PassengerDetailsService passengerDetailsService = new PassengerDetailsService();
    private final PassengerDetailsPortType passengerDetailsPort;
    private final EnhancedAirBookService bookService = new EnhancedAirBookService();
    private final EnhancedAirBookPortType bookPort;
    private final OTACancelService cancelService = new OTACancelService();
    private final OTACancelPortType cancelPort;
    private final EndTransactionService endTransactionService = new EndTransactionService();
    private final EndTransactionPortType endTransactionPort;
    private final TravelItineraryReadService itineraryService = new TravelItineraryReadService();
    private final TravelItineraryReadPortType itineraryPort;
    private final String senderCompanyDomain;
    private final URL endpointURL;
    private final String IPCC;
    private final String queuePCC;

    /**
     *
     * @param endpointURL
     * @param senderCompanyDomain
     * @param IPCC
     * @param queuePCC
     */
    public SabreBookClient(URL endpointURL, String senderCompanyDomain, String IPCC, String queuePCC) {
        this.endpointURL = endpointURL;
        this.senderCompanyDomain = senderCompanyDomain;
        this.IPCC = IPCC;
        this.passengerDetailsPort = portAddContext(passengerDetailsService.getPassengerDetailsPortType(), endpointURL.toString());
        this.bookPort = portAddContext(bookService.getEnhancedAirBookPortType(), endpointURL.toString());
        this.cancelPort = portAddContext(cancelService.getOTACancelPortType(), endpointURL.toString());
        this.itineraryPort = portAddContext(itineraryService.getTravelItineraryReadPortType(), endpointURL.toString());
        this.endTransactionPort = portAddContext(endTransactionService.getEndTransactionPortType(), endpointURL.toString());
        this.queuePCC = queuePCC == null ? IPCC : queuePCC;
    }

    private void addFlightSegments(List<EnhancedAirBookRQ.OTAAirBookRQ.OriginDestinationInformation.FlightSegment> odi,
            List<SabreFlightSegment> sfs, int passengers) {
        if (sfs != null) {
            for (SabreFlightSegment s : sfs) {
                EnhancedAirBookRQ.OTAAirBookRQ.OriginDestinationInformation.FlightSegment fs = new EnhancedAirBookRQ.OTAAirBookRQ.OriginDestinationInformation.FlightSegment();
                EnhancedAirBookRQ.OTAAirBookRQ.OriginDestinationInformation.FlightSegment.OriginLocation ol = new EnhancedAirBookRQ.OTAAirBookRQ.OriginDestinationInformation.FlightSegment.OriginLocation();
                ol.setLocationCode(s.getFrom());

                EnhancedAirBookRQ.OTAAirBookRQ.OriginDestinationInformation.FlightSegment.DestinationLocation dl = new EnhancedAirBookRQ.OTAAirBookRQ.OriginDestinationInformation.FlightSegment.DestinationLocation();
                dl.setLocationCode(s.getTo());
                fs.setDestinationLocation(dl);
                fs.setOriginLocation(ol);
                fs.setFlightNumber(s.getFlightNumber());
                EnhancedAirBookRQ.OTAAirBookRQ.OriginDestinationInformation.FlightSegment.MarriageGrp mg = new EnhancedAirBookRQ.OTAAirBookRQ.OriginDestinationInformation.FlightSegment.MarriageGrp();
                if (s.getMarriageGrp() != null && (s.getMarriageGrp().trim().toUpperCase().equals("O".toUpperCase()) || s.getMarriageGrp().toUpperCase().trim().equals("I".toUpperCase()))) {
                    mg.setInd(!s.getMarriageGrp().toUpperCase().trim().equals("O"));
                }
                fs.setMarriageGrp(mg);
                EnhancedAirBookRQ.OTAAirBookRQ.OriginDestinationInformation.FlightSegment.OperatingAirline oa = new EnhancedAirBookRQ.OTAAirBookRQ.OriginDestinationInformation.FlightSegment.OperatingAirline();
                oa.setCode(s.getAirline());
                fs.setOperatingAirline(oa);
                EnhancedAirBookRQ.OTAAirBookRQ.OriginDestinationInformation.FlightSegment.MarketingAirline ma = new EnhancedAirBookRQ.OTAAirBookRQ.OriginDestinationInformation.FlightSegment.MarketingAirline();
                ma.setCode(s.getMarketingAirline());
                ma.setFlightNumber(s.getMarketingAirlineFlightNumber());
                fs.setMarketingAirline(ma);
                fs.setDepartureDateTime(s.getDeparture() == null ? null : getSabreDateFormat().format(s.getDeparture()));
                EnhancedAirBookRQ.OTAAirBookRQ.OriginDestinationInformation.FlightSegment.Equipment e = new EnhancedAirBookRQ.OTAAirBookRQ.OriginDestinationInformation.FlightSegment.Equipment();
                e.setAirEquipType(s.getEquipmentCode());
                fs.setEquipment(e);
                fs.setNumberInParty("" + passengers);
                fs.setStatus("NN");
                fs.setResBookDesigCode(s.getResBookDesigCode());
                odi.add(fs);
            }
        }
    }

    /**
     *
     * @param token
     * @return
     */
    protected Holder<Security> generateBookSecurity(String token) {
        Security security = new Security();
        security.setBinarySecurityToken(token);
        return new Holder<Security>(security);
    }

    /**
     *
     * @param senderCompanyDomain
     * @param endpointURL
     * @param IPCC
     * @param action
     * @return
     */
    protected Holder<MessageHeader> generateBookMessageHeader(String senderCompanyDomain, URL endpointURL, String IPCC, String action) {
        MessageHeader messageHeader = new MessageHeader();
        messageHeader.setVersion("1.0");
        Service srv = new Service();
        srv.setType("OTA");
        srv.setValue(action);
        messageHeader.setService(srv);
        From from = new From();
        PartyId fromPartyId = new PartyId();
        fromPartyId.setType(PARTYID_TYPE);
        fromPartyId.setValue(senderCompanyDomain);
        from.setPartyId(Collections.singletonList(fromPartyId));
        To to = new To();
        PartyId toPartyId = new PartyId();
        toPartyId.setValue(endpointURL.getHost());
        toPartyId.setType(PARTYID_TYPE);
        to.setPartyId(Collections.singletonList(toPartyId));
        MessageData messageData = new MessageData();
        messageData.setMessageId(this.sequence.incrementAndGet() + "-" + System.currentTimeMillis() + "@" + senderCompanyDomain);
        messageData.setTimestamp(getSabreDateFormat().format(new Date()));//2003-12-09T11:15:12Z
        messageHeader.setConversationId(this.sequence.incrementAndGet() + "-" + System.currentTimeMillis() + "@" + senderCompanyDomain);
        messageHeader.setFrom(from);
        messageHeader.setTo(to);
        messageHeader.setAction(action);
        messageHeader.setCPAId(IPCC);
        messageHeader.setMessageData(messageData);
        return new Holder<MessageHeader>(messageHeader);
    }

    private SabreFlightSegment toSabreFlightSegment(FlightSegment segment) throws SabreException {
        SabreFlightSegment s = new SabreFlightSegment();
        if (segment != null) {
            s.setFrom(segment.getOriginLocation() == null ? null : segment.getOriginLocation().getLocationCode());
            s.setTo(segment.getDestinationLocation() == null ? null : segment.getDestinationLocation().getLocationCode());
            try {
                s.setArrival(segment.getArrivalDateTime() == null ? null : getSabreDateFormatNoYearNoSecond().parse(segment.getArrivalDateTime()));
                s.setDeparture(segment.getDepartureDateTime() == null ? null : getSabreDateFormatNoSecond().parse(segment.getDepartureDateTime()));
            } catch (ParseException ex) {
                Logger.getLogger(SabreBookClient.class.getName()).log(Level.SEVERE, null, ex);
                throw new SabreException(ex);
            }
            s.setResBookDesigCode(segment.getResBookDesigCode());
            s.setEquipmentCode(segment.getEquipment() == null ? null : segment.getEquipment().getAirEquipType());
            s.setMarketingAirline(segment.getMarketingAirline() == null ? null : segment.getMarketingAirline().getCode());
            s.setMarketingAirlineFlightNumber(segment.getMarketingAirline() == null ? null : segment.getMarketingAirline().getFlightNumber());
            s.setAirline(segment.getOperatingAirline() == null || segment.getOperatingAirline().isEmpty() ? segment.getMarketingAirline().getCode() : segment.getOperatingAirline().get(0).getCode());
            s.setFlightNumber(segment.getFlightNumber());
            s.setResBookDesigCode(segment.getResBookDesigCode());
            s.setDuration(segment.getElapsedTime() == null ? null : Integer.parseInt(segment.getElapsedTime()));
        }
        return s;
    }

    /**
     *
     * @param reserveID
     * @param token
     * @return
     * @throws SabreException
     */
    public SabreSearchResponse readItinerary(String reserveID, String token) throws SabreException {
        TravelItineraryReadRQ readRQ = new TravelItineraryReadRQ();
        TravelItineraryReadRQ.UniqueID uid = new TravelItineraryReadRQ.UniqueID();
        uid.setID(reserveID);
        readRQ.setUniqueID(uid);
        Holder<MessageHeader> messageHeader = generateBookMessageHeader(senderCompanyDomain, endpointURL, IPCC, "TravelItineraryReadRQ");
        readRQ.setVersion("3.4.0");
        TravelItineraryReadRQ.MessagingDetails md = new TravelItineraryReadRQ.MessagingDetails();
        TravelItineraryReadRQ.MessagingDetails.SubjectAreas sa = new TravelItineraryReadRQ.MessagingDetails.SubjectAreas();
        sa.setSubjectArea(Collections.singletonList("DEFAULT"));
        md.setSubjectAreas(sa);
        readRQ.setMessagingDetails(md);
        Holder<Security> security = generateBookSecurity(token);

        TravelItineraryReadRS readRS;
        try {
            readRS = this.itineraryPort.travelItineraryReadRQ(messageHeader, security, readRQ);
        } catch (SOAPFaultException e) {
            Logger.getLogger(SabreBookClient.class.getName()).log(Level.SEVERE, null, e);
            return super.generateErrorResponse(new SabreSearchResponse(), "Error en llamada a Sabre", e.getMessage(), e.toString());
        }

        if (readRS == null || readRS.getApplicationResults() == null || readRS.getTravelItinerary() == null
                || readRS.getTravelItinerary().getItineraryInfo() == null || readRS.getTravelItinerary().getItineraryInfo().getReservationItems() == null
                || readRS.getTravelItinerary().getItineraryInfo().getReservationItems().getItem() == null
                || readRS.getTravelItinerary().getItineraryInfo().getReservationItems().getItem().isEmpty() || null == readRS.getApplicationResults().getStatus()
                || !readRS.getApplicationResults().getStatus().equals(CompletionCodes.COMPLETE)) {
            endTransaction(token);
            return super.generateErrorResponse(new SabreSearchResponse(), readRS == null ? null : readRS.getApplicationResults());
        }

        SabreSearchResponse sR = new SabreSearchResponse();
        for (Item i : readRS.getTravelItinerary().getItineraryInfo().getReservationItems().getItem()) {
            if (i.getRPH().equals("1")) {
                List<SabreFlightSegment> departure = new ArrayList<SabreFlightSegment>();
                for (FlightSegment s : i.getFlightSegment()) {
                    departure.add(toSabreFlightSegment(s));
                }
                sR.setDepartureFlight(departure);
            } else if (i.getRPH().equals("2")) {
                List<SabreFlightSegment> returnn = new ArrayList<SabreFlightSegment>();
                for (FlightSegment s : i.getFlightSegment()) {
                    returnn.add(toSabreFlightSegment(s));
                }
                sR.setReturnFlight(returnn);
            } else {
                Logger.getLogger(JSabre.class.getName()).log(Level.SEVERE, null, new SabreException("RPH desconocido! " + i.getRPH()));
            }
        }
        return sR;
    }

    private SabrePassengerInformation getAndRemovePassengerType(String type, List<SabrePassengerInformation> passgersToPair) {
        for (int i = 0; i < passgersToPair.size(); i++) {
            if (passgersToPair.get(i).getPassengerType() != null && passgersToPair.get(i).getPassengerType().equals(type)) {
                return passgersToPair.remove(i);
            }
        }
        return null;
    }

    /*private String ageTypeForChildren(String passengerType, Date birthDate, Date lastSegmentDate) {
     if (passengerType == null) {
     return SabreConstants.PASSENGER_TYPE_ADULT;
     }
     if (passengerType.equals(SabreConstants.PASSENGER_TYPE_CHILD)) {
     if (birthDate != null && lastSegmentDate != null && lastSegmentDate.after(birthDate)) {
     int years = lastSegmentDate.getYear() - birthDate.getYear();
     if (years < 99) {
     return "C" + (years < 10 ? "0" + years : years);
     }
     }
     return SabreConstants.PASSENGER_TYPE_CHILD;
     }
     return passengerType;
     }*/
    /**
     *
     * @param request
     * @param token
     * @return
     */
    public SabreBookResponse airBook(SabreBookRequest request, String token) {
        //PassengerDetails (datos pasajeros, datos agencia) solo si hay problemas con tipos 1 ADT 1 CHL
        //EnhancedAirBook (segmentos, te cotiza* verificar con araucana)
        //PassengerDetails (remark, osi, sfi, end transaction*)
        //SessionClose
        if (super.nullObjects(request, request.getPassengerInformation(), request.getResponseInformation(), request.getSearchInformation(),
                request.getResponseInformation().getPassengerPrice())) {
            return super.generateErrorResponse(new SabreBookResponse(), "SabreBookRequest inválido, no contiene campos requeridos");
        }

        EnhancedAirBookRQ bookRQ = new EnhancedAirBookRQ();
        EnhancedAirBookRQ.OTAAirBookRQ book = new EnhancedAirBookRQ.OTAAirBookRQ();

        List<EnhancedAirBookRQ.OTAAirBookRQ.HaltOnStatus> h = new ArrayList<EnhancedAirBookRQ.OTAAirBookRQ.HaltOnStatus>();
        EnhancedAirBookRQ.OTAAirBookRQ.HaltOnStatus hos1 = new EnhancedAirBookRQ.OTAAirBookRQ.HaltOnStatus();
        hos1.setCode("NO");
        EnhancedAirBookRQ.OTAAirBookRQ.HaltOnStatus hos2 = new EnhancedAirBookRQ.OTAAirBookRQ.HaltOnStatus();
        hos2.setCode("NN");
        EnhancedAirBookRQ.OTAAirBookRQ.HaltOnStatus hos3 = new EnhancedAirBookRQ.OTAAirBookRQ.HaltOnStatus();
        hos3.setCode("UC");
        EnhancedAirBookRQ.OTAAirBookRQ.HaltOnStatus hos4 = new EnhancedAirBookRQ.OTAAirBookRQ.HaltOnStatus();
        hos4.setCode("US");
        h.add(hos1);
        h.add(hos2);
        h.add(hos3);
        h.add(hos4);
        book.setHaltOnError(Boolean.FALSE);
        book.setHaltOnStatus(h);

        EnhancedAirBookRQ.OTAAirBookRQ.RedisplayReservation rres = new EnhancedAirBookRQ.OTAAirBookRQ.RedisplayReservation();
        rres.setNumAttempts(SabreConstants.DEFAULT_BOOKING_NUMATTEMPTS);
        rres.setWaitInterval(SabreConstants.DEFAULT_BOOKING_WAITINTERVAL);
        book.setRedisplayReservation(rres);

        EnhancedAirBookRQ.OTAAirBookRQ.OriginDestinationInformation od = new EnhancedAirBookRQ.OTAAirBookRQ.OriginDestinationInformation();
        List<EnhancedAirBookRQ.OTAAirBookRQ.OriginDestinationInformation.FlightSegment> odi = new ArrayList<EnhancedAirBookRQ.OTAAirBookRQ.OriginDestinationInformation.FlightSegment>();
        od.setFlightSegment(odi);

        book.setOriginDestinationInformation(od);
        book.setHaltOnError(Boolean.TRUE);
        EnhancedAirBookRQ.OTAAirPriceRQ prq = new EnhancedAirBookRQ.OTAAirPriceRQ();

        EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation pri = new EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation();
        pri.setRetain(Boolean.TRUE);
        EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers oq = new EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers();
        EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers pq = new EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers();
        List<EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.PassengerType> pt = new ArrayList<EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.PassengerType>();
        int passengers = 0;
        Map<String, Integer> passengerTypeCount = new HashMap<String, Integer>();
        Map<String, EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.PassengerType> passengerTypes = new HashMap<String, EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.PassengerType>();
        for (SabrePassengerPrice pp : request.getResponseInformation().getPassengerPrice()) {

            if (!pp.getPassengerType().equals(SabreConstants.PASSENGER_TYPE_INFANT)) {
                passengers = passengers + pp.getPassengerQuantity();
            }
            EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.PassengerType pa = new EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.PassengerType();
            pa.setCode(pp.getPassengerType());
            pa.setQuantity(pp.getPassengerQuantity() + "");
            if (!passengerTypes.containsKey(pp.getPassengerType())) {
                passengerTypeCount.put(pp.getPassengerType(), pp.getPassengerQuantity());
                passengerTypes.put(pp.getPassengerType(), pa);
            } else {
                passengerTypeCount.put(pp.getPassengerType(), passengerTypeCount.get(pp.getPassengerType()) + pp.getPassengerQuantity());
                pa.setQuantity(passengerTypeCount.get(pp.getPassengerType()) + "");
                passengerTypes.put(pp.getPassengerType(), pa);
            }
        }
        pt.addAll(passengerTypes.values());

        addFlightSegments(odi, request.getResponseInformation().getDepartureFlight(), passengers);
        addFlightSegments(odi, request.getResponseInformation().getReturnFlight(), passengers);

        Date latestFlightDate = null;
        for (SabreFlightSegment fs : request.getResponseInformation().getDepartureFlight()) {
            if (latestFlightDate == null) {
                latestFlightDate = fs.getArrival();
            } else if (latestFlightDate.before(fs.getArrival())) {
                latestFlightDate = fs.getArrival();
            }
        }
        if (request.getResponseInformation().getReturnFlight() != null) {
            for (SabreFlightSegment fs : request.getResponseInformation().getReturnFlight()) {
                if (latestFlightDate == null) {
                    latestFlightDate = fs.getArrival();
                } else if (latestFlightDate.before(fs.getArrival())) {
                    latestFlightDate = fs.getArrival();
                }
            }
        }

        pq.setPassengerType(pt);
        oq.setPricingQualifiers(pq);
        pri.setOptionalQualifiers(oq);
        prq.setPriceRequestInformation(pri);
        prq.setHaltOnError(Boolean.TRUE);
        bookRQ.setOTAAirPriceRQ(prq);
        bookRQ.setOTAAirBookRQ(book);
        EnhancedAirBookRQ.PostProcessing pp = new EnhancedAirBookRQ.PostProcessing();
        pp.setHaltOnError(Boolean.TRUE);
        EnhancedAirBookRQ.PostProcessing.RedisplayReservation rr = new EnhancedAirBookRQ.PostProcessing.RedisplayReservation();
        rr.setWaitInterval(new BigInteger(SabreConstants.DEFAULT_PASSENGERDETAILS_WAITINTERVAL));
        bookRQ.setVersion("2.5.0");
        pp.setRedisplayReservation(rr);
        bookRQ.setPostProcessing(pp);
        Holder<MessageHeader> messageHeader = generateBookMessageHeader(senderCompanyDomain, endpointURL, IPCC, "EnhancedAirBookRQ");

        Holder<Security> security = generateBookSecurity(token);
        EnhancedAirBookRS bookRS;
        try {
            bookRS = this.bookPort.enhancedAirBookRQ(messageHeader, security, bookRQ);
        } catch (SOAPFaultException e) {
            Logger.getLogger(SabreBookClient.class.getName()).log(Level.SEVERE, null, e);
            return super.generateErrorResponse(new SabreBookResponse(), "Error en llamada a Sabre", e.getMessage(), e.toString());
        }
        if (bookRS == null || bookRS.getApplicationResults() == null || null == bookRS.getApplicationResults().getStatus()
                || !bookRS.getApplicationResults().getStatus().equals(CompletionCodes.COMPLETE)) {
            return super.generateErrorResponse(new SabreBookResponse(), bookRS == null ? null : bookRS.getApplicationResults());
        }

        PassengerDetailsRQ detailsRQ2 = new PassengerDetailsRQ();
        Holder<MessageHeader> messageHeaderPD = generateBookMessageHeader(senderCompanyDomain, endpointURL, IPCC, "PassengerDetailsRQ");

        PassengerDetailsRQ.TravelItineraryAddInfoRQ addInfo = new PassengerDetailsRQ.TravelItineraryAddInfoRQ();
        PassengerDetailsRQ.TravelItineraryAddInfoRQ.CustomerInfo ci = new PassengerDetailsRQ.TravelItineraryAddInfoRQ.CustomerInfo();
        List<PassengerDetailsRQ.TravelItineraryAddInfoRQ.CustomerInfo.CustLoyalty> cll = new ArrayList<PassengerDetailsRQ.TravelItineraryAddInfoRQ.CustomerInfo.CustLoyalty>();
        List<PassengerDetailsRQ.TravelItineraryAddInfoRQ.CustomerInfo.PersonName> pn = new ArrayList<PassengerDetailsRQ.TravelItineraryAddInfoRQ.CustomerInfo.PersonName>();
        PassengerDetailsRQ.TravelItineraryAddInfoRQ.CustomerInfo.ContactNumbers cn = new PassengerDetailsRQ.TravelItineraryAddInfoRQ.CustomerInfo.ContactNumbers();
        List<ContactNumber> cns = new ArrayList<ContactNumber>();

        Map<String, String> nameNumberFOID = new HashMap<String, String>();
        Map<String, PassengerDetailsRQ.SpecialReqDetails.SpecialServiceRQ.SpecialServiceInfo.SecureFlight.PersonName> nameNumberDOCS = new HashMap<String, PassengerDetailsRQ.SpecialReqDetails.SpecialServiceRQ.SpecialServiceInfo.SecureFlight.PersonName>();
        String adultNumberForInfant = null;
        List<String> inftList = new ArrayList<String>();

        List<PassengerDetailsRQ.PriceQuoteInfo.Link> link = new ArrayList<PassengerDetailsRQ.PriceQuoteInfo.Link>();
        int i = 1;
        if (bookRS.getTravelItineraryReadRS() != null && bookRS.getTravelItineraryReadRS().getTravelItinerary() != null
                && bookRS.getTravelItineraryReadRS().getTravelItinerary().getItineraryInfo() != null
                && bookRS.getTravelItineraryReadRS().getTravelItinerary().getItineraryInfo().getItineraryPricing() != null
                && bookRS.getTravelItineraryReadRS().getTravelItinerary().getItineraryInfo().getItineraryPricing().getPriceQuote() != null) {
            List<SabrePassengerInformation> passgersToPair = new ArrayList<SabrePassengerInformation>(request.getPassengerInformation());
            for (EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote pquote : bookRS.getTravelItineraryReadRS().getTravelItinerary().getItineraryInfo().getItineraryPricing().getPriceQuote()) {
                if (pquote.getPricedItinerary() != null) {
                    for (PricedItinerary pricei : pquote.getPricedItinerary()) {
                        if (pricei.getAirItineraryPricingInfo() != null && pricei.getAirItineraryPricingInfo().getPassengerTypeQuantity() != null) {

                            for (EnhancedAirBookRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.AirItineraryPricingInfo.PassengerTypeQuantity po : pricei.getAirItineraryPricingInfo().getPassengerTypeQuantity()) {
                                int max = po.getQuantity() == null ? 0 : Integer.parseInt(po.getQuantity());
                                for (int j = 1; j <= max; j++) {
                                    SabrePassengerInformation spass = getAndRemovePassengerType(po.getCode(), passgersToPair);
                                    if (spass != null) {
                                        if (!spass.getPassengerType().equals(SabreConstants.PASSENGER_TYPE_INFANT)) {
                                            ContactNumber n = new ContactNumber();
                                            n.setNameNumber(i + ".1");
                                            n.setPhoneUseType("H");
                                            n.setPhone(spass.getPhoneNumber());

                                            PassengerDetailsRQ.TravelItineraryAddInfoRQ.CustomerInfo.PersonName p = new PassengerDetailsRQ.TravelItineraryAddInfoRQ.CustomerInfo.PersonName();
                                            p.setGivenName(spass.getGivenName());
                                            p.setSurname(spass.getSurname());
                                            p.setNameNumber(i + ".1");

                                            pn.add(p);

                                            if (spass.getCountryCode() != null && !spass.getCountryCode().equals("")
                                                    && spass.getPassport() != null && !spass.getPassport().equals("")) {
                                                nameNumberFOID.put(i + ".1", "PP" + spass.getCountryCode() + spass.getPassport());// + "-" + i + ".1");
                                            }
                                            if (spass.isIsFemale() != null && spass.getBirthDay() != null) {
                                                PassengerDetailsRQ.SpecialReqDetails.SpecialServiceRQ.SpecialServiceInfo.SecureFlight.PersonName sfpn = new PassengerDetailsRQ.SpecialReqDetails.SpecialServiceRQ.SpecialServiceInfo.SecureFlight.PersonName();
                                                sfpn.setDateOfBirth(super.getSabreDateFormatYearMonthDay().format(spass.getBirthDay()));
                                                sfpn.setGender((spass.isIsFemale() ? "F" : "M"));
                                                sfpn.setGivenName(spass.getGivenName());
                                                sfpn.setNameNumber(i + ".1");
                                                sfpn.setSurname(spass.getSurname());
                                                nameNumberDOCS.put(i + ".1", sfpn);
                                            }

                                            cns.add(n);

                                            PassengerDetailsRQ.PriceQuoteInfo.Link l = new PassengerDetailsRQ.PriceQuoteInfo.Link();

                                            l.setNameNumber(i + ".1");
                                            l.setRecord(pquote.getRPH());
                                            link.add(l);
                                            i++;
                                            if (spass.getPassengerType().equals(SabreConstants.PASSENGER_TYPE_ADULT) && adultNumberForInfant == null) {
                                                adultNumberForInfant = i + ".1";
                                            }
                                        } else {
                                            if (adultNumberForInfant != null) {
                                                inftList.add((spass.getSurname() + "/" + spass.getGivenName() + "/"
                                                        + super.getSabreDateFormatNatural().format(spass.getBirthDay()) + "-" + adultNumberForInfant).toUpperCase());
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        PassengerDetailsRQ.SpecialReqDetails srd = new PassengerDetailsRQ.SpecialReqDetails();
        detailsRQ2.setSpecialReqDetails(srd);
        PassengerDetailsRQ.SpecialReqDetails.SpecialServiceRQ ssrq = new PassengerDetailsRQ.SpecialReqDetails.SpecialServiceRQ();
        srd.setSpecialServiceRQ(ssrq);
        PassengerDetailsRQ.SpecialReqDetails.SpecialServiceRQ.SpecialServiceInfo ssi = new PassengerDetailsRQ.SpecialReqDetails.SpecialServiceRQ.SpecialServiceInfo();
        ssrq.setSpecialServiceInfo(ssi);
        List<PassengerDetailsRQ.SpecialReqDetails.SpecialServiceRQ.SpecialServiceInfo.Service> sss = new ArrayList<PassengerDetailsRQ.SpecialReqDetails.SpecialServiceRQ.SpecialServiceInfo.Service>();
        List<PassengerDetailsRQ.SpecialReqDetails.SpecialServiceRQ.SpecialServiceInfo.SecureFlight> sfl = new ArrayList<PassengerDetailsRQ.SpecialReqDetails.SpecialServiceRQ.SpecialServiceInfo.SecureFlight>();

        for (Entry<String, String> entry : nameNumberFOID.entrySet()) {
            PassengerDetailsRQ.SpecialReqDetails.SpecialServiceRQ.SpecialServiceInfo.Service ssss = new PassengerDetailsRQ.SpecialReqDetails.SpecialServiceRQ.SpecialServiceInfo.Service();
            PassengerDetailsRQ.SpecialReqDetails.SpecialServiceRQ.SpecialServiceInfo.Service.PersonName ppnn = new PassengerDetailsRQ.SpecialReqDetails.SpecialServiceRQ.SpecialServiceInfo.Service.PersonName();
            ppnn.setNameNumber(entry.getKey());
            ssss.setPersonName(ppnn);
            ssss.setSSRCode("FOID");
            ssss.setSegmentNumber("A");
            ssss.setText(entry.getValue());
            sss.add(ssss);
        }
        for (String inft : inftList) {
            PassengerDetailsRQ.SpecialReqDetails.SpecialServiceRQ.SpecialServiceInfo.Service ssss = new PassengerDetailsRQ.SpecialReqDetails.SpecialServiceRQ.SpecialServiceInfo.Service();
            PassengerDetailsRQ.SpecialReqDetails.SpecialServiceRQ.SpecialServiceInfo.Service.PersonName ppnn = new PassengerDetailsRQ.SpecialReqDetails.SpecialServiceRQ.SpecialServiceInfo.Service.PersonName();
            ppnn.setNameNumber(adultNumberForInfant);
            ssss.setPersonName(ppnn);
            ssss.setSSRCode("INFT");
            ssss.setSegmentNumber("A");
            ssss.setText(inft);
            sss.add(ssss);
        }
        for (Entry<String, PassengerDetailsRQ.SpecialReqDetails.SpecialServiceRQ.SpecialServiceInfo.SecureFlight.PersonName> entry : nameNumberDOCS.entrySet()) {
            PassengerDetailsRQ.SpecialReqDetails.SpecialServiceRQ.SpecialServiceInfo.SecureFlight ssff = new PassengerDetailsRQ.SpecialReqDetails.SpecialServiceRQ.SpecialServiceInfo.SecureFlight();
            ssff.setSegmentNumber("A");
            ssff.setPersonName(entry.getValue());
            ssff.setSSRCode("DOCS");
            sfl.add(ssff);
        }

        ssi.setService(sss);
        ssi.setSecureFlight(sfl);
        PassengerDetailsRQ.PriceQuoteInfo pqi = new PassengerDetailsRQ.PriceQuoteInfo();

        pqi.setHaltOnError(Boolean.TRUE);
        pqi.setLink(link);
        detailsRQ2.setPriceQuoteInfo(pqi);
        cn.setContactNumber(cns);
        ci.setCustLoyalty(cll);
        ci.setPersonName(pn);
        ci.setContactNumbers(cn);
        PassengerDetailsRQ.TravelItineraryAddInfoRQ.AgencyInfo ai = new PassengerDetailsRQ.TravelItineraryAddInfoRQ.AgencyInfo();
        PassengerDetailsRQ.TravelItineraryAddInfoRQ.AgencyInfo.Ticketing ti = new PassengerDetailsRQ.TravelItineraryAddInfoRQ.AgencyInfo.Ticketing();
        //si es automatico afecta si es segmentado va la fecha
        //<Ticketing PseudoCityCode="IPCC" QueueNumber="55" ShortText="TEST" TicketTimeLimit="12-21T08:00" TicketType="7TAW"/>
        /*
         el formato del 7T se debe poner el time limit es decir que la reserva caiga en un Q en donde recuerde que 
         hay que emitir el tkt en una fecha determinada, esto podría ser el día siguiente de creada la reserva, la entrada es 7TAW09MAR/
         cuando el tkt ya está emitido te aparece de la siguiente forma :
         1.T-05FEB-U5XG*AKF  ó  7T-00123456789
         */
        //ti.setTicketType("7T-*");
        ti.setTicketType("7TAW/");

        ai.setTicketing(ti);
        addInfo.setAgencyInfo(ai);
        addInfo.setCustomerInfo(ci);
        addInfo.setHaltOnError(Boolean.TRUE);
        detailsRQ2.setTravelItineraryAddInfoRQ(addInfo);
        detailsRQ2.setVersion("2.3.0");
        PassengerDetailsRQ.MiscSegmentSellRQ mss = new PassengerDetailsRQ.MiscSegmentSellRQ();
        mss.setHaltOnError(Boolean.TRUE);
        PassengerDetailsRQ.MiscSegmentSellRQ.MiscSegment ms = new PassengerDetailsRQ.MiscSegmentSellRQ.MiscSegment();
        ms.setNumberInParty(new BigInteger(request.getPassengerInformation().size() + ""));
        ms.setStatus("HK");// GK
        PassengerDetailsRQ.MiscSegmentSellRQ.MiscSegment.OriginLocation ol = new PassengerDetailsRQ.MiscSegmentSellRQ.MiscSegment.OriginLocation();
        ol.setLocationCode(request.getResponseInformation().getFrom());
        ms.setOriginLocation(ol);
        ms.setDepartureDateTime(request.getResponseInformation().getDepartureDate() == null ? null : DATEFORMAT_BOOK.format(request.getResponseInformation().getDepartureDate()));
        ms.setType("OTH");
        ms.setText("Reservation");
        PassengerDetailsRQ.MiscSegmentSellRQ.MiscSegment.VendorPrefs vp = new PassengerDetailsRQ.MiscSegmentSellRQ.MiscSegment.VendorPrefs();
        PassengerDetailsRQ.MiscSegmentSellRQ.MiscSegment.VendorPrefs.Airline al = new PassengerDetailsRQ.MiscSegmentSellRQ.MiscSegment.VendorPrefs.Airline();
        al.setCode(request.getResponseInformation().getAirline());
        vp.setAirline(al);
        ms.setVendorPrefs(vp);

        mss.setMiscSegment(ms);
        PassengerDetailsRQ.PostProcessing postp = new PassengerDetailsRQ.PostProcessing();
        postp.setHaltOnError(Boolean.TRUE);
        postp.setRedisplayReservation(Boolean.TRUE);
        PassengerDetailsRQ.PostProcessing.EndTransactionRQ et = new PassengerDetailsRQ.PostProcessing.EndTransactionRQ();
        PassengerDetailsRQ.PostProcessing.EndTransactionRQ.Source s = new PassengerDetailsRQ.PostProcessing.EndTransactionRQ.Source();
        //esto en un futuro podría caer a un queue específico
        s.setReceivedFrom("ONLINE");
        et.setSource(s);
        et.setHaltOnError(Boolean.TRUE);
        PassengerDetailsRQ.PostProcessing.EndTransactionRQ.EndTransaction endt = new PassengerDetailsRQ.PostProcessing.EndTransactionRQ.EndTransaction();

        et.setEndTransaction(endt);
        postp.setEndTransactionRQ(et);
        detailsRQ2.setPostProcessing(postp);

        // queue 
        PassengerDetailsRQ.PostProcessing.QueuePlaceRQ qprq = new PassengerDetailsRQ.PostProcessing.QueuePlaceRQ();
        PassengerDetailsRQ.PostProcessing.QueuePlaceRQ.QueueInfo qinfo = new PassengerDetailsRQ.PostProcessing.QueuePlaceRQ.QueueInfo();
        PassengerDetailsRQ.PostProcessing.QueuePlaceRQ.QueueInfo.QueueIdentifier qid = new PassengerDetailsRQ.PostProcessing.QueuePlaceRQ.QueueInfo.QueueIdentifier();
        qid.setNumber(request.getQueueNumber());
        qid.setPseudoCityCode(queuePCC);//IPCC);
        qid.setPrefatoryInstructionCode("11");
        qinfo.setQueueIdentifier(Collections.singletonList(qid));
        //qprq.setMultiQueuePlace(null);
        qprq.setHaltOnError(Boolean.TRUE);
        qprq.setQueueInfo(qinfo);

        if (request.getQueueNumber() != null && !request.getQueueNumber().trim().equals("")
                && !request.getQueueNumber().equals(SabreConstants.DEFAULT_QUEUE_DEACTIVATED)) {
            postp.setQueuePlaceRQ(qprq);
            endt.setInd("false");
        } else {
            endt.setInd("true");
        }
        PassengerDetailsRQ.IgnoreOnError ie = new PassengerDetailsRQ.IgnoreOnError();
        ie.setInd(false);
        detailsRQ2.setIgnoreOnError(ie);
        PassengerDetailsRQ.PreProcessing prep = new PassengerDetailsRQ.PreProcessing();
        prep.setHaltOnError(Boolean.TRUE);
        PassengerDetailsRS detailsRS2;
        try {
            detailsRS2 = this.passengerDetailsPort.passengerDetailsRQ(messageHeaderPD, security, detailsRQ2);
        } catch (SOAPFaultException e) {
            Logger.getLogger(SabreBookClient.class.getName()).log(Level.SEVERE, null, e);
            return super.generateErrorResponse(new SabreBookResponse(), "Error en llamada a Sabre", e.getMessage(), e.toString());
        }

        if (detailsRS2 == null || detailsRS2.getApplicationResults() == null || null == detailsRS2.getApplicationResults().getStatus()
                || !detailsRS2.getApplicationResults().getStatus().equals(CompletionCodes.COMPLETE)
                || null == detailsRS2.getTravelItineraryReadRS() || null == detailsRS2.getItineraryRef()) {
            return super.generateErrorResponse(new SabreBookResponse(), detailsRS2 == null ? null : detailsRS2.getApplicationResults());
        }
        SabreBookResponse response = new SabreBookResponse();
        if (detailsRS2.getTravelItineraryReadRS() != null) {
            response = buildSabreBookResponse(detailsRS2.getTravelItineraryReadRS().getTravelItinerary());
            if (detailsRS2.getItineraryRef() != null) {
                response.setItineraryRefID(detailsRS2.getItineraryRef().getID());
            }
            return response;
        }
        response.setError(true);
        response.setStatus(CompletionCodes.UNKNOWN.value());
        return response;
    }

    private SabreBookResponse buildSabreBookResponse(TravelItinerary itinerary) {
        SabreBookResponse response = new SabreBookResponse();
        if (itinerary != null) {
            if (itinerary.getItineraryRef() != null) {
                if (itinerary.getItineraryRef().getSource() != null) {
                    response.setItineraryRefAAA_PseudoCityCode(itinerary.getItineraryRef().getSource().getAAAPseudoCityCode());
                    try {
                        response.setItineraryRefCreateDateTime(itinerary.getItineraryRef().getSource().getCreateDateTime() == null
                                ? null : getSabreDateFormatNoSecond().parse(itinerary.getItineraryRef().getSource().getCreateDateTime()));
                    } catch (ParseException ex) {
                        Logger.getLogger(SabreBookClient.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    response.setItineraryRefCreationAgent(itinerary.getItineraryRef().getSource().getCreationAgent());
                    response.setItineraryRefHomePseudoCityCode(itinerary.getItineraryRef().getSource().getHomePseudoCityCode());
                    response.setItineraryRefPseudoCityCode(itinerary.getItineraryRef().getSource().getPseudoCityCode());
                    response.setItineraryRefReceivedFrom(itinerary.getItineraryRef().getSource().getReceivedFrom());
                }
                response.setItineraryRefAirExtras(itinerary.getItineraryRef().isAirExtras());
                response.setItineraryRefID(itinerary.getItineraryRef().getID());
                response.setItineraryRefInhibitCode(itinerary.getItineraryRef().getInhibitCode());
                response.setItineraryRefPartitionID(itinerary.getItineraryRef().getPartitionID());
                response.setItineraryRefPrimeHostID(itinerary.getItineraryRef().getPrimeHostID());
            }
            if (itinerary.getCustomerInfo() != null) {
                List<SabrePassengerInformation> pi = new ArrayList<SabrePassengerInformation>();
                if (itinerary.getCustomerInfo().getPersonName() != null && !itinerary.getCustomerInfo().getPersonName().isEmpty()) {
                    for (PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.CustomerInfo.PersonName pn : itinerary.getCustomerInfo().getPersonName()) {
                        SabrePassengerInformation spi = new SabrePassengerInformation();
                        spi.setGivenName(pn.getGivenName());
                        spi.setSurname(pn.getSurname());
                        spi.setNameNumber(pn.getNameNumber());
                        spi.setRPH(Integer.parseInt(pn.getRPH()));
                        spi.setWithInfant(Boolean.parseBoolean(pn.getWithInfant()));
                        pi.add(spi);
                    }
                    if (itinerary.getCustomerInfo().getContactNumbers() != null && itinerary.getCustomerInfo().getContactNumbers().getContactNumber() != null
                            && !itinerary.getCustomerInfo().getContactNumbers().getContactNumber().isEmpty()) {
                        for (PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.CustomerInfo.ContactNumbers.ContactNumber cn : itinerary.getCustomerInfo().getContactNumbers().getContactNumber()) {
                            int rph = Integer.parseInt(cn.getRPH());
                            for (SabrePassengerInformation spi2 : pi) {
                                if (spi2.getRPH() == rph) {
                                    spi2.setPhoneLocationCode(cn.getLocationCode());
                                    spi2.setPhoneNumber(cn.getPhone());
                                    spi2.setPhoneRPH(cn.getRPH());
                                }
                            }
                        }
                    }
                }
                response.setCostumerInfo(pi);
            }
            if (itinerary.getItineraryInfo() != null) {
                if (itinerary.getItineraryInfo().getTicketing() != null && !itinerary.getItineraryInfo().getTicketing().isEmpty()) {
                    List<SabreBookResponse.Ticketing> ticks = new ArrayList<SabreBookResponse.Ticketing>();
                    for (PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.Ticketing t : itinerary.getItineraryInfo().getTicketing()) {
                        SabreBookResponse.Ticketing ti = new SabreBookResponse.Ticketing();
                        ti.setRPH(Integer.parseInt(t.getRPH()));
                        ti.setTicketTimeLimit(t.getTicketTimeLimit());
                        ticks.add(ti);
                    }
                    response.setItineraryTicketing(ticks);
                }
                if (itinerary.getItineraryInfo().getReservationItems() != null && itinerary.getItineraryInfo().getReservationItems().getItem() != null
                        && !itinerary.getItineraryInfo().getReservationItems().getItem().isEmpty()) {
                    List<SabreFlightSegment> fs = new ArrayList<SabreFlightSegment>();
                    for (PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item ri : itinerary.getItineraryInfo().getReservationItems().getItem()) {
                        if (ri.getFlightSegment() != null) {
                            for (PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.FlightSegment fd : ri.getFlightSegment()) {
                                SabreFlightSegment sfs = new SabreFlightSegment();
                                sfs.setRPH(Integer.parseInt(ri.getRPH()));
                                sfs.setAirMilesFlown(Integer.parseInt(fd.getAirMilesFlown()));
                                try {
                                    sfs.setArrival(fd.getArrivalDateTime() == null ? null : getSabreDateFormatNoYearNoSecond().parse(fd.getArrivalDateTime()));
                                } catch (ParseException ex) {
                                    Logger.getLogger(SabreBookClient.class.getName()).log(Level.SEVERE, null, ex);
                                }
                                sfs.setConnectionInd(fd.getConnectionInd());
                                sfs.setDayOfWeekInd(Integer.parseInt(fd.getDayOfWeekInd()));
                                try {
                                    sfs.setDeparture(fd.getDepartureDateTime() == null ? null : getSabreDateFormatNoSecond().parse(fd.getDepartureDateTime()));
                                } catch (ParseException ex) {
                                    Logger.getLogger(SabreBookClient.class.getName()).log(Level.SEVERE, null, ex);
                                }
                                sfs.setElapsedTime(safeStringToBigDecimal(fd.getElapsedTime()));
                                sfs.setFlightNumber(fd.getFlightNumber());
                                sfs.setNumberInParty(fd.getNumberInParty());
                                sfs.setResBookDesigCode(fd.getResBookDesigCode());
                                sfs.setSegmentNumber(fd.getSegmentNumber());
                                sfs.setSmokingAllowed(fd.isSmokingAllowed());
                                sfs.setSpecialMeal(fd.isSpecialMeal());
                                sfs.setStatus(fd.getStatus());
                                sfs.setStopQuantity(fd.getStopQuantity());
                                sfs.seteTicket(fd.isETicket());
                                sfs.setFrom(fd.getOriginLocation() == null ? null : fd.getOriginLocation().getLocationCode());
                                sfs.setTo(fd.getDestinationLocation() == null ? null : fd.getDestinationLocation().getLocationCode());
                                sfs.setEquipmentCode(fd.getEquipment() == null ? null : fd.getEquipment().getAirEquipType());
                                sfs.setMarketingAirline(fd.getMarketingAirline() == null ? null : fd.getMarketingAirline().getCode());
                                sfs.setMarketingAirlineFlightNumber(fd.getMarketingAirline() == null ? null : fd.getMarketingAirline().getFlightNumber());
                                if (fd.getMeal() != null) {
                                    List<String> meal = new ArrayList<String>();
                                    for (PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.FlightSegment.Meal m : fd.getMeal()) {
                                        meal.add(m.getCode());
                                    }
                                    sfs.setMeal(meal);
                                }
                                if (fd.getOperatingAirline() != null) {
                                    List<String> opAir = new ArrayList<String>();
                                    for (PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ReservationItems.Item.FlightSegment.OperatingAirline m : fd.getOperatingAirline()) {
                                        opAir.add(m.getCode());
                                    }
                                    sfs.setOperatingAirline(opAir);
                                }
                                sfs.setTerminal(fd.getOriginLocation() == null ? null : fd.getOriginLocation().getTerminal());
                                sfs.setTerminalCode(fd.getOriginLocation() == null ? null : fd.getOriginLocation().getTerminalCode());
                                sfs.setSupplierRef(fd.getSupplierRef() == null ? null : fd.getSupplierRef().getID());
                                sfs.setText(fd.getText());
                                try {
                                    sfs.setUpdatedArrivalTime(fd.getUpdatedArrivalTime() == null ? null : getSabreDateFormatNoYearNoSecond().parse(fd.getUpdatedArrivalTime()));
                                } catch (ParseException ex) {
                                    Logger.getLogger(SabreBookClient.class.getName()).log(Level.SEVERE, null, ex);
                                }
                                try {
                                    sfs.setUpdatedDepartureTime(fd.getUpdatedDepartureTime() == null ? null : getSabreDateFormatNoYearNoSecond().parse(fd.getUpdatedDepartureTime()));
                                } catch (ParseException ex) {
                                    Logger.getLogger(SabreBookClient.class.getName()).log(Level.SEVERE, null, ex);
                                }
                                fs.add(sfs);
                            }
                        }
                    }
                    response.setReservationItems(fs);
                }
                if (itinerary.getItineraryInfo().getItineraryPricing() != null && itinerary.getItineraryInfo().getItineraryPricing().getPriceQuote() != null) {
                    List<SabreBookResponse.Quote> quotes = new ArrayList<SabreBookResponse.Quote>();
                    for (PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote q
                            : itinerary.getItineraryInfo().getItineraryPricing().getPriceQuote()) {
                        SabreBookResponse.Quote quo = new SabreBookResponse.Quote();
                        quo.setRPH(Integer.parseInt(q.getRPH()));
                        if (q.getMiscInformation() != null && q.getMiscInformation().getSignatureLine() != null) {
                            List<SabreBookResponse.QuoteSignature> s = new ArrayList<SabreBookResponse.QuoteSignature>();
                            for (PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.MiscInformation.SignatureLine sl
                                    : q.getMiscInformation().getSignatureLine()) {
                                SabreBookResponse.QuoteSignature sig = new SabreBookResponse.QuoteSignature();
                                sig.setExpirationDateTime(sl.getExpirationDateTime());
                                sig.setSource(sl.getSource());
                                sig.setStatus(sl.getStatus());
                                sig.setText(sl.getText());
                                s.add(sig);
                            }
                            quo.setItineraryQuoteSiganture(s);
                        }
                        if (q.getPricedItinerary() != null) {
                            List<SabreBookResponse.PricedItinerary> pi = new ArrayList<SabreBookResponse.PricedItinerary>();
                            for (PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary pit : q.getPricedItinerary()) {
                                SabreBookResponse.PricedItinerary pity = new SabreBookResponse.PricedItinerary();
                                pity.setDisplayOnly(pit.isDisplayOnly());
                                pity.setInputMessage(pit.getInputMessage());
                                pity.setRPH(Integer.parseInt(pit.getRPH()));
                                pity.setStatusCode(pit.getStatusCode());
                                pity.setTaxExempt(pit.isTaxExempt());
                                pity.setValidatingCarrier(pit.getValidatingCarrier());
                                if (pit.getAirItineraryPricingInfo() != null) {
                                    if (pit.getAirItineraryPricingInfo().getItinTotalFare() != null) {
                                        List<SabreBookResponse.TotalFare> tfl = new ArrayList<SabreBookResponse.TotalFare>();
                                        for (PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.AirItineraryPricingInfo.ItinTotalFare itf : pit.getAirItineraryPricingInfo().getItinTotalFare()) {
                                            SabreBookResponse.TotalFare tf = new SabreBookResponse.TotalFare();
                                            tf.setBaseFareAmount(itf.getBaseFare() == null ? null : safeStringToBigDecimal(itf.getBaseFare().getAmount()));
                                            tf.setBaseFareCurrencyCode(itf.getBaseFare() == null ? null : itf.getBaseFare().getCurrencyCode());
                                            tf.setEquivFareAmount(itf.getEquivFare() == null ? null : safeStringToBigDecimal(itf.getEquivFare().getAmount()));
                                            tf.setEquivFareCurrencyCode(itf.getEquivFare() == null ? null : itf.getEquivFare().getCurrencyCode());
                                            tf.setTaxAmount(itf.getTaxes() == null || itf.getTaxes().getTax() == null ? null : safeStringToBigDecimal(itf.getTaxes().getTax().getAmount()));
                                            tf.setTaxBreakdownCode(itf.getTaxes() == null ? null : itf.getTaxes().getTaxBreakdownCode());
                                            tf.setTaxCode(itf.getTaxes() == null || itf.getTaxes().getTax() == null ? null : itf.getTaxes().getTax().getTaxCode());
                                            tf.setTotalFareAmount(itf.getTotalFare() == null ? null : safeStringToBigDecimal(itf.getTotalFare().getAmount()));
                                            tf.setTotalFareCurrencyCode(itf.getTotalFare() == null ? null : itf.getTotalFare().getAmount());
                                            if (itf.getTotals() != null) {
                                                tf.setTotalBaseFareAmount(itf.getTotals().getBaseFare() == null ? null : safeStringToBigDecimal(itf.getTotals().getBaseFare().getAmount()));
                                                tf.setTotalEquivFareAmount(itf.getTotals().getEquivFare() == null ? null : safeStringToBigDecimal(itf.getTotals().getEquivFare().getAmount()));
                                                tf.setTotalTaxAmount(itf.getTotals().getTaxes() == null || itf.getTotals().getTaxes().getTax() == null ? null : safeStringToBigDecimal(itf.getTotals().getTaxes().getTax().getAmount()));
                                                tf.setTotalTotalFareAmount(itf.getTotals().getTotalFare() == null ? null : safeStringToBigDecimal(itf.getTotals().getTotalFare().getAmount()));
                                            }
                                        }
                                        pity.setTotalFare(tfl);
                                    }
                                    if (pit.getAirItineraryPricingInfo().getPassengerTypeQuantity() != null) {
                                        List<String> tq = new ArrayList<String>();
                                        List<String> tqc = new ArrayList<String>();
                                        for (PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.AirItineraryPricingInfo.PassengerTypeQuantity itf : pit.getAirItineraryPricingInfo().getPassengerTypeQuantity()) {
                                            tq.add(itf.getQuantity());
                                            tqc.add(itf.getCode());
                                        }
                                        pity.setPassengerTypeQuantity(tq);
                                        pity.setPassengerTypeQuantityCode(tqc);
                                    }
                                    if (pit.getAirItineraryPricingInfo().getPTCFareBreakdown() != null) {
                                        List<SabreBookResponse.PTCFareBreakdown> ptcb = new ArrayList<SabreBookResponse.PTCFareBreakdown>();
                                        for (PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.AirItineraryPricingInfo.PTCFareBreakdown itf : pit.getAirItineraryPricingInfo().getPTCFareBreakdown()) {
                                            SabreBookResponse.PTCFareBreakdown ptc = new SabreBookResponse.PTCFareBreakdown();
                                            ptc.setEndorsements(itf.getEndorsements() == null ? null : itf.getEndorsements().getText());
                                            if (itf.getFareBasis() != null) {
                                                ptc.setFareBasis(new ArrayList<String>());
                                                for (FareBasis fb : itf.getFareBasis()) {
                                                    ptc.getFareBasis().add(fb.getCode());
                                                }
                                            }
                                            if (itf.getFareCalculation() != null) {
                                                ptc.setFareCalculation(itf.getFareCalculation().getText());
                                            }
                                            ptc.setFareSource(ptc.getFareSource());
                                            if (itf.getFlightSegment() != null) {
                                                ptc.setFlightSegments(new ArrayList<SabreFlightSegment>());
                                                for (PassengerDetailsRS.TravelItineraryReadRS.TravelItinerary.ItineraryInfo.ItineraryPricing.PriceQuote.PricedItinerary.AirItineraryPricingInfo.PTCFareBreakdown.FlightSegment fs : itf.getFlightSegment()) {
                                                    SabreFlightSegment sfs = new SabreFlightSegment();
                                                    sfs.setConnectionInd(fs.getConnectionInd());
                                                    try {
                                                        sfs.setDeparture(fs.getDepartureDateTime() == null ? null : getSabreDateFormatNoYearNoSecond().parse(fs.getDepartureDateTime()));
                                                    } catch (ParseException ex) {
                                                        Logger.getLogger(SabreBookClient.class.getName()).log(Level.SEVERE, null, ex);
                                                    }
                                                    sfs.setBaggageAllowanceNumber(fs.getBaggageAllowance() == null ? null : fs.getBaggageAllowance().getNumber());
                                                    sfs.setFareBasisCode(fs.getFareBasis() == null ? null : fs.getFareBasis().getCode());
                                                    sfs.setValidityNotValidAfter(fs.getValidityDates() == null ? null : fs.getValidityDates().getNotValidAfter());
                                                    sfs.setValidityNotValidBefore(fs.getValidityDates() == null ? null : fs.getValidityDates().getNotValidBefore());
                                                    sfs.setFlightNumber(fs.getFlightNumber());
                                                    sfs.setResBookDesigCode(fs.getResBookDesigCode());
                                                    sfs.setSegmentNumber(fs.getSegmentNumber());
                                                    sfs.setStatus(fs.getStatus());
                                                    sfs.setMarketingAirline(fs.getMarketingAirline() == null ? null : fs.getMarketingAirline().getCode());
                                                    sfs.setMarketingAirlineFlightNumber(fs.getMarketingAirline() == null ? null : fs.getMarketingAirline().getFlightNumber());
                                                    sfs.setFrom(fs.getOriginLocation() == null ? null : fs.getOriginLocation().getLocationCode());
                                                    ptc.getFlightSegments().add(sfs);
                                                }
                                            }
                                            ptc.setResTicketingRestrictions(ptc.getResTicketingRestrictions());
                                            ptcb.add(ptc);
                                        }
                                        pity.setPtcFareBreakdown(ptcb);
                                    }
                                }
                                pi.add(pity);
                            }
                            quo.setPricedItinerary(pi);
                        }
                        if (q.getResponseHeader() != null) {
                            quo.setItineraryQuoteHeaders(q.getResponseHeader().getText());
                        }
                        quotes.add(quo);
                    }
                    response.setQuotes(quotes);
                }
            }
        }
        return response;
    }

    /**
     *
     * @param reserveID
     * @param token
     * @return
     */
    public SabreCancelResponse airCancel(String reserveID, String token) {
        //Normalmente no se hace la cancelación (solo dura 24 horas)
        //Crear sesión
        //Read itinerary (recolocator)
        //OTA_Cancel
        //End_Transaction
        //Close
        TravelItineraryReadRQ readRQ = new TravelItineraryReadRQ();
        TravelItineraryReadRQ.UniqueID uid = new TravelItineraryReadRQ.UniqueID();
        uid.setID(reserveID);
        readRQ.setUniqueID(uid);
        Holder<MessageHeader> messageHeader = generateBookMessageHeader(senderCompanyDomain, endpointURL, IPCC, "TravelItineraryReadRQ");
        readRQ.setVersion("3.4.0");
        TravelItineraryReadRQ.MessagingDetails md = new TravelItineraryReadRQ.MessagingDetails();
        TravelItineraryReadRQ.MessagingDetails.SubjectAreas sa = new TravelItineraryReadRQ.MessagingDetails.SubjectAreas();
        sa.setSubjectArea(Collections.singletonList("DEFAULT"));
        md.setSubjectAreas(sa);
        readRQ.setMessagingDetails(md);
        Holder<Security> security = generateBookSecurity(token);

        TravelItineraryReadRS readRS;
        try {
            readRS = this.itineraryPort.travelItineraryReadRQ(messageHeader, security, readRQ);
        } catch (SOAPFaultException e) {
            Logger.getLogger(SabreBookClient.class.getName()).log(Level.SEVERE, null, e);
            return super.generateErrorResponse(new SabreCancelResponse(), "Error en llamada a Sabre", e.getMessage(), e.toString());
        }
        if (readRS == null || readRS.getApplicationResults() == null || null == readRS.getApplicationResults().getStatus()
                || !readRS.getApplicationResults().getStatus().equals(CompletionCodes.COMPLETE)) {
            return super.generateErrorResponse(new SabreCancelResponse(), readRS == null ? null : readRS.getApplicationResults());
        }

        OTACancelRQ rq = new OTACancelRQ();
        rq.setVersion("2.0.0");
        OTACancelRQ.Segment s = new OTACancelRQ.Segment();
        s.setType("entire");
        rq.setSegment(Collections.singletonList(s));

        OTACancelRS cancelRS;
        try {
            cancelRS = cancelPort.otaCancelRQ(generateBookMessageHeader(senderCompanyDomain, endpointURL, IPCC, "OTA_CancelLLSRQ"), security, rq);
        } catch (SOAPFaultException e) {
            Logger.getLogger(SabreBookClient.class.getName()).log(Level.SEVERE, null, e);
            return super.generateErrorResponse(new SabreCancelResponse(), "Error en llamada a Sabre", e.getMessage(), e.toString());
        }
        if (cancelRS == null || cancelRS.getApplicationResults() == null || null == cancelRS.getApplicationResults().getStatus()
                || !cancelRS.getApplicationResults().getStatus().equals(CompletionCodes.COMPLETE)) {
            return super.generateErrorResponse(new SabreCancelResponse(), cancelRS == null ? null : cancelRS.getApplicationResults());
        }

        EndTransactionRS etRS = endTransaction(token);
        if (etRS == null || etRS.getApplicationResults() == null || null == etRS.getApplicationResults().getStatus()
                || !etRS.getApplicationResults().getStatus().equals(CompletionCodes.COMPLETE)) {
            return super.generateErrorResponse(new SabreCancelResponse(), etRS == null ? null : etRS.getApplicationResults());
        }

        SabreCancelResponse r = new SabreCancelResponse();
        r.setCancel(true);
        return r;
    }

    private EndTransactionRS endTransaction(String token) {
        Holder<Security> security = generateBookSecurity(token);
        EndTransactionRQ etRQ = new EndTransactionRQ();
        etRQ.setVersion("2.0.4");
        EndTransactionRQ.EndTransaction et = new EndTransactionRQ.EndTransaction();
        et.setInd(true);
        etRQ.setEndTransaction(et);
        EndTransactionRQ.Source src = new EndTransactionRQ.Source();
        src.setReceivedFrom("ONLINE");
        etRQ.setSource(src);
        try {
            return endTransactionPort.endTransactionRQ(generateBookMessageHeader(senderCompanyDomain, endpointURL, IPCC, "EndTransactionLLSRQ"), security, etRQ);
        } catch (SOAPFaultException e) {
            Logger.getLogger(SabreBookClient.class.getName()).log(Level.SEVERE, null, e);
            return null;
        }
    }

}
