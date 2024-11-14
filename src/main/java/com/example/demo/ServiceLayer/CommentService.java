package com.example.demo.ServiceLayer;

import com.example.demo.Clases.Comment;
import com.example.demo.Clases.Post;
import com.example.demo.Clases.User;
import com.example.demo.RepositoryLayer.CommentRepository;
import com.example.demo.RepositoryLayer.PostRepository;
import com.example.demo.RepositoryLayer.UserRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class CommentService {

    private final CommentRepository commentRepository;
    private final PostRepository postRepository;
    private final UserRepository userRepository;

    public CommentService(CommentRepository commentRepository, PostRepository postRepository, UserRepository userRepository) {
        this.commentRepository = commentRepository;
        this.postRepository = postRepository;
        this.userRepository = userRepository;
    }

    public Comment saveComment(String content, String aut0id, Integer postid){
        User existingUser= userRepository.findByauth0id(aut0id);
        Post existingPost= postRepository.findPostById(postid);

        Comment newComment= new Comment();
        newComment.setContent(content);
        newComment.setUser(existingUser);
        newComment.setPost(existingPost);
        newComment.setCreated_at(LocalDate.now());

        return commentRepository.save(newComment);
    }

//    public List<Comment> getCommentByUserAuth0id (String auth0id) {
//    }

}
