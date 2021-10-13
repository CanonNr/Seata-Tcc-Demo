package com.example.web1.controller;

import com.example.web1.service.TestService;
import io.seata.spring.annotation.GlobalTransactional;
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
        return "web1";
    }
}
