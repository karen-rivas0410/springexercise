package com.codeup.springexercise.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

        @GetMapping("/home") //removing the @ResponseBody so that you can return the html page instead of the text//
        public String home() {
            return "home";  //this needs the name of the html so that spring can look for it in the resources/templates file//
        }

}
