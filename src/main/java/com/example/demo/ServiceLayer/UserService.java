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

//    public User getUserByAuth0Id(String auth0Id) {
//        return userRepository.findByauth0id(auth0Id);
//    }

    public User registerUser(String name,String email, String imgUrl, String auth0id) { //toma los valores de los campos del objeto user y registra elusuario en la base de datos.
        User existingUser = userRepository.findByauth0id(auth0id);

        if (existingUser == null) {
            User newUser = new User();
            newUser.setName(name);
            newUser.setEmail(email);
            newUser.setImgUrl(imgUrl);
            newUser.setAuth0id(auth0id);
            return userRepository.save(newUser);
        }

        return existingUser;
    }
}
