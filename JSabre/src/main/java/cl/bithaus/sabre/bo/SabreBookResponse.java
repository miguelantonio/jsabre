package cl.bithaus.sabre.bo;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Miguel A. Fuentes Buchholtz
 * @email miguel@variacode.com
 */
public class SabreBookResponse extends SabreResponse {

    private List<SabrePassengerInformation> costumerInfo;
    private List<SabrePassengerPrice> itineraryPricing;
    private List<Ticketing> itineraryTicketing;
    private List<SabreFlightSegment> reservationItems;
    private List<Quote> quotes;

    private String itineraryRefID;
    private boolean itineraryRefAirExtras;
    private String itineraryRefInhibitCode;
    private String itineraryRefPartitionID;
    private String itineraryRefPrimeHostID;
    private String itineraryRefAAA_PseudoCityCode;
    private Date itineraryRefCreateDateTime;
    private String itineraryRefCreationAgent;
    private String itineraryRefHomePseudoCityCode;
    private String itineraryRefPseudoCityCode;
    private String itineraryRefReceivedFrom;

    public List<SabrePassengerInformation> getCostumerInfo() {
        return costumerInfo;
    }

    public void setCostumerInfo(List<SabrePassengerInformation> costumerInfo) {
        this.costumerInfo = costumerInfo;
    }

    public String getItineraryRefID() {
        return itineraryRefID;
    }

    public void setItineraryRefID(String itineraryRefID) {
        this.itineraryRefID = itineraryRefID;
    }

    public boolean isItineraryRefAirExtras() {
        return itineraryRefAirExtras;
    }

    public void setItineraryRefAirExtras(boolean itineraryRefAirExtras) {
        this.itineraryRefAirExtras = itineraryRefAirExtras;
    }

    public String getItineraryRefInhibitCode() {
        return itineraryRefInhibitCode;
    }

    public void setItineraryRefInhibitCode(String itineraryRefInhibitCode) {
        this.itineraryRefInhibitCode = itineraryRefInhibitCode;
    }

    public String getItineraryRefPartitionID() {
        return itineraryRefPartitionID;
    }

    public void setItineraryRefPartitionID(String itineraryRefPartitionID) {
        this.itineraryRefPartitionID = itineraryRefPartitionID;
    }

    public String getItineraryRefPrimeHostID() {
        return itineraryRefPrimeHostID;
    }

    public void setItineraryRefPrimeHostID(String itineraryRefPrimeHostID) {
        this.itineraryRefPrimeHostID = itineraryRefPrimeHostID;
    }

    public String getItineraryRefAAA_PseudoCityCode() {
        return itineraryRefAAA_PseudoCityCode;
    }

    public void setItineraryRefAAA_PseudoCityCode(String itineraryRefAAA_PseudoCityCode) {
        this.itineraryRefAAA_PseudoCityCode = itineraryRefAAA_PseudoCityCode;
    }

    public Date getItineraryRefCreateDateTime() {
        return itineraryRefCreateDateTime;
    }

    public void setItineraryRefCreateDateTime(Date itineraryRefCreateDateTime) {
        this.itineraryRefCreateDateTime = itineraryRefCreateDateTime;
    }

    public String getItineraryRefCreationAgent() {
        return itineraryRefCreationAgent;
    }

    public void setItineraryRefCreationAgent(String itineraryRefCreationAgent) {
        this.itineraryRefCreationAgent = itineraryRefCreationAgent;
    }

    public String getItineraryRefHomePseudoCityCode() {
        return itineraryRefHomePseudoCityCode;
    }

    public void setItineraryRefHomePseudoCityCode(String itineraryRefHomePseudoCityCode) {
        this.itineraryRefHomePseudoCityCode = itineraryRefHomePseudoCityCode;
    }

    public String getItineraryRefPseudoCityCode() {
        return itineraryRefPseudoCityCode;
    }

    public void setItineraryRefPseudoCityCode(String itineraryRefPseudoCityCode) {
        this.itineraryRefPseudoCityCode = itineraryRefPseudoCityCode;
    }

    public String getItineraryRefReceivedFrom() {
        return itineraryRefReceivedFrom;
    }

    public void setItineraryRefReceivedFrom(String itineraryRefReceivedFrom) {
        this.itineraryRefReceivedFrom = itineraryRefReceivedFrom;
    }

    public List<SabrePassengerPrice> getItineraryPricing() {
        return itineraryPricing;
    }

    public void setItineraryPricing(List<SabrePassengerPrice> itineraryPricing) {
        this.itineraryPricing = itineraryPricing;
    }

    public List<Ticketing> getItineraryTicketing() {
        return itineraryTicketing;
    }

    public void setItineraryTicketing(List<Ticketing> itineraryTicketing) {
        this.itineraryTicketing = itineraryTicketing;
    }

    public List<SabreFlightSegment> getReservationItems() {
        return reservationItems;
    }

    public void setReservationItems(List<SabreFlightSegment> reservationItems) {
        this.reservationItems = reservationItems;
    }

    public List<Quote> getQuotes() {
        return quotes;
    }

    public void setQuotes(List<Quote> quotes) {
        this.quotes = quotes;
    }

    public static class Quote {

        private List<String> itineraryQuoteHeaders;
        private List<QuoteSignature> itineraryQuoteSiganture;
        private List<PricedItinerary> pricedItinerary;
        private int RPH;

        public List<String> getItineraryQuoteHeaders() {
            return itineraryQuoteHeaders;
        }

        public void setItineraryQuoteHeaders(List<String> itineraryQuoteHeaders) {
            this.itineraryQuoteHeaders = itineraryQuoteHeaders;
        }

        public List<QuoteSignature> getItineraryQuoteSiganture() {
            return itineraryQuoteSiganture;
        }

        public void setItineraryQuoteSiganture(List<QuoteSignature> itineraryQuoteSiganture) {
            this.itineraryQuoteSiganture = itineraryQuoteSiganture;
        }

        public int getRPH() {
            return RPH;
        }

        public void setRPH(int RPH) {
            this.RPH = RPH;
        }

        public List<PricedItinerary> getPricedItinerary() {
            return pricedItinerary;
        }

        public void setPricedItinerary(List<PricedItinerary> pricedItinerary) {
            this.pricedItinerary = pricedItinerary;
        }
    }

    public static class QuoteSignature {

        private String expirationDateTime;
        private String source;
        private String status;
        private String text;

        public String getExpirationDateTime() {
            return expirationDateTime;
        }

        public void setExpirationDateTime(String expirationDateTime) {
            this.expirationDateTime = expirationDateTime;
        }

        public String getSource() {
            return source;
        }

        public void setSource(String source) {
            this.source = source;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }

    }

    public static class PricedItinerary {

        private boolean displayOnly;
        private String inputMessage;
        private int RPH;
        private String StatusCode;
        private boolean TaxExempt;
        private String ValidatingCarrier;
        private List<String> passengerTypeQuantity;
        private List<String> passengerTypeQuantityCode;
        private List<TotalFare> totalFare;
        private List<PTCFareBreakdown> ptcFareBreakdown;

        public List<PTCFareBreakdown> getPtcFareBreakdown() {
            return ptcFareBreakdown;
        }

        public void setPtcFareBreakdown(List<PTCFareBreakdown> ptcFareBreakdown) {
            this.ptcFareBreakdown = ptcFareBreakdown;
        }

        public List<TotalFare> getTotalFare() {
            return totalFare;
        }

        public void setTotalFare(List<TotalFare> totalFare) {
            this.totalFare = totalFare;
        }

        public List<String> getPassengerTypeQuantity() {
            return passengerTypeQuantity;
        }

        public void setPassengerTypeQuantity(List<String> passengerTypeQuantity) {
            this.passengerTypeQuantity = passengerTypeQuantity;
        }

        public List<String> getPassengerTypeQuantityCode() {
            return passengerTypeQuantityCode;
        }

        public void setPassengerTypeQuantityCode(List<String> passengerTypeQuantityCode) {
            this.passengerTypeQuantityCode = passengerTypeQuantityCode;
        }

        public boolean isDisplayOnly() {
            return displayOnly;
        }

        public void setDisplayOnly(boolean displayOnly) {
            this.displayOnly = displayOnly;
        }

        public String getInputMessage() {
            return inputMessage;
        }

        public void setInputMessage(String inputMessage) {
            this.inputMessage = inputMessage;
        }

        public int getRPH() {
            return RPH;
        }

        public void setRPH(int RPH) {
            this.RPH = RPH;
        }

        public String getStatusCode() {
            return StatusCode;
        }

        public void setStatusCode(String StatusCode) {
            this.StatusCode = StatusCode;
        }

        public boolean isTaxExempt() {
            return TaxExempt;
        }

        public void setTaxExempt(boolean TaxExempt) {
            this.TaxExempt = TaxExempt;
        }

        public String getValidatingCarrier() {
            return ValidatingCarrier;
        }

        public void setValidatingCarrier(String ValidatingCarrier) {
            this.ValidatingCarrier = ValidatingCarrier;
        }

    }

    public static class PTCFareBreakdown {

        private String endorsements;
        private List<String> resTicketingRestrictions;
        private List<SabreFlightSegment> flightSegments;
        private List<String> fareBasis;
        private List<String> fareCalculation;
        private String fareSource;

        public String getEndorsements() {
            return endorsements;
        }

        public void setEndorsements(String endorsements) {
            this.endorsements = endorsements;
        }

        public List<String> getResTicketingRestrictions() {
            return resTicketingRestrictions;
        }

        public void setResTicketingRestrictions(List<String> resTicketingRestrictions) {
            this.resTicketingRestrictions = resTicketingRestrictions;
        }

        public List<SabreFlightSegment> getFlightSegments() {
            return flightSegments;
        }

        public void setFlightSegments(List<SabreFlightSegment> flightSegments) {
            this.flightSegments = flightSegments;
        }

        public List<String> getFareBasis() {
            return fareBasis;
        }

        public void setFareBasis(List<String> fareBasis) {
            this.fareBasis = fareBasis;
        }

        public List<String> getFareCalculation() {
            return fareCalculation;
        }

        public void setFareCalculation(List<String> fareCalculation) {
            this.fareCalculation = fareCalculation;
        }

        public String getFareSource() {
            return fareSource;
        }

        public void setFareSource(String fareSource) {
            this.fareSource = fareSource;
        }

    }

    public static class TotalFare {

        private BigDecimal baseFareAmount;
        private String baseFareCurrencyCode;
        private BigDecimal equivFareAmount;
        private String equivFareCurrencyCode;
        private String taxCode;
        private BigDecimal taxAmount;
        private List<String> taxBreakdownCode;
        private BigDecimal totalFareAmount;
        private String totalFareCurrencyCode;
        private BigDecimal totalBaseFareAmount;
        private BigDecimal totalEquivFareAmount;
        private BigDecimal totalTaxAmount;
        private BigDecimal totalTotalFareAmount;

        public BigDecimal getBaseFareAmount() {
            return baseFareAmount;
        }

        public void setBaseFareAmount(BigDecimal baseFareAmount) {
            this.baseFareAmount = baseFareAmount;
        }

        public String getBaseFareCurrencyCode() {
            return baseFareCurrencyCode;
        }

        public void setBaseFareCurrencyCode(String baseFareCurrencyCode) {
            this.baseFareCurrencyCode = baseFareCurrencyCode;
        }

        public BigDecimal getEquivFareAmount() {
            return equivFareAmount;
        }

        public void setEquivFareAmount(BigDecimal equivFareAmount) {
            this.equivFareAmount = equivFareAmount;
        }

        public String getEquivFareCurrencyCode() {
            return equivFareCurrencyCode;
        }

        public void setEquivFareCurrencyCode(String evivFareCurrencyCode) {
            this.equivFareCurrencyCode = evivFareCurrencyCode;
        }

        public String getTaxCode() {
            return taxCode;
        }

        public void setTaxCode(String taxCode) {
            this.taxCode = taxCode;
        }

        public BigDecimal getTaxAmount() {
            return taxAmount;
        }

        public void setTaxAmount(BigDecimal taxAmount) {
            this.taxAmount = taxAmount;
        }

        public List<String> getTaxBreakdownCode() {
            return taxBreakdownCode;
        }

        public void setTaxBreakdownCode(List<String> taxBreakdownCode) {
            this.taxBreakdownCode = taxBreakdownCode;
        }

        public BigDecimal getTotalFareAmount() {
            return totalFareAmount;
        }

        public void setTotalFareAmount(BigDecimal totalFareAmount) {
            this.totalFareAmount = totalFareAmount;
        }

        public String getTotalFareCurrencyCode() {
            return totalFareCurrencyCode;
        }

        public void setTotalFareCurrencyCode(String totalFareCurrencyCode) {
            this.totalFareCurrencyCode = totalFareCurrencyCode;
        }

        public BigDecimal getTotalBaseFareAmount() {
            return totalBaseFareAmount;
        }

        public void setTotalBaseFareAmount(BigDecimal totalBaseFareAmount) {
            this.totalBaseFareAmount = totalBaseFareAmount;
        }

        public BigDecimal getTotalEquivFareAmount() {
            return totalEquivFareAmount;
        }

        public void setTotalEquivFareAmount(BigDecimal totalEquivFareAmount) {
            this.totalEquivFareAmount = totalEquivFareAmount;
        }

        public BigDecimal getTotalTaxAmount() {
            return totalTaxAmount;
        }

        public void setTotalTaxAmount(BigDecimal totalTaxAmount) {
            this.totalTaxAmount = totalTaxAmount;
        }

        public BigDecimal getTotalTotalFareAmount() {
            return totalTotalFareAmount;
        }

        public void setTotalTotalFareAmount(BigDecimal totalTotalFareAmount) {
            this.totalTotalFareAmount = totalTotalFareAmount;
        }

    }

    public static class Ticketing {

        private int RPH;
        private String ticketTimeLimit;

        public int getRPH() {
            return RPH;
        }

        public void setRPH(int RPH) {
            this.RPH = RPH;
        }

        public String getTicketTimeLimit() {
            return ticketTimeLimit;
        }

        public void setTicketTimeLimit(String ticketTimeLimit) {
            this.ticketTimeLimit = ticketTimeLimit;
        }

    }

    @Override
    public String toString() {
        return "SabreBookResponse [costumerInfo=" + costumerInfo
                + ", itineraryPricing=" + itineraryPricing
                + ", itineraryTicketing=" + itineraryTicketing
                + ", reservationItems=" + reservationItems + ", quotes="
                + quotes + ", itineraryRefID=" + itineraryRefID
                + ", itineraryRefAirExtras=" + itineraryRefAirExtras
                + ", itineraryRefInhibitCode=" + itineraryRefInhibitCode
                + ", itineraryRefPartitionID=" + itineraryRefPartitionID
                + ", itineraryRefPrimeHostID=" + itineraryRefPrimeHostID
                + ", itineraryRefAAA_PseudoCityCode="
                + itineraryRefAAA_PseudoCityCode
                + ", itineraryRefCreateDateTime=" + itineraryRefCreateDateTime
                + ", itineraryRefCreationAgent=" + itineraryRefCreationAgent
                + ", itineraryRefHomePseudoCityCode="
                + itineraryRefHomePseudoCityCode
                + ", itineraryRefPseudoCityCode=" + itineraryRefPseudoCityCode
                + ", itineraryRefReceivedFrom=" + itineraryRefReceivedFrom
                + "]";
    }

}
