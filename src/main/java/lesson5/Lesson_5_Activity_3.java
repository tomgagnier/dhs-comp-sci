package lesson5;

import java.util.Scanner;

import static java.lang.Math.PI;
import static java.lang.System.out;

/**
 * Lesson 5 Coding Activity Question 3
 *
 * Input the radius of a circle and print the circumference and area.
 * The answer should be a decimal value.
 *
 * Remember the formula for circumference is 2 * pi * r and the formula
 * for area is pi * r * r. You can use 3.14 for the value of pi in this activity.
 *
 * Sample Run:
 *
 * Enter a radius:
 * 4
 * Circumference: 25.12
 * Area: 50.24
 */

@SuppressWarnings("UseOfSystemOutOrSystemErr")
class Lesson_5_Activity_3 {
    public static void main(String... args) {
        try (Scanner in = new Scanner(System.in)) {
            out.print("Enter a radius: ");
            double radius = in.nextDouble();
            out.printf("Circumference: %.2f%n", 2 * PI * radius);
            out.printf("Area: %.2f%n", PI * radius * radius);
        }
    }
}
