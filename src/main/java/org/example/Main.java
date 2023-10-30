package org.example;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static Manipulator manipulator;
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number (example: 0; 5,2 etc.): ");

        double l3var = in.nextDouble();
        double[] length;
        double[] angel;
        double[] startPoint;
        manipulator = new Manipulator(length, startPoint, angel);
        System.out.println(Arrays.toString(manipulator.getEndCoordinate()));
    }
}