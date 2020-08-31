package com.mky.design.locksupport;

/**
 * @author makaiyu
 * @date 2020-08-31 09:30
 */
public class TestObjWait1 {

    public static void main(String[] args) throws Exception {
        final Object obj = new Object();

        Thread threadA = new Thread(() -> {
            int sum = 0;
            for (int i = 0; i < 10; i++) {
                sum += i;
            }
            try {
                synchronized (obj) {
                    obj.wait();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

            System.out.println(Thread.currentThread().getName() + "  sum = " + sum);
        }, "ThreadA");

        threadA.start();

        //睡眠一秒钟，保证线程A已经计算完成，阻塞在wait方法
        Thread.sleep(1000);
        System.out.println(Thread.currentThread().getName() + " sleep over ");

        synchronized (obj) {
            obj.notify();
        }
        System.out.println(Thread.currentThread().getName() + " over ");
    }
}
