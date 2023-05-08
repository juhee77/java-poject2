package com.example.javaprojtectest2.week4.day1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

class UserFactoryTest {
    @Test
    @DisplayName("UserFactoryTest")
    public void test(){
        //given
        UserFactory userFactory = new UserFactory();

        //when
        User user = userFactory.getAdultUser();

        //then
        System.out.println(user.age);
        Assertions.assertEquals(user.age,34);
    }
}