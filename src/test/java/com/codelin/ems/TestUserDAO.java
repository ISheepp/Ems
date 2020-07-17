package com.codelin.ems;

import com.codelin.ems.dao.UserDao;
import com.codelin.ems.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.UUID;

/**
 * @author lin
 * @create 2020-07-17 15:18
 */

@SpringBootTest(classes = EmsApplication.class)
@RunWith(SpringRunner.class)
public class TestUserDAO {

    @Autowired
    private UserDao userDAO;

    @Test
    public void testSave(){
        userDAO.save(new User(UUID.randomUUID().toString(), "xiaochen", "陈燕楠", "123", "男"));
    }
}
