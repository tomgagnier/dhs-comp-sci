package term1.lesson7;

import java.util.Scanner;

import static java.lang.System.out;

/**
 * Lesson 7 Coding Activity Question 1
 *
 * Input a positive three digit integer. Print out the digits one per line.
 *
 * Sample run:
 *
 * Please enter a three digit number:
 * 678
 *
 * Here are the digits:
 * 6
 * 7
 * 8
 */
@SuppressWarnings("ALL")
class Lesson_7_Activity_1 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            out.print("Please enter a three digit number: ");
            int i = in.nextInt();
            out.printf("Here are the digits: %d %d %d%n", i % 1000 / 100, i % 100 / 10, i % 10);
        }
    }
}
