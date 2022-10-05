package com.example.tutorial.dao;

import com.example.tutorial.model.User;

import java.util.UUID;

public interface UserDao {
    int createUser(UUID id, User user);

    default int createUser(User user) {
        UUID id = UUID.randomUUID();
        return createUser(id,user);
    }
}
