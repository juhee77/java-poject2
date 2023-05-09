package com.example.javaprojtectest2.week4.day2;

public abstract class ShapeDrawer {
    public void printShape(int height) {
        for (int i = 0; i < height; i++) {
            System.out.print(makeALine(height, i));
        }
    }

    public void printShapeWillFull(int height) {
        for (int i = 0; i < height; i++) {
            System.out.print(makeFullLine(height, i));
        }
    }

    public abstract String makeALine(int h, int i);

    public abstract String makeFullLine(int h, int i);

}
