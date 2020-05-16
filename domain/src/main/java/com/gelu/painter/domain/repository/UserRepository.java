package com.gelu.painter.domain.repository;

import com.gelu.painter.domain.model.User;

import java.util.List;

public interface UserRepository {
    User getCurrentUser();
    List<User> getAllUsers();
    void addUser(User user);
}
