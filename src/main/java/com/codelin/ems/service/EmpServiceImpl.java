package com.codelin.ems.service;

import com.codelin.ems.dao.EmpDao;
import com.codelin.ems.entity.Emp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

/**
 * @author lin
 * @create 2020-07-20 20:04
 */
@Service
@Transactional
public class EmpServiceImpl implements EmpService {

    @Autowired
    private EmpDao empDao;

    @Override
    public List<Emp> findAll() {
        return empDao.findAll();
    }

    @Override
    public void addEmp(Emp emp) {
        emp.setId(UUID.randomUUID().toString());
        empDao.addEmp(emp);
    }
}
