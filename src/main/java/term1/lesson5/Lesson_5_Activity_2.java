package term1.lesson5;

import java.util.Scanner;

import static java.lang.System.out;

/**
 * Lesson 5 Coding Activity Question 2
 *
 * Input four integer values and print the sum of all four values.
 */
@SuppressWarnings("All")
class Lesson_5_Activity_2 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            out.print("Enter four integers: ");
            out.println(in.nextInt() + in.nextInt() + in.nextInt() + in.nextInt());
        }
    }
}
