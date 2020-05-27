package com.nihui.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Classname AdminController
 * @Description TODO
 * @Date 2020/5/27 1:54 PM
 * @Created by nihui
 */
@RestController
@RequestMapping(value = "/admin/api")
public class AdminController {

    @GetMapping("/hello")
    public String hello(){
        return "hello , admin ";
    }
}
