package com.mky.design.abstracts;

/**
 * @author makaiyu
 * @date 2020-08-11 10:18
 */
public class C extends B {

    static {
        System.out.println("C.class static invoke ");
    }

    public C() {
        System.out.println("C.class invoke");
    }
}
