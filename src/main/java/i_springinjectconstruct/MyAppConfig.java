package i_springinjectconstruct;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author AMV
 */
@Configuration
class MyAppConfig {
    
    @Bean(name="main")
    public Main getMain() {
        return new Main();
    }
 }
