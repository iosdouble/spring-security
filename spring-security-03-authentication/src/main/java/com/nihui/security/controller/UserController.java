package com.nihui.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Classname UserController
 * @Description TODO
 * @Date 2020/5/27 1:55 PM
 * @Created by nihui
 */
@RestController
@RequestMapping("/user/api")
public class UserController {
    @GetMapping("/hello")
    public String hello(){
        return "hello , user";
    }
}
