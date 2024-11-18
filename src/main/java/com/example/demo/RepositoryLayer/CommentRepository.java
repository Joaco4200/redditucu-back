package com.example.demo.RepositoryLayer;

import com.example.demo.Clases.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository <Comment,Integer>{
    List<Comment> findByPostPostId(Integer postId);
}
