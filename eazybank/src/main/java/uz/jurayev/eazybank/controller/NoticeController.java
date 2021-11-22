package uz.jurayev.eazybank.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NoticeController {

    @GetMapping("notice")
    public String getNoticesInfo(){
        return "Notice info page";
    }
}
