package com.mky.design.interfaces;

/**
 * @author makaiyu
 * @date 2020-08-11 10:35
 */
public class Test {

    public static void main(String[] args) {

        // 接口支持多继承，支持继承中的就近原则
        // jdk1.8后 interfaces 支持default实现
        // 当需要在某些已有的接口中增加新的方法，同时不想影响已实现的类，可以使用default来进行默认实现
        // 但这种设计 违反了Java的一种思想：编译期发现问题  (半编译半解释的语言)

        C c = new C();
        c.testA();
        c.testDefaultA();
    }

}
