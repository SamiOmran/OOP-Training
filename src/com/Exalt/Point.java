package com.Exalt;

import java.util.concurrent.RecursiveTask;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    int getX() {
        return x;
    }

    int getY() {
        return y;
    }

    void setX(int x) {
        this.x = x;
    }

    void setY(int y) {
        this.y = y;
    }

    @Override
    public boolean equals(Object obj) {
        Point secondPoint = (Point) obj;

        if (this.x == secondPoint.x && this.y == secondPoint.y) {
            return true;
        } else {
            return false;
        }
    }
}
