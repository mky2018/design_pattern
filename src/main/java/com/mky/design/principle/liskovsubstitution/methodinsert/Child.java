package com.mky.design.principle.liskovsubstitution.methodinsert;

import java.util.HashMap;
import java.util.Map;

/**
 * @author makaiyu
 * @date 2020-05-03 16:29
 */
public class Child extends Base {

//    @Override
//    public void method(HashMap map) {
//        System.out.println("子类HashMap入参方法被执行");
//    }

    public void method(Map map) {
        System.out.println("子类Map入参方法被执行");
    }
}
