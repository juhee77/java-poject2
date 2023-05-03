package com.example.javaprojtectest2.Programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class programmers_120852 {
    private List<Integer> primes = new ArrayList<>();

    public int[] solution(int n) {
        List<Integer> answer = new ArrayList<>();
        init(n);
        while (1 < n) {
            for (int nowPrime : primes) {
                if (n % nowPrime == 0) {
                    while (n % nowPrime == 0) {
                        n /= nowPrime;
                    }
                    answer.add(nowPrime);
                    break;
                }
            }
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }

    private void init(int n) {
        boolean[] isNotPrime = new boolean[n + 1];
        isNotPrime[0] = isNotPrime[1] = true;
        for (int i = 2; i < isNotPrime.length; i++) {
            if (!isNotPrime[i]) {
                primes.add(i);
                for (int j = i * 2; j < isNotPrime.length; j += i) {
                    isNotPrime[j] = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new programmers_120852().solution(420)));
    }
}
