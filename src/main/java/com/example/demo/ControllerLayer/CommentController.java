package com.example.demo.ControllerLayer;

import com.example.demo.Clases.Comment;
import com.example.demo.ServiceLayer.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class CommentController {

    @Autowired
    private CommentService commentService;

    @PostMapping("/comment")
    public Comment saveComment(@RequestBody Comment comment) {
        return commentService.saveComment(comment.getContent(), comment.getUser().getAuth0id(), comment.getPost().getPostId());
    }

    @GetMapping("/getComment")
    public List<Comment> getCommentsByPostId(@RequestParam Integer postId) {
        return commentService.getCommentByPostId(postId);
    }
}
