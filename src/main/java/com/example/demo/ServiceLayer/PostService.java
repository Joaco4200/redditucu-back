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

    //METODOS SERVICE:  devolver post x usuario,y devolver post por post_Id.


    public List<Post> getPostById(Integer userId){
        return postRepository.findByUserId(userId);
    }

    public Post savePost(Post post, Integer userid){
        User user= userRepository.findById(userid);
        post.setUser(user);
        return postRepository.save(post);
    }

    public List<Post> getAllPosts(){
        return postRepository.findAll();
    }
}