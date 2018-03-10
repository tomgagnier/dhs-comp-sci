package lesson5;

import java.util.Scanner;

import static java.lang.System.out;

/**
 * Lesson 5 Coding Activity Question 4
 *
 * Ask the user to enter the price of an item and tell them
 * how much money they would get back from $20. It's okay to
 * return a negative number. Also, Don't forget to include the dollar sign.
 *
 * Sample Run:
 *
 * Enter a price:
 * 3.50
 * Change from $20: $16.5
 */

@SuppressWarnings("UseOfSystemOutOrSystemErr")
class Lesson_5_Activity_4 {
    public static void main(String... args) {
        try (Scanner in = new Scanner(System.in)) {
            out.print("Enter a price: ");
            double price = in.nextDouble();
            out.printf("Change from $20: %.2f$%n", 20.0 - price);
        }
    }
}
