package lesson6;

import java.util.Scanner;

import static java.lang.System.out;

/**
 * Lesson 6 Coding Activity Question 1
 *
 * double x = (11+4)/2
 *
 * What answer do you get? The answer is imprecise!
 *
 * Write a Java program that precisely calculates the average
 * between two integers that input from the keyboard, and prints
 * the answer to the screen. The average must include the integer
 * and decimal portions of the calculation.
 *
 * Sample Run:
 *
 * Please enter two integers:
 * 4
 * 11
 *
 * The average is: 7.5
 */
@SuppressWarnings("UseOfSystemOutOrSystemErr")
class Lesson_6_Activity_1 {
    public static void main(String... args) {
        try (Scanner in = new Scanner(System.in)) {
            out.print("Please enter two integers: ");
            int i1 = in.nextInt();
            int i2 = in.nextInt();
            double average = (double) (i1 + i2) / 2;
            out.printf("The average is: %s%n", average);
        }
    }
}
