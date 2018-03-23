package term1.lesson6;

import java.util.Scanner;

import static java.lang.System.out;

/**
 * Lesson 6 Coding Activity Question 2
 *
 * Input a double value and print only the integer part.
 *
 * Sample run:
 *
 * Please input a decimal number:
 * 57.8934
 * Answer: 57
 */
@SuppressWarnings("UseOfSystemOutOrSystemErr")
class Lesson_6_Activity_2 {
    public static void main(String... args) {
        try (Scanner in = new Scanner(System.in)) {
            out.print("Please input a decimal number: ");
            double d = in.nextDouble();
            out.printf("Answer: %d%n", (int) d);
        }
    }
}
