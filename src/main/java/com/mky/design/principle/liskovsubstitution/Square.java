package com.mky.design.principle.liskovsubstitution;

/**
 * @author makaiyu
 * @date 2020-05-03 16:12
 */
public class Square implements Quadtangle{

    private long sideLength;

    public long getSideLength() {
        return sideLength;
    }

    public void setSideLength(long sideLength) {
        this.sideLength = sideLength;
    }


    public long getWidth() {
        return sideLength;
    }

    public long getLength() {
        return sideLength;
    }
}
