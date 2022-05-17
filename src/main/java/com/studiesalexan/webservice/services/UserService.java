package com.studiesalexan.webservice.services;

import com.studiesalexan.webservice.entities.User;
import com.studiesalexan.webservice.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAll(){
        return userRepository.findAll();
    }

    public User findById(Long id){
       Optional<User> obj = userRepository.findAllById(id);
       return obj.get();
    }
}
