package com.mky.design.observer.spring;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ApplicationEvent;
import org.springframework.stereotype.Component;

/**
 * @author makaiyu
 * @date 2020-08-04 13:22
 */
@Component
public class MyPublisher implements ApplicationContextAware {
    private ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    public void publishEvent(ApplicationEvent event) {
        System.out.println("publish event");
        applicationContext.publishEvent(event);
    }
}

