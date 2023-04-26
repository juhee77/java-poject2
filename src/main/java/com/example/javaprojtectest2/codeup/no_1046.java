

package com.example.javaprojtectest2.codeup;

import java.io.IOException;
import java.util.Scanner;

public class no_1046 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        long sum = (long) num1 + num2 + num3;
        System.out.println(sum);
        System.out.printf("%.1f", (float) sum / 3);
    }
}
