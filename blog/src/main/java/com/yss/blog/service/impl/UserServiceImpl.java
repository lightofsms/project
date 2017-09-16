package com.yss.blog.service.impl;

import com.yss.blog.mapper.UserMapper;
import com.yss.blog.pojo.User;
import com.yss.blog.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper mapper;

    @Override
    public User save(User user) {
        return mapper.save(user);
    }

    @Override
    public List<User> findAll() {
        return mapper.findAll();
    }

}
