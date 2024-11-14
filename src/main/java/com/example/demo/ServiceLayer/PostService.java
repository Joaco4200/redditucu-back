package com.example.demo.ServiceLayer;

import com.example.demo.Clases.Post;
import com.example.demo.Clases.User;
import com.example.demo.RepositoryLayer.PostRepository;
import com.example.demo.RepositoryLayer.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Service
public class PostService {

    private final PostRepository postRepository;
    private final UserRepository userRepository;

    @Autowired
    public PostService(PostRepository postRepository, UserRepository userRepository){
        this.postRepository = postRepository;
        this.userRepository = userRepository;
    }

    public Post savePost(String auth0id, String title, String content){
        User user= userRepository.findByauth0id(auth0id);

        Post newPost= new Post();
        newPost.setUser(user);
        newPost.setTitle(title);
        newPost.setContent(content);
        newPost.setCreated_at(LocalDate.now());

        return postRepository.save(newPost);
    }

//    public List<Post> getPostById(Integer userId){
//        return postRepository.findByUserId(userId);
//    }


    public List<Post> getAllPosts(){
        return postRepository.findAll();
    }
}