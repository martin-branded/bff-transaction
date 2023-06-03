package ar.com.branded.bfftransaction.config;

import ar.com.branded.bfftransaction.repository.*;
import ar.com.branded.bfftransaction.repository.impl.jdbc.*;
import ar.com.branded.bfftransaction.repository.impl.rest.GenerateTokenTiendaNube;
import ar.com.branded.bfftransaction.repository.impl.rest.GetProductsTiendaNube;
import ar.com.branded.bfftransaction.service.GenerateCodeShop;
import ar.com.branded.bfftransaction.service.GenerateUserShop;
import ar.com.branded.bfftransaction.service.GetPageableLooks;
import ar.com.branded.bfftransaction.service.impl.GenerateCodeShopService;
import ar.com.branded.bfftransaction.service.impl.GenerateUserShopService;
import ar.com.branded.bfftransaction.service.impl.GetPageableLooksService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.client.RestTemplate;

import javax.sql.DataSource;


@Configuration
public class AplicationContextConfig {

    @Value("${spring.datasource.url}")
    private String URL_SUPABASE;
    @Value("${spring.datasource.password}")
    private String SUPABASE_PASS;
    @Value("${spring.datasource.username}")
    private String SUPABASE_USER;


    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
    @Bean
    public JdbcTemplate jdbcTemplate(DataSource dataSource) {
        return new JdbcTemplate(dataSource);
    }
    @Bean
    public DataSource dataSource(){
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUrl(URL_SUPABASE);
        dataSource.setUsername(SUPABASE_USER);
        dataSource.setPassword(SUPABASE_PASS);
        return dataSource;
    }


    @Bean(name = "generateCodeShop")
    public GenerateCodeShop saveShopByCodeService(){
        return new GenerateCodeShopService();
    }
    @Bean(name = "generateToken")
    public GenerateToken saveShopByCodeRepository(RestTemplate restTemplate){
        return new GenerateTokenTiendaNube(restTemplate);
    }
    @Bean(name = "saveToken")
    public SaveToken saveToken(JdbcTemplate jdbcTemplate){
        return new SaveTokenSupabase(jdbcTemplate);
    }
    @Bean(name = "generateUserShop")
    public GenerateUserShop generateUserShop(){return new GenerateUserShopService();}
    @Bean(name = "generateRelationUserShop")
    public GenerateRelationUserShop generateRelationUserShop(JdbcTemplate jdbcTemplate){return new GenerateRelationUserShopSupabase(jdbcTemplate);}
    @Bean(name = "getProducts")
    public GetAllProductsByAuth getProducts(RestTemplate restTemplate){return new GetProductsTiendaNube(restTemplate);}
    @Bean(name = "getToken")
    public GetTokenByProfile getToken(JdbcTemplate jdbcTemplate){return new GetTokenSupabase(jdbcTemplate);}
    @Bean(name = "saveProduct")
    public SaveProducts saveProduct(JdbcTemplate jdbcTemplate){return new SaveProductsSupabase(jdbcTemplate);}
    @Bean(name = "saveProductDetails")
    public SaveProductsDetails saveProductDetails(JdbcTemplate jdbcTemplate){return new SaveProductDetailsSupabase(jdbcTemplate);}
    @Bean(name = "getPageableLooks")
    public GetPageableLooks getPageableLooks(){return new GetPageableLooksService();}
    @Bean(name = "retriverLooks")
    public RetriverLooks retriverLooks(JdbcTemplate jdbcTemplate){return new RetriverLooksSupabase(jdbcTemplate);}

}
