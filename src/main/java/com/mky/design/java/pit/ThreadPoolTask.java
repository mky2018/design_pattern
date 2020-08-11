package com.mky.design.java.pit;

/**
 * @author makaiyu
 * @date 2020-05-13 16:09
 */

import java.io.Serializable;

/**
 * 描述:
 *
 * @author yanpenglei
 * @create 2017-10-12 15:40
 **/
public class ThreadPoolTask implements Runnable, Serializable {

    private Object attachData;

    ThreadPoolTask(Object tasks) {
        this.attachData = tasks;
    }

    @Override
    public void run() {

        try {

            System.out.println("开始执行任务：" + attachData + "任务，使用的线程池，线程名称：" + Thread.currentThread().getName());

            System.out.println();

        } catch (Exception e) {
            e.printStackTrace();
        }
        attachData = null;
    }

}
