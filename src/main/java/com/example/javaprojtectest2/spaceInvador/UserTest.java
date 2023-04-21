package com.example.javaprojtectest2.spaceInvador;

public class UserTest {
    public static void main(String[] args) {
        User user1 = new User("user1", 14, "010-1234-5678");
        User user2 = new User("user2", 2, "010-1134-5678");
        User user3 = new User("user3", 22, "010-1434-5678");
        User user4 = new User("user4", 20, "010-1634-5678");

        System.out.println();
        System.out.println("user1 = " + user1);
        System.out.println("user2 = " + user2);
        System.out.println("user3 = " + user3);
        System.out.println("user4 = " + user4);

        System.out.println();
        System.out.println("user1.isAdult() = " + user1.isAdult());
        System.out.println("user2.isAdult() = " + user2.isAdult());
        System.out.println("user3.isAdult() = " + user3.isAdult());
        System.out.println("user4.isAdult() = " + user4.isAdult());
    }
}
