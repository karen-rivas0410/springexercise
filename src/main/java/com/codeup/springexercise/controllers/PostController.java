package com.codeup.springexercise.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PostController {

    @GetMapping("/posts")
    @ResponseBody
    public String index(){
        return "posts index page";
    }

    @GetMapping
    @GetMapping
    @GetMapping
    @GetMapping


}
