package com.ziye.wiki.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//返回字符串
@RestController
//返回页面
//@Controller
public class TestController {
    @RequestMapping("/hello")
    public String hello(){
        return "hello world!";
    }

}
