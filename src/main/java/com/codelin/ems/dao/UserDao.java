package com.codelin.ems.dao;

        import com.codelin.ems.entity.User;
        import org.apache.ibatis.annotations.Param;

/**
 * @author lin
 * @create 2020-07-17 15:12
 */
public interface UserDao {

    //保存用户的方法
    void save(User user);

    //登录的方法
    User findByUsernameAndPassword(@Param("username") String username, @Param("password") String password);
}
