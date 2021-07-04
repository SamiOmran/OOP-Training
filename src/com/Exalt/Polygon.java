package com.Exalt;

import java.util.ArrayList;

public class Polygon extends ClosedShape {
    protected ArrayList<Point> pointList;

    public void addPoint(Point p) {
        if (pointList == null) {
            pointList = new ArrayList<Point>();
        }

        pointList.add(p);
    }

    public Point getPoint(int index) {
        if (index > pointList.size()+1) {
            return null;
        }
        return pointList.get(index - 1);
    }

    public boolean isRectangle() {
        if (pointList.size() == 4) {
            Point point1 = getPoint(1);
            Point point2 = getPoint(2);
            Point point3 = getPoint(3);
            Point point4 = getPoint(4);

            int width1 = (int) Line.calculateLength(point1, point2);
            int width2 = (int) Line.calculateLength(point3, point4);

            int height1 = (int) Line.calculateLength(point1, point4);
            int height2 = (int) Line.calculateLength(point2, point3);

            if (width1 == width2 && height1 == height2) {
                return true;
            } else {
                return false;
            }

        } else {
            return false;
        }
    }

    @Override
    public float getPerimeter() {
        return 0;
    }

    @Override
    public void moveUp(int m) {

    }

    @Override
    public void moveDown(int m) {

    }

    @Override
    public void moveLeft(int m) {

    }

    @Override
    public void moveRight(int m) {

    }

    @Override
    public void moveBy(int x, int y) {

    }

    @Override
    public void draw() {
        System.out.println("Polygon");
    }
}
