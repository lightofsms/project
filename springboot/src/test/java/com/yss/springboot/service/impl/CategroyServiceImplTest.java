package com.yss.springboot.service.impl;

import com.yss.springboot.pojo.ProductCategory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CategroyServiceImplTest {

    @Resource
    private CategroyServiceImpl categroyService;

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void findOne() throws Exception {
        ProductCategory productCategory = categroyService.findOne(1);
        Assert.assertEquals(new Integer(1), productCategory.getCategoryId());
    }

    @Test
    public void findAll() throws Exception {
        List<ProductCategory> list = categroyService.findAll();
        Assert.assertNotEquals(0, list.size());
    }

    @Test
    public void findByCategoryTypeIn() throws Exception {
        List<ProductCategory> list = categroyService.findByCategoryTypeIn(Arrays.asList(3, 4));

        Assert.assertNotEquals(0, list.size());
    }

    @Test
    public void save() throws Exception {
        ProductCategory productCategory = new ProductCategory();
        productCategory.setCategoryName("女生专");
        productCategory.setCategoryType(5);
        ProductCategory category = categroyService.save(productCategory);
        Assert.assertNotNull(category);
    }

}