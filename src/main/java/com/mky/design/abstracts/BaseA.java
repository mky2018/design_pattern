package com.mky.design.abstracts;

/**
 * @author makaiyu
 * @date 2020-08-11 10:18
 */
public abstract class BaseA {

    public BaseA() {
        System.out.println("A.class invoke");
    }

    static {
        System.out.println("A.class static invoke ");
    }

    public void testA() {
        System.out.println("A.class -> testA method invoke");
    }

}

