package com.example.demo.RepositoryLayer;

import com.example.demo.Clases.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
    User findByauth0id(String auth0id);
    User findById(int id);
}



