package uz.jurayev.eazybank.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

    @GetMapping("myAccount")
    public String getAccountsInfo(){
        return "Account info page";
    }
}
