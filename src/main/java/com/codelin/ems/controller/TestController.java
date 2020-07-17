package com.codelin.ems.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lin
 * @create 2020-07-17 10:31
 */

@RestController
@RequestMapping("test")
public class TestController {

    @GetMapping("test")
    public String test(){
        System.out.println("test method");
        return "test method ok";
    }
}
