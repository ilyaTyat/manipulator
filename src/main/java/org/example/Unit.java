package org.example;

import lombok.Getter;

public class Unit {

    double x0, y0, f0;
    double l, f;
    @Getter
    double x, y;

    public Unit(double x0, double y0, double f0, double l, double f) {
        this.x0 = x0;
        this.y0 = y0;
        this.f0 = Math.toRadians(f0);
        this.f = Math.toRadians(f);
        this.l = l;
        coordinateOperation();
    }

    private void coordinateOperation() {
        x = l * Math.cos(f0+ f) + x0;
        y = l * Math.sin(f0+ f) + y0;
    }

}
