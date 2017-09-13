package com.lightofsms.girl.service.impl;

import com.lightofsms.girl.pojo.Girl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GirlServiceImplTest {
    @Test
    public void findByIdLessThan() throws Exception {

        List<Girl> girls = service.findByIdLessThan(2);
        System.out.println(girls);
    }

    @Test
    public void findOne() throws Exception {
        System.out.println(service.findOne(1));
    }

    @Resource
    GirlServiceImpl service;

    @Test
    @Transactional
    public void save() throws Exception {

        service.save(new Girl("yang", "z", 23));
        service.save(new Girl("shi", "bb", 23));
//        Assert.assertNotNull(result);

    }

    @Test
    public void findALl() throws Exception {
        List<Girl> girls = service.findALl();
        System.out.println(girls);
    }

}