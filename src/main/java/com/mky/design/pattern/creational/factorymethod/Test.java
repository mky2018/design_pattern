package com.mky.design.pattern.creational.factorymethod;

/**
 * @author makaiyu
 * @date 2020-05-04 14:11
 */
public class Test {

    public static void main(String[] args) {

        VideoFactory videoFactory = new JavaVideoFactory();
        VideoFactory pythonVideoFactory = new PythonVideoFactory();
        VideoFactory feVideoFactory = new FEVideoFactory();

        Video video = videoFactory.getVideo();

        video.produce();

    }

}
