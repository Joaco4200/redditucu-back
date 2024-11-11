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

//    public List<User> getUsers(){
//        return userRepository.findAll();
//    }

    public User registerUser(String name,String email, String auth0id, String imgUrl){
        User existingUser= userRepository.findByAuth0Id(auth0id);

        if(existingUser == null){

            existingUser = new User();
            existingUser.setAuth0id(auth0id);
            existingUser.setName(name);
            existingUser.setEmail(email);
            existingUser.setImgUrl(imgUrl);

            return userRepository.save(existingUser);
        }
        return existingUser;
    }

}
