package com.example.demo.ControllerLayer;

import com.example.demo.Clases.Post;
import com.example.demo.ServiceLayer.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class PostController {

    @Autowired
    private PostService postService;

    @GetMapping("/getPostById")
    public Post getPostById(@RequestParam Integer postId){
        return postService.getPostById(postId);
    }

    @GetMapping("/getAllPosts")
    public List<Post> getAllPosts() {
        return postService.getAllPosts();
    }

    @PostMapping("/post")
    public Post savePost(@RequestBody Post post) {
        return postService.savePost(post.getUser().getAuth0id(), post.getTitle(), post.getContent());
    }
}