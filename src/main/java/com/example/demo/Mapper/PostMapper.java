package com.example.demo.Mapper;

import com.example.demo.Clases.Post;
import com.example.demo.Clases.User;
import com.example.demo.ClasesDto.PostDto;
import com.example.demo.ClasesDto.UserDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.time.LocalDate;

@Mapper
public interface PostMapper {

    PostMapper INSTANCE = Mappers.getMapper(PostMapper.class);

    @Mapping(source = "postId", target = "postId")
    @Mapping(source = "title", target = "title")
    @Mapping(source = "content", target = "content")
    @Mapping(source = "created_at", target = "created_at")
    @Mapping(source = "user", target = "user")
    PostDto PostToPostDto(Post post);

    @Mapping(source = "postId", target = "postId")
    @Mapping(source = "title", target = "title")
    @Mapping(source = "content", target = "content")
    @Mapping(source = "created_at", target = "created_at")
    @Mapping(source = "user", target = "user")
    Post PostDtoToPost(PostDto PostDto);
}
