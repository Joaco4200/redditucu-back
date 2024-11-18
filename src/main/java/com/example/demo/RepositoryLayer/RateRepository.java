package com.example.demo.RepositoryLayer;

import com.example.demo.Clases.Rate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RateRepository extends JpaRepository <Rate, Integer>{
    Rate findByUser_Auth0idAndPost_PostId(String auth0id, Integer postId);
}