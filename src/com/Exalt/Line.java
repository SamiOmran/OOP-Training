package com.Exalt;
//import java.math.
public class Line extends Shape{
    private Point begin;
    private Point end;

    public Line(Point begin, Point end) {
        this.begin = begin;
        this.end = end;
    }

    public static double calculateLength(Point p1, Point p2) {
        double length = 0;

        length = Math.sqrt(Math.pow(p1.getX() - p2.getX(),2) + Math.pow(p1.getY() - p2.getY(),2));

        return length;
    }

    @Override
    void draw() {
        System.out.println("This is line class");
    }
}
