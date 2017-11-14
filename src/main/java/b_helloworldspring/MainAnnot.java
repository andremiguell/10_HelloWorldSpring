package b_helloworldspring;

import org.springframework.context.support.GenericXmlApplicationContext;

/**
 *
 * @author AMV
 */
public class MainAnnot {
    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("calsspath:bean-annot.xml");
        ctx.refresh();;
        Mensageiro m = ctx.getBean("mensageiro", Mensageiro.class);
        System.out.println(m.getMensagem());
    }
}