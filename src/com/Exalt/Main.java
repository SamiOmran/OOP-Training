package com.Exalt;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Polygon square1 = new Square(new Point(3,3), 4);
        Polygon rec = new Rectangle(new Point(0,0), 3, 4);

        System.out.println(square1.toString());
        System.out.println(rec.toString());

        System.out.println(rec.equals(square1));

        // write your code here
    }
}

