package com.mky.design.async;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;

import java.util.concurrent.Executor;

/**
 * @author makaiyu
 * @date 2020-08-05 09:45
 */
@EnableAsync
@Configuration
@ComponentScan("com.mky.design.async")
public class Config {

    @Bean("mkyExecutor")
    public Executor executor() {
        // 创建自定义的线程池
        return new MkyAsyncConfigurer().getAsyncExecutor();
    }

}
