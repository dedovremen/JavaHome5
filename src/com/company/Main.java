package com.company;

import com.company.Figures.Circle;
import com.company.Figures.Square;

public class Main {

    public static void main(String[] args) {
        Square square1 = new Square(2);
        Circle circle1 = new Circle(3);

        System.out.println(square1.calcFigSquare());
        System.out.println(circle1.calcElSquare());
    }
}
