package com.example.demo.ServiceLayer;


import com.example.demo.Clases.User;
import com.example.demo.RepositoryLayer.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getUsers(){
        return userRepository.findAll();
    }

    public User registerUser(String name,String email, String auth0_id, String imgUrl){
        User existingUser= userRepository.findByauth0_id(auth0_id);

        if(existingUser == null){
            existingUser = new User();
            existingUser.setAuth0_id(auth0_id);
            existingUser.setName(name);
            existingUser.setEmail(email);
            existingUser.setImgUrl(imgUrl);
        }
        return existingUser;
    }

}
