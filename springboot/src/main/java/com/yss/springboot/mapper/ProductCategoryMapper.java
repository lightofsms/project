package com.yss.springboot.mapper;

import com.yss.springboot.pojo.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductCategoryMapper extends JpaRepository<ProductCategory, Integer> {
    //    查询一个字段里面的多个值返回这些值的list
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);
}
