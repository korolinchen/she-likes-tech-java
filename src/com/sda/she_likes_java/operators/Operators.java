package com.sda.she_likes_java.operators;

public class Operators {
    public static void main(String[] args) {
        System.out.println("Let's try some operators");
        System.out.println("Logical operators");

        boolean firstValue;
        boolean secondValue;
        boolean evaluationResult;

        System.out.println("&& operator");
        firstValue = true;
        secondValue = true;
        evaluationResult = firstValue && secondValue;
        System.out.println("firstValue && secondValue");

        firstValue = true;
        secondValue = false;
        evaluationResult = firstValue && secondValue;
        System.out.println("true && false: " + evaluationResult);

        firstValue = false;
        secondValue = true;
        evaluationResult = firstValue && secondValue;
        System.out.println("false && true: " + evaluationResult);

        firstValue = false;
        secondValue = false;
        evaluationResult = firstValue && secondValue;
        System.out.println("false && false: " + evaluationResult);

        System.out.println();
        System.out.println("Let's test negation operator");
        firstValue = false;
        secondValue = !firstValue;
        System.out.println("!false is: " + secondValue);

        firstValue = true;
        secondValue = !firstValue;
        System.out.println("!true is: " + secondValue);

        // negation of isPolite equals naughty
        boolean ispolite = false;
        if (!ispolite) {
            System.out.println("You're not polite, or just naughty");
        }

        // naughty here is true and it is the same as negated isPolite
        boolean naughty = true;
        if (naughty) {
            System.out.println("You're not polite, or just naughty");
        }

        System.out.println();
        System.out.println("Let's see or || operator");
        boolean hasGun = true;
        boolean hasGranade = true;
        boolean isTerrorist = hasGun || hasGranade;
        System.out.println("true || true is: " + isTerrorist);

        hasGun = true;
        hasGranade = false;
        isTerrorist = hasGun || hasGranade;
        System.out.println("true || false is: " + isTerrorist);

        hasGun = false;
        hasGranade = true;
        isTerrorist = hasGun || hasGranade;
        System.out.println("false || true is: " + isTerrorist);

        hasGun = false;
        hasGranade = false;
        isTerrorist = hasGun || hasGranade;
        System.out.println("false || false is: " + isTerrorist);

    }
}

