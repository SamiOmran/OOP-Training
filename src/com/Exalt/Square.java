package com.Exalt;

public class Square extends Rectangle {
    public Square(Point upperCorner, int side) {
        super(upperCorner, side, side);
    }

    public void update(Point upperCorner, int side) {

    }

    public int getSide() {

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
}
