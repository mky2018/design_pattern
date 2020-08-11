package com.mky.design.observer.spring;

import org.springframework.context.ApplicationEvent;

/**
 * @author makaiyu
 * @date 2020-08-04 13:22
 */
public class MyEvent extends ApplicationEvent {
    public MyEvent(Object source) {
        super(source);
        System.out.println("my Event");
    }
}

