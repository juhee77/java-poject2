package com.example.javaprojtectest2.Programmers;

public class programmers_12928 {
    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                if (i * i != n) answer += n / i; //1 5 25 (5와 같은)
                answer += i;
            }
        }
        return answer;
    }
}
