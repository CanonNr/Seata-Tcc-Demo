package com.example.web2.controller;

import com.example.web2.service.TestService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;

@RestController
@RequestMapping("/test")
public class TestController {

    @Resource
    TestService testService;

    @GetMapping("/1")
    public String test1(Integer id){
        testService.print(id);
        return "web2";
    }
}
