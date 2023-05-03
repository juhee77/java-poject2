package com.example.javaprojtectest2.codeup;

import java.util.Scanner;

public class no_1071 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] allNum = sc.nextLine().split(" ");
        for (String now : allNum) {
            if (now.equals("0")) {
                break;
            }
            System.out.println(now);
        }

        int now = sc.nextInt();
        do{
            System.out.println(now);
            now = sc.nextInt(); //틀림 만약 처음이 0이라면?의 문제
        }while(now!=0);
    }
}
