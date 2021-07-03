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
    void draw() {
        System.out.println("This is ellipse class");
    }
}
