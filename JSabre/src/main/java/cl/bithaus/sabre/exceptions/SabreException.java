package cl.bithaus.sabre.exceptions;

/**
 *
 * @author Miguel A. Fuentes Buchholtz
 * @email miguel@variacode.com
 */
public class SabreException extends Exception {

	private static final long serialVersionUID = -1353324187353720246L;

    /**
     *
     * @param msg
     */
    public SabreException(String msg) {
        super(msg);
    }

    /**
     *
     * @param e
     */
    public SabreException(Throwable e) {
        super(e);
    }
}
