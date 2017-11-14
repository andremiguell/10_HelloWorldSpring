package f_helloworldspringconstruct;

/**
 *
 * @author AMV
 */
public class ConstructMensageiroImpl implements Mensageiro{

    private final String message;
    
    public ConstructMensageiroImpl(String msg) {
        this.message = msg;
    }
    
    @Override
    public String getMessage() {
        return this.message;
    }   
}
