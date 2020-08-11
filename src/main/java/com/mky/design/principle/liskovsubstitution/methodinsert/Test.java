package com.mky.design.principle.liskovsubstitution.methodinsert;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author makaiyu
 * @date 2020-05-03 16:30
 */
public class Test {

    public static void main(String[] args) {
        Child child = new Child();

        HashMap hashMap = new HashMap();

        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();

        child.method(hashMap);
    }

}
