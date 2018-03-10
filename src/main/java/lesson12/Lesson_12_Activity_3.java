package lesson12;

import java.util.Scanner;

/**
 * Lesson 12 Coding Activity 3
 * Test if a number input from the keyboard is a valid
 * test score (between 0 and 100 inclusive).
 *
 * Sample Run 1
 * Enter a test score:
 * 78.5
 * Valid
 *
 *
 * Sample Run 2
 * Enter a test score:
 * 179
 * Not Valid
 */
@SuppressWarnings("ALL")
class Lesson_12_Activity_3 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            double number = scanner.nextDouble();
            System.out.println(number < 0 || number > 100
                                       ? "Not Valid" : "Valid");
        }
    }
}
