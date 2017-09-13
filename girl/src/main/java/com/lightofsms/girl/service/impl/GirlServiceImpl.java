package com.lightofsms.girl.service.impl;

import com.lightofsms.girl.exception.GirlException;
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

    //增加和更新对象
//    @Transactional
    public Girl save(Girl girl) throws Exception {
//        判断小于20岁不让注册
        if (girl.getAge() < 20) {
            throw new GirlException("小于20",19);
        }
        return mapper.save(girl);
    }

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
}
