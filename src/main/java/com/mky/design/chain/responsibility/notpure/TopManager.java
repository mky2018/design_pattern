package com.mky.design.chain.responsibility.notpure;

import java.util.Random;

/**
 * @author makaiyu
 * @date 2020-08-11 13:57
 */
public class TopManager extends BaseHandler {

    public TopManager(String name) {
        super(name);
    }

    @Override
    public boolean process(LeaveRequest leaveRequest) {
        boolean result = (new Random().nextInt(10)) > 3;
        String log = "总经理<%s> 审批 <%s> 的请假申请，请假天数： <%d> ，审批结果：<%s> ";
        System.out.println(String.format(log, this.name, leaveRequest.getName(),
                leaveRequest.getNumOfDays(), result ? "批准" : "不批准"));

        // 总经理不批准
        if (!result) {
            return false;
        }
        // 总经理最后批准
        return true;
    }

}
