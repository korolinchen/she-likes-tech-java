package com.sda.she_likes_java.loops.while_loop;

public class WhileGrow {
    public static void main(String[] args) {
    int ageOfTheKid = 1;

    while (ageOfTheKid <= 18) {
        System.out.println("Mommy can I go to disco? I am: " +ageOfTheKid + " years old");
        System.out.println("No");

        // ageOfTheKid = ageOfTheKid + 1; // same written bellow but shorter
        ageOfTheKid++; // if  I use both lines the kid grows by years each on each step - every iteration
        // iteration - the repetition of a process, a new version of a piece of computer hardware or software.
    }
        System.out.println("Go to party");
    }
}
