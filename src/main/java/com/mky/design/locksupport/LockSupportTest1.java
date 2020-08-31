package com.mky.design.locksupport;

import java.util.concurrent.locks.LockSupport;

/**
 * @author makaiyu
 * @date 2020-08-31 10:55
 */
public class LockSupportTest1 {

    private static Thread mainThread;

    //①LockSupport不需要在同步代码块里 。所以线程间也不需要维护一个共享的同步对象了，实现了线程间的解耦。
    //②unpark函数可以先于park调用，所以不需要担心线程间的执行的先后顺序。
    // unpark函数可以先于park调用。比如 Main调用unpark函数，给 线程ThreadA 发了一个“许可”，
    // 那么当 线程ThreadA 调用park时，它发现已经有“许可”了，那么它会马上再继续运行。
    // park和wait的区别。wait让线程阻塞前，必须通过synchronized获取同步锁。
    public static void main(String[] args) {

        ThreadA ta = new ThreadA("ta");
        // 获取主线程
        mainThread = Thread.currentThread();

        System.out.println(Thread.currentThread().getName() + " start ta");
        ta.start();

        System.out.println(Thread.currentThread().getName() + " block");
        // 主线程阻塞
        LockSupport.park(mainThread);

        System.out.println(Thread.currentThread().getName() + " continue");
    }

    static class ThreadA extends Thread {

        public ThreadA(String name) {
            super(name);
        }

        public void run() {
            System.out.println(Thread.currentThread().getName() + " wakup others");
            // 唤醒“主线程”
            LockSupport.unpark(mainThread);
        }
    }
}

