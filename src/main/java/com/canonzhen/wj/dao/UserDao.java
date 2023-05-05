package com.canonzhen.wj.dao;

import com.canonzhen.wj.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User,Integer> {
    User findByUsername(String username);
    User getByUsernameAndPassword(String username,String password);
}
