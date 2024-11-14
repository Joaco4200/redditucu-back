package com.example.demo.Clases;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "\"post\"")
public class Post {

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


    private Integer id ;
    private String title;
    private String content ;
    private LocalDate created_at ;

    @ManyToOne
    @JoinColumn(name= "user_id", nullable = false)
    private User user ;


    public Post() {
    };


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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
