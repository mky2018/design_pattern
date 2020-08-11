package com.mky.design.observer.jdk;

/**
 * @author makaiyu
 * @date 2020-08-04 10:13
 */
public class Client {
    public static void main(String[] args) {
        AbstractSubject sub = new ConcreteAbstractSubject();
        ConcreteObserver1 concreteObserver1 = new ConcreteObserver1();
        sub.addObserver(concreteObserver1);
        sub.addObserver(new ConcreteObserver2());
        sub.doSomething();
    }
}
