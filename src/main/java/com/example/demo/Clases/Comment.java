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

    //instancia de post, istancia de user?, instancia de likes?

    private Integer id;
    private String text;
    private LocalDate created_at;

}
