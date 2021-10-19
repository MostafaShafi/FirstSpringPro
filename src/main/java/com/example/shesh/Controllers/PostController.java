package com.example.shesh.Controllers;

import com.example.shesh.Models.Post;
import com.example.shesh.Services.PostService;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class PostController {

    @Autowired
    private PostService postService;
    @Autowired
    private Gson gson;

    @GetMapping("/post/{id}")
    public String getPost(@PathVariable(value = "id") Integer id) {
        return gson.toJson(postService.getPostById(id));
    }

    @GetMapping("/posts")
    public String getPosts() {
        return gson.toJsonTree(postService.getPosts()).toString();
    }

    @GetMapping("/postui/{id}")
    public String getPostByUserId(@PathVariable(value = "id") Integer id) {
        return gson.toJsonTree(postService.getPostByUserId(id)).toString();
    }

    @PostMapping("/addpost")
    public Post setPost(@Valid @RequestBody Post post, BindingResult result) {
        return postService.setPost(post);
    }

    @PutMapping("/post/{id}")
    public Post updatePost(@PathVariable(value = "id") Integer id, @Valid @RequestBody Post post, BindingResult result) {
        return postService.updatePost(id, post);
    }
}
