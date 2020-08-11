package com.mky.design.principle.liskovsubstitution.methodinsert;

import java.util.HashMap;

/**
 * @author makaiyu
 * @date 2020-05-03 16:29
 */
public class Base {

    public void method(HashMap map) {
        System.out.println("父类被执行");
    }

}
