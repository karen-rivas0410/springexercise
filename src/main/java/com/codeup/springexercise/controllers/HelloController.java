package com.codeup.springexercise.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
//    @GetMapping("/hello")
//    public String hello() {
//        return "hello";
//    }

    ////SECOND OPTION////
    @GetMapping("/hello2")
    @ResponseBody
    public String hello2(Model model) {
        String message = "Hello to you!";
        model.addAttribute("message", message);
        return message;
    }

    @GetMapping("/hello/{name}")
    public String hello(@PathVariable String name, Model model) {
        model.addAttribute("name", name);
        return "hello";
    }

//    @GetMapping("/hello/{first}/{last}")
//    @ResponseBody
//    public String hello(@PathVariable String first, @PathVariable String last, Model model) {
//        String message = "Hello, " + first + " " + last + "!";
//        model.addAttribute("message", message);
//        return message;
//    }
    @GetMapping("/hello/{first}/{last}")
    public String hello(@PathVariable String first, @PathVariable String last, Model model) {
        String message = first + " " + last;
        model.addAttribute("message", message);
        return "hello";
    }
}

