package com.example.javaprojtectest2.week3.day2;

public class Task1 {
    public static void main(String[] args) {
        Task1 task1 = new Task1();
        task1.nFact(5);
        task1.whileEx(10);
        task1.eachSum(6874);
    }

    private void eachSum(int num) {
        int sum = 0;
        while (0<num) {
            sum += num % 10;
            num /= 10;
        }
        System.out.println("sum = " + sum);
    }

    private void whileEx(int range) {
        while (range>0) {
            System.out.printf(range + " ");
            range--;
        }
        System.out.println();
    }

    public void nFact(int n) {
        long sum = 1;
        for (; 0 < n; n--) {
            sum *= n;
        }
        System.out.println(sum);
    }
}
