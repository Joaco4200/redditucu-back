//package com.example.demo.ServiceLayer;
//
//import com.example.demo.Clases.Post;
//import com.example.demo.Clases.Rate;
//import com.example.demo.Clases.User;
//import com.example.demo.RepositoryLayer.PostRepository;
//import com.example.demo.RepositoryLayer.RateRepository;
//import com.example.demo.RepositoryLayer.UserRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.Optional;
//
//@Service
//public class RateService {
//
//    @Autowired
//    private UserRepository userRepository;
//    @Autowired
//    private PostRepository postRepository;
//    @Autowired
//    private RateRepository rateRepository;
//
//
//    public Rate ratePost(String auth0id, Integer postId, Integer rateValue){
//        User user= userRepository.findById(auth0id);
//        Post post= postRepository.findBypostId(postId);
//        Rate existingRate= rateRepository.findByUser_Auth0idAndPost_PostId(auth0id,postId);
//
//        if(existingRate!=null){
//            if(existingRate.getLikes().equals(rateValue)){
//                existingRate.setLikes(0);
//            }
//            else{
//                existingRate.setLikes(rateValue);
//            }
//            return existingRate;
//        }
//        else {
//            Rate newRate = new Rate();
//            newRate.setUser(user);
//            newRate.setPost(post);
//            newRate.setLikes(rateValue);
//            rateRepository.save(newRate);
//            return newRate;
//        }
//    }
//
//    public Rate rateComment(String auth0id,Integer commentId, Integer rateValue){
//        return null;
//    }
//}
