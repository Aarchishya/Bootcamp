package com.example.repository;

import com.example.entity.User;

import java.util.List;

public interface IUserRepository {
    User addUser(User user);
    void deleteUser(int id);
    User updateUser(int id, String newEmail);
    User updateUser(User user);
    List<User> getAllUsers();

    User search(int id);
}
