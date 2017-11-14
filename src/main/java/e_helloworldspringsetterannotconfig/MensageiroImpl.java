package e_helloworldspringsetterannotconfig;

import org.springframework.stereotype.Service;

/**
 *
 * @author AMV
 */
@Service("mensageiro")
public class MensageiroImpl implements Mensageiro {

    @Override
    public String getMessage() {
        return "HelloWorldSpringSetterAnnotationConfiguration";
    }
}
