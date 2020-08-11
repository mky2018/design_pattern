package com.mky.design.observer.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author makaiyu
 * @date 2020-08-04 13:23
 */
@Configuration
@ComponentScan
public class AppConfig {

    @Bean(name = "myPublisher")
    public MyPublisher myPublisher(){
        return new MyPublisher();
    }
}

