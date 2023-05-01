package ar.com.branded.bfftransaction.controller;

import ar.com.branded.bfftransaction.service.SaveShopByCode;
import jakarta.annotation.Resource;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RequestMapping("/auth")
@RestController
public class AuthShopController {

    @Resource(name="saveShop")
    private SaveShopByCode saveShopByCode;


    @GetMapping()
    public ResponseEntity<?> createShopUser(@RequestParam String code){
        saveShopByCode.execute(code);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
