package com.mky.design.pattern.creational.factorymethod;

/**
 * @author makaiyu
 * @date 2020-05-04 13:25
 */
public class JavaVideo extends Video {


    @Override
    public void produce() {
        System.out.println("录制Java填充视频");
    }
}
