package com.example.demo.ClasesDto;

import com.example.demo.Clases.User;

import java.time.LocalDate;

public class PostDto {

    private Integer postId ;
    private String title;
    private String content ;
    private LocalDate created_at ;
    private User user;

    public PostDto() {}

    public PostDto(Integer postId, String title, String content, LocalDate created_at) {
        this.postId = postId;
        this.title = title;
        this.content = content;
        this.created_at = created_at;
    }

    public Integer getPostId() {
        return postId;
    }

    public void setPostId(Integer postId) {
        this.postId = postId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
