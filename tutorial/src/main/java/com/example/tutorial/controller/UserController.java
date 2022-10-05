package com.example.tutorial.controller;

import com.example.tutorial.model.User;
import com.example.tutorial.service.IUserService;
import com.example.tutorial.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RequestMapping("user/find")
@RestController
public class UserController {

    private final IUserService userService;
    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<User> findUsers(){
        List<User> users = userService.findAll();
        System.out.println(users.size());
        return users;
    }
}
