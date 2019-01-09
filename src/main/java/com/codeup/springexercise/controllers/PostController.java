package com.codeup.springexercise.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PostController {

    @GetMapping("/posts")
    @ResponseBody
    public String index(){
        return "posts index page";
    }

    @GetMapping("/posts/{id}")
    @ResponseBody
    public String view(@PathVariable long id) {
        return "view an individual post with id: " + id;
    }

    @GetMapping("/posts/create")
    @ResponseBody
    public String create(){
        return "view the form for creating a post";
    }

    @PostMapping("/posts/")
    @ResponseBody
    public String newPost() {
        return "create a new post";
    }


}
