package com.yss.blog.controller;

import com.yss.blog.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

@Controller
public class HelloController {

    @Resource
    private UserService userService;

    @GetMapping("/hello")
    public String toHello() {

        return "hello";
    }

    @GetMapping("/users")
    public ModelAndView list(Model model) {

        model.addAttribute("userList", userService.findAll());
        model.addAttribute("title", "用户管理");
        return new ModelAndView("users/list","userModel",model);
    }
}
