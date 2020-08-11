package com.mky.design.interfaces;

/**
 * @author makaiyu
 * @date 2020-08-11 10:31
 */
public interface A {

    void testA();

    default void testDefaultA() {
        System.out.println("A.class test default interface");
    }

}
