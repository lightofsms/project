package com.lightofsms.girl.mapper;

import com.lightofsms.girl.pojo.Girl;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GirlMapper extends JpaRepository<Girl, Integer> {
    //当id小于某个值
    List<Girl> findByIdLessThan(Integer id);

}