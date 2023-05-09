package com.example.javaprojtectest2.week4.day2;

public class Student extends Human {
    String school;
    String teacherName;

    public Student(String name, int age, String school, String teacherName) {
        super(name, age);
        this.school = school;
        this.teacherName = teacherName;
    }

    @Override
    public void callOut(){
        System.out.println("Student.callOut");
    }

    @Override
    public String toString() {
        return "Student{" + super.toString() +
                "school='" + school + '\'' +
                ", teacherName='" + teacherName + '\'' +
                '}';
    }
}
