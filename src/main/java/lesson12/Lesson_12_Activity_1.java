package lesson12;

import java.util.Scanner;

/**
 * Lesson 12 Coding Activity 1
 * Write a program to input three integers.
 * Test if the average is greater than or equal to 89.5.
 * If so, print out the phrase "ABOVE AVERAGE" (without the quotes).
 */
@SuppressWarnings("ALL")
class Lesson_12_Activity_1 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int i1 = scanner.nextInt();
            int i2 = scanner.nextInt();
            int i3 = scanner.nextInt();
            double average = (i1 + i2 + i3) / 3;
            if (average >= 89.5) {
                System.out.println("ABOVE AVERAGE");
            }
        }
    }
}
