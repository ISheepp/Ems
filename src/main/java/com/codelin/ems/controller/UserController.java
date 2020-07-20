package com.codelin.ems.controller;

import com.codelin.ems.entity.User;
import com.codelin.ems.service.UserService;
import com.codelin.ems.utils.ValidateImageCodeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.image.BufferedImage;
import java.io.IOException;

/**
 * @author lin
 * @create 2020-07-17 15:43
 */

@Controller
@RequestMapping("user")
public class UserController {


    @Autowired
    private UserService userService;
    //开发用户注册
    @PostMapping("regist")
    public String regist(User user, String code, HttpSession session){
        System.out.println("user = " + user);
        //1.判断验证码是否通过
        if (session.getAttribute("code").toString().equalsIgnoreCase(code)){
            userService.save(user);
            return "redirect:/ems/login.jsp";
            //2.通过之后注册
        }else{
            //3.不通过则直接回到注册页面
            return "redirect:/ems/regist.jsp";
        }
    }

    //开发用户登录
    @RequestMapping("login")
    public String login(String username, String password, HttpSession session){
        User user = userService.login(username, password);
        //判断 user为空 用户名密码错误   不为空  登陆成功
        if(user!=null){
            session.setAttribute("user",user);
            return "redirect:/emp/findAll";//查询员工的所有
        }else {
            return "redirect:/ems/login.jsp";
        }
    }


    //生成验证码
    @GetMapping("getImage")
    public void getImage(HttpSession session, HttpServletResponse response) throws IOException {
        //生成验证码
        String securityCode = ValidateImageCodeUtils.getSecurityCode();
        //将验证码方式session
        session.setAttribute("code", securityCode);
        //生成图片
        BufferedImage image = ValidateImageCodeUtils.createImage(securityCode);
        //输出图片 通过响应的方式输出
        ServletOutputStream os = response.getOutputStream();
        //调用工具类
        ImageIO.write(image,"png",os);

    }
}
