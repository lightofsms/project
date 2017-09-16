package com.yss.webnorm.controller;

import com.yss.webnorm.poji.ResultBean;
import com.yss.webnorm.service.GirlService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class GirlController {

    @Resource
    private GirlService girlService;

    @GetMapping("/girl")
    public ResultBean<?> findOneGirl(int id) {

        return girlService.findOne(id);
    }
}
