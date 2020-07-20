package com.codelin.ems.controller;

import com.codelin.ems.entity.Emp;
import com.codelin.ems.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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
}
