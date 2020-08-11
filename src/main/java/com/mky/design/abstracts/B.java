package com.mky.design.abstracts;

/**
 * @author makaiyu
 * @date 2020-08-11 10:18
 */
public abstract class B extends A {

    static {
        System.out.println("B.class static invoke ");
    }

    public B() {
        System.out.println("B.class invoke");
    }

    @Override
    public void testA() {
        System.out.println("B.class -> testA method invoke");
    }

    public void testB() {
        System.out.println("B.class -> testB method invoke");
    }

}
