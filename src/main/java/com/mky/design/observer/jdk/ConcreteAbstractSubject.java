package com.mky.design.observer.jdk;

/**
 * @author makaiyu
 * @date 2020-08-04 10:12
 * 具体被观察者
 */
public class ConcreteAbstractSubject extends AbstractSubject {

    @Override
    public void doSomething() {
        System.out.println("被观察者事件发生改变");
        this.notifyObserver();
    }

}

class ConcreteObserver1 implements Observer {

    @Override
    public void update() {
        System.out.println("观察者1收到信息，并进行处理");
    }
}

class ConcreteObserver2 implements Observer {

    @Override
    public void update() {
        System.out.println("观察者2收到信息，并进行处理");
    }
}
