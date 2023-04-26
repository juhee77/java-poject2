package com.example.javaprojtectest2.week2.day3;

import java.util.Arrays;

public class TenxTen {
    public static void main(String[] args) {
        int[][] array = new int[10][10];
        System.out.println(Arrays.toString(array[0]));
        System.out.println(Arrays.toString(array[1]));
        System.out.println(Arrays.toString(array[2]));
        System.out.println(Arrays.toString(array[3]));
        System.out.println(Arrays.toString(array[4]));
        System.out.println(Arrays.toString(array[5]));
        System.out.println(Arrays.toString(array[6]));
        System.out.println(Arrays.toString(array[7]));
        System.out.println(Arrays.toString(array[8]));
        System.out.println(Arrays.toString(array[9]));

        System.out.println("========================");

        print2DimentionArray(array);

        int[][] arr = new int[3][3];
        arr[0][0] = 1;
        arr[1][0] = 2;
        arr[0][2] = 3;
        print2DimentionArray(arr);



        int[][] map = new int[5][5];
        fillRow(map, 1);
        print2DimentionArray(map);

        int[][] map2 = new int[5][5];
        fillCol(map2, 1);
        print2DimentionArray(map2);

        System.out.printf("a + b = %d\n", 3 + 10);
        System.out.printf("a - b = %d\n", 3 - 10);
        System.out.printf("a * b = %d\n", 3 * 10);
        System.out.printf("a / b = %d\n", 3 / 10);
        System.out.printf("a %% b = %d\n", 3 % 10);
    }

    private static void fillRow(int[][] map, int rowNum) {
        for (int i = 0; i < map[0].length; i++) {
            map[rowNum][i] = 100;
        }
    }
    private static void fillCol(int[][] map, int colNum) {
        for (int i = 0; i < map.length; i++) {
            map[i][colNum] = 100;
        }
    }
    private static void print2DimentionArray(int[][] array) {
        System.out.println("====================");
        for (int[] singleArray : array) {
            System.out.println(Arrays.toString(singleArray));
        }
        System.out.println("====================");

    }

}
