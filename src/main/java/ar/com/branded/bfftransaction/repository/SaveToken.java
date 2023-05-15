package ar.com.branded.bfftransaction.repository;

import ar.com.branded.bfftransaction.repository.model.rest.TokenResponse;

public interface SaveToken {

    void execute(TokenResponse token);
}
