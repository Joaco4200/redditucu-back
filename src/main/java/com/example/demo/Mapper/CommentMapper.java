package com.example.demo.Mapper;

import com.example.demo.Clases.Comment;
import com.example.demo.Clases.Post;
import com.example.demo.ClasesDto.CommentDto;
import com.example.demo.ClasesDto.PostDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CommentMapper {

    CommentMapper INSTANCE =Mappers.getMapper(CommentMapper.class);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "content", target = "content")
    @Mapping(source = "created_at", target = "created_at")
    @Mapping(source = "user", target = "user")
    @Mapping(source = "post", target = "post")
    CommentDto CommentToCommentDto(Comment comment);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "content", target = "content")
    @Mapping(source = "created_at", target = "created_at")
    @Mapping(source = "user", target = "user")
    @Mapping(source = "post", target = "post")
    Comment CommentDtoToComment(CommentDto commentDto);
}