package com.codelin.ems.service;

import com.codelin.ems.entity.User;

/**
 * @author lin
 * @create 2020-07-17 15:59
 */
public interface UserService {
    //保存用户
    void save(User user);
    //登录
    User login(String username, String password);
}
