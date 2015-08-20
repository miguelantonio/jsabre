package cl.bithaus.sabre.bo;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Miguel A. Fuentes Buchholtz
 * @email miguel@variacode.com
 */
public class SabreSearchResponse extends SabreResponse {

    private String from;
    private Date departureDate;

    //aerolínea carrier
    private String airline;
    private String currency;
    //Valor
    private BigDecimal price;
    private List<SabrePassengerPrice> passengerPrice;
    private List<SabreFlightSegment> departureFlight;
    private List<SabreFlightSegment> returnFlight;

    /**
     *
     */
    public SabreSearchResponse() {

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
    public BigDecimal getPrice() {
        return price;
    }

    /**
     *
     * @param price
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     *
     * @return
     */
    public List<SabreFlightSegment> getDepartureFlight() {
        return departureFlight;
    }

    /**
     *
     * @param departureFlight
     */
    public void setDepartureFlight(List<SabreFlightSegment> departureFlight) {
        this.departureFlight = departureFlight;
    }

    /**
     *
     * @return
     */
    public List<SabreFlightSegment> getReturnFlight() {
        return returnFlight;
    }

    /**
     *
     * @param returnFlight
     */
    public void setReturnFlight(List<SabreFlightSegment> returnFlight) {
        this.returnFlight = returnFlight;
    }

    /**
     *
     * @return
     */
    public String getCurrency() {
        return currency;
    }

    /**
     *
     * @param currency
     */
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     *
     * @return
     */
    public List<SabrePassengerPrice> getPassengerPrice() {
        return passengerPrice;
    }

    /**
     *
     * @param passengerPrice
     */
    public void setPassengerPrice(List<SabrePassengerPrice> passengerPrice) {
        this.passengerPrice = passengerPrice;
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
    public Date getDepartureDate() {
        return departureDate;
    }

    /**
     *
     * @param departureDate
     */
    public void setDepartureDate(Date departureDate) {
        this.departureDate = departureDate;
    }

    public Integer getDepartureFlightDuration() {

        SabreFlightSegment first = this.getDepartureFlight().get(0);
        SabreFlightSegment last = this.getDepartureFlight().get(this.getDepartureFlight().size() - 1);

        long delta = last.getArrival().getTime() - first.getDeparture().getTime();

        return (int) delta / 1000 / 60;

    }

    public Integer getReturnFlightDuration() {

        SabreFlightSegment first = this.getReturnFlight().get(0);
        SabreFlightSegment last = this.getReturnFlight().get(this.getReturnFlight().size() - 1);

        long delta = last.getArrival().getTime() - first.getDeparture().getTime();

        return (int) delta / 1000 / 60;
    }

    public String getDepartureFlightCompositeNumber() {

        String aux = this.departureFlight.get(0).getMarketingAirline() + departureFlight.get(0).getMarketingAirlineFlightNumber();
        for (int i = 1; i < departureFlight.size(); i++) {

            aux += "-" + departureFlight.get(i).getMarketingAirline() + departureFlight.get(i).getMarketingAirlineFlightNumber();
        }

        return aux;
    }

    public String getReturnFlightCompositeNumber() {

        if (this.returnFlight == null) {
            return null;
        }

        String aux = this.returnFlight.get(0).getMarketingAirline() + returnFlight.get(0).getMarketingAirlineFlightNumber();
        for (int i = 1; i < returnFlight.size(); i++) {

            aux += "-" + returnFlight.get(i).getMarketingAirline() + returnFlight.get(i).getMarketingAirlineFlightNumber();
        }

        return aux;
    }

    /**
     *
     * @return
     */
    public String toStringCustom() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm");
        if (this.isError()) {

            return "Error: " + Arrays.toString(this.getErrorDescription().toArray());
        }

        String str = "SabreSearchResponse [$" + price + " " + currency + " - " + airline + ", " + from + (departureDate == null ? "" : sdf.format(departureDate)) + "] \n";

        if (departureFlight != null) {
            for (SabreFlightSegment s : departureFlight) {
                str += "          Departure > " + s.toStringCustom() + "\n";
            }
        }

        if (returnFlight != null) {
            for (SabreFlightSegment s : returnFlight) {
                str += "             Return > " + s.toStringCustom() + "\n";
            }
        }

        if (passengerPrice != null) {
            for (SabrePassengerPrice pp : passengerPrice) {
                str += "     PassengerPrice > " + pp.toStringCustom("                      ") + "\n";
            }
        }

        return str;
    }

    @Override
    public String toString() {
        return "SabreSearchResponse [from=" + from + ", departureDate="
                + departureDate + ", airline=" + airline + ", currency="
                + currency + ", price=" + price + ", passengerPrice="
                + passengerPrice + ", departureFlight=" + departureFlight
                + ", returnFlight=" + returnFlight + "]";
    }

}
