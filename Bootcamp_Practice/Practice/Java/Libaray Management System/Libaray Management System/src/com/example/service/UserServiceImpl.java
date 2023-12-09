package com.example.service;

import com.example.entity.User;
import com.example.repository.IUserRepository;
import com.example.repository.UserRepositoryImpl;

import java.util.List;

public class UserServiceImpl implements IUserService {
    private IUserRepository userRepository = new UserRepositoryImpl();

//    public UserServiceImpl(IUserRepository userRepository) {
//        this.userRepository = userRepository;
//    }

    @Override
    public User addUser(User user) {
        return userRepository.addUser(user);
    }

    @Override
    public void deleteUser(int id) {
        userRepository.deleteUser(id);
    }

    @Override
    public User updateUser(User user) {
        return userRepository.updateUser(user);
    }

    @Override
    public User updateUser(int id, String newEmail) {
        return userRepository.updateUser(id, newEmail);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.getAllUsers();
    }

    @Override
    public User search(int id){
        return userRepository.search(id);
    }
}

