package com.sda.she_likes_java.homework;

import java.util.Scanner;

public class BouncerVersion4 {
    public static void main(String[] args) {
        System.out.println("Party time???");

        System.out.println("Somebody is coming to the club?");
        System.out.println("Hi, how old are you?");

        Scanner inputReader = new Scanner(System.in);
        String declineMessage = "Sorry, go home :)";
        int age = inputReader.nextInt();
        System.out.println("Let me know your height");
        int height = inputReader.nextInt();
        boolean isAllowedToParty = age >= 18 && height >= 150;

        //
        if (isAllowedToParty) {
            System.out.println("Have a great time at the party!");

        } else {
            System.out.println(declineMessage);
        }
    }
}
