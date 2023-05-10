package com.example.javaprojtectest2.week4.day3.lecture;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FilePrinter implements Printer {
    static int cnt = 0;
   @Override
   public void print(String message) throws IOException {
       BufferedWriter bw = new BufferedWriter(new FileWriter("src/main/java/com/example/javaprojtectest2/week4/day3/makeImgFile/hello"+(cnt++)+".txt"));
       bw.append(message);
       bw.flush();
       bw.close();
   }
}