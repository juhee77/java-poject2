package com.example.javaprojtectest2.week4.day2;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    public static void main(String[] args) {
        Human human = new Human("test", 20);
        System.out.println(human);
        Student student = new Student("test2", 15, "heo", "heoo");
        System.out.println(student);

        Human human1 = student;
        System.out.println(human1);

        human1.callOut(); //업캐스팅 해도 학생의 것으로 출력된다.
        human.callOut();
        student.callOut();
    }


}