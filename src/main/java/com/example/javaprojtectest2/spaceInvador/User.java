package com.example.javaprojtectest2.spaceInvador;

public class User {
    String name;
    int age;
    String phoneNumber;

    public User(String name, int age, String phoneNumber) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

    boolean isAdult() {
        return age >= 20;
    }
}
