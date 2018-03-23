package term1.lesson11;

import java.util.Scanner;

/**
 * Lesson 11 Coding Activity 3
 * Get two integers from the keyboard and test if they are equal.
 * If they are, print "YES" (without the quotes).
 */
@SuppressWarnings("ALL")
class Lesson_11_Activity_3 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            if (scanner.nextInt() == scanner.nextInt()) {
                System.out.println("YES");
            }
        }
    }
}
