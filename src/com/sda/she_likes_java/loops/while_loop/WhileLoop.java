package com.sda.she_likes_java.loops.while_loop;

public class WhileLoop {
    public static void main(String[] args) {
        System.out.println("I'm here");
        System.out.println("I'm here");
        System.out.println("I'm here");

        boolean condition = false;
        // while loop is going to be executed only when condition is true
        // the body of while loop is going to be repeated as many times as condition is true
        while (condition) {
            System.out.println("Java forever");
        }

        int numberOfTrials = 5;
        while (numberOfTrials > 0) {
            System.out.println("I'm working");
            // explanation
            numberOfTrials = numberOfTrials - 1;
            if (numberOfTrials % 2 == 1) { // printing only odd numbers == 1/ == 0 (even number)
                System.out.println("Current value of numberOfTrials: " + numberOfTrials);
            }
        }

        System.out.println("The END");
    }
}
