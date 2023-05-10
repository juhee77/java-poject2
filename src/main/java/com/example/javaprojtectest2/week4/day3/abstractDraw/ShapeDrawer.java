package com.example.javaprojtectest2.week4.day3.abstractDraw;

public abstract class ShapeDrawer implements Drawer {
    public String spaceChar = "0";
    public String fillStr = "*";
    public int height = 5;

    public ShapeDrawer(String spaceChar, String fillStr, int height) {
        this.spaceChar = spaceChar;
        this.fillStr = fillStr;
        this.height = height;
    }

    public ShapeDrawer(String spaceChar) {
        this.spaceChar = spaceChar;
    }

    public ShapeDrawer() {
    }

    public String printShape() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < height; i++) {
            sb.append(makeALine(i));
        }
        return sb.toString();
    }

    public String printFullShape() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < height; i++) {
            sb.append(makeFullLine(i));
        }
        return sb.toString();
    }

    public abstract String makeALine(int i);

    public abstract String makeFullLine(int i);
}
