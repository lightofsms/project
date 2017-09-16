package com.yss.blog.mapper;

import com.yss.blog.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserMapper extends JpaRepository<User, Long> {
}
