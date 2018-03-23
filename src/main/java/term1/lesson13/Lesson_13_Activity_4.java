package term1.lesson13;

import java.util.Scanner;

/**
 * Lesson 13 Coding Activity 4
 * Input an integer grade from the keyboard and translate it to a letter grade.
 * For example, if a user enters 4, print "A", and if they enter 0 print "F."
 * You can assume that an integer between 0 and 4 will be input.
 */
@SuppressWarnings("ALL")
class Lesson_13_Activity_4 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int grade = scanner.nextInt();
            if (grade == 4) {
                System.out.println("A");
            } else if (grade == 3) {
                System.out.println("B");
            } else if (grade == 2) {
                System.out.println("C");
            } else if (grade == 1) {
                System.out.println("D");
            } else {
                System.out.println("F");
            }
        }
    }
}
