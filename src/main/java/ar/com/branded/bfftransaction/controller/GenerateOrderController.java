package ar.com.branded.bfftransaction.controller;

import ar.com.branded.bfftransaction.controller.model.OrderRequest;
import ar.com.branded.bfftransaction.service.GenerateOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/order")
@RestController
public class GenerateOrderController {

    private final GenerateOrder generateOrder;

    @Autowired
    public GenerateOrderController(GenerateOrder generateOrder) {
        this.generateOrder = generateOrder;
    }

    @PostMapping("/{id_user}")
    public ResponseEntity<?> generateOrder(@PathVariable(name = "id_user") String idUser, @RequestBody OrderRequest order){
        generateOrder.execute(idUser, order.getProductId(), order.getAddressId());
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
