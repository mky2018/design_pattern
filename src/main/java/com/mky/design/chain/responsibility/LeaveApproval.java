package com.mky.design.chain.responsibility;

/**
 * @author makaiyu
 * @date 2020-08-11 13:46
 * 常规 请假实例
 */
public class LeaveApproval {

    // 类比较庞大，各个上级的审批方法都集中在该类中，违反了 "单一职责原则"
    // 当需要修改该请假流程，譬如增加当天数大于30天时还需提交给董事长处理，必须修改该类源代码（并重新进行严格地测试），违反了 "开闭原则"
    // 该流程缺乏灵活性，流程确定后不可再修改（除非修改源代码），客户端无法定制流程
    public boolean process(String request, int number) {
        // 主管处理
        boolean result = handleByDirector(request);
        if (!result) {
            // 主管不批准
            return false;
        } else if (number < 3) {
            // 主管批准且天数小于 3
            return true;
        }

        // 准管批准且天数大于等于 3，提交给经理处理
        result = handleByManager(request);
        // 经理不批准
        if (!result) {
            return false;
            // 经理批准且天数小于 7
        } else if (number < 7) {
            return true;
        }

        // 经理批准且天数大于等于 7，提交给总经理处理
        result = handleByTopManager(request);
        // 总经理不批准
        if (!result) {
            return false;
        }
        // 总经理最后批准
        return true;
    }

    public boolean handleByDirector(String request) {
        // 主管处理该请假申请
        return true;
    }

    public boolean handleByManager(String request) {
        // 经理处理该请假申请
        return true;
    }

    public boolean handleByTopManager(String request) {
        // 总经理处理该请假申请
        return true;
    }

}

