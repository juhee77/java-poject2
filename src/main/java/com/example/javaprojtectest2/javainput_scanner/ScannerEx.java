package com.example.javaprojtectest2.javainput_scanner;

import java.util.Scanner;

public class ScannerEx {
    int a,b;

    public void inputNumber() {
        Scanner sc = new Scanner(System.in);
        this.a = sc.nextInt();
        this.b = sc.nextInt();
    }
    public void addNumber(){
        System.out.println(a + b);
    }
}
