package lesson5;

import java.util.Scanner;

import static java.lang.System.out;

/**
 * Lesson 5 Coding Activity Question 1
 *
 * Input two double values and print the difference between them.
 * (The difference can be found by subtracting the second value from the first).
 */
@SuppressWarnings("All")
class Lesson_5_Activity_1 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            out.print("Enter two doubles: ");
            double d1 = in.nextDouble();
            double d2 = in.nextDouble();
            out.println(d1 - d2);
        }
    }
}
