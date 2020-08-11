package com.mky.design.principle.openclose;

/**
 * @author makaiyu
 * @date 2020-05-03 12:16
 */
public class Test {

    public static void main(String[] args) {
        ICourse iCourse = new JavaDisCountCourse(96, "Java 0 ->1", 250.41d);
        JavaDisCountCourse javaCourse = (JavaDisCountCourse) iCourse;
        System.out.println("课程Id：" + javaCourse.getId() +
                " 课程名称：" + javaCourse.getName() + " 课程价格：" +
                javaCourse.getDisCountPrice() + "元" + " 原价：" + javaCourse.getPrice() + "元");
    }

}
