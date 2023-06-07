package ar.com.branded.bfftransaction.controller;

import ar.com.branded.bfftransaction.model.domain.Product;
import ar.com.branded.bfftransaction.service.GetPageableProducts;
import jakarta.annotation.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/products")
@RestController
public class RetriverProductsController {
    @Resource(name = "getPageableProducts")
    private GetPageableProducts getPageableProducts;

    @GetMapping
    public ResponseEntity<List<Product>> getProducts(@RequestParam("page") int page,
                                                     @RequestParam("size") int size) {
        return ResponseEntity.ok(getPageableProducts.execute(page, size));
    }
}
