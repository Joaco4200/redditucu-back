package com.example.demo.ServiceLayer;

import com.example.demo.Clases.Post;
import com.example.demo.Clases.User;
import com.example.demo.ClasesDto.PostDto;
import com.example.demo.Interfaces.service.IPostService;
import com.example.demo.Mapper.PostMapper;
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
public class PostService implements IPostService {

    @Autowired
    private PostRepository postRepository;
    @Autowired
    private UserRepository userRepository;

    private static final PostMapper postMapper = PostMapper.INSTANCE;


    public Post savePost(String auth0id, String title, String content){
        User user= userRepository.findByauth0id(auth0id);

        Post newPost= new Post();
        newPost.setUser(user);
        newPost.setTitle(title);
        newPost.setContent(content);
        newPost.setCreated_at(LocalDate.now());
        return postRepository.save(newPost);
    }

    public PostDto getPostById(Integer id){
        Post post = postRepository.findBypostId(id);
        return postMapper.PostToPostDto(post);
    }

    public List<PostDto> getAllPosts(){
        List<Post> posts= postRepository.findAll();
        return posts.stream().map(postMapper::PostToPostDto).toList();
    }

    public List<PostDto> getPostByUserauth0id(String auth0id) {
        List<Post> posts = postRepository.findByUser_auth0id(auth0id);
        return posts.stream().map(postMapper::PostToPostDto).toList();
    }


}