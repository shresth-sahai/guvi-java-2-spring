package com.example.firstproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {
//    @Autowired
//    private final PostRepository postRepository;
private  PostRepository postRepository;
public PostService(PostRepository postRepository){
    this.postRepository=postRepository;
}
public List<Post> getAllPosts(){
    return postRepository.findAll();

}
public Post getPostById(Long id){
    return postRepository.findById(id).orElse(null);
}
public Post createPost(Post post){
    return postRepository.save(post);
}
public Post updatePost(Long id,Post postDetails){
    Optional<Post>  optionalPost=postRepository.findById(id);

    if(optionalPost.isPresent()){
        Post post=optionalPost.get();
        post.setTitle(postDetails.getTitle());
        post.setContent(postDetails.getContent());
        return postRepository.save(post);
    }
    return  null;
}
public void deletePost(Long id){
    postRepository.deleteById(id);
}
}
