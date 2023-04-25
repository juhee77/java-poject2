package com.example.javaprojtectest2.codeup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;

public class no_1019 {
    public static void main(String[] args) throws IOException, ParseException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), ".");
//        .split("//."); 만약 스플릿을 사용하면 괄호 안에 정규표현식이 들어가야하므로 //으로 입력해야한다.
        // 정규표현식에서 .은 모든 문자를 뜻하므로 ~~
        int year = Integer.parseInt(st.nextToken());
        int month = Integer.parseInt(st.nextToken());
        int day = Integer.parseInt(st.nextToken());
        System.out.printf("%04d.%02d.%02d", year, month, day);

        SimpleDateFormat formatter = new SimpleDateFormat("yyyy.M.d");
        Date date = formatter.parse(br.readLine());
        SimpleDateFormat format = new SimpleDateFormat("yyyy.MM.dd");
        System.out.println(format.format(date));
    }
}
