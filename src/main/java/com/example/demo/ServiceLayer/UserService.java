package com.example.demo.ServiceLayer;


import com.example.demo.Clases.User;
import com.example.demo.RepositoryLayer.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User getUserByAuth0Id(String auth0Id) {
        return userRepository.findByauth0id(auth0Id);
    }

    public User registerUser(String name,String email, String imgUrl, String auth0id){
        User existingUser= userRepository.findByauth0id(auth0id);

        if(existingUser == null){

            existingUser = new User();
            existingUser.setName(name);
            existingUser.setEmail(email);
            existingUser.setImgUrl(imgUrl);
            existingUser.setAuth0id(auth0id);
            return userRepository.save(existingUser);
        }
        return existingUser;
    }

}
