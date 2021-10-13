package com.example.web.service;

import com.example.web.feignClient.Web1Service;
import com.example.web.feignClient.Web2Service;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

@Service
public class TestService {

    @Resource
    Web1Service web1;

    @Resource
    Web2Service web2;

    /**
     * 最终效果:
     * 如果a和b有一个是单数则都[回滚]
     * 如果a和b都是双数则都[提交]
     * 如果a和b是相等的两个双数，30行抛出异常都[回滚]
     */
    @GlobalTransactional
    public void get(Integer a,Integer b){
        String s1 = web1.get(a);
        String s2 = web2.get(b);
        System.out.println("web1:"+s1);
        System.out.println("web2:"+s2);
        System.out.println(10/(a-b));  // 如果a、b是相等的双数则报错  / by zero
    }
}
