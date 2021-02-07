package com.controller;

import com.pojo.User;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserService userService;
    @RequestMapping("selectUser")
    public String selectUser(){
        System.out.println("表现层：查询所有账户...");
        List<User> list = userService.selectUser();
        for (User user : list) {
            System.out.println(user);
        }
        return "list";
    }
}
