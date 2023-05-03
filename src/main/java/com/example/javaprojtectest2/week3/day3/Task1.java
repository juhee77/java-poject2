package com.example.javaprojtectest2.week3.day3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        Task1 task = new Task1();
        task.usingDoWhile();
        task.sumAllEven(1, 10);
        task.sumAllOdd(1, 10);
        task.findDivisor(12);
        task.sumDivisor(20);
        task.findGcd(60, 80);
        task.findLcm(60, 80);
        task.findPrimeDiv2(25);
        task.findPrimeSqrt(29);
    }

    private void findPrimeDiv2(int num) {
        boolean isPrime = true;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        System.out.println(num + "은 " + (isPrime ? "prime" : "notPrime"));
    }
    private void findPrimeSqrt(int num) {
        boolean isPrime = true;
        for (int i = 2; i*i <= num; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        System.out.println(num + "은 " + (isPrime ? "prime" : "notPrime"));
    }

    private void sumDivisor(int num) {
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) sum += i;
        }
        System.out.println(num + " 의 약수의 합 : " + sum);
    }

    //최소 공배수
    private void findLcm(int a, int b) {
        System.out.println((a * b) / gcd(a, b));
    }

    //최소 공약수
    private void findGcd(int a, int b) {
        System.out.println(gcd(a, b));
    }

    private int gcd(int a, int b) {
        if (a % b == 0) return b;
        return gcd(b, a % b);
    }

    private void findDivisor(int num) {
        System.out.println(num + " 의 약수");
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) System.out.print(i + " ");
        }
        System.out.println();

        List<Integer> divisor = new ArrayList<>();
        System.out.println(num + " 의 약수");
        for (int i = 1; i * i <= num; i++) {
            if (num % i == 0) {
                divisor.add(i);
                if (i * i != num) divisor.add(num / i);
            }
        }
        Collections.sort(divisor);
        System.out.println(divisor);
    }

    private void sumAllEven(int start, int end) {
        int sum = 0;
        while (start <= end) {
            if (start % 2 == 0) {
                sum += start;
            }
            start++;
        }
        System.out.println(sum);
    }

    private void sumAllOdd(int start, int end) {
        int sum = 0;
        while (start <= end) {
            if (start % 2 == 1) {
                sum += start;
            }
            start++;
        }
        System.out.println(sum);
    }

    public void usingDoWhile() {
        int n = 5;
        do {
            System.out.println(n);
        } while (10 < n); //무조건 한번은 돈다
    }
}
