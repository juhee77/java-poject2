package com.example.javaprojtectest2.javainput_scanner;

import java.util.Scanner;

public class ScannerEx {
    int a,b;

    public void inputNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("두개의 숫자를 입력하세요. 입력하고 엔터 입력하고 엔터");
        System.out.print("첫번째 숫자:");
        a = sc.nextInt();
        System.out.println("첫번째 숫자는 " + a + "입니다.");
        System.out.print("두번째 숫자:");
        b = sc.nextInt();
        System.out.println("두번째 숫자는 " + b + "입니다.");
    }
    public void addNumber(){
        System.out.println("두 숫자의 합은 " + (a + b) +" 입니다.");
    }
}
