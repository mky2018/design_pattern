package com.mky.design.chain.responsibility.notpure;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author makaiyu
 * @date 2020-08-11 13:54
 */
@Data
@AllArgsConstructor
public class LeaveRequest {

    /**
     * 请假人姓名
     */
    private String name;

    /**
     * 请假天数
     */
    private int numOfDays;
}
