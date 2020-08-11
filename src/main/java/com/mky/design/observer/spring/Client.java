package com.mky.design.observer.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author makaiyu
 * @date 2020-08-04 13:23
 */

public class Client {


    public void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        MyPublisher myPublisher = (MyPublisher) context.getBean("myPublisher");
        myPublisher.publishEvent(new MyEvent(this));
    }

}
