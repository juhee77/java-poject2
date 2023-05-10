package com.example.javaprojtectest2.week4.day2.abstractDraw;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.UUID;

public abstract class ShapeDrawer {
    public String spaceChar = "0";
    public String fillStr = "*";

    public ShapeDrawer(String spaceChar, String fillStr) {
        this.spaceChar = spaceChar;
        this.fillStr = fillStr;
    }

    public ShapeDrawer(String spaceChar) {
        this.spaceChar = spaceChar;
    }

    public ShapeDrawer() {
    }

    public void printShape(int height) {
        for (int i = 0; i < height; i++) {
            System.out.print(makeALine(height, i));
        }
    }

    public void printShapeWithFull(int height) {
        for (int i = 0; i < height; i++) {
            System.out.print(makeFullLine(height, i));
        }
    }

    public abstract String makeALine(int h, int i);

    public abstract String makeFullLine(int h, int i);


    public BufferedOutputStream printShapeBw(int height, BufferedOutputStream bw) throws IOException {
        for (int i = 0; i < height; i++) {
            bw.write(makeALine(height, i).getBytes());
        }
        return bw;
    }

    public BufferedOutputStream printShapeFullBw(int height, BufferedOutputStream bw) throws IOException {
        for (int i = 0; i < height; i++) {
            bw.write(makeFullLine(height, i).getBytes());
        }
        return bw;
    }

    public void printShapeToFile(int height) throws IOException {
        String uid = UUID.randomUUID().toString();
        BufferedOutputStream bw = new BufferedOutputStream(new FileOutputStream("src/main/java/com/example/javaprojtectest2/week4/day3/makeImgFile/EACH" + uid));
        convertToFile(printShapeBw(height, bw));
    }

    public void printShapeWithFullToFile(int height) throws IOException {
        String uid = UUID.randomUUID().toString();
        BufferedOutputStream bw = new BufferedOutputStream(new FileOutputStream("src/main/java/com/example/javaprojtectest2/week4/day3/makeImgFile/FULL" + uid));
        convertToFile(printShapeFullBw(height, bw));
    }

    public void convertToFile(BufferedOutputStream br) throws IOException {
        try {
            System.out.println("make a new FILE");
        } catch (Exception e) {
            e.getStackTrace();
            // TODO: handle exception
        } finally {
            br.close();
        }
    }

}
