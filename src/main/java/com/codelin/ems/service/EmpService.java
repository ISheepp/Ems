package com.codelin.ems.service;


import com.codelin.ems.entity.Emp;

import java.util.List;

/**
 * @author lin
 * @create 2020-07-20 20:04
 */


public interface EmpService {

    List<Emp> findAll();

    //添加员工
    void addEmp(Emp emp);

}
