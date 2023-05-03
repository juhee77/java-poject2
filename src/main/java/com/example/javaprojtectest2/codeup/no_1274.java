package com.example.javaprojtectest2.codeup;

import java.util.Scanner;

public class no_1274 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (isPrime(num)) {
            System.out.println("prime");
        }else{
            System.out.println("not prime");
        }
    }

    private static boolean isPrime(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
