package com.Exalt;

public class Square extends Rectangle {
    public Square(Point upperCorner, int side) {
        super(upperCorner, side, side);
    }

    public void update(Point upperCorner, int side) {
        super.update(upperCorner, side, side);
    }

    public int getSide() {
        return super.getHeight();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        Point upperCorner = getPoint(1);
        Point upperRight = getPoint(2);
        Point lowerRight = getPoint(3);
        Point lowerLeft = getPoint(4);

        return "The Square vertices are: (" +
                upperCorner.getX() + ", " + upperCorner.getY() + "), (" +
                upperRight.getX()  + ", " + upperRight.getY()  + "), (" +
                lowerRight.getX()  + ", " + lowerRight.getY()  + "), (" +
                lowerLeft.getX()   + ", " + lowerLeft.getY()   + "),"   +
                " length of it's sides "  + this.getSide();
    }

    @Override
    public void moveUp(int m) {
        super.moveUp(m);
    }

    @Override
    public void moveDown(int m) {
        super.moveDown(m);
    }

    @Override
    public void moveLeft(int m) {
        super.moveLeft(m);
    }

    @Override
    public void moveRight(int m) {
        super.moveRight(m);
    }

    @Override
    public void moveBy(int x, int y) {
        super.moveBy(x, y);
    }

    @Override
    public float getPerimeter() {
        return super.getPerimeter();
    }
}
