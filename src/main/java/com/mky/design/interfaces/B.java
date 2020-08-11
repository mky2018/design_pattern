package com.mky.design.interfaces;

/**
 * @author makaiyu
 * @date 2020-08-11 10:31
 */
public interface B extends A {

    @Override
    void testA();

    @Override
    default void testDefaultA() {
        System.out.println("B.class testDefault override");
    }
}
