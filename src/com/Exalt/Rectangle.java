package com.Exalt;

public class Rectangle extends Polygon {
    public Rectangle(Point upperCorner, int w, int h) {
        addPoint(upperCorner);
        /**
         * calculate other points
         * to add to arrayList
         */
        Point upperRight = new Point(upperCorner.getX() + w, upperCorner.getY());
        Point lowerRight = new Point(upperCorner.getX() + w, upperCorner.getY() - h);
        Point lowerLeft = new Point(upperCorner.getX() , upperCorner.getY() - h);

        addPoint(upperRight);
        addPoint(lowerRight);
        addPoint(lowerLeft);
    }

    public void update(Point upperCorner, int w, int h) {
        pointList.clear();
        Point upperRight = new Point(upperCorner.getX() + w, upperCorner.getY());
        Point lowerRight = new Point(upperCorner.getX() + w, upperCorner.getY() - h);
        Point lowerLeft = new Point(upperCorner.getX() , upperCorner.getY() - h);

        addPoint(upperCorner);
        addPoint(upperRight);
        addPoint(lowerRight);
        addPoint(lowerLeft);
    }

    public int getWidth() {
        Point upperCorner = this.getPoint(1);
        Point lowerLeft = this.getPoint(4);
        int width = 0;

        width = (int) Line.calculateLength(upperCorner, lowerLeft);

        return width;
    }

    public int getHeight() {
        Point upperCorner = this.getPoint(1);
        Point upperRight = this.getPoint(2);
        int height = 0;

        height = (int) Line.calculateLength(upperCorner, upperRight);
        return height;
    }

    @Override
    public String toString() {
        Point upperCorner = this.getPoint(1);
        Point upperRight = this.getPoint(2);
        Point lowerRight = this.getPoint(3);
        Point lowerLeft = this.getPoint(4);

        return "The rectangle vertices are: (" +
                upperCorner.getX() + ", " + upperCorner.getY() + "), (" +
                upperRight.getX()  + ", " + upperRight.getY()  + "), (" +
                lowerRight.getX()  + ", " + lowerRight.getY()  + "), (" +
                lowerLeft.getX()   + ", " + lowerLeft.getY()   + "), "  +
                ", height = "      + this.getHeight()+", width =  " + this.getWidth();
    }

    @Override
    public boolean equals(Object obj) {
        Rectangle secondRectangle = (Rectangle)obj;
        int secondRectangleHeight = secondRectangle.getHeight();
        int secondRectangleWidth = secondRectangle.getWidth();

        int firstRectangleHeight = this.getHeight();
        int firstRectangleWidth = this.getWidth();

        if (firstRectangleHeight == secondRectangleHeight && firstRectangleWidth == secondRectangleWidth) {
            return true;
        }
        return false;
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
    public float getPerimeter() {
        int height = this.getHeight();
        int width = this.getWidth();
        int perimeter = 0;

        perimeter = 2 * (width + height);

        return perimeter;
    }
}
