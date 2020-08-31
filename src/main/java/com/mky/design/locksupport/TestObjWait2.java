package com.mky.design.locksupport;

import java.util.concurrent.locks.LockSupport;

/**
 * @author makaiyu
 * @date 2020-08-31 09:46
 */
public class TestObjWait2 {

    public static void main(String[] args) throws Exception {

        Thread threadA = new Thread(() -> {
            int sum = 0;
            for (int i = 0; i < 10; i++) {
                sum += i;
            }
            LockSupport.park();
            System.out.println(Thread.currentThread().getName() + " sum = " + sum);
        }, "ThreadA");

        threadA.start();

        //睡眠一秒钟，保证线程A已经计算完成，阻塞在wait方法
        Thread.sleep(1000);
        System.out.println(Thread.currentThread().getName() + " sleep over ");

        LockSupport.unpark(threadA);
        System.out.println(Thread.currentThread().getName() + " over ");
    }
}

