package com.example.NewProject.controller;


import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

public class AddContoller {


        @GetMapping("")
        public String sumForm() {
            return "sumForm";
        }

        @PostMapping(value = "/sum", produces = MediaType.APPLICATION_JSON_VALUE)
        public String sum(@RequestParam Integer num1, @RequestParam Integer num2, Model model) {
            int result = num1 + num2;
            model.addAttribute("result", result);
            return "sumResult";
        }
    }
