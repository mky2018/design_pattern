package com.mky.design.principle.singleresponsibility;

/**
 * @author makaiyu
 * @date 2020-05-03 13:21
 */
public class Bird {
    public void mainMoveMode(String birdName) {
        if ("鸵鸟".equals(birdName)) {
            System.out.println(birdName + "用脚走");
        } else {
            System.out.println(birdName + "用翅膀飞");
        }
    }
}
