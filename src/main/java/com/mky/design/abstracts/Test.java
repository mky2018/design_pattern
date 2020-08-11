package com.mky.design.abstracts;

/**
 * @author makaiyu
 * @date 2020-08-11 10:19
 */
public class Test {

    public static void main(String[] args) {
        // 就近原则 B extends A / C extends B
        // C.testA() 调用B中实现

        // C extends B / B extends A 静态代码块执行顺序: A -> B -> C
        // C extends B / B extends A 无参构造执行顺序: A -> B -> C
        // 类不可多继承
        C c = new C();
        c.testA();
    }

}
