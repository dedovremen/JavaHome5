package com.company.Figures;

public class Ellipse {
    protected int littleSemiaxis;
    protected int bigSemiaxis;

    public Ellipse(int littleSemiaxis, int bigSemiaxis) {
        this.littleSemiaxis = littleSemiaxis;
        this.bigSemiaxis = bigSemiaxis;
    }

    public double calcElSquare () {
        double elSquare = Math.PI * littleSemiaxis * bigSemiaxis;
        return elSquare;
    }

    public double calcElPerimeter () {
        double elPerimeter = 4 * (((Math.PI)*littleSemiaxis*bigSemiaxis) + (Math.abs(littleSemiaxis-bigSemiaxis))) / (littleSemiaxis + bigSemiaxis);
        return elPerimeter;
    }
}
