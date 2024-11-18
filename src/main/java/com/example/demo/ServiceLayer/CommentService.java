package com.example.demo.ServiceLayer;

import com.example.demo.Clases.Comment;
import com.example.demo.Clases.Post;
import com.example.demo.Clases.User;
import com.example.demo.RepositoryLayer.CommentRepository;
import com.example.demo.RepositoryLayer.PostRepository;
import com.example.demo.RepositoryLayer.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class CommentService {

    @Autowired
    private CommentRepository commentRepository;
    @Autowired
    private PostRepository postRepository;
    @Autowired
    private UserRepository userRepository;

    public Comment saveComment(String content, String aut0id, Integer postId){
        User existingUser= userRepository.findByauth0id(aut0id);
        Post existingPost= postRepository.findBypostId(postId);

        Comment newComment= new Comment();
        newComment.setContent(content);
        newComment.setUser(existingUser);
        newComment.setPost(existingPost);
        newComment.setCreated_at(LocalDate.now());

        return commentRepository.save(newComment);
    }

    public List<Comment> getCommentByPostId (Integer postId) {
        return commentRepository.findByPostPostId(postId);
    }
}
