package term1.lesson13;

import java.util.Scanner;

/**
 * Lesson 13 Coding Activity 2
 * Take input of an integer number from the keyboard and print "passing"
 * if it's greater than or equal to 60, and print "failing" otherwise.
 */
@SuppressWarnings("ALL")
class Lesson_13_Activity_2 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int grade = scanner.nextInt();
            if (grade >= 60) {
                System.out.println("passing");
            } else {
                System.out.println("failing");
            }
        }
    }
}
