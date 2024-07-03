package com.ziye.wiki.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class TestController {

    //搜索配置文件中的test.hello
    @Value("${test.hello:Test}")
    private String testHello;

    @GetMapping("/hello")
    public String hello() {
        return "Hello world!"+testHello;
    }

    @PostMapping("/hello/post")
    public String helloPost(@RequestParam Map<String, String> map) {
        // 假设你想获取名为"name"的参数，需要确保map中有这个键，否则会抛出异常
        String nameParam = map.getOrDefault("name", "Name not provided");
        return "Hello world post!!!" + nameParam;
    }
}
