package com.example.javaprojtectest2.week4.day4.lecture;

class Student {
   private String code;
   private int testId; // String -> int 로 바뀌었는데 나중 결과보고 수정...
   private String name;

    // 멤버변수에 직접 접근하는 것을 막기 위해 생성자를 만든다
    public Student(String code, int testId, String name) {
        this.code = code;
        this.testId = testId;
        this.name = name;
    }

    // Getter

    public String getCode() {
        return code;
    }

    public int getTestId() {
        return testId;
    }

    public String getName() {
        return name;
    }
}

// 이하 main method