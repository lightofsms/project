package com.yss.pojo;

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
    private String username;
    private String passwd;

    public User() {
    }

    public User(String username, String passwd) {
        this.username = username;
        this.passwd = passwd;
    }
}
