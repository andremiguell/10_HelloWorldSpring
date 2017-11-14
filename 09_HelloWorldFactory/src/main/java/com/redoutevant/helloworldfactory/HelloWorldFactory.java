package com.redoutevant.helloworldfactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dev
 */
public class HelloWorldFactory {
    
    private static HelloWorldFactory instance = null;
    private Properties props = null;
    private Mensageiro msg = null;
    private Display disp = null;
    
    // privado factory
    private HelloWorldFactory() {
       props =  new Properties();
        try {
            props.load(
                    new FileInputStream("src/main/resources/hello.properties"));
        } catch (IOException ex) {
            Logger.getLogger(HelloWorldFactory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
