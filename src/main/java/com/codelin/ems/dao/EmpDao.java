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
}
