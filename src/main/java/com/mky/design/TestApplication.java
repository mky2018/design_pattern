package com.mky.design;

import com.mky.design.async.Config;
import com.mky.design.async.DmzAsyncService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * @author makaiyu
 * @date 2020-05-12 13:41
 */
@SpringBootApplication
@EnableAsync
public class TestApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(Config.class);
        DmzAsyncService bean = ac.getBean(DmzAsyncService.class);
        bean.testAsync();
        System.out.println("main函数执行完成");
//        SpringApplication.run(TestApplication.class);
    }

}
