package com.yuqiu.controller;

import com.yuqiu.services.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.servlet.http.HttpServletRequest;
import com.yuqiu.model.User;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by dell on 2017/8/18.
 */
@Controller
public class LoginController {
    @Autowired
    @Lazy
    private CustomerService customerService;

    @RequestMapping("/login")
    public String login(HttpServletRequest request, String userCode, String password){
        User user = customerService.doLogin(userCode, password);
        if(user instanceof User) {
            request.setAttribute("userName",user.getName());
            request.setAttribute("currentTime",new SimpleDateFormat("yyyyMMdd HH:mm:ss").format(new Date(System.currentTimeMillis())));
            return "hello";
        }else {
            request.getSession().removeAttribute("message");
            request.getSession().setAttribute("message","用户名或密码错误");
            return "login";
        }
    }

}
