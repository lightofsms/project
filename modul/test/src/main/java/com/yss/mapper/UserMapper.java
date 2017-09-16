package com.yss.mapper;

import com.yss.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserMapper extends JpaRepository<User, Long> {
}
