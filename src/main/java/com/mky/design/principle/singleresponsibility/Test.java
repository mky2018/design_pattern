package com.mky.design.principle.singleresponsibility;

/**
 * @author makaiyu
 * @date 2020-05-03 13:22
 */
public class Test {

//    public static void main(String[] args) {
//        Bird bird = new Bird();
//        bird.mainMoveMode("喜鹊");
//        bird.mainMoveMode("鸵鸟");
//    }

    public static void main(String[] args) {
        FlyBird flyBird = new FlyBird();
        flyBird.mainMoveMode("喜鹊");

        WalkBird walkBird = new WalkBird();
        walkBird.mainMoveMode("鸵鸟");
    }

}
