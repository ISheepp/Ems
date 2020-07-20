package com.codelin.ems.controller;

import com.codelin.ems.entity.Emp;
import com.codelin.ems.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.el.ELManager;
import java.util.List;

/**
 * @author lin
 * @create 2020-07-20 20:06
 */

@Controller
@RequestMapping("emp")
public class EmpController {

    @Autowired
    private EmpService empService;

    //查询所有
    @GetMapping("findAll")
    public String findAll(Model model){
        List<Emp> emps = empService.findAll();
        model.addAttribute("emps", emps);
        return "ems/emplist";
    }

    //添加员工
    @PostMapping("addEmp")
    public String addEmp(Emp emp){
        empService.addEmp(emp);
        return "redirect:/emp/findAll";
    }

    //删除员工
    @GetMapping("delete")
    public String delete(String id){
        empService.delete(id);
        return "redirect:/emp/findAll";
    }

    //根据id查询
    @GetMapping("findOne")
    public String findOne(String id, Model model){
        Emp emp = empService.findById(id);
        model.addAttribute("emp", emp);
        return "ems/updateEmp";
    }

    //更新员工信息
    @PostMapping("update")
    public String update(Emp emp){
        empService.update(emp);
        return "redirect:/emp/findAll";
    }
}
