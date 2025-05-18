package com.example.firstproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/apis/posts")
public class PostController {
    @Autowired
    private  PostService postService;

    @GetMapping
    public List<Post> getAllPosts(){
        return postService.getAllPosts();
    }
    @GetMapping("/{id}")
    // api/posts/1
    public Post getPost(@PathVariable Long id){
        return postService.getPostById(id);
    }
    @PostMapping
    public Post createPost(@RequestBody Post post){
        return postService.createPost(post);
    }
    @PutMapping("/{id}")
    public Post updatePost(@PathVariable Long id,@RequestBody Post post){
        return postService.updatePost(id,post);
    }
    @DeleteMapping("/{id}")
    public void deletePost(@PathVariable Long id){
        postService.deletePost(id);
    }
}
