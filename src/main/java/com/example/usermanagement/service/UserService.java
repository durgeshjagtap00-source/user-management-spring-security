package com.example.usermanagement.service;

import com.example.usermanagement.entity.User;

import java.util.List;

public interface UserService {

    User createUser(User user);

    List<User> getAllUsers();
}

