package com.example.javaprojtectest2.week4.day1;

import com.example.javaprojtectest2.week4.day1.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


class UserTest {
    @Test
    @DisplayName("유저 테스트")
    public void userTest() {
        User user1 = new User();
        user1.name = "김미미";
        user1.age = 14;
        User user2 = new User();
        user2.name = "김나나";
        user2.age = 37;

        Assertions.assertFalse(user1.isAdult());
        //System.out.printf("%s는 성인입니까? %s\n", user1.name, user1.isAdult());
        Assertions.assertTrue(user2.isAdult());
        //System.out.printf("%s는 성인입니까? %s\n", user2.name, user2.isAdult());
    }
}