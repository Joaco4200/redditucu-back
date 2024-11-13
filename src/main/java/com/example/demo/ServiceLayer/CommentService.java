package com.example.demo.ServiceLayer;

import com.example.demo.Clases.Comment;
import com.example.demo.Clases.Post;
import com.example.demo.Clases.User;
import com.example.demo.RepositoryLayer.CommentRepository;
import com.example.demo.RepositoryLayer.PostRepository;
import com.example.demo.RepositoryLayer.UserRepository;

import java.util.List;
import java.util.Optional;

public class CommentService {

    private final CommentRepository commentRepository;
    private final PostRepository postRepository;
    private final UserRepository userRepository;

    public CommentService(CommentRepository commentRepository, PostRepository postRepository, UserRepository userRepository) {
        this.commentRepository = commentRepository;
        this.postRepository = postRepository;
        this.userRepository = userRepository;
    }

    public List<Comment> getCommentByUserAuth0id (String auth0id) {
    }

    public List<Comment> saveComment(String content, String aut0id, Integer postid){
        User existingUser= userRepository.findByauth0id(aut0id);
        Optional<Post> existingPost= postRepository.findById(postid);

        Comment newComment= new Comment();
        newComment.setContent(content);
        newComment.setUser(existingUser);
        newComment.setPost(existingPost);
    }
}
