package com.example.demo.Interfaces.service;

import com.example.demo.Clases.Post;
import com.example.demo.ClasesDto.PostDto;

import java.util.List;

public interface IPostService {

    Post savePost(String auth0id, String title, String content);
    PostDto getPostById(Integer id);
    List<PostDto> getAllPosts();
    List<PostDto> getPostByUserauth0id(String auth0id);
}
