package com.example.demo.ServiceLayer;


import com.example.demo.Clases.User;
import com.example.demo.ClasesDto.UserDto;
import com.example.demo.Interfaces.service.IUserService;
import com.example.demo.Mapper.UserMapper;
import com.example.demo.RepositoryLayer.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {

    @Autowired
    private UserRepository userRepository;

    private static final UserMapper userMapper = UserMapper.INSTANCE;

    public UserDto registerUser(String name,String email, String imgUrl, String auth0id) { //toma los valores de los campos del objeto user y registra elusuario en la base de datos.
        User existingUser = userRepository.findByauth0id(auth0id);

        if (existingUser == null) {
            User newUser = new User();
            newUser.setName(name);
            newUser.setEmail(email);
            newUser.setImgUrl(imgUrl);
            newUser.setAuth0id(auth0id);
            userRepository.save(newUser);
//            return userMapper.UserToUserDto(newUser);
        }
        return userMapper.UserToUserDto(existingUser);
    }
}
