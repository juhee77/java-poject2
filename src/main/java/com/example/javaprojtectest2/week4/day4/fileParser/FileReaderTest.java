package com.example.javaprojtectest2.week4.day4.fileParser;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {
    public FileReaderTest(String s) {
    }

    public String[] read(){
        return new String[5];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("/Users/bagjuhui/Desktop/hospital.csv"));
        System.out.println(br.readLine());

    }
}
