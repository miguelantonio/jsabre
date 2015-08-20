package cl.bithaus.sabre.bo;

import java.util.List;

/**
 *
 * @author Miguel A. Fuentes Buchholtz
 * @email miguel@variacode.com
 */
public class SabreResponse {

    public static final String STATUS_COMPLETE = "COMPLETE";
    public static final String STATUS_INCOMPLETE = "INCOMPLETE";
    
    private boolean error;
    //Buen STATUS: COMPLETE
    private String status;
    private List<String> errorDescription;

    /**
     *
     * @return
     */
    public boolean isError() {
        return error;
    }

    /**
     *
     * @param error
     */
    public void setError(boolean error) {
        this.error = error;
    }

    /**
     *
     * @return
     */
    public String getStatus() {
        return status;
    }

    /**
     *
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     *
     * @return
     */
    public List<String> getErrorDescription() {
        return errorDescription;
    }

    /**
     *
     * @param errorDescription
     */
    public void setErrorDescription(List<String> errorDescription) {
        this.errorDescription = errorDescription;
    }

}
