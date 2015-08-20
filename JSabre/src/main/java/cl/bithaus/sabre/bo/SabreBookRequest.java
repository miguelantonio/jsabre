package cl.bithaus.sabre.bo;

import java.util.List;

/**
 *
 * @author Miguel A. Fuentes Buchholtz
 * @email miguel@variacode.com
 */
public class SabreBookRequest implements SabreRequest{

    private SabreSearchRequest searchInformation;
    private SabreSearchResponse responseInformation;
    private List<SabrePassengerInformation> passengerInformation;
    private String queueNumber;
    private String PPC;

    /**
     *
     */
    public SabreBookRequest() {
    }

    /**
     *
     * @param searchInformation
     * @param responseInformation
     * @param passengerInformation
     */
    public SabreBookRequest(SabreSearchRequest searchInformation, SabreSearchResponse responseInformation
            , List<SabrePassengerInformation> passengerInformation) {
        this.responseInformation = responseInformation;
        this.searchInformation = searchInformation;
        this.passengerInformation = passengerInformation;
    }

    /**
     *
     * @return
     */
    public List<SabrePassengerInformation> getPassengerInformation() {
        return passengerInformation;
    }

    /**
     *
     * @param passengerInformation
     */
    public void setPassengerInformation(List<SabrePassengerInformation> passengerInformation) {
        this.passengerInformation = passengerInformation;
    }

    /**
     *
     * @return
     */
    public SabreSearchRequest getSearchInformation() {
        return searchInformation;
    }

    /**
     *
     * @param searchInformation
     */
    public void setSearchInformation(SabreSearchRequest searchInformation) {
        this.searchInformation = searchInformation;
    }

    /**
     *
     * @return
     */
    public SabreSearchResponse getResponseInformation() {
        return responseInformation;
    }

    /**
     *
     * @param responseInformation
     */
    public void setResponseInformation(SabreSearchResponse responseInformation) {
        this.responseInformation = responseInformation;
    }

    public String getQueueNumber() {
        return queueNumber;
    }

    public void setQueueNumber(String queueNumber) {
        this.queueNumber = queueNumber;
    }

    public String getPPC() {
        return PPC;
    }

    public void setPPC(String PPC) {
        this.PPC = PPC;
    }

    @Override
    public String toString() {
        return "SabreBookRequest{" + "searchInformation=" + searchInformation + ", responseInformation=" + responseInformation + ", passengerInformation=" + passengerInformation + ", queueNumber=" + queueNumber + '}';
    }
    
    

}
