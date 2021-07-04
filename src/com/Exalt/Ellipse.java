package com.Exalt;

import com.sun.deploy.pings.Pings;

import java.nio.channels.Pipe;

public class Ellipse extends ClosedShape {
    protected Point focus1;
    protected Point focus2;
    protected int major;
    protected int minor;

    public Ellipse(Point focus1, Point focus2, int major, int minor) {
        this.focus1 = focus1;
        this.focus2 = focus2;
        this.major = major;
        this.minor = minor;
    }

    public Point getFocus1() {
        return focus1;
    }

    public Point getFocus2() {
        return focus2;
    }

    public int getMajor() {
        return major;
    }

    public int getMinor() {
        return minor;
    }

    public void update(Point f1, Point f2, int major, int minor) {
        this.focus1 = f1;
        this.focus2 = f2;
        this.major = major;
        this.minor = minor;
    }

    @Override
    public float getPerimeter() {
        float perimeter = 0;
        final float PI = (float) 3.14;

        perimeter = (float) ((float) 2 * PI * Math.sqrt( (major*major + minor*minor)/2 ));

        return perimeter;
    }

    @Override
    public void draw() {
        System.out.println("This is ellipse class");
    }

    @Override
    public void moveUp(int m) {
        this.focus1.setY(this.focus1.getY() + m);
        this.focus2.setY(this.focus2.getY() + m);
    }

    @Override
    public void moveDown(int m) {
        this.focus1.setY(this.focus1.getY() - m);
        this.focus2.setY(this.focus2.getY() - m);
    }

    @Override
    public void moveLeft(int m) {
        this.focus1.setX(this.focus1.getX() - m);
        this.focus2.setX(this.focus2.getX() - m);
    }

    @Override
    public void moveRight(int m) {
        this.focus1.setX(this.focus1.getX() + m);
        this.focus2.setX(this.focus2.getX() + m);
    }

    @Override
    public void moveBy(int x, int y) {
        this.focus1.setX(this.focus1.getX() + x);
        this.focus2.setX(this.focus2.getX() + x);

        this.focus1.setY(this.focus1.getY() + y);
        this.focus2.setY(this.focus2.getY() + y);
    }
}

