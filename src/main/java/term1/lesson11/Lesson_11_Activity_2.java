package term1.lesson11;

import java.util.Scanner;

/**
 * Lesson 11 Coding Activity 2
 * Test if a decimal value input from the keyboard is equal to 48.729.
 * If it is, print "YES" (without the quotes).
 */
@SuppressWarnings("ALL")
class Lesson_11_Activity_2 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            if (scanner.nextDouble() == 48.729) {
                System.out.println("YES");
            }
        }
    }
}
