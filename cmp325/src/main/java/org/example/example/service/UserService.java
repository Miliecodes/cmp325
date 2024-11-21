package org.example.example.service;

import org.example.example.model.User;

import java.util.List;

public interface UserService {
    User createUser(User user);
    User updateUser(User user);

    List<User> getAllUsers();
}
