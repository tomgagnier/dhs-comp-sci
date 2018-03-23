package term1.lesson7;

import java.util.Scanner;

import static java.lang.System.out;

/**
 * Lesson 7 Coding Activity Question 2
 *
 * Change the last problem so that it also prints the sum of the digits.
 * Use the format shown below.
 *
 * Make sure your output is printed in the same order as the sample run.
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
 *
 * 6 + 7 + 8 = 21
 */
@SuppressWarnings("ALL")
class Lesson_7_Activity_2 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            out.print("Please enter a three digit number: ");
            int i = in.nextInt();
            int hundreds = i % 1000 / 100;
            int tens = i % 100 / 10;
            int ones = i % 10;
            out.printf("Here are the digits: %d %d %d%n", hundreds, tens, ones);
            out.printf("%d + %d + %d = %d%n", hundreds, tens, ones, hundreds + tens + ones);
        }
    }
}
