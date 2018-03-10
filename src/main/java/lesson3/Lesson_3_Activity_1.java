package lesson3;

import java.util.Scanner;

/**
 * Lesson 3 Coding Activity Question 1
 *
 * Write the code to ask the user to enter their name and print the following message:
 *
 * Hi ______, nice to see you.
 *
 * Remember, you'll need to use the method println and Scanner class method nextLine.
 */

@SuppressWarnings("UseOfSystemOutOrSystemErr")
class Lesson_3_Activity_1 {
    public static void main(String... args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("What is your name? ");
            String name = in.nextLine();
            System.out.printf("Hi %s, nice to see you.%n", name);
        }
    }
}
