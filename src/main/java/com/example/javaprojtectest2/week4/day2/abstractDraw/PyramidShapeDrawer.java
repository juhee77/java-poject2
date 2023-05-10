package com.example.javaprojtectest2.week4.day2.abstractDraw;

public class PyramidShapeDrawer extends ShapeDrawer {
    private String spaceChar = "0";
    private String fillStr = "*";

    public PyramidShapeDrawer(String spaceChar, String fillStr) {
        this.spaceChar = spaceChar;
        this.fillStr = fillStr;
    }

    public PyramidShapeDrawer(String spaceChar) {
        this.spaceChar = spaceChar;
    }

    public PyramidShapeDrawer() {
    }

    @Override
    public String makeALine(int height, int index) {
        return spaceChar.repeat(height - index - 1) + fillStr.repeat(2 * index + 1) +" \n";
    }

    @Override
    public String makeFullLine(int height, int index) {
        return spaceChar.repeat(height - index - 1) + fillStr.repeat(2 * index + 1) +spaceChar.repeat(height - index - 1)+" \n";
    }
}
