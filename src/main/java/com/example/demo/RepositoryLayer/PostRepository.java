package com.example.demo.RepositoryLayer;

import com.example.demo.Clases.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PostRepository extends JpaRepository <Post, Integer> {
    Post findBypostId(Integer postId);
    List<Post> findByUser_auth0id(String auth0id);
}


