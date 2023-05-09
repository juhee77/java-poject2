package com.example.javaprojtectest2.week4.day2;

public class Parallelogram2 implements PrintOneLine{
    private String spaceChar = "0";
    private int width = 4;

   public Parallelogram2(String spaceChar) {
       this.spaceChar = spaceChar;
   }

    public Parallelogram2(String spaceChar, int width) {
        this.spaceChar = spaceChar;
        this.width = width;
    }

    public void printPyramid(int height) {
       for (int i = 0; i < height; i++) {
           printOneLine(i, height, "*");
       }
       System.out.println();
   }
   public static void main(String[] args) {
       Parallelogram2 pyramid1 = new Parallelogram2(" ");
       pyramid1.printPyramid(4);

       Parallelogram2 pyramid2 = new Parallelogram2(" ",7);
       pyramid2.printPyramid(4);

       Parallelogram2 pyramidSpaceZero = new Parallelogram2("0");
       pyramidSpaceZero.printPyramid(5);
   }

    @Override
    public void printOneLine(int index, int height, String fillStr) {
        System.out.printf("%s%s\n", spaceChar.repeat(height - index - 1), fillStr.repeat(width));

    }
}