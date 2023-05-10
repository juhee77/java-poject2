package com.example.javaprojtectest2.week4.day3.lecture;

import java.io.IOException;

public class HelloPrinter{
   // 파일에도 저장 하고 싶고
   // 콘솔에도 출력 하고 싶다
   Printer printer;

    public HelloPrinter(Printer printer) {
        this.printer = printer;
    }


    public void repeatMessage(int n, String message) throws IOException {
        for (int i = 0; i < n; i++) {
            printer.print(message);
        }
    }

    public static void main(String[] args) throws IOException {
        HelloPrinter hp = new HelloPrinter(new ConsolePrinter()); // 인스턴스 생성
        hp.repeatMessage(5, "Hello"); // 호출

        HelloPrinter hp2 = new HelloPrinter(new FilePrinter()); // 인스턴스 생성
        hp2.repeatMessage(5, "Hello"); // 호출
    }
}