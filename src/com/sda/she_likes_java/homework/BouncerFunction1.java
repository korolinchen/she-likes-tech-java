package com.sda.she_likes_java.homework;

import java.util.Scanner;

public class BouncerFunction1 {
    public static void main(String[] args) {
        System.out.println("\nBoys: Do you want to party tonight?");
        System.out.println("\nGirls: Yes, let's go to the club");
        System.out.println("\nBoys: We will try with the young bouncer and girls can try with the older bouncer");
        System.out.println("\nYoung bouncer: So pals, you wanna party tonight?");
        // calling function for young bouncer
        youngBouncer();
        // it went yes or no
        System.out.println("\n...meanwhile gals are going to the old bouncer (he looks friendly)");
        oldBouncer();
    }

    public static void youngBouncer() {

        int age;
        int height;
        boolean isAbleToSingWell;

        Scanner inputReader = new Scanner(System.in);
        String declineMessage = "\nNot tonight my friend";

        System.out.println("\nYoung bouncer: What is your age?");
        age = inputReader.nextInt();

        System.out.println("\nYoung bouncer: How tall are you (cm)?");
        height = inputReader.nextInt();

        System.out.println("\nYoung bouncer: Can you sing well, answer true or false my friend");
        isAbleToSingWell = inputReader.nextBoolean();

        boolean canEnterTheClub = age >= 18 && height >= 100 && isAbleToSingWell == true;
        if (canEnterTheClub) {
            System.out.println("Young bouncer: Pals you may enter the club, no smoking inside");
        } else {
            System.out.println(declineMessage);
        }
    }

    public static void oldBouncer() {
        // do I have to re-introduce variables in this function?
        int age;
        int height;
        boolean isAbleToSingWell;
        // is this Scanner ok for the second time to use?
        Scanner inputReader = new Scanner(System.in);
        String declineMessageTwo = "\nOld bouncer: Sorry, we are full"; // new decline message by oldBouncer

        System.out.println("\nOld bouncer: What is your age gals?");
        age = inputReader.nextInt();

        System.out.println("\nOld bouncer: How tall are you (cm)?");
        height = inputReader.nextInt();

        System.out.println("\nOld bouncer: Can you sing well?");
        isAbleToSingWell = inputReader.nextBoolean();

        boolean canEnterTheClubEasy = age >= 18 || height >= 100 || isAbleToSingWell == true;
        if (canEnterTheClubEasy) {
            System.out.println("Old bouncer: Welcome to the club and take care gals");
        } else {
            System.out.println(declineMessageTwo);
        }
    }
}