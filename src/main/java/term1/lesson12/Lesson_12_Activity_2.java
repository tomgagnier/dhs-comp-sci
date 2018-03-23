package term1.lesson12;

import java.util.Scanner;

/**
 * Lesson 12 Coding Activity 2
 * Input two decimal numbers and print the largest.
 * If the numbers are equal, print one of them.
 *
 * Sample Run 1
 * Please enter two numbers:
 * 45.7
 * 45.1
 *
 * Largest is: 45.7
 *
 * Sample Run 2
 * Please enter two numbers:
 * 14
 * 14
 *
 * Largest is: 14.0
 */
@SuppressWarnings("ALL")
class Lesson_12_Activity_2 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Please enter two numbers: ");
            double d1 = scanner.nextDouble();
            double d2 = scanner.nextDouble();

            if (d1 >= d2) {
                System.out.println("Largest is " + d1);
            } else {
                System.out.println("Largest is " + d2);
            }
        }
    }
}
