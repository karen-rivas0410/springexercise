package com.codeup.springexercise.services;

import com.codeup.springexercise.models.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostService {
    private List<Post> posts;

    public PostService() {
        posts = new ArrayList<>();
        createPosts();
    }

    public List<Post> all() {
        return posts;
    }

    public Post create(Post post) {
        post.setId(posts.size() + 1);
        posts.add(post);
        return post;
    }

    public Post one(int id){
        return posts.get(id -1);
    }

    private void createPosts() {
        // create some post objects and add them to the posts list
        // using the create method
        create(new Post("New Post 1","lorem impsum dolor set amit", 1));
        create(new Post("New Post 2", "lorem impsum dolor set amit", 2));
        create(new Post("New Post 3", "lorem impsum dolor set amit", 3));
        create(new Post("New Post 4", "lorem impsum dolor amit", 4));

    }
}
