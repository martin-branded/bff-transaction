package ar.com.branded.bfftransaction.controller;

import ar.com.branded.bfftransaction.model.domain.Look;
import ar.com.branded.bfftransaction.service.GetPageableLooks;
import jakarta.annotation.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/looks")
@RestController
public class RetriverLooksController {

    @Resource(name = "getPageableLooks")
    private GetPageableLooks getPageableLooks;

    @GetMapping(params = { "page", "size" })
    public ResponseEntity<List<Look>> getLooks (@RequestParam("page") int page,
                                                @RequestParam("size") int size) {

        return ResponseEntity.ok(getPageableLooks.execute(page, size));
    }
}
