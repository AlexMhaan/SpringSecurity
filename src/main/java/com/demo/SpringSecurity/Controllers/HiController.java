package com.demo.SpringSecurity.Controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {

    @Value("${app.message}")
    String message;

    @GetMapping("/hihi")
    public String hihi(){
        System.out.println(message);
        return "Hi HI from spring security!!";


    }

   @GetMapping("/boo")
    public String boo(){
       System.out.println(message);
        return "Boo from spring security!!";

    }
}
