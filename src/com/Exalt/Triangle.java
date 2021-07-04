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

    @Override
    public String toString() {
        Point point1 = this.getPoint(1);
        Point point2 = this.getPoint(2);
        Point point3 = this.getPoint(3);

        return "The Triangle vertices are: (" +
                point1.getX() + ", " + point1.getY() + "), (" +
                point2.getX()  + ", " + point2.getY()  + "), (" +
                point3.getX()  + ", " + point3.getY()  + "), (" ;
    }

    @Override
    public boolean equals(Object obj) {
        Triangle secondTriangle = (Triangle) obj;
        Point secondTrianglePoint1 = secondTriangle.getPoint(1);
        Point secondTrianglePoint2 = secondTriangle.getPoint(2);
        Point secondTrianglePoint3 = secondTriangle.getPoint(3);

        Point firstTrianglePoint1 = this.getPoint(1);
        Point firstTrianglePoint2 = this.getPoint(2);
        Point firstTrianglePoint3 = this.getPoint(3);

        int secondTriangleSide1 = (int) Line.calculateLength(secondTrianglePoint1, secondTrianglePoint2);
        int secondTriangleSide2 = (int) Line.calculateLength(secondTrianglePoint1, secondTrianglePoint3);
        int secondTriangleSide3 = (int) Line.calculateLength(secondTrianglePoint3, secondTrianglePoint2);

        int firstTriangleSide1 = (int) Line.calculateLength(firstTrianglePoint1, firstTrianglePoint2);
        int firstTriangleSide2 = (int) Line.calculateLength(firstTrianglePoint1, firstTrianglePoint3);
        int firstTriangleSide3 = (int) Line.calculateLength(firstTrianglePoint3, firstTrianglePoint2);

        if (    secondTriangleSide1 == firstTriangleSide1 &&
                secondTriangleSide2 == firstTriangleSide2 &&
                secondTriangleSide3 == firstTriangleSide3) {
            return true;
        } else {
            return false;
        }

    }
}
