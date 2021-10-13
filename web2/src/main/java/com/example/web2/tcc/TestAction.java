package com.example.web2.tcc;

import io.seata.rm.tcc.api.BusinessActionContext;
import io.seata.rm.tcc.api.BusinessActionContextParameter;
import io.seata.rm.tcc.api.LocalTCC;
import io.seata.rm.tcc.api.TwoPhaseBusinessAction;

@LocalTCC
public interface TestAction {

    @TwoPhaseBusinessAction(name = "TccActionOne",
            commitMethod = "commit",
            rollbackMethod = "rollback")
    boolean prepare(BusinessActionContext actionContext,
                           @BusinessActionContextParameter(paramName = "id") Integer id);


    boolean commit(BusinessActionContext actionContext);

    boolean rollback(BusinessActionContext actionContext);
}
