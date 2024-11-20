package com.example.demo.Interfaces.service;

import com.example.demo.Clases.Comment;
import com.example.demo.ClasesDto.CommentDto;

import java.util.List;

public interface ICommentService {

    Comment saveComment(String content, String aut0id, Integer postId);
    List<CommentDto> getCommentByPostId (Integer postId);
}
