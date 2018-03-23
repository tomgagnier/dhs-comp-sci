package term1.lesson6;

import java.util.Scanner;

import static java.lang.System.out;

/**
 * Lesson 6 Coding Activity Question 3
 *
 * Input a double and print the first two digits after the decimal point.
 *
 * Sample run:
 *
 * Please input a decimal number:
 * 57.8934
 * Answer: 89
 *
 * Hint - you will need to do a numeric cast and some division and/or subtraction.
 */
@SuppressWarnings("UseOfSystemOutOrSystemErr")
class Lesson_6_Activity_3 {
    public static void main(String... args) {
        try (Scanner in = new Scanner(System.in)) {
            out.print("Please enter a decimal number: ");
            double d = in.nextDouble();
            out.println("Answer: " + firstTwoDigitsAfterDecimalPoint(d));
        }
    }

    private static String firstTwoDigitsAfterDecimalPoint(double d) {
        return String.format("%02d", (int) (100 * (d - (int) d)));
    }
}
