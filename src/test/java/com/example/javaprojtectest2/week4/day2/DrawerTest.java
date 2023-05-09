package com.example.javaprojtectest2.week4.day2;

class DrawerTest {

    public static void main(String[] args) {
        ParallelogramShapeDrawer parallelogram = new ParallelogramShapeDrawer();
        parallelogram.printShape(5);

        ParallelogramShapeDrawer parallelogram2 = new ParallelogramShapeDrawer("\uD83E\uDD0D","\uD83D\uDC9C",7);
        parallelogram2.printShapeWillFull(5);

        ParallelogramShapeDrawer parallelogram3 = new ParallelogramShapeDrawer("@");
        parallelogram3.printShape(5);

        System.out.println("=========================");
        PyramidShapeDrawer pyramidShapeDrawer = new PyramidShapeDrawer();
        pyramidShapeDrawer.printShape(5);

        PyramidShapeDrawer pyramidShapeDrawer2 = new PyramidShapeDrawer("\uD83E\uDD0D","\uD83D\uDC9C");
        pyramidShapeDrawer2.printShapeWillFull(5);

        PyramidShapeDrawer pyramidShapeDrawer3 = new PyramidShapeDrawer("@");
        pyramidShapeDrawer3.printShape(5);

    }
}