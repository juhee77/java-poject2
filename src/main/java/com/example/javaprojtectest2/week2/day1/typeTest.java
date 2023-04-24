package com.example.javaprojtectest2.week2.day1;

public class typeTest {
    public static void main(String[] args) {
        String sOne = "1";
        float fOne2 = 1;
        int one = 1;

        System.out.printf("%s, %d, %f\n", sOne, one, fOne2); //-> 1, 1, 1.000000

        float fOne = 1;
        float fTwo = 2;
        System.out.printf("%f\n", fOne + fOne / fTwo); //->1.500000

        int iOne = 1;
        int iTwo = 2;
        System.out.printf("%d\n", iOne + iOne / iTwo); // 1

        System.out.printf("%d\n", 9 / 2); //->4
        System.out.printf("%f\n", 9 / 2.0);//4.500000

        float f7 = 1.23e7f; //e는 10 ex-> float f2 = 1.23e10f; 는 한글로 쓰면 몇일까요 12,300,000,000

        float f8 = 1.23e8f;
        float f9 = 1.23e9f;
        float f10 = 1.23e10f;

        System.out.println("f7 = " + f7); //f7 = 1.23E7
        System.out.println("f8 = " + f8); //f8 = 1.23E8
        System.out.println("f9 = " + f9); //f9 = 1.23E9
        System.out.println("f10 = " + f10); // -> double 을 써야 하는 경계 //f10 = 1.23000003E10


        float f1 = 3.141592653589793f;
        System.out.println(f1); // --> 3.1415927
        //f를 붙이면 7자리 초과하면 반올림 된다는 것을 알고 코딩하라는 의도로 보입니다.


        String str1 = "1.5";
        String str2 = "2.5";

        System.out.println(str1 + str2);//1.52.5

        try {
            int iNum1 = Integer.parseInt(str1);
            int iNum2 = Integer.parseInt(str2);
            System.out.println("int 형 변환 " + (iNum1 + iNum2)); //-> 실행 안된다.
        } catch (Exception e) {
            System.out.printf("[ERROR] 의도된 에러 : ");
            System.out.println(e);

        } finally {
            float fNum1 = Float.parseFloat(str1);
            float fNum2 = Float.parseFloat(str2);
            System.out.println("float 형변환 " + (fNum2 + fNum1));
        }

        boolean flag = false;
        System.out.println(flag);
        System.out.println(!flag);

        System.out.println(flag == flag);
        System.out.println(flag != flag);

    }
}
