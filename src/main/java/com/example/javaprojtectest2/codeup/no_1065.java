

package com.example.javaprojtectest2.codeup;

import java.io.IOException;
import java.util.Scanner;

public class no_1065 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            int num = sc.nextInt();
            if (num % 2 == 0) {
                System.out.println(num);
            }
        }
    }
}
