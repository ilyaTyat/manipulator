package org.example;

import java.lang.Math;

public class Manipulator {

    double[] startPoint;
    double[] angel;
    double[] length;
    int countUnit;

    public Manipulator(double[] length, double[] startPoint, double[] angel) {
        this.length = length;
        this.countUnit = length.length;
        this.startPoint = startPoint;
        this.angel = angel;
    }

    public double[] getEndCoordinate() {
        double x = startPoint[0];
        double y = startPoint[1];
        double f = 0;

        for (int i = 0; i < countUnit; i++) {
            Unit unit = new Unit(x, y, f, length[i], angel[i]);
            x = unit.getX();
            y = unit.getY();
            f += angel[i];
        }
        return new double[]{x, y};
    }
}
