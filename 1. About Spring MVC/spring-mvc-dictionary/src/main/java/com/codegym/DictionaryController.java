package com.codegym;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DictionaryController {
    private String result;
    @GetMapping("/")
    public String showForm(){
        return "form";
    }

    @PostMapping("/result")
    public String dictionaryResult(@RequestParam String input, Model model){
        switch (input){
            case "hello":
                result = "xin chào";
                break;
            case "car":
                result = "xe hơi";
                break;
            case "board":
                result = "thuyền";
                break;
            case "air plane":
                result = "máy bay";
                break;
            default:
                result = "Không thể dịch từ này";
            break;
        }
        model.addAttribute("result", result);
        return "result";
    }
}
