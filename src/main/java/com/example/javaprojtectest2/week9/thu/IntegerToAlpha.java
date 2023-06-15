  package com.example.javaprojtectest2.week9.thu;

public class IntegerToAlpha {
    public String itoa(int value) {
        StringBuilder answerBuilder = new StringBuilder();
        boolean minusFlag = false;
        if (value < 0) {
            minusFlag = true;
            value = Math.abs(value);
        }

        while (0 < value) {
            answerBuilder.append(value % 10);
            value /= 10;
        }

        if (minusFlag) answerBuilder.append('-');
        return answerBuilder.reverse().toString();
    }

    public static void main(String[] args) {
        IntegerToAlpha itoa = new IntegerToAlpha();
        // 123456789
        System.out.println(itoa.itoa(1234) + itoa.itoa(56789));
    }
}