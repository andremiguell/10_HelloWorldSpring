package com.redoutevant.helloworldfactory;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Factory
 *
 * @author Cesar Freire
 */
public class Main {

// versão 1
//    public static void main(String[] args) {
//        System.out.println("Hello World!");
//    }
// versão 2
//    public static void main(String[] args) {
//       if(args.length > 0) {
//           System.out.println(args[0]);
//       }
//    }
    // versão 3   
//    public static void main(String[] args) {
//        Display d = new DisplayImpl();
//        Mensageiro m = new MensageiroImpl();
//        d.setMensagem(m);
//        try {
//            d.render();
//        } catch (Exception ex) {
//            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
    // versao 4
    public static void main(String[] args) {
        Display d = HelloWorldFactory.getInstance().getDisplay();
        Mensageiro m = HelloWorldFactory.getInstance().getMensageiro();
        d.setMensagem(m);
        try {
            d.render();
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
