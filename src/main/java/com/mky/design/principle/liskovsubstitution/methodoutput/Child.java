package com.mky.design.principle.liskovsubstitution.methodoutput;

import java.util.HashMap;
import java.util.Map;

/**
 * @author makaiyu
 * @date 2020-05-03 16:39
 */
public class Child extends Base {

    @Override
    public HashMap method() {
        HashMap hashMap = new HashMap();
        System.out.println("子类被执行");
        hashMap.put("message","子类被执行");
        return hashMap;
    }
}
