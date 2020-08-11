package com.mky.design.pattern.creational.singleton;

/**
 * @author makaiyu
 * @date 2020-05-08 17:30
 */
public class Singleton {

    private Singleton() {

    }

    public static Singleton getInstance() {
        return SingletonHolder.instance;
    }

    private static class SingletonHolder {
        private static final Singleton instance = new Singleton();
    }

}


