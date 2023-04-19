package com.example.javaprojtectest2.javainput;

import java.io.IOException;

public class JavaInputTest {
    public static void main(String[] args) throws IOException {
        JavaInput javaInput = new JavaInput();
        javaInput.readTwoChars();

        System.out.println("-----------");
        javaInput.readAChars();
    }
}
