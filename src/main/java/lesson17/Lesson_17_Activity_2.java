package lesson17;

import java.util.Scanner;

/**
 * Lesson 17 Coding Activity 2
 * Ask the user for two numbers. Print only the even numbers between them,
 * you should also print the two numbers if they are even.
 *
 * Sample Run 1:
 *
 * Enter two numbers:
 * 3
 * 11
 *
 * 4 6 8 10
 *
 * Sample Run 2:
 *
 * Enter two numbers:
 * 10
 * 44
 *
 * 10 12 14 16 18 20 22 24 26 28 30 32 34 36 38 40 42 44
 */
@SuppressWarnings("ALL")
class Lesson_17_Activity_2 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter two numbers:");
            int i1 = scanner.nextInt();
            int i2 = scanner.nextInt();
            for (int i = i1; i <= i2; ++i) {
                if (i % 2 == 0) {
                    System.out.println("Please enter the ");
                }
            }
        }
    }
}
