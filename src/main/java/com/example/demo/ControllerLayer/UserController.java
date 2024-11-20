package com.example.demo.ControllerLayer;

import com.example.demo.Clases.User;
import com.example.demo.ClasesDto.UserDto;
import com.example.demo.Interfaces.service.IUserService;
import com.example.demo.ServiceLayer.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class UserController {

    @Autowired
    private IUserService userService;

    @PostMapping("/user") //Indica que saveUser maneja la peticion  POST(crear o agregar) que lleguen a la url /user.
    public UserDto saveUser(@RequestBody UserDto user) { //requesteBody indica que el cuerpo de la solicitud http debe ser convertido a ojeto User. Spring automaticamente convierte el JSON que viene en el cuerpo de la solicitud en un objeto user usando un covertidor(Jackson)(el json debe contenerpropiedades correspondientes a la clase User.
        return userService.registerUser(user.getName(), user.getEmail(), user.getImgUrl(),user.getAuth0id());
    }
}