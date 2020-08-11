package com.mky.design.pattern.creational.factorymethod;

/**
 * @author makaiyu
 * @date 2020-05-04 13:25
 */
public class PythonVideoFactory extends VideoFactory {


    @Override
    public Video getVideo() {
        return new PythonVideo();
    }
}
