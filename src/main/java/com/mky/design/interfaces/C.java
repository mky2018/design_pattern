package com.mky.design.interfaces;

/**
 * @author makaiyu
 * @date 2020-08-11 10:31
 */
public class C implements A, B {

    @Override
    public void testA() {
        System.out.println("C.class invoke testA");
    }

}
