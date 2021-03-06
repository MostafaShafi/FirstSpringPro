package com.example.shesh.Services;

import com.example.shesh.Models.Post;
import com.example.shesh.Repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class PostService {

    @Autowired
    PostRepository postRepository;

    public PostService() {
    }

    public Post getPostById(Integer id) {
        return postRepository.findById(id).get();
    }

    public ArrayList<Post> getPosts() {
        ArrayList<Post> posts = new ArrayList<>();
        postRepository.findAll().forEach(post -> {posts.add(post);});
        return posts;
    }

    public ArrayList<Post> getPostByUserId(int userId) {
        return postRepository.getPostByUserId(userId);
    }

    public Post setPost(Post post) {
        return postRepository.save(post);
    }

    public Post updatePost(Integer id, Post post) {
        Post oldPost = getPostById(id);
        oldPost.setAuthor(post.getAuthor());
        oldPost.setTitle(post.getTitle());
        oldPost.setBody(post.getBody());
        return setPost(oldPost);
    }
}
