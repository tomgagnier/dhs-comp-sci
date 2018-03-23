package term1.lesson4;

import java.util.Scanner;

import static java.lang.System.out;

/**
 * Lesson 4 Coding Activity Question 1
 *
 * Input two doubles and print them backwards on the screen.
 *
 * So if the user enters:
 *
 * 1.3 6.8
 *
 * It should output:
 *
 * 6.8 1.3
 *
 * Notice there is exactly one space between the numbers.
 */

@SuppressWarnings("UseOfSystemOutOrSystemErr")
class Lesson_4_Activity_1 {
    public static void main(String... args) {
        try (Scanner in = new Scanner(System.in)) {

            out.print("Input two doubles: ");
            double d1 = in.nextDouble();
            double d2 = in.nextDouble();
            out.printf("%s %s%n", d2, d1);
        }
    }
}
