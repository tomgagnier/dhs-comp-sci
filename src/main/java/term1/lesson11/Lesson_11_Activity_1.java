package term1.lesson11;

import java.util.Scanner;

/**
 * Lesson 11 Coding Activity 1
 * Test if an integer input from the keyboard is equal to the integer 176.
 * If it is, print "YES" (without the quotes).
 */
@SuppressWarnings("MethodCanBeVariableArityMethod")
class Lesson_11_Activity_1 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            if (scanner.nextInt() == 176) {
                System.out.println("YES");
            }
        }
    }
}
