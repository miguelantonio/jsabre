
package cl.bithaus.sabre.bo;

import java.util.Date;

/**
 *
 * Si esto va en una solicitud de booking se debe indicar ADT primero que INF, ya que se debe indicar adulto responsable
 * 
 * @author Miguel A. Fuentes Buchholtz
 * @email miguel@variacode.com
 */
public class SabrePassengerInformation {

    private String givenName;
    private String surname;
    private String phoneNumber;
    private String phoneLocationCode;
    private String phoneRPH;
    private boolean withInfant;
    private String nameNumber;
    private int RPH;
    private String passengerType;
    private String passport;
    //Sabre Country code CL para chile AR para argentina, etc..
    private String countryCode;
    private Date birthDay;
    private Boolean isFemale;
    
    //TODO: marco deprecados los que están "en la mira" debido al soporte Sabre
    @Deprecated
    private String membershipID;

    /**
     *
     * @return
     */
    public String getGivenName() {
        return givenName;
    }

    /**
     *
     * @param givenName
     */
    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    /**
     *
     * @return
     */
    public String getSurname() {
        return surname;
    }

    /**
     *
     * @param lastName
     */
    public void setSurname(String lastName) {
        this.surname = lastName;
    }

    /**
     *
     * @return
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     *
     * @param phoneNumber
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneLocationCode() {
        return phoneLocationCode;
    }

    public void setPhoneLocationCode(String phoneLocationCode) {
        this.phoneLocationCode = phoneLocationCode;
    }

    public String getPhoneRPH() {
        return phoneRPH;
    }

    public void setPhoneRPH(String phoneRPH) {
        this.phoneRPH = phoneRPH;
    }

    public boolean isWithInfant() {
        return withInfant;
    }

    public void setWithInfant(boolean withInfant) {
        this.withInfant = withInfant;
    }

    public String getNameNumber() {
        return nameNumber;
    }

    public void setNameNumber(String nameNumber) {
        this.nameNumber = nameNumber;
    }

    public int getRPH() {
        return RPH;
    }

    public void setRPH(int RPH) {
        this.RPH = RPH;
    }

    public String getPassengerType() {
        return passengerType;
    }

    public void setPassengerType(String passengerType) {
        this.passengerType = passengerType;
    }

    public String getMembershipID() {
        return membershipID;
    }

    public void setMembershipID(String membershipID) {
        this.membershipID = membershipID;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public Boolean isIsFemale() {
        return isFemale;
    }

    public void setIsFemale(Boolean isFemale) {
        this.isFemale = isFemale;
    }
    
}
