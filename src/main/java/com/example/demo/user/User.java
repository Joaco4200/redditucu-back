package com.example.demo.user;

import jakarta.persistence.*;

@Entity
@Table(name= "users")
public class User {
    @Id
//    @SequenceGenerator(
//            name= "user_sequence",
//            sequenceName = "user_sequence",
//            allocationSize= 1
//    )
//    @GeneratedValue(
//            strategy = GenerationType.SEQUENCE,
//            generator = "user_sequence"
//    )

    private Integer id;
    private String auth0_id;
    private String name;
    private String email;

    public User() {
    }

    public User(String auth0_id, Integer id, String name, String email) {
        this.auth0_id = auth0_id;
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public String getAuth0_id() {
        return auth0_id;
    }

    public void setAuth0_id(String auth0_id) {
        this.auth0_id = auth0_id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
