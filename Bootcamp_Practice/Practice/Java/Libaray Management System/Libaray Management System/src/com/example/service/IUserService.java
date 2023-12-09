package com.example.service;

import com.example.entity.User;

import java.util.List;

public interface IUserService {
    User addUser(User user);
    void deleteUser(int id);
    User updateUser(User user);
    User updateUser(int id, String newEmail);
    List<User> getAllUsers();

    User search(int id);
}

