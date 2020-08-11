package com.mky.design.observer.spring;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @author makaiyu
 * @date 2020-08-04 13:22
 */
@Component
class MyListenerA implements ApplicationListener<MyEvent> {
    @Override
    public void onApplicationEvent(MyEvent AyEvent) {
        System.out.println("ListenerA received");
    }
}

@Component
class MyListenerB implements ApplicationListener<MyEvent> {
    @Override
    public void onApplicationEvent(MyEvent AyEvent) {
        System.out.println("ListenerB received");
    }
}

