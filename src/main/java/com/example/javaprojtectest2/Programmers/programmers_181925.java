package com.example.javaprojtectest2.Programmers;

public class programmers_181925 {
    public String solution(int[] numLog) {
        String answer = "";

        int before = numLog[0];
        for (int i = 1; i < numLog.length; i++) {
            int now = numLog[i];
            switch (now - before) {
                case 1:
                    answer += 'w';
                    break;
                case -1:
                    answer += 's';
                    break;
                case 10:
                    answer += 'd';
                    break;
                case -10:
                    answer += 'a';
                    break;

            }
            before = now;
        }

        return answer;
    }

    public static void main(String[] args) {

    }
}
