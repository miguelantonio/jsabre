package cl.bithaus.sabre.bo;

import java.util.Date;

/**
 *
 * @author Miguel A. Fuentes Buchholtz
 * @email miguel@variacode.com
 */
public class SabreSearchRequest implements SabreRequest {

    //Origen
    private String from;
    //Destino
    private String to;
    //Fecha de salida
    private Date departureDate;
    //Fecha de regreso (para roundtrip), si null es solo un viaje
    private Date returnDate;
    //número de adultos
    private int adults;
    //número de niños
    private int children;
    //número de infantes
    private int infants;

    /**
     *
     * @param from
     * @param to
     * @param departureDate
     * @param adults
     * @param children
     * @param infants
     */
    public SabreSearchRequest(String from, String to, Date departureDate, int adults, int children, int infants) {
        this(from, to, departureDate, null, adults, children, infants);
    }

    /**
     *
     * @param from
     * @param to
     * @param departureDate
     * @param returnDate
     * @param adults
     * @param children
     * @param infants
     */
    public SabreSearchRequest(String from, String to, Date departureDate, Date returnDate, int adults, int children, int infants) {
        this.from = from;
        this.to = to;
        this.departureDate = departureDate;
        this.returnDate = returnDate;
        this.adults = adults;
        this.children = children;
        this.infants = infants;
    }

    public boolean isValid() {
        
        return !(from == null || from.trim().isEmpty() || departureDate == null || (adults <= 0 && children <= 0 && infants <= 0) || (to == null) || (returnDate != null && returnDate.before(departureDate)));
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

    /**
     *
     * @return
     */
    public Date getReturnDate() {
        return returnDate;
    }

    /**
     *
     * @param returnDate
     */
    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    /**
     *
     * @return
     */
    public int getAdults() {
        return adults;
    }

    /**
     *
     * @param adults
     */
    public void setAdults(int adults) {
        this.adults = adults;
    }

    /**
     *
     * @return
     */
    public int getChildren() {
        return children;
    }

    /**
     *
     * @param children
     */
    public void setChildren(int children) {
        this.children = children;
    }

    /**
     *
     * @return
     */
    public int getInfants() {
        return infants;
    }

    /**
     *
     * @param infants
     */
    public void setInfants(int infants) {
        this.infants = infants;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + (this.from != null ? this.from.hashCode() : 0);
        hash = 79 * hash + (this.to != null ? this.to.hashCode() : 0);
        hash = 79 * hash + (this.departureDate != null ? this.departureDate.hashCode() : 0);
        hash = 79 * hash + (this.returnDate != null ? this.returnDate.hashCode() : 0);
        hash = 79 * hash + this.adults;
        hash = 79 * hash + this.children;
        hash = 79 * hash + this.infants;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final SabreSearchRequest other = (SabreSearchRequest) obj;
        if ((this.from == null) ? (other.from != null) : !this.from.equals(other.from)) {
            return false;
        }
        if ((this.to == null) ? (other.to != null) : !this.to.equals(other.to)) {
            return false;
        }
        if (this.departureDate != other.departureDate && (this.departureDate == null || !this.departureDate.equals(other.departureDate))) {
            return false;
        }
        if (this.returnDate != other.returnDate && (this.returnDate == null || !this.returnDate.equals(other.returnDate))) {
            return false;
        }
        if (this.adults != other.adults) {
            return false;
        }
        if (this.children != other.children) {
            return false;
        }
        if (this.infants != other.infants) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "SabreSearchRequest{" + "\n\tfrom=" + from + ", \n\tto=" + to + ", \n\tdepartureDate=" + departureDate + ", \n\treturnDate=" + returnDate + ", \n\tadults=" + adults + ", \n\tchildren=" + children + ", \n\tinfants=" + infants + "\n\t}";
    }

}
