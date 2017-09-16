package com.yss.service.impl;

import com.yss.mapper.UserMapper;
import com.yss.pojo.User;
import com.yss.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper mapper;

    @Override
    public List<User> findAll() {
        return mapper.findAll();
    }

    @Override
    public User save(User user) {
        return mapper.save(user);
    }
}
