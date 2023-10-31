package org.example;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static Manipulator manipulator;
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);

        System.out.println("!Данные вводятся сразу после двоеточия через пробел, числа с плавающей запятой записываются через точку!");
        System.out.print("Введите длины звеньев манипулятора:");
        String data1 = in.nextLine();
        String[] lengthStr = data1.split(" ");

        System.out.print("Введите углы звеньев манипулятора соответственно введённым длинам:");
        String data2 = in.nextLine();
        String[] angelStr = data2.split(" ");

        System.out.print("Введите начальную точку манипулятора в двумерной системе координат:");
        String data3 = in.nextLine();
        String[] startPointStr = data3.split(" ");

        double[] length = new double[lengthStr.length];
        double[] angel = new double[lengthStr.length];
        double[] startPoint = new double[2];

/*      // Тестовые данные без ввода с консоли
        length = new double[]{12, 1.2, 5};
        angel = new double[]{10, 30, 5};
        startPoint = new double[]{0, 0};*/

        try {
            for (int i = 0; i < lengthStr.length; i++) {
                length[i] = Double.parseDouble(lengthStr[i]);
                angel[i] = Double.parseDouble(angelStr[i]);
            }

            for (int i = 0; i < 2; i++)
                startPoint[i] = Double.parseDouble(startPointStr[i]);
        } catch (Exception e) {
            System.out.println("Размерность входных данных не соответствует требованиям\n" + e);
            return;
        }

        manipulator = new Manipulator(length, angel, startPoint);
        System.out.println("Конечная точка имеет следующие координаты [x, y]:" + Arrays.toString(manipulator.getEndCoordinate()));
    }
}