package com.yss.service;

import com.yss.pojo.User;

import java.util.List;

public interface UserService {
    List<User> findAll();

    User save(User user);
}
