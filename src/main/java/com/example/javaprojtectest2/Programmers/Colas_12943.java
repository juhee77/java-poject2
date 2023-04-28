package com.example.javaprojtectest2.Programmers;

public class Colas_12943 {
    public int solution2(int num) {

        int cnt = 0;
        while (cnt < 500 && num > 1) {
            if (num % 2 == 0) num /= 2;
            else num = num * 3 + 1;

            cnt++;
        }
        return (num == 1) ? cnt : -1;
    }

    public int solution(int num) {
        int cnt = 0;
        while (1 <= num && cnt < 500) {
            if (num == 1) return cnt;

            cnt++;
            if (num % 2 == 0) num /= 2;
            else num = num * 3 + 1;
        }
        return -1;
    }

    public static void main(String[] args) {

        System.out.println(new Colas_12943().solution(6));
        System.out.println(new Colas_12943().solution(16));
        System.out.println(new Colas_12943().solution(626331));

    }
}
