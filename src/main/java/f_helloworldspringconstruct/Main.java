package f_helloworldspringconstruct;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.context.support.GenericXmlApplicationContext;

/**
 *
 * Factory
 * @author AMV
 */
public class Main {

    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:f_bean-construct.xml");
        ctx.refresh();
        Display d = ctx.getBean("display", Display.class);
        try {
            d.render();
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
