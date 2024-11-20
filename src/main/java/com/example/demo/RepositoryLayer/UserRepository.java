package com.example.demo.RepositoryLayer;

import com.example.demo.Clases.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, String> { //UserRepository hereda metodos CRUD de JPARepository.Espera tipo de la entidad y tipo de la claveprimaria.
    User findByauth0id(String auth0id);
}



