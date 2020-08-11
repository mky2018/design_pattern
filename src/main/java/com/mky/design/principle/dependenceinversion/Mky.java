package com.mky.design.principle.dependenceinversion;

/**
 * @author makaiyu
 * @date 2020-05-03 12:54
 */
public class Mky {

    private ICourse iCourse;

    public void setiCourse(ICourse iCourse) {
        this.iCourse = iCourse;
    }

    public void studyImoocCourse() {
        iCourse.studyCourse();
    }

}
