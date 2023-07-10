package com.example.javaprojtectest2.boj.greedy.oilBank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public long solution() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        long cityCount = Integer.parseInt(reader.readLine());
        StringTokenizer cityDistToken = new StringTokenizer(reader.readLine());

        long[] cityDistance = new long[(int) cityCount - 1];
        for (int i = 0; i < cityCount - 1; i++) {
            cityDistance[i] = Integer.parseInt(cityDistToken.nextToken());
        }
        StringTokenizer cityFuelToken = new StringTokenizer(reader.readLine());
        long[] cityFuel = new long[(int) cityCount];
        for (int i = 0; i < cityCount; i++) {
            cityFuel[i] = Integer.parseInt(cityFuelToken.nextToken());
        }


        long minFuel = cityFuel[0];
        long all = 0;
        for (int i = 0; i < cityCount - 1; i++) {
            minFuel = Math.min(minFuel, cityFuel[i]);
            all += minFuel * cityDistance[i];
        }
        return all;
    }

    public static void main(String[] args) throws IOException {
        System.out.println(new Main().solution());
    }
}