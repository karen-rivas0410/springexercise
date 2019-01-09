package com.codeup.springexercise.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

public class HomeController {

    @Controller
    class HelloController {

        @GetMapping(/"")
        return "This is the landing page!"

        @GetMapping("/hello")
        @ResponseBody
        public String hello() {
            return "Hello from Spring!";
        }

        ////SECOND OPTION////
        @GetMapping("/hello2")
        public String hello2(Model model) {
            String message = "Hello to you!";
            model.addAttribute("message", message);
            return "hello";
        }

        @GetMapping("/hello/{name}")
        public String hello(@PathVariable String name, Model model) {
            String message = "Hello, " + name + "!";
            model.addAttribute("message", message);
            return "hello";
        }

        @GetMapping("/hello/{fist}/{last}")
        public String hello(@PathVariable String first, @PathVariable String last, Model model) {
            String message = "Hello, " + first + " " + last + "!";
            model.addAttribute("message", message);
            return message;
        }
    }
}
