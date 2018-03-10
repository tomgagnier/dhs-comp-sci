package lesson10;

import java.util.Scanner;

/**
 * Lesson 10 Coding Activity Question 1
 *
 * The following calculation will give roundoff error:
 * double x = 1.473;
 * System.out.println(2 - x);
 *
 * Write the code to correct it. You can assume no more than 3 decimal places will be used.
 *
 * Sample run:
 *
 * Please enter two decimal values:
 * 2
 * 1.473
 *
 * The difference is: 0.527
 *
 * Use this starter file as your template.
 */
@SuppressWarnings("ALL")
class Lesson_10_Activity_1 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println(subtract(2.000, 1.473, 1000.0));
        }
    }

    private static double subtract(double v1, double v2, double factor) {
        return (round(v1, factor) - round(v2, factor)) / factor;
    }

    private static int round(double v1, double factor) {
        return (int) Math.round(v1 * factor);
    }
}
