package org.example;

import java.lang.Math;
import java.lang.Math;
public class OperateCoordinate {

    double x, y;

    double l1, l2, l3var, h, l4;

    double f1, f2, f3;

    public OperateCoordinate(double l1, double l2, double h,
                             double l4, double f1, double f2, double f3) {
        this.f1=Math.toRadians(f1);
        this.f2=Math.toRadians(f2);
        this.f3=Math.toRadians(f3);
        this.l1=l1;
        this.l2=l2;
       // this.l3var = l3var;
        this.l4=l4;
        this.h=h;
    }

    public double[] getEndCoordinate(double l3) {
        l3var=l3;

        this.x = l1*Math.cos(f1) + l2*Math.cos(f1-f2) + l3var*Math.cos(f1-f2-f3) + h*Math.cos(f1-f2-f3);
        this.y = l1*Math.sin(f1) + l2*Math.sin(f1-f2) + l3var*Math.sin(f1-f2-f3) - h*Math.sin(f1-f2-f3);

        return new double[] {this.x, this.y};
    }
}
