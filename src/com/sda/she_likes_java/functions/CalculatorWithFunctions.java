package com.sda.she_likes_java.functions;

public class CalculatorWithFunctions {
    public static void main(String[] args) {
        System.out.println("calculation begins");
        sum(10, 15);
        System.out.println();
        sum(1,2);
        System.out.println("\nmerci beaucoup");
    }
    public static int sum(int first, int second) {
        System.out.println("How good is calculator?");
        int result = first + second;
        System.out.println("the sum of the function called numbers: " + result);
        return result; // keyword
    }
}
