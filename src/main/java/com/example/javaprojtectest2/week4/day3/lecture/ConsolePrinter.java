package com.example.javaprojtectest2.week4.day3.lecture;

public class ConsolePrinter implements Printer {
   @Override
   public void print(String message) {
       System.out.println(message);
   }
}