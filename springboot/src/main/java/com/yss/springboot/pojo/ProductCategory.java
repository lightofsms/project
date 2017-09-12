package com.yss.springboot.pojo;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@DynamicUpdate
@Data
public class ProductCategory {

    @Id//命名主键
    @GeneratedValue//自增
    private Integer categoryId;

    private String categoryName;

    private Integer categoryType;

}
