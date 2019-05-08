package com.example.lesson1crabcake;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class HomeController {

    @RequestMapping("/")
    public String homePage(){
        return "index";
    }

    @RequestMapping("/crabbyrecipe")
    public String crabbyrecipe() {
        return "crabbyrecipe";
    }
}
