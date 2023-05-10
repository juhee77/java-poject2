package com.example.javaprojtectest2.week4.day2.abstractDraw;

public class ParallelogramShapeDrawer extends ShapeDrawer {
    private String spaceChar = "0";
    private String fillStr = "*";
    private int width = 4;

    public ParallelogramShapeDrawer(String spaceChar, String fillStr, int width) {
        this.spaceChar = spaceChar;
        this.fillStr = fillStr;
        this.width = width;
    }

    public ParallelogramShapeDrawer(String spaceChar) {
        this.spaceChar = spaceChar;
    }

    public ParallelogramShapeDrawer() {
    }

    @Override
    public String makeALine(int height, int index) {
        return spaceChar.repeat(height - index - 1) + fillStr.repeat(width) + " \n";
    }

    @Override
    public String makeFullLine(int height, int index) {
        return spaceChar.repeat(height - index - 1) + fillStr.repeat(width) + spaceChar.repeat(index) + " \n";
    }
}
