package term1.lesson22;

import java.util.Scanner;

/**
 * Lesson 22 Coding Activity 2
 * Write the code to take a String and print it diagonally.
 *
 * Sample run:
 *
 * Enter a string:
 * bought
 * b
 * o
 * u
 * g
 * h
 * t
 * Use a tab character for every four spaces in the sample.
 *
 * Hint: You may need more than one loop.
 */
@SuppressWarnings("ALL")
class Lesson_22_Activity_2 {
    public static void main(String... args) {
        Scanner scanner;
        //        scanner = new Scanner(System.in);
        scanner = new Scanner("hello, world!\n");
        String word = scanner.nextLine();

        for (int i = 0; i < word.length(); ++i) {
            for (int tabCount = 0; tabCount < i; ++tabCount) {
                System.out.print("\t");
            }
            System.out.println(word.charAt(i));
        }
    }
}
