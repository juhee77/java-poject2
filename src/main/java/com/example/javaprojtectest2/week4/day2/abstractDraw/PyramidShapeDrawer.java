package com.example.javaprojtectest2.week4.day2.abstractDraw;

public class PyramidShapeDrawer extends ShapeDrawer {
    public PyramidShapeDrawer(String spaceChar, String fillStr) {
        super(spaceChar,fillStr);
    }

    public PyramidShapeDrawer(String spaceChar) {
        super(spaceChar);
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
