package com.yss.springboot.mapper;

import com.yss.springboot.pojo.ProductCategory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryMapperTest {

    @Autowired
    private ProductCategoryMapper productCategoryMapper;

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void findOneTest() {
        ProductCategory productCategory = productCategoryMapper.findOne(1);
        System.out.println(productCategory.toString());
    }

    @Test
//    @Transactional
    public void saveTest() {
        ProductCategory productCategory = new ProductCategory();
//        不加设置主键就是增加数据,加上就是更新数据
        productCategory.setCategoryId(2);
        productCategory.setCategoryName("我的最爱");
        productCategory.setCategoryType(3);
        ProductCategory result = productCategoryMapper.save(productCategory);
//        测试是否成功
        Assert.assertNotNull(result);

    }

    @Test
    public void findByCategoryTypeInTest() {
        List<Integer> list = Arrays.asList(3, 4);
        List<ProductCategory> result = productCategoryMapper.findByCategoryTypeIn(list);
        Assert.assertNotEquals(0, result.size());

    }

}