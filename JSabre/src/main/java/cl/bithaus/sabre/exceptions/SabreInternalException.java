
package cl.bithaus.sabre.exceptions;

/**
 *
 * @author Miguel A. Fuentes Buchholtz
 * @email miguel@variacode.com
 */
public class SabreInternalException extends SabreException{

    public SabreInternalException(String msg) {
        super(msg);
    }
    
    public SabreInternalException(Throwable t){
        super(t);
    }
    
}
