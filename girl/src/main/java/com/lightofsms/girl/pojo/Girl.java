package com.lightofsms.girl.pojo;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Min;

@Entity
@DynamicUpdate
@Data
public class Girl {

    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private String cupSize;

    @Min(value = 18, message = "未成年不能注册")
    private Integer age;

    public Girl(String name, String cupSize, Integer age) {
        this.name = name;
        this.cupSize = cupSize;
        this.age = age;
    }

    public Girl() {
    }
}
