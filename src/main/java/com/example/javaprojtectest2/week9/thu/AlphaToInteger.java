package com.example.javaprojtectest2.week9.thu;

public class AlphaToInteger {
    // 숫자로만 이루언진 value 문자열에 대해서
    // 각 글자를 숫자 데이터로 해석한 뒤
    // - 48 하면 숫자가 된다.
    public int atoi(String value) {
        int result = 0;
        boolean minus = value.charAt(0) == '-';

        for (int i = (minus) ? 1 : 0; i < value.length(); i++) {
            result *= 10;
            result += value.charAt(i) - '0';
        }

        return (minus) ? -result : result;
    }

    public static void main(String[] args) {
        AlphaToInteger atoi = new AlphaToInteger();
        System.out.println(atoi.atoi("12345"));
        System.out.println(atoi.atoi("-4291"));
    }
}
