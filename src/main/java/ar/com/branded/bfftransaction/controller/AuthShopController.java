package ar.com.branded.bfftransaction.controller;

import ar.com.branded.bfftransaction.model.domain.Auth;
import ar.com.branded.bfftransaction.service.GenerateCodeShop;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/auth")
@Controller
public class AuthShopController {

    @Resource(name="generateCodeShop")
    private GenerateCodeShop generateCodeShop;


    @GetMapping()
    public String getCodeShopUser(@RequestParam String code, Model model) {
        Auth auth = generateCodeShop.execute(code);
        model.addAttribute("code", auth.getCode());
        return "CodeConfirmation";
    }

}
