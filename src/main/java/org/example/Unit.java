package org.example;

import lombok.Getter;

public class Unit {

    private final double x0, y0, f0;
    private final double l, f;
    @Getter
    private double x, y, vx, vy, ax, ay;

    public Unit(double x0, double y0, double f0, double l, double f) {
        this.x0 = x0;
        this.y0 = y0;
        this.f0 = Math.toRadians(f0);
        this.f = Math.toRadians(f);
        this.l = l;
        coordinateOperation();
        coordinateChangeRate();
        coordinateAcceleration();
    }

    private void coordinateOperation() {
        x = l * Math.cos(f0+ f) + x0;
        y = l * Math.sin(f0+ f) + y0;
    }

    private void coordinateChangeRate() {
       vx = -1 * l * Math.sin(f0 + f);
       vy = Math.cos(f0 + f);
    }

    private void coordinateAcceleration() {
        ax = -1 * l * Math.cos(f0 + f);
        ay = -1 * Math.sin(f0 + f);
    }

}
