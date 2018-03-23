package term1.lesson11;

import java.util.Scanner;

/**
 * Lesson 11 Coding Activity 4
 * Test if an integer input from the keyboard is odd or even.
 *
 * Sample Run 1:
 * Enter a Number:
 * 78
 * Even
 *
 * Sample Run 2:
 * Enter a Number:
 * 17
 * Odd
 */
@SuppressWarnings("ALL")
class Lesson_11_Activity_4 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a Number: ");
            if (scanner.nextInt() % 2 == 0) {
                System.out.println("Even");
            } else {
                System.out.println("Odd");
            }
        }
    }
}
