package ar.com.branded.bfftransaction.config;

import ar.com.branded.bfftransaction.service.SaveShopByCode;
import ar.com.branded.bfftransaction.service.impl.SaveShopByCodeService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AplicationContextConfig {

    @Bean(name = "saveShop")
    public SaveShopByCode saveShopByCodeService(){
        return new SaveShopByCodeService();
    }
}
