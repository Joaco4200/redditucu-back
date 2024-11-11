package com.example.demo.ServiceLayer;

import com.example.demo.Clases.Post;
import com.example.demo.RepositoryLayer.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.List;

@Service
public class PostService {

    private final PostRepository postRepository;

    @Autowired
    public PostService(PostRepository postRepository){
        this.postRepository = postRepository;
    }

    //METODOS SERVICE:  devolver post x usuario,y devolver post por post_Id.

//    @PostMapping
//    public Post createPost(@RequestBody Post post){
//        Post existing
//    }

    @GetMapping
    public List<Post> getAllPosts(){
        return postRepository.findAll();
    }
}