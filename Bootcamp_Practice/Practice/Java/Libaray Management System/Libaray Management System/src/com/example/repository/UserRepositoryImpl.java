package com.example.repository;

import com.example.entity.User;

import java.util.ArrayList;
import java.util.List;

public class UserRepositoryImpl implements IUserRepository {
    private List<User> userList;

    public UserRepositoryImpl() {
        userList = new ArrayList<>();
    }

    @Override
    public User addUser(User user) {
        userList.add(user);
        return user;
    }

    @Override
    public void deleteUser(int id) {
        userList.removeIf(user -> user.getId() == id);
    }

    @Override
    public User updateUser(User user) {
        int index = getUserIndexById(user.getId());
        if (index != -1) {
            userList.set(index, user);
            return user;
        }
        return null;
    }

    @Override
    public User updateUser(int id, String newEmail) {
        int index = getUserIndexById(id);
        if (index != -1) {
            User userToUpdate = userList.get(index);
            userToUpdate.seteMail(newEmail);
            userList.set(index, userToUpdate);
            return userToUpdate;
        }
        return null;
    }

    @Override
    public List<User> getAllUsers() {
        return new ArrayList<>(userList);
    }

    @Override
    public User search(int id) {
        for (User user : userList){
            if (user.getId() == id)
                return user;
        }
        return null;
    }

    private int getUserIndexById(int id) {
        for (int i = 0; i < userList.size(); i++) {
            if (userList.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }


}


