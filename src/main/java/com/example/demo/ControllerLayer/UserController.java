package com.example.demo.ControllerLayer;

import com.example.demo.Clases.User;
import com.example.demo.ServiceLayer.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/user")
    public User saveUser(@RequestBody User user) {
        return userService.registerUser(user.getName(), user.getEmail(), user.getImgUrl(),user.getAuth0id());
    }
}



