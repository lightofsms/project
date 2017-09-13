package com.lightofsms.girl.controller;

import com.lightofsms.girl.pojo.Girl;
import com.lightofsms.girl.pojo.Result;
import com.lightofsms.girl.service.impl.GirlServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.List;


@RestController
public class GirlControlller {

    private final static Logger logger = LoggerFactory.getLogger(GirlControlller.class);

    @Resource
    private
    GirlServiceImpl girlService;

    @PostMapping("/girl")
    public Result<? extends Girl> add(@Valid Girl girl, BindingResult bindingResult) throws Exception {
        if (bindingResult.hasErrors()) {
            return new Result<Girl>(0, bindingResult.getFieldError().getDefaultMessage(), null);
        }

        return new Result<>(1, "成功",girlService.save(girl));

    }

    @GetMapping("/girls")
    public List<Girl> getGirls() {
        return girlService.findALl();
    }
}
