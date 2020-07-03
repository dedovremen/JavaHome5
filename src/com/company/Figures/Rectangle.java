package com.company.Figures;

public class Rectangle {
    protected int length;
    protected int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int calcFigSquare() {
        int figSquare = length * width;
        return figSquare;
    }

    public int calcFigPerimeter() {
        int figPerimeter = 2 * (length + width);
        return figPerimeter;
    }
}
