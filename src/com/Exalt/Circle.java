package com.Exalt;

public class Circle extends Ellipse {

    public Circle(Point p1, int radius) {
        super(p1, p1, radius, radius);
    }

    public void update(Point cen, int radius) {
        super.update(cen, cen, radius, radius);
    }

    public Point getCenter() {
        return focus1;
    }

    public float getRadius() {
        return major;
    }

    @Override
    public float getPerimeter() {
        final float PI = (float) 3.14;
        float perimeter = 0;

        perimeter = 2 * PI * getRadius();

        return perimeter;
    }

    @Override
    public void draw() {
        System.out.println("This is circle class");
    }
}
