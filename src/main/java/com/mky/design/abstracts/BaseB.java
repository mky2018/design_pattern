package com.mky.design.abstracts;

/**
 * @author makaiyu
 * @date 2020-08-11 10:18
 */
public abstract class BaseB extends BaseA {

    static {
        System.out.println("B.class static invoke ");
    }

    public BaseB() {
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
