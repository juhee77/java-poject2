package com.example.javaprojtectest2.week2.day2;

import java.util.Arrays;

public class StringSub {
    public static void main(String[] args) {
        String str = "Hello";
        System.out.println(str.substring(0, 1));
        System.out.println(str.substring(0, 2));
        System.out.println(str.substring(0, 3));
        System.out.println(str.substring(0, 4));
        System.out.println(str.substring(1, 3));


        String str1 = "hello1";
        String str2 = "hello2";
        System.out.println(str.hashCode());
        System.out.println("GOLD-->" + str1.hashCode());
        System.out.println("G-->" + str2.hashCode());
        System.out.println("str1 identifyHashCode = " + System.identityHashCode(str1));
        System.out.println("str2 identifyHashCode = " + System.identityHashCode(str2));

        System.out.println("isSame = " + (str1.substring(0, 1) == str2));


// str1 의 G와 str2 의 G 의 해시코드
        str2 = "h";
        str1 = new String("h");
        System.out.println("str1 의 해시코드 = " + str1.hashCode());
        System.out.println("str2 의 해시코드 = " + str2.hashCode());
        System.out.println("str1 의 주소값 = " + System.identityHashCode(str1));
        System.out.println("str2 의 주소값 = " + System.identityHashCode(str2));
        System.out.println(str1 == str2); //flase
        //위의 str1,str2의 해시 값은 동일하다 ->  메소드는 내부적으로 해당 문자열을 이용하여 해시 값을 계산하기 때문에


        String str3 = "10 3 19 28 7 488";
        System.out.println(Arrays.toString(str3.split(" ")));


        int[] arr = new int[3];
        for (int i = 0; i < 3; i++) {
            arr[i] = i;
        }
        System.out.println(Arrays.toString(arr));

        float[] fArr = new float[3];
        String[] sArr = new String[3];
        System.out.println("Arrays.toString(fArr) = " + Arrays.toString(fArr));
        System.out.println("Arrays.toString(sArr) = " + Arrays.toString(sArr));
    }
}
