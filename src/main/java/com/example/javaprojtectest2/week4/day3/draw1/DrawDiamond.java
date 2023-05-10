package com.example.javaprojtectest2.week4.day3.draw1;

public class DrawDiamond {
    public static String getRepeatedSymbol(String symbol, int n) {
        return symbol.repeat(n);
    }

    public static void main(String[] args) {
        int h = 7;
        int pivot = h / 2;
        for (int i = 0; i < h; i++) {
            if (i <= pivot) {
                // 피라미드
                // 초항이 3 등차가 -2
                System.out.printf("%s%s\n", getRepeatedSymbol("0", -2 + h - i - 2), getRepeatedSymbol("*", 2 * i + 1));
            } else {
                // 역피라미드
                System.out.printf("%s%s\n", getRepeatedSymbol("0", i - pivot), getRepeatedSymbol("*", 2 * (h - i) - 1));
            }
        }
    }

    public static String makeALine(int h, int i) {
        int pivot = h / 2;
        if(i <= pivot){
            return String.format("%s%s\n", getRepeatedSymbol("0", pivot - i), getRepeatedSymbol("*", 2 * i + 1));
        } else {
            return String.format("%s%s\n", getRepeatedSymbol("0", i - pivot), getRepeatedSymbol("*", 2 * (h - i) - 1));
        }
    }

}
