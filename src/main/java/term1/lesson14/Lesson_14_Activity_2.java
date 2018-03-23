package term1.lesson14;

import java.util.Scanner;

/**
 * Lesson 14 Coding Activity 2
 * Write a program to input two integers and print
 * "Both are positive or zero." to the screen, if both are positive or zero.
 * Print "One or both are negative." otherwise.
 */
@SuppressWarnings("ALL")
class Lesson_14_Activity_2 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter a number:");
            int i1 = scanner.nextInt();
            int i2 = scanner.nextInt();
            if (i1 < 0 || i2 < 0) {
                System.out.println("One or both are negative.");
            } else {
                System.out.println("Both are positive");
            }
        }
    }
}
