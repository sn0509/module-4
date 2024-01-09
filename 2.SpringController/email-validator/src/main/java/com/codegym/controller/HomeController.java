package com.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.regex.Pattern;

@Controller
public class HomeController {
    private static String regex = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\\\.[A-Za-z0-9]+)$;";
    private static Pattern pattern;

    public HomeController(){
        pattern = Pattern.compile(regex);
    }
    @GetMapping("/")
    public String getHome(){
        return "home";
    }
}
