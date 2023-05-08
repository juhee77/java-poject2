package com.example.javaprojtectest2.Programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

public class programmers_120852 {
    private final List<Integer> primes = new ArrayList<>();

    public int[] solution(int n) {
        LinkedHashSet<Integer> primeNumbers = new LinkedHashSet<>();

        int i = 2;
        while (n != 0 && i <= n) {
            if (n % i == 0) {
                //소수인지 확인하는 로직이 안들어가도 된다.(앞에서 미리 다 나눈다)
                primeNumbers.add(i);
                n /= i;
            } else {
                i++;
            }
        }
        return primeNumbers.stream().mapToInt(Integer::intValue).toArray();
    }


    public int[] solution2(int n) {
        List<Integer> answer = new ArrayList<>();
        initPrime(n);
        for (int nowPrime : primes) { //굳이 소수를 판별할 이유가 없다.
            if (n % nowPrime == 0) {
                while (n % nowPrime == 0) {
                    n /= nowPrime;
                }
                answer.add(nowPrime);
            }
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }

    private void initPrime(int n) {
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
        System.out.println(Arrays.toString(new programmers_120852().solution(1420)));
    }
}
