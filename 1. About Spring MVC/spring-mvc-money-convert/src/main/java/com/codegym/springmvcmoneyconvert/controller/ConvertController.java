package com.codegym.springmvcmoneyconvert.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ConvertController {
    private double result;
    @GetMapping("/")
    public String showForm(){
        return "form";
    }

    @PostMapping("/result")
    public String result(@RequestParam double number, Model model){
        result = number * 24000;
        model.addAttribute("result",result);
        return "result";
    }
}
