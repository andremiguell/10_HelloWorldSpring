package e_helloworldspringsetterannotconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author AMV
 */
@Configuration
class MyAppConfig {
    
    @Bean(name="display")
    public Display getDisplay() {
        return new DisplayImpl();
    }
     
    @Bean(name="mensageiro")
    public Mensageiro getMensageiro() {
        return new MensageiroImpl();
    }
 }
