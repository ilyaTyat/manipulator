package org.example;

import lombok.Getter;

import java.lang.Math;

public class Manipulator {

    double[] startPoint;
    double[] angel;
    double[] length;
    int countUnit;

    @Getter
    double[] accelerationCoordinate, velocityCoordinate, endPoint;

    public Manipulator(double[] length, double[] angel, double[] startPoint) {
        this.length = length;
        this.countUnit = length.length;
        this.startPoint = startPoint;
        this.angel = angel;
        operateParameters();
    }

    private void operateParameters() {
        double x = startPoint[0];
        double y = startPoint[1];
        double vx = 0, vy = 0;
        double ax = 0, ay = 0;
        double f = 0;

        for (int i = 0; i < countUnit; i++) {
            Unit unit = new Unit(x, y, f, length[i], angel[i]);
            x = unit.getX();
            y = unit.getY();
            ax += unit.getAx();
            ay += unit.getAy();
            vx += unit.getVx();
            vy += unit.getVy();
            f += angel[i];
        }
        accelerationCoordinate = new double[]{ax, ay};
        velocityCoordinate = new double[]{vx, vy};
        endPoint = new double[]{x, y};
    }
}
