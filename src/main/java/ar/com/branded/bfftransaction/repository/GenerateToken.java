package ar.com.branded.bfftransaction.repository;

import ar.com.branded.bfftransaction.repository.model.rest.TokenResponse;

public interface GenerateToken {
    TokenResponse execute(String code);
}
