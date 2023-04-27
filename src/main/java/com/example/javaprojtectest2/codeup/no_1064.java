

package com.example.javaprojtectest2.codeup;

import java.io.IOException;
import java.util.Scanner;

public class no_1064 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int tempMin = num3 > num2 ? num2 : num3;
        System.out.println((num1 > tempMin) ? tempMin : num1);
    }
}
