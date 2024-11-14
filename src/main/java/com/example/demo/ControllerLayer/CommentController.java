package com.example.demo.ControllerLayer;

import com.example.demo.Clases.Comment;
import com.example.demo.ServiceLayer.CommentService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class CommentController {

    private final CommentService commentService;

    public CommentController(CommentService commentService) {
        this.commentService = commentService;
    }

    @PostMapping("/comment")
    public Comment saveComment(@RequestBody Comment comment) {
        return commentService.saveComment(comment.getContent(), comment.getUser().getAuth0id(), comment.getPost().getId());
    }


}
