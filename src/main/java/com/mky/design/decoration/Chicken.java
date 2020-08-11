package com.mky.design.decoration;

/**
 * @author makaiyu
 * @date 2020-06-12 09:54
 */
public class Chicken extends Food {

    public Chicken() {
        desc = "鸡肉";
    }

    @Override
    public String getDesc() {
        return desc;
    }
}
