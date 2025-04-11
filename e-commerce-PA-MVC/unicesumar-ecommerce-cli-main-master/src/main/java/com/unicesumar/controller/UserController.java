package com.unicesumar.controller;

import com.unicesumar.entities.User;
import com.unicesumar.repository.UserRepository;

import java.util.List;
import java.util.UUID;

public class UserController {
    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public void createUser(String name, String email, String password) {
        UUID id = UUID.randomUUID();
        User u = new User(id, email, name, password);
        userRepository.save(u);
    }
}
