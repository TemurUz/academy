package uz.jurayev.eazybank.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BalanceController {

        @GetMapping("myBalance")
        public String getBalancesInfo(){
            return "Balance info page";
        }
}
