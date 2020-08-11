package com.mky.design.pattern.creational.factorymethod;

/**
 * @author makaiyu
 * @date 2020-05-04 14:23
 */
public class FEVideoFactory extends VideoFactory {

    @Override
    public Video getVideo() {
        return new FEVideo();
    }
}
