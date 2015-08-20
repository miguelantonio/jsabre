package cl.bithaus.sabre.bo;

/**
 *
 * @author Miguel A. Fuentes Buchholtz
 * @email miguel@variacode.com
 */
public class SabreCancelResponse extends SabreResponse {

    private boolean cancel = false;

    /**
     *
     * @return
     */
    public boolean isCancel() {
        return cancel;
    }

    /**
     *
     * @param cancel
     */
    public void setCancel(boolean cancel) {
        this.cancel = cancel;
    }

    /**
     *
     * @return
     */
    public String toStringCustom() {
        if (this.isError()) {
            return super.toString();
        }
        if (cancel) {
            return "CANCEL OK";
        } else {
            return "CANCEL FAILED";
        }
    }
}
