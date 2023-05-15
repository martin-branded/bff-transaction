package ar.com.branded.bfftransaction.service;

import ar.com.branded.bfftransaction.model.domain.Auth;

public interface GenerateCodeShop {
    Auth execute(String code);
}
