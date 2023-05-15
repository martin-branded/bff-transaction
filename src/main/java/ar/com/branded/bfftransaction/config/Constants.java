package ar.com.branded.bfftransaction.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Constants {
    public static Integer CLIENT_ID;
    public static String SECRET_ID;
    public static String GRANT_TYPE;
    public static String URL_TIENDANUBE_AUTH;
    public static String URL_TIENDANUBE_API;

    @Value("${tiendanube.client_id}")
    public void setClientId(Integer clientId) {
        CLIENT_ID = clientId;
    }

    @Value("${tiendanube.secret_id}")
    public void setSecretId(String secretId) {
        SECRET_ID = secretId;
    }

    @Value("${tiendanube.grant_type}")
    public void setGrantType(String grantType) {
        GRANT_TYPE = grantType;
    }

    @Value("${tiendanube.urls.auth}")
    public void setUrlTiendanubeAuth(String urlTiendanubeAuth) {
        URL_TIENDANUBE_AUTH = urlTiendanubeAuth;
    }

    @Value("${tiendanube.urls.api}")
    public void setUrlTiendanubeApi(String urlTiendanubeApi) {
        URL_TIENDANUBE_API = urlTiendanubeApi;
    }
}
