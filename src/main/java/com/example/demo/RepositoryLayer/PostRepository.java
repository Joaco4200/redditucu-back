package com.example.demo.RepositoryLayer;

import com.example.demo.Clases.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PostRepository extends JpaRepository <Post, Integer> {
//    List<Post> findByUserId(Integer userId);
    Post findPostById(Integer id);
}


