package com.example.demo.ClasesDto;

public class UserDto {

    private Integer id;
    private String auth0id;
    private String name;
    private String email;
    private String imgUrl;

    public UserDto() {}

    public UserDto(Integer id, String auth0id, String name, String email, String imgUrl) {
        this.id = id;
        this.auth0id = auth0id;
        this.name = name;
        this.email = email;
        this.imgUrl = imgUrl;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAuth0id() {
        return auth0id;
    }

    public void setAuth0id(String auth0id) {
        this.auth0id = auth0id;
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

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }
}
