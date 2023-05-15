package ar.com.branded.bfftransaction.controller;

import ar.com.branded.bfftransaction.model.domain.Auth;
import ar.com.branded.bfftransaction.service.GenerateUserShop;
import jakarta.annotation.Resource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/generate")
@RestController
public class GenerateUserController {

    @Resource(name = "generateUserShop")
    private GenerateUserShop generateUserShop;

    @PostMapping()
    public ResponseEntity<?> generateShopUser(@RequestBody Auth auth){
        generateUserShop.execute(auth);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
