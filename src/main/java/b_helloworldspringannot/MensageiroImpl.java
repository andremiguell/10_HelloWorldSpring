package b_helloworldspringannot;

import org.springframework.stereotype.Service;

/**
 *
 * @author AMV
 */
 @Service("mensageiro")
public class MensageiroImpl implements Mensageiro{

    @Override
    public String getMensagem() {
        return "helloworldSpringAnnotation";
    }
    
}
