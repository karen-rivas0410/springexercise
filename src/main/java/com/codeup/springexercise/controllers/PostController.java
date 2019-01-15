package com.codeup.springexercise.controllers;

import com.codeup.springexercise.models.Post;
import com.codeup.springexercise.services.PostService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class PostController {

    private List<Post> posts; //post object is created to have an list of posts//

    private final PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

//    @GetMapping("/posts")
//    @ResponseBody
//    public String index(){
//        return "posts index page";
//    }

    @GetMapping("/posts")
    public String index(Model model) {
        posts = new ArrayList<>();
        posts.add(new Post("New Post 1", "lorem impsum dolor set amit",1));
        posts.add(new Post("New Post 2", "lorem impsum dolor set amit", 2));
        posts.add(new Post("New Post 3", "lorem impsum dolor set amit", 3));
        posts.add(new Post("New Post 4", "lorem impsum dolor set amit", 4));
        model.addAttribute("posts",posts);
        return "posts/index";
    }

//    @GetMapping("/posts/{id}")
//    @ResponseBody
//    public String view(@PathVariable int id) {
//        return "view an individual post with id: " + id;
//    }

    @GetMapping("/posts/{id}")
    public String view(@PathVariable int id, Model model) {
        Post post = posts.get(id - 1);  //create a new object post//
        model.addAttribute("post", post);
        model.addAttribute("id", id);
        return ("posts/show");
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
