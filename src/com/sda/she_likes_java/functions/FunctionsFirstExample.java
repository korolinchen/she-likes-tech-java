package com.sda.she_likes_java.functions;

public class FunctionsFirstExample {
    public static void main(String[] args) {
        // I can call it many times - the code
        // function features, has name (just before brackets like "main"),
        // has parameters (inside brackets, like " String [] args),
        // has return value - type name before the function, like "void"
        // void means no return
        // we call function by its name
        printMyName(); // main is calling what is inside the command, calling a dish from the kitchen.

        System.out.println();
        System.out.println("after call...");
        System.out.println();

        printMyName();
    }

    public static void printMyName() {

        int numberOfTimes = 10;
        while (numberOfTimes > 0) {
            System.out.println("Hi, I'm Karolinchen");
            numberOfTimes--;
        }  // this is my function, a piece of a source code.
    }
}
