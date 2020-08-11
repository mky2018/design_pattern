package com.mky.design.principle.singleresponsibility;

/**
 * @author makaiyu
 * @date 2020-05-03 13:28
 */
public interface ICourse {

    String getCourseName();

    byte[] getCourseVideo();

    void studyCourse();

    void refundCourse();
}
