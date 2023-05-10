package com.example.javaprojtectest2.week4.day2.abstractDraw;

public class ParallelogramShapeDrawer extends ShapeDrawer {
    private int width = 4;

    public ParallelogramShapeDrawer(String spaceChar, String fillStr, int width) {
        super(spaceChar, fillStr);
        this.width = width;
    }

    public ParallelogramShapeDrawer(String spaceChar) {
        super(spaceChar);
    }

    public ParallelogramShapeDrawer(int width) {
        this.width = width;
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
