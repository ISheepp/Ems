package com.codelin.ems.service;

import com.codelin.ems.dao.UserDao;
import com.codelin.ems.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

/**
 * @author lin
 * @create 2020-07-17 16:00
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public void save(User user) {
        user.setId(UUID.randomUUID().toString());
        userDao.save(user);
    }

    @Override
    public User login(String username, String password) {
        return userDao.findByUsernameAndPassword(username, password);
    }
}
