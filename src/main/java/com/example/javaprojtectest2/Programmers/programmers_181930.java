package com.example.javaprojtectest2.Programmers;

public class programmers_181930 {
    public int solution(int a, int b, int c) {

        int ans = a + b + c;
        if (a != b && a != c && b != c) { //모두 다름
            return ans;
        }

        ans *= (a * a) + (b * b) + (c * c);
        if (a == b && b == c) { //3개의 수 모두 같음
            return (int) ((ans)* (Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3)));
        } else {
            return ans;
        }
    }

    public static void main(String[] args) {
        System.out.println(new programmers_181930().solution(2, 2, 2));
    }
}
