package com.Exalt;

public class Triangle extends Polygon {
    public Triangle(Point p1, Point p2, Point p3) {
        addPoint(p1);
        addPoint(p2);
        addPoint(p3);
    }

    public void update(Point p1, Point p2, Point p3) {
        pointList.clear();
        addPoint(p1);
        addPoint(p2);
        addPoint(p3);
    }
}
