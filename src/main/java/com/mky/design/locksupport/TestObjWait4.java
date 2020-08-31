package com.mky.design.locksupport;

import java.util.concurrent.*;

/**
 * @author makaiyu
 * @date 2020-08-31 09:26
 */
public class TestObjWait4 {

    public static void main(String[] args) throws Exception {
        ArrayBlockingQueue<Runnable> queue = new ArrayBlockingQueue<Runnable>(1000);
        ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor(5, 5, 1000, TimeUnit.SECONDS, queue);

        Future<String> future = poolExecutor.submit(new Callable<String>() {
            @Override
            public String call() throws Exception {
                TimeUnit.SECONDS.sleep(5);
                return "hello";
            }
        });

        String result = future.get();
        System.out.println(result);
    }

}
