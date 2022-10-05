package com.example.tutorial.service;

import com.example.tutorial.Repository.UserRepository;
import com.example.tutorial.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements IUserService{

    private final UserRepository userRepository;
    @Autowired
    public UserService( UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> findAll(){
        return (List<User>)userRepository.findAll();
    }
}
