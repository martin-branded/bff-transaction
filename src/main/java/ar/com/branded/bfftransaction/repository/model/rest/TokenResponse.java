package ar.com.branded.bfftransaction.repository.model.rest;

import ar.com.branded.bfftransaction.model.domain.Auth;

public class TokenResponse {

    private String access_token;
    private String token_type;
    private String scope;
    private Integer user_id;

    public Auth toDomain(){
        return new Auth(user_id.toString());
    }

    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

    public String getToken_type() {
        return token_type;
    }

    public void setToken_type(String token_type) {
        this.token_type = token_type;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }
}
