package lesson3;

/**
 * Lesson 3 Coding Activity Question 3
 *
 * Write a program that will ask the user to enter an adjective and a name.
 * Print the following sentence, replacing the ______ with the words they entered.
 *
 * My name is _____. I am _____.
 *
 * Sample Run:
 *
 * Hi there. What is your name?
 * Ada
 * What adjective describes you?
 * logical
 * My name is Ada. I am logical.
 */

import java.util.Scanner;

import static java.lang.System.out;

@SuppressWarnings("All")
class Lesson_3_Activity_3 {
    public static void main(String... args) {
        try (Scanner in = new Scanner(System.in)) {

            out.print("Hi there. What is your name? ");
            String name = in.nextLine();

            out.print("What adjective describes you? ");
            String adjective = in.nextLine();

            out.printf("My name is %s. I am %s.%n", name, adjective);
        }
    }
}
