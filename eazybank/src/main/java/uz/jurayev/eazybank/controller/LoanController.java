package uz.jurayev.eazybank.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoanController {

        @GetMapping("myLoan")
        public String getLoansInfo(){
            return "Loan info page";
    }
}

