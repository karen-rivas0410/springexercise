package com.codeup.springexercise.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PostController {

    @GetMapping("/posts")
    @ResponseBody
    public String index(){
        return "posts index page";
    }

    @GetMapping("/posts/{id}")
    public String view(@PathVariable String id) {
        return "view an individual post" + id;
    }

    @GetMapping("/posts/create")
    public String create(){
        return "view the form for creating a post";
    }

    @GetMapping("/posts/create")
    public String newPost() {
        return "create a new post";
    }


}
