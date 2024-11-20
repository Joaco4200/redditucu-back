package com.example.demo.Interfaces.service;

import com.example.demo.Clases.User;
import com.example.demo.ClasesDto.UserDto;

public interface IUserService {

    UserDto registerUser(String name, String email, String imgUrl, String auth0id);
}
