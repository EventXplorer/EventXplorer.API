package com.eventxplorer.EventXplorer.API.service;

import com.eventxplorer.EventXplorer.API.model.User;

import java.util.List;

public interface UserService {
    public abstract User createUser(User user);
    public abstract User updateUser(User user);
    public abstract User getUserById(String id);
    public abstract List<User> getAllUsers();
    public abstract void deleteUser(String id);
    public abstract boolean isUserExist(String id);
}