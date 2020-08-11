package com.mky.design.chain.responsibility.notpure;

import lombok.Data;

/**
 * @author makaiyu
 * @date 2020-08-11 13:55
 * 抽象处理类
 */
@Data
public abstract class BaseHandler {

    /**
     * 处理者姓名
     */
    protected String name;

    /**
     * 下一个处理者
     */
    protected BaseHandler nextBaseHandler;

    public BaseHandler(String name) {
        this.name = name;
    }

    /**
     * 处理请假
     */
    public abstract boolean process(LeaveRequest leaveRequest);
}

