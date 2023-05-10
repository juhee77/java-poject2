package com.example.javaprojtectest2.week4.day3.draw1;

public class RightTriangleDraw {
   public static void main(String[] args) {
       RightTriangleDraw rightTriangleDraw = new RightTriangleDraw();
       rightTriangleDraw.printShape();
   }

    private void printShape() {
        int h = 5;
        for (int i = 1; i <= h; i++) {
            System.out.printf("%s%s\n", "0".repeat(h - i), "*".repeat(2 * i - 1));
        }
    }
}
