package com.sda.she_likes_java.homework;

import java.util.Scanner;

public class FourCalc {
    // psvm
    public static void main(String[] args) {
        System.out.println("FruitCalc");
        // naming variables 1 to 4
        int oranges;
        int bananas;
        int kiwis;
        int pineapples;
        System.out.println("How many oranges do you have?");
        // TODO: explain object reaction
        Scanner inputReader = new Scanner(System.in);
        oranges = inputReader.nextInt();
        System.out.println("Number of oranges you told us about = " + oranges);
        System.out.println("...");
        // the \n means put new line
        System.out.println("\nHow many bananas do you have?");
        bananas = inputReader.nextInt();
        System.out.println("Number of bananas you told us about = " + bananas);
        System.out.println("...");
        System.out.println("\nHow many kiwis do you have?");
        kiwis = inputReader.nextInt();
        System.out.println("Number of kiwis you told us about = " + kiwis);
        System.out.println("...");
        System.out.println("\nHow many pineapples do you have?");
        pineapples = inputReader.nextInt();
        System.out.println("Number of pineapples you told us about = " + pineapples);
        System.out.println("...");
        // adding fruits in one plate
        int sum = oranges + bananas + kiwis + pineapples;
        System.out.println("\nThe total number of fruits on your plate now = " + sum);
    }
}
