package ar.com.branded.bfftransaction.controller;

import ar.com.branded.bfftransaction.service.SaveShopByCode;
import jakarta.annotation.Resource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/auth")
@RestController
@CrossOrigin
public class AuthShopController {

    @Resource(name="saveShop")
    private SaveShopByCode saveShopByCode;


    @GetMapping()
    public ResponseEntity<?> createShopUser(@RequestParam String code){
        saveShopByCode.execute(code);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
