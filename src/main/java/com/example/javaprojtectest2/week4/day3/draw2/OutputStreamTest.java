package com.example.javaprojtectest2.week4.day3.draw2;

import com.example.javaprojtectest2.week4.day2.abstractDraw.ParallelogramShapeDrawer;
import com.example.javaprojtectest2.week4.day2.abstractDraw.PyramidShapeDrawer;

import java.io.IOException;


class OutputStreamTest {
    public static void main(String[] args) throws IOException {
        ParallelogramShapeDrawer parallelogram = new ParallelogramShapeDrawer();
        parallelogram.printShapeToFile(5);

        ParallelogramShapeDrawer parallelogram2 = new ParallelogramShapeDrawer("\uD83E\uDD0D","\uD83D\uDC9C",7);
        parallelogram2.printShapeWithFullToFile(5);

        ParallelogramShapeDrawer parallelogram3 = new ParallelogramShapeDrawer("@");
        parallelogram3.printShapeToFile(5);

        System.out.println("=========================");
        PyramidShapeDrawer pyramidShapeDrawer = new PyramidShapeDrawer();
        pyramidShapeDrawer.printShapeToFile(5);

        PyramidShapeDrawer pyramidShapeDrawer2 = new PyramidShapeDrawer("\uD83E\uDD0D","\uD83D\uDC9C");
        pyramidShapeDrawer2.printShapeWithFullToFile(5);

        PyramidShapeDrawer pyramidShapeDrawer3 = new PyramidShapeDrawer("@");
        pyramidShapeDrawer3.printShapeToFile(5);

    }
}