package cl.bithaus.sabre.bo;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Miguel A. Fuentes Buchholtz
 * @email miguel@variacode.com
 */
public class SabreFlightSegment {

    private String baggageAllowanceNumber;
    private String fareBasisCode;
    private String validityNotValidAfter;
    private String validityNotValidBefore;
    private Integer RPH;
    private Integer airMilesFlown;
    private String connectionInd;
    private Integer dayOfWeekInd;
    private String numberInParty;
    private String segmentNumber;
    private boolean smokingAllowed;
    private boolean specialMeal;
    private String status;
    private String stopQuantity;
    private boolean eTicket;
    private String from;
    private String to;
    private BigDecimal elapsedTime;
    private Date departure;
    private Date arrival;
    private String airline;
    private Integer duration;
    private String marriageGrp;
    private String flightNumber;
    private String departureTimeZone;
    private String arrivalTimeZone;
    private String cabin;
    private String resBookDesigCode;
    private String equipmentCode;
    private String marketingAirline;
    private String marketingAirlineFlightNumber;
    private List<String> meal;
    private List<String> operatingAirline;
    private String terminal;
    private String terminalCode;
    private String supplierRef;
    private String text;
    private Date updatedArrivalTime;
    private Date updatedDepartureTime;

    public String getMarriageGrp() {
        return marriageGrp;
    }

    public void setMarriageGrp(String marriageGrp) {
        this.marriageGrp = marriageGrp;
    }

    public String getBaggageAllowanceNumber() {
        return baggageAllowanceNumber;
    }

    public void setBaggageAllowanceNumber(String baggageAllowanceNumber) {
        this.baggageAllowanceNumber = baggageAllowanceNumber;
    }

    public String getFareBasisCode() {
        return fareBasisCode;
    }

    public void setFareBasisCode(String fareBasisCode) {
        this.fareBasisCode = fareBasisCode;
    }

    public String getValidityNotValidAfter() {
        return validityNotValidAfter;
    }

    public void setValidityNotValidAfter(String validityNotValidAfter) {
        this.validityNotValidAfter = validityNotValidAfter;
    }

    public String getValidityNotValidBefore() {
        return validityNotValidBefore;
    }

    public void setValidityNotValidBefore(String validityNotValidBefore) {
        this.validityNotValidBefore = validityNotValidBefore;
    }

    /**
     *
     */
    public SabreFlightSegment() {

    }

    /**
     *
     * @return
     */
    public String getFrom() {
        return from;
    }

    /**
     *
     * @param from
     */
    public void setFrom(String from) {
        this.from = from;
    }

    /**
     *
     * @return
     */
    public String getTo() {
        return to;
    }

    /**
     *
     * @param to
     */
    public void setTo(String to) {
        this.to = to;
    }

    /**
     *
     * @return
     */
    public Date getDeparture() {
        return departure;
    }

    /**
     *
     * @param departure
     */
    public void setDeparture(Date departure) {
        this.departure = departure;
    }

    /**
     *
     * @return
     */
    public Date getArrival() {
        return arrival;
    }

    /**
     *
     * @param arrival
     */
    public void setArrival(Date arrival) {
        this.arrival = arrival;
    }

    /**
     *
     * @return
     */
    public String getAirline() {
        return airline;
    }

    /**
     *
     * @param airline
     */
    public void setAirline(String airline) {
        this.airline = airline;
    }

    /**
     *
     * @return
     */
    public Integer getDuration() {
        return duration;
    }

    /**
     *
     * @param duration
     */
    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    /**
     *
     * @return
     */
    public String getFlightNumber() {
        return flightNumber;
    }

    /**
     *
     * @param flightNumber
     */
    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    /**
     *
     * @return
     */
    public String getDepartureTimeZone() {
        return departureTimeZone;
    }

    /**
     *
     * @param departureTimeZone
     */
    public void setDepartureTimeZone(String departureTimeZone) {
        this.departureTimeZone = departureTimeZone;
    }

    /**
     *
     * @return
     */
    public String getArrivalTimeZone() {
        return arrivalTimeZone;
    }

    /**
     *
     * @param arrivalTimeZone
     */
    public void setArrivalTimeZone(String arrivalTimeZone) {
        this.arrivalTimeZone = arrivalTimeZone;
    }

    /**
     *
     * @return
     */
    public String getCabin() {
        return cabin;
    }

    /**
     *
     * @param cabin
     */
    public void setCabin(String cabin) {
        this.cabin = cabin;
    }

    /**
     *
     * @return
     */
    public String getResBookDesigCode() {
        return resBookDesigCode;
    }

    /**
     *
     * @param bookDesigCode
     */
    public void setResBookDesigCode(String bookDesigCode) {
        this.resBookDesigCode = bookDesigCode;
    }

    /**
     *
     * @return
     */
    public String getEquipmentCode() {
        return equipmentCode;
    }

    /**
     *
     * @param equipmentCode
     */
    public void setEquipmentCode(String equipmentCode) {
        this.equipmentCode = equipmentCode;
    }

    /**
     *
     * @return
     */
    public String getMarketingAirline() {
        return marketingAirline;
    }

    /**
     *
     * @param marketingAirline
     */
    public void setMarketingAirline(String marketingAirline) {
        this.marketingAirline = marketingAirline;
    }

    /**
     *
     * @return
     */
    public String getMarketingAirlineFlightNumber() {
        return marketingAirlineFlightNumber;
    }

    /**
     *
     * @param marketingAirlineFlightNumber
     */
    public void setMarketingAirlineFlightNumber(String marketingAirlineFlightNumber) {
        this.marketingAirlineFlightNumber = marketingAirlineFlightNumber;
    }

    public Integer getRPH() {
        return RPH;
    }

    public void setRPH(Integer RPH) {
        this.RPH = RPH;
    }

    public Integer getAirMilesFlown() {
        return airMilesFlown;
    }

    public void setAirMilesFlown(Integer airMilesFlown) {
        this.airMilesFlown = airMilesFlown;
    }

    public String getConnectionInd() {
        return connectionInd;
    }

    public void setConnectionInd(String connectionInd) {
        this.connectionInd = connectionInd;
    }

    public Integer getDayOfWeekInd() {
        return dayOfWeekInd;
    }

    public void setDayOfWeekInd(Integer dayOfWeekInd) {
        this.dayOfWeekInd = dayOfWeekInd;
    }

    public String getNumberInParty() {
        return numberInParty;
    }

    public void setNumberInParty(String numberInParty) {
        this.numberInParty = numberInParty;
    }

    public String getSegmentNumber() {
        return segmentNumber;
    }

    public void setSegmentNumber(String segmentNumber) {
        this.segmentNumber = segmentNumber;
    }

    public boolean isSmokingAllowed() {
        return smokingAllowed;
    }

    public void setSmokingAllowed(boolean smokingAllowed) {
        this.smokingAllowed = smokingAllowed;
    }

    public boolean isSpecialMeal() {
        return specialMeal;
    }

    public void setSpecialMeal(boolean specialMeal) {
        this.specialMeal = specialMeal;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStopQuantity() {
        return stopQuantity;
    }

    public void setStopQuantity(String stopQuantity) {
        this.stopQuantity = stopQuantity;
    }

    public boolean iseTicket() {
        return eTicket;
    }

    public void seteTicket(boolean eTicket) {
        this.eTicket = eTicket;
    }

    public BigDecimal getElapsedTime() {
        return elapsedTime;
    }

    public void setElapsedTime(BigDecimal elapsedTime) {
        this.elapsedTime = elapsedTime;
    }

    public List<String> getMeal() {
        return meal;
    }

    public void setMeal(List<String> meal) {
        this.meal = meal;
    }

    public List<String> getOperatingAirline() {
        return operatingAirline;
    }

    public void setOperatingAirline(List<String> operatingAirline) {
        this.operatingAirline = operatingAirline;
    }

    public String getTerminal() {
        return terminal;
    }

    public void setTerminal(String terminal) {
        this.terminal = terminal;
    }

    public String getTerminalCode() {
        return terminalCode;
    }

    public void setTerminalCode(String terminalCode) {
        this.terminalCode = terminalCode;
    }

    public String getSupplierRef() {
        return supplierRef;
    }

    public void setSupplierRef(String supplierRef) {
        this.supplierRef = supplierRef;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getUpdatedArrivalTime() {
        return updatedArrivalTime;
    }

    public void setUpdatedArrivalTime(Date updatedArrivalTime) {
        this.updatedArrivalTime = updatedArrivalTime;
    }

    public Date getUpdatedDepartureTime() {
        return updatedDepartureTime;
    }

    public void setUpdatedDepartureTime(Date updatedDepartureTime) {
        this.updatedDepartureTime = updatedDepartureTime;
    }

    @Override
    public String toString() {
        return "SabreFlightSegment{" + "\n\t\tfrom=" + from + ", \n\t\tto=" + to + ", \n\t\tdeparture=" + departure + ", \n\t\tarrival=" + arrival + ", \n\t\tairline=" + airline + ", \n\t\tduration=" + duration + ", \n\t\tflightNumber=" + flightNumber + ", \n\t\tdepartureTimeZone=" + departureTimeZone + ", \n\t\tarrivalTimeZone=" + arrivalTimeZone + ", \n\t\tcabin=" + cabin + "\n\t\t}";
    }

    /**
     *
     * @return
     */
    public String toStringCustom() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm");
        String str = "Segm [" + airline + "-" + flightNumber + " " + cabin + " "
                + from + "-" + to + " "
                + sdf.format(departure) + departureTimeZone + " "
                + sdf.format(arrival) + arrivalTimeZone + " (Dur " + duration + "m) ]";

        return str;
    }
}
