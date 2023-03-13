package com.sda.she_likes_java.loops.while_loop;

import java.util.Scanner;

public class ManyTimesWhileLoop {
    public static void main(String[] args) {
        System.out.println("How many times to repeat loop?");

        Scanner inputReader = new Scanner(System.in);

        int numberOfTimes = inputReader.nextInt();

        while (numberOfTimes > 0) {
            System.out.println("repeating...");
            System.out.println("current trial: " + numberOfTimes);
            numberOfTimes--; // each time will minus 1 same as: numberOfTimes = numberOfTimes -1;
        }
    }
}
