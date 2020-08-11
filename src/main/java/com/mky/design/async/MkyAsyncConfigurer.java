package com.mky.design.async;

import org.springframework.scheduling.annotation.AsyncConfigurer;

import java.util.concurrent.*;

/**
 * @author makaiyu
 * @date 2020-08-05 10:48
 */
public class MkyAsyncConfigurer implements AsyncConfigurer {

    /**
     * The {@link Executor} instance to be used when processing async
     * method invocations.
     */
    @Override
    public Executor getAsyncExecutor() {

        return new ThreadPoolExecutor(5, 10, 30, TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(10), new ThreadFactory() {
            /**
             * Constructs a new {@code Thread}.  Implementations may also initialize
             * priority, name, daemon status, {@code ThreadGroup}, etc.
             *
             * @param r a runnable to be executed by new thread instance
             * @return constructed thread, or {@code null} if the request to
             * create a thread is rejected
             */
            @Override
            public Thread newThread(Runnable r) {
                Thread thread = new Thread(r);
                thread.setName("thread : " + Thread.currentThread().getName());
                System.out.println(thread.getName());
                return thread;
            }
        }, new ThreadPoolExecutor.AbortPolicy());
    }


}
