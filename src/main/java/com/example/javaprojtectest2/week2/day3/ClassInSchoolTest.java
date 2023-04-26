package com.example.javaprojtectest2.week2.day3;

public class ClassInSchoolTest {
    public static void main(String[] args) {
        ClassInSchool classInSchool = new ClassInSchool();
        classInSchool.no = 1;
        classInSchool.teacher.age = 30;
        classInSchool.teacher.name = "gamy";
        classInSchool.teacher.phoneNumber = "010-2444-2345";

        Student[] students = new Student[2];
        // 배열의 초기화
        students[0] = new Student();
        students[0].name = "김경록";
        students[0].phoneNumber = "010-1234-5678";
        students[0].age = 37;
        students[1] = new Student();
        students[1].name = "김지유";
        students[1].phoneNumber = "010-2468-1357";
        students[1].age = 2;
        classInSchool.students = students;
    }
}
