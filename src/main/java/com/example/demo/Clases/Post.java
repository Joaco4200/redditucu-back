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

    public Post() {
    };

//    public Post(Integer id, Integer user_id, String content, LocalDateTime created_at) {
//        this.id = id;
//        this.user_id = user_id;
//        this.content = content;
//        this.created_at = created_at;
//}



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
}
