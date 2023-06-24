package com.example.NewProject.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

public class AddContoller {


        @GetMapping("/sum")
        public String sumForm() {
            return "sumForm";
        }

        @PostMapping("/sum")
        public String sum(@RequestParam Integer num1, @RequestParam Integer num2, Model model) {
            int result = num1 + num2;
            model.addAttribute("result", result);
            return "sumResult";
        }
    }
