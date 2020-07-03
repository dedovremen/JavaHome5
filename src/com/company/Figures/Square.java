package com.company.Figures;

public class Square extends Rectangle {
    protected int length;

    public Square(int length) {
        super(length, length);
        this.length = length;
    }
}
