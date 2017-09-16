package com.yss.blog.pojo;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@DynamicUpdate
@Data
public class User {

    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String email;

    public User() {
    }

    public User(String name, String email) {

        this.name = name;
        this.email = email;
    }
}
