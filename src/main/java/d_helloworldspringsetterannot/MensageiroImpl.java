package d_helloworldspringsetterannot;

import c_helloworldspringsetter.*;
import org.springframework.stereotype.Service;

/**
 *
 * @author AMV
 */
@Service("mensageiro")
public class MensageiroImpl implements Mensageiro {

    @Override
    public String getMessage() {
        return "HelloWorld3";
    }
}
