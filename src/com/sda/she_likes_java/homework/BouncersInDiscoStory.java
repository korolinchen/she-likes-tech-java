package com.sda.she_likes_java.homework;

import java.util.Scanner;

public class BouncersInDiscoStory {
    public static void main(String[] args) {
        System.out.println("Party night is on");
        System.out.println("Try entering the club");

        int age;
        double height;
        boolean hasGoodVoice;

        Scanner inputReader = new Scanner(System.in);
        String declineMessage = "Sorry, not tonight :|";

        System.out.println("Trial with the first bouncer");

        System.out.println("\nHi, how old are you?");

        int age = inputReader.nextInt();

        System.out.println("\n...and");

        System.out.println("How tall are you in cm?");

        double height = inputReader.nextInt();




        hasGoodVoice = inputReader.hasNextBoolean();
        boolean isAllowedToParty = age >= 18 && height >= 150;
        System.out.println("Let me know your height");
        // , and . depending on the region when entering double values as input

        if (!isAllowedToParty) {
            System.out.println(declineMessage);
        } else {
            System.out.println("Enjoy");
        }

    }
}
