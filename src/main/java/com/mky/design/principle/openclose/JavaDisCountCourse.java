package com.mky.design.principle.openclose;

/**
 * @author makaiyu
 * @date 2020-05-03 12:28
 */
public class JavaDisCountCourse extends JavaCourse {
    public JavaDisCountCourse(Integer id, String name, Double price) {
        super(id, name, price);
    }

    public Double getDisCountPrice() {
        return super.getPrice() * 0.8;
    }

}
