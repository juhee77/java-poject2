package com.example.javaprojtectest2.week5.day4;

public class TimeCheck {
    private long beforeTime;

    public TimeCheck() {
        beforeTime = System.nanoTime();
        System.out.println("beforeTime = " + beforeTime);
    }

    public Long finish(){
        // 코드 실행 후에 시간 받아오기
        //두 시간에 차 계산
        long afterTime = System.nanoTime();
        System.out.println("afterTime = " + afterTime);
        return (afterTime - beforeTime)/1000;
    }
}
