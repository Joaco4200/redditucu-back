package com.example.demo.Clases;

import jakarta.persistence.*;

@Entity //Indica que la clase Rate es una entidad JPA, es decir que la clase estamapeada a una tabla en la db.
@Table(name = "\"rate\"")
public class Rate {

    @Id
    @SequenceGenerator( //define un generador de secuencias para la generación de valores de la clave primaria.
            name= "post_sequence",
            sequenceName = "post_sequence",
            allocationSize= 1 //define incremento de valor generado por la secuencia.
    )
    @GeneratedValue( // le indica a JPA que el valor dela primary key se genera automaticamente x la secuencia.
            strategy = GenerationType.SEQUENCE,
            generator = "post_sequence"
    )

    private Integer rateId;
    private Integer Likes;

    @ManyToOne
    @JoinColumn(name="post_id")
    private Post post;

    @ManyToOne
    @JoinColumn(name="comment_id")
    private Comment comment;

    @ManyToOne
    @JoinColumn(name="user_id")
    private User user;

    public Rate(){
    }

    public Integer getRateId() {
        return rateId;
    }

    public void setRateId(Integer rateId) {
        this.rateId = rateId;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    public Comment getComment() {
        return comment;
    }

    public void setComment(Comment comment) {
        this.comment = comment;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Integer getLikes() {
        return Likes;
    }

    public void setLikes(Integer likes) {
        Likes = likes;
    }
}
