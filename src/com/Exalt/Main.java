package com.Exalt;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Point center = new Point(2,5);
        int radius = 6;
        Ellipse circle = new Circle(center, radius);

        System.out.println(circle.getPerimeter());

        circle.draw();
        // write your code here
    }
}

