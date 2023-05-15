package ar.com.branded.bfftransaction.service.impl;

import ar.com.branded.bfftransaction.model.domain.Auth;
import ar.com.branded.bfftransaction.repository.GenerateToken;
import ar.com.branded.bfftransaction.repository.SaveToken;
import ar.com.branded.bfftransaction.repository.model.rest.TokenResponse;
import ar.com.branded.bfftransaction.service.GenerateCodeShop;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class GenerateCodeShopService implements GenerateCodeShop {

    @Resource(name="generateToken")
    private GenerateToken generateToken;
    @Resource(name="saveToken")
    private SaveToken saveToken;

    @Override
    public Auth execute(String code) {

        TokenResponse tokenResponse = generateToken.execute(code);
        saveToken.execute(tokenResponse);

        return tokenResponse.toDomain();

    }
}
