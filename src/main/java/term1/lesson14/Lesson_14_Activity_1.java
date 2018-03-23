package term1.lesson14;

import java.util.Scanner;

/**
 * Lesson 14 Coding Activity 1
 * Test if an integer is not between 5 and 76 inclusive.
 *
 * Sample Run 1
 * Enter a number:
 * 7
 * False
 *
 *
 * Sample Run 2
 * Enter a number:
 * 1
 * True
 */
@SuppressWarnings("ALL")
class Lesson_14_Activity_1 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter a number:");
            int number = scanner.nextInt();
            if (5 > number || number > 76) {
                System.out.println("True");
            } else {
                System.out.println("False");
            }
        }
    }
}
