package com.mky.design.async;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

/**
 * @author makaiyu
 * @date 2020-08-05 09:46
 */
@Component  // 这个类本身要被Spring管理
public class DmzAsyncService {

    @Async(value = "mkyExecutor")  // 添加注解表示这个方法要异步执行
    public void testAsync() {
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("testAsync invoked");
    }
}