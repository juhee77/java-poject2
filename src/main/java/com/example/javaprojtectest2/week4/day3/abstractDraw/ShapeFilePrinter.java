package com.example.javaprojtectest2.week4.day3.abstractDraw;

import com.example.javaprojtectest2.week4.day3.lecture.ConsolePrinter;
import com.example.javaprojtectest2.week4.day3.lecture.FilePrinter;
import com.example.javaprojtectest2.week4.day3.lecture.Printer;

import java.io.IOException;

public class ShapeFilePrinter {
    // 파일에도 저장 하고 싶고
    // 콘솔에도 출력 하고 싶다
    Printer printer;
    Drawer drawer;

    public ShapeFilePrinter(Printer printer, Drawer drawer) {
        this.printer = printer;
        this.drawer = drawer;
    }


    public void drawFile() throws IOException {
        printer.print(drawer.printShape());
    }

    public static void main(String[] args) throws IOException {
        ShapeFilePrinter pyramidPrinter = new ShapeFilePrinter(new FilePrinter(), new PyramidShapeDrawer());
        pyramidPrinter.drawFile();
        ShapeFilePrinter pyramidPrinter2 = new ShapeFilePrinter(new ConsolePrinter(), new PyramidShapeDrawer());
        pyramidPrinter2.drawFile();

        ShapeFilePrinter parallelogramPrinter = new ShapeFilePrinter(new FilePrinter(), new ParallelogramShapeDrawer());
        parallelogramPrinter.drawFile();
    }
}
