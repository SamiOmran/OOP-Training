package com.Exalt;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Polygon square1 = new Square(new Point(3,3), 4);
        Polygon square2 = new Square(new Point(2,5), 4);


        System.out.println(square1.equals(square2));


    //    System.out.println(square1.toString());

        // write your code here
    }
}

