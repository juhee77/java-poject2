

package com.example.javaprojtectest2.codeup;

import java.io.IOException;
import java.util.Scanner;

public class no_1067 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(isMinus(num) ? "minus" : "plus");
        System.out.println(isEven(num) ? "even" : "odd");

    }

    private static boolean isEven(int num) {
        return num % 2 == 0;
    }
    private static boolean isMinus(int num) {
        return num < 0;
    }
}
