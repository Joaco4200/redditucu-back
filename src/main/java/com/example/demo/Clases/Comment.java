package com.example.demo.Clases;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "\"comment\"")
public class Comment {

    @Id
    @SequenceGenerator(
            name= "post_sequence",
            sequenceName = "post_sequence",
            allocationSize= 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "post_sequence"
    )

    private Integer id;
    private String content;
    private LocalDate created_at;

    @ManyToOne
    @JoinColumn(name="postid")
    private Post post;

    @ManyToOne
    @JoinColumn(name="userid")
    private User user;

    public Comment() {
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

    public LocalDate getCreated_at() {
        return created_at;
    }

    public void setCreated_at(LocalDate created_at) {
        this.created_at = created_at;
    }
}
