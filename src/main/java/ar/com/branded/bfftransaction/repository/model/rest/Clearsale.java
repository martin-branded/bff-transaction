package ar.com.branded.bfftransaction.repository.model.rest;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Clearsale {
    @JsonProperty("CodigoIntegracao")
    private boolean codigoIntegracao;
    private String IP;
    private String Estado;
}
