package com.example.demo.ClasesDto;

import com.example.demo.Clases.Post;
import com.example.demo.Clases.User;

import java.time.LocalDate;

public class CommentDto {

    private Integer id;
    private String content;
    private LocalDate created_at;
    private Post post;
    private User user;

    public CommentDto() {}

    public CommentDto(Integer id, String content, LocalDate created_at, Post post, User user) {
        this.id = id;
        this.content = content;
        this.created_at = created_at;
        this.post = post;
        this.user = user;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDate getCreated_at() {
        return created_at;
    }

    public void setCreated_at(LocalDate created_at) {
        this.created_at = created_at;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
