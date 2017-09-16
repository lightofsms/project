package com.yss.blog.service;

import com.yss.blog.pojo.User;

import java.util.List;

public interface UserService {

    User save(User user);

    List<User> findAll();
}
