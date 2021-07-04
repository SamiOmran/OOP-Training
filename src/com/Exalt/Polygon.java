package com.Exalt;

import java.util.ArrayList;

public class Polygon extends ClosedShape {
    protected ArrayList<Point> pointList;

    public void addPoint(Point p) {
        if (pointList.isEmpty()) {
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

}
