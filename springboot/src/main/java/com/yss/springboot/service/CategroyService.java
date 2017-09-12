package com.yss.springboot.service;

import com.yss.springboot.pojo.ProductCategory;

import java.util.List;

public interface CategroyService {

    ProductCategory findOne(Integer id);

    List<ProductCategory> findAll();

    List<ProductCategory> findByCategoryTypeIn(List<Integer> typeList);

    ProductCategory save(ProductCategory productCategory);
}
