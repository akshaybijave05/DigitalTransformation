package com.digital.transformation.service;

import com.digital.transformation.entity.User;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();

    User getUserById(int id);

    User createUser(User user);

    User updateUser(int id, User updatedUser);

    void deleteUser(int id);

	User loginUser(String email, String password);
}
