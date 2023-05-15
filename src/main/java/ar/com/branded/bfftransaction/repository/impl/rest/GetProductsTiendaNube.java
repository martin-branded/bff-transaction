package ar.com.branded.bfftransaction.repository.impl.rest;

import ar.com.branded.bfftransaction.model.domain.Auth;
import ar.com.branded.bfftransaction.repository.GetAllProductsByAuth;
import ar.com.branded.bfftransaction.repository.model.rest.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

import static ar.com.branded.bfftransaction.config.Constants.URL_TIENDANUBE_API;

@Repository
public class GetProductsTiendaNube implements GetAllProductsByAuth {

    private final RestTemplate restTemplate;

    @Autowired
    public GetProductsTiendaNube(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public List<Product> execute(Auth auth, String token) {
        final String userId = auth.getProfile_id();

        HttpHeaders headers = new HttpHeaders();
        headers.setBearerAuth(token);
        HttpEntity<String> entity = new HttpEntity<>(headers);

        ResponseEntity<Product[]> response = restTemplate.exchange(
                URL_TIENDANUBE_API + "/" + userId + "/products",
                HttpMethod.GET,
                entity,
                Product[].class
        );

        return Arrays.stream(Objects.requireNonNull(response.getBody())).toList();
    }
}
