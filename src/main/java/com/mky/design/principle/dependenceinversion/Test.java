package com.mky.design.principle.dependenceinversion;

/**
 * @author makaiyu
 * @date 2020-05-03 12:56
 */
public class Test {

//    public static void main(String[] args) {
//        Mky mky = new Mky();
//        mky.studJavaCourse();
//        mky.studyFECourse();
//    }

    // 接口方法注入
//    public static void main(String[] args) {
//        Mky mky = new Mky();
//        mky.studyImoocCourse(new JavaCourse());
//        mky.studyImoocCourse(new FECourse());
//        mky.studyImoocCourse(new PythonCourse());
//    }

    // 构造器注入
//    public static void main(String[] args) {
//        Mky mky = new Mky(new JavaCourse());
//        mky.studyImoocCourse();
//    }

    public static void main(String[] args) {
        Mky mky = new Mky();
        mky.setiCourse(new JavaCourse());
        mky.studyImoocCourse();

        mky.setiCourse(new FECourse());
        mky.studyImoocCourse();
    }

}
