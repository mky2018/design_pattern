package com.mky.design.pattern.creational.factorymethod;

/**
 * @author makaiyu
 * @date 2020-05-04 14:22
 */
public class FEVideo extends Video {
    @Override
    public void produce() {
        System.out.println("录制FE填充视频");
    }
}
