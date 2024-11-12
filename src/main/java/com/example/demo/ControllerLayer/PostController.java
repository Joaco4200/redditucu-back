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
    PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping
    public List<Post> getPostByUserId(@RequestBody Integer id) {
        return postService.getPostById(id);
    }

    @PostMapping("/post")
    public Post savePost(@RequestBody Post post, Integer userid) {
        return postService.savePost(post, userid);
    }
}
