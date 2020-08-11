package com.mky.design.principle.demete;

import java.util.ArrayList;
import java.util.List;

/**
 * @author makaiyu
 * @date 2020-05-03 14:25
 */
public class TermLeader {
    public void checkNumberOfCourses() {
        List<Course> courseList = new ArrayList<Course>();
        for (int i = 0; i < 20; i++) {
            courseList.add(new Course());
        }
        System.out.println("在线课程的数量是：" + courseList.size());
    }
}
