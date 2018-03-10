package lesson13;

import java.util.Scanner;

/**
 * Lesson 13 Coding Activity 1
 * Take input of an integer number from the keyboard
 * and print "Positive" if it's positive or zero, and print "Negative" otherwise.
 */
@SuppressWarnings("ALL")
class Lesson_13_Activity_1 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int i = scanner.nextInt();
            if (i >= 0) {
                System.out.println("Positive");
            } else {
                System.out.println("Negative");
            }
        }
    }
}
