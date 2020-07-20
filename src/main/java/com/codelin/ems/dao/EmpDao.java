package com.codelin.ems.dao;

import com.codelin.ems.entity.Emp;

import java.util.List;

/**
 * @author lin
 * @create 2020-07-20 20:03
 */
public interface EmpDao {

    //查询所有员工
    List<Emp> findAll();

    //添加员工
    void addEmp(Emp emp);

    //删除员工
    void delete(String id);

    //根据id查询员工信息
    Emp findById(String id);

    //更新员工信息
    void update(Emp emp);
}
