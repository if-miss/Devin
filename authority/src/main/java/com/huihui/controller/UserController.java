package com.huihui.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ConcurrentHashMap;

/**
* @Author huihui 
* @Date 2019/9/26
* @Description 
*/
@RestController
public class UserController {

    @RequestMapping("/getUser")
    public String getUser(){
        ConcurrentHashMap map= new  ConcurrentHashMap<String,String>();
        return "My name is Devin";
    }
}
