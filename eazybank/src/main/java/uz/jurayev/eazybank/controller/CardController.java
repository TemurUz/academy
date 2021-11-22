package uz.jurayev.eazybank.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CardController {

        @GetMapping("myCard")
        public String getCardsInfo(){
            return "Card info page";
    }
}
