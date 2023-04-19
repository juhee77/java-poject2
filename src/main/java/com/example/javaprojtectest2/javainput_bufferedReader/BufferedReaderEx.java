package com.example.javaprojtectest2.javainput_bufferedReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderEx {
    public void readALine() throws IOException {
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);

        System.out.println("input1 = " + br.readLine());
        System.out.println("input2 = " + br.readLine());
    }
}
