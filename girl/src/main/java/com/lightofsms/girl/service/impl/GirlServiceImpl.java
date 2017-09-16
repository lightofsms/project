package com.lightofsms.girl.service.impl;

import com.lightofsms.girl.mapper.GirlMapper;
import com.lightofsms.girl.pojo.Girl;
import com.lightofsms.girl.service.GirlService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class GirlServiceImpl implements GirlService {

    @Resource
    private GirlMapper mapper;


    //    查询所有列表
    public List<Girl> findALl() {
        return mapper.findAll();
    }
//分页查询以后实现

    //    根据id查询单个信息
    public Girl findOne(int id) {
        Girl girl1 = mapper.findOne(id);
        return girl1;
    }

    public List<Girl> findByIdLessThan(Integer id) {

        return mapper.findByIdLessThan(id);
    }

    @Override
    public Girl save(Girl girl) throws Exception {
        return mapper.save(girl);
    }
}
