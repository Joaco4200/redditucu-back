package com.example.demo.RepositoryLayer;

import com.example.demo.Clases.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepository extends JpaRepository <Comment,Integer>{
    List<Comment> findByPostId(Integer postid);
}
