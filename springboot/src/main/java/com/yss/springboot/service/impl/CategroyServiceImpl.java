package com.yss.springboot.service.impl;

import com.yss.springboot.mapper.ProductCategoryMapper;
import com.yss.springboot.pojo.ProductCategory;
import com.yss.springboot.service.CategroyService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CategroyServiceImpl implements CategroyService {

    @Resource
    private ProductCategoryMapper repository;

    @Override
    public ProductCategory findOne(Integer id) {
        return repository.findOne(id);
    }

    @Override
    public List<ProductCategory> findAll() {
        return repository.findAll();
    }

    @Override
    public List<ProductCategory> findByCategoryTypeIn(List<Integer> typeList) {
        return repository.findByCategoryTypeIn(typeList);
    }

    @Override
    public ProductCategory save(ProductCategory productCategory) {
        return repository.save(productCategory);
    }
}
