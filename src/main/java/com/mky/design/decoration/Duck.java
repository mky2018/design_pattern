package com.mky.design.decoration;

/**
 * @author makaiyu
 * @date 2020-06-12 09:54
 */
public class Duck extends Food {

    public Duck() {
        desc = "鸭肉";
    }

    @Override
    public String getDesc() {
        return desc;
    }
}
