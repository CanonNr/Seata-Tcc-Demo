package com.example.web1.tcc.impl;

import com.example.web1.tcc.TestAction;
import io.seata.rm.tcc.api.BusinessActionContext;
import org.springframework.stereotype.Service;

@Service
public class TestActionImpl implements TestAction {
    @Override
    public boolean prepare(BusinessActionContext actionContext, Integer id) {
        System.out.println("执行prepare...");
        // 如果id偶数返回true,反之false
        return id%2==0;
    }

    @Override
    public boolean commit(BusinessActionContext actionContext) {
        System.out.println("执行commit...");
        return true;
    }

    @Override
    public boolean rollback(BusinessActionContext actionContext) {
        System.out.println("执行rollback...");
        return true;
    }
}
