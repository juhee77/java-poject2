package com.example.javaprojtectest2.codeup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class no_1027 {
    public static void main(String[] args) throws IOException, ParseException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //date format type
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy.MM.dd");
        Date date = formatter.parse(br.readLine());
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
        System.out.println(format.format(date));
    }
}
