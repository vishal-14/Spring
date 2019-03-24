package com.spring.bootDemo.controller;

import com.spring.bootDemo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController {
    @Autowired
    User user;
    @RequestMapping("/user")
    @ResponseBody
    public User getUsers(){
        return user;
    }
}
