package com.example.demo.Mapper;


import com.example.demo.Clases.User;
import com.example.demo.ClasesDto.UserDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    @Mapping(source = "name", target = "name")
    @Mapping(source = "email", target = "email")
    @Mapping(source = "auth0id", target = "auth0id")
    @Mapping(source = "imgUrl", target = "imgUrl")
    UserDto UserToUserDto(User user);

    @Mapping(source = "name", target = "name")
    @Mapping(source = "email", target = "email")
    @Mapping(source = "auth0id", target = "auth0id")
    @Mapping(source = "imgUrl", target = "imgUrl")
    User UserDtoToUser(UserDto userDto);
}