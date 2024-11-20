package com.example.demo.ControllerLayer;

import com.example.demo.Clases.Post;
import com.example.demo.ClasesDto.PostDto;
import com.example.demo.Interfaces.service.IPostService;
import com.example.demo.ServiceLayer.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class PostController {

    @Autowired
    private IPostService postService;

    @PostMapping("/post")
    public Post savePost(@RequestBody Post post) {
        return postService.savePost(post.getUser().getAuth0id(), post.getTitle(), post.getContent());
    }

    @GetMapping("/getPostById")
    public PostDto getPostById(@RequestParam Integer postId){
        return postService.getPostById(postId);
    }

    @GetMapping("/getAllPosts")
    public List<PostDto> getAllPosts() {
        return postService.getAllPosts();
    }

    @GetMapping("/getUserPosts")
    public List<PostDto> getUserPosts(@RequestParam String auth0id) {
        return postService.getPostByUserauth0id(auth0id);
    }
}