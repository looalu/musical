package com.example.musical;

import config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MusicalApplication {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(AppConfig.class);

        User user1 = (User) context.getBean("user1");
        User user2 = (User) context.getBean("user2");
        System.out.println("User1: " + user1.getUsername());
        System.out.println("User2: " + user2.getUsername());
        System.out.println("User2's email: " + user2.getEmail());



    }
}
