package com.example.web2.service;

import com.example.web2.tcc.TestAction;
import io.seata.spring.annotation.GlobalTransactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
@Slf4j
public class TestService {

    @Resource
    TestAction testAction;

    @GlobalTransactional
    public void print(Integer id){
        boolean ret = testAction.prepare(null, id);

        if (!ret){
            System.out.println(" Transaction Error !!! ");
            throw new RuntimeException("tcc error");
        }



    }
}
