package com.mky.design.java.pit;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.*;

/**
 * @author makaiyu
 * @date 2020-05-12 13:38
 */
public class ThreadLocalTest {

    private static final ThreadLocal<Integer> currentUser = ThreadLocal.withInitial(() -> null);

    public static Map wrong(Integer userId) {
        //设置用户信息之前先查询一次ThreadLocal中的用户信息
        String before = Thread.currentThread().getName() + ":" + currentUser.get();
        //设置用户信息到ThreadLocal
        currentUser.set(userId);
        //设置用户信息之后再查询一次ThreadLocal中的用户信息
        String after = Thread.currentThread().getName() + ":" + currentUser.get();
        //汇总输出两次查询结果
        Map result = new HashMap();
        result.put("before", before);
        result.put("after", after);
        System.out.println(result);
        return result;
    }

    public static void main(String[] args) {

        ThreadPoolExecutor threadPool = new ThreadPoolExecutor(1, 4, 3,
                TimeUnit.SECONDS, new ArrayBlockingQueue<>(3), new ThreadPoolExecutor.AbortPolicy());

        long currentTimeMillis = System.currentTimeMillis();

        for (int i = 1; i <= 4; i++) {
            try {
                String task = "task=" + i;
                System.out.println("创建任务并提交到线程池中：" + task);
                threadPool.execute(new ThreadPoolTask(task));

                Thread.sleep(3000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        try {
            //等待所有线程执行完毕当前任务。
            threadPool.shutdown();

            boolean loop = true;
            do {
                //等待所有线程执行完毕当前任务结束
                loop = !threadPool.awaitTermination(2, TimeUnit.SECONDS);//等待2秒
            } while (loop);

            System.out.println("所有线程执行完毕");

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            System.out.println("耗时：" + (System.currentTimeMillis() - currentTimeMillis));
        }

    }

}
