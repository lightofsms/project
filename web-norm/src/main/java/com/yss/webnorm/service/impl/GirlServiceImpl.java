package com.yss.webnorm.service.impl;

import com.yss.webnorm.mapper.GirlMapper;
import com.yss.webnorm.poji.ResultBean;
import com.yss.webnorm.service.GirlService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class GirlServiceImpl implements GirlService {

    @Resource
    private GirlMapper mapper;

    public ResultBean<?> findOne(int id) {
        return new ResultBean<>(mapper.findOne(id));
    }
}
