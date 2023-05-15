package ar.com.branded.bfftransaction.repository.impl.rest;
import ar.com.branded.bfftransaction.repository.GenerateToken;
import ar.com.branded.bfftransaction.repository.model.rest.AuthTiendaNube;
import ar.com.branded.bfftransaction.repository.model.rest.TokenResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;
import static ar.com.branded.bfftransaction.config.Constants.*;
@Repository
public class GenerateTokenTiendaNube implements GenerateToken {

    private final RestTemplate restTemplate;

    @Autowired
    public GenerateTokenTiendaNube(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public TokenResponse execute(String code) {
        AuthTiendaNube authTiendaNube = new AuthTiendaNube(CLIENT_ID, SECRET_ID, GRANT_TYPE, code);

        return restTemplate.postForObject(
                URL_TIENDANUBE_AUTH,
                authTiendaNube,
                TokenResponse.class
        );
    }
}
