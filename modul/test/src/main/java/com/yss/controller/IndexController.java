package com.yss.controller;

import com.yss._other.exception.ResultException;
import com.yss.pojo.ResultBean;
import com.yss.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class IndexController {

    @Resource
    private UserService userService;

    @GetMapping("/users")
    public ResultBean<?> getUsers() {

        return new ResultBean<>(userService.findAll());
    }

    @GetMapping("/error")
    public ResultBean error() {
        throw new ResultException("错误了", -1);
//        return null;
    }

}
