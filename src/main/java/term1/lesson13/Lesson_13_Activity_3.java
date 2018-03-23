package term1.lesson13;

import java.util.Scanner;

/**
 * Lesson 13 Coding Activity 3
 * Input two integers and print the largest. If they are equal print "EQUAL".
 * You should be able to do this with only one if statement but you may use multiple else statements.
 */
@SuppressWarnings("ALL")
class Lesson_13_Activity_3 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int i1 = scanner.nextInt();
            int i2 = scanner.nextInt();
            if (i1 > i2) {
                System.out.println(i1);
            } else if (i1 < i2) {
                System.out.println(i2);
            } else {
                System.out.println("EQUAL");
            }
        }
    }
}
