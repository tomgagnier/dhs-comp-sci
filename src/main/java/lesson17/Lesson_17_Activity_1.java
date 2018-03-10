package lesson17;

import java.util.Scanner;

/**
 * Lesson 17 Coding Activity 1
 * Write a program that will input a list of test scores in from the keyboard.
 * When the user enters -1, print the average.
 *
 * What do you need to be careful about when using -1 to stop a loop?
 *
 * Sample Run:
 * Enter the Scores:
 * 45
 * 100
 * -1
 *
 * The average is: 72.5
 */
@SuppressWarnings("ALL")
class Lesson_17_Activity_1 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int count = 0;
            double total = 0;
            while (true) {
                int i = scanner.nextInt();
                if (i == -1) {
                    break;
                }
                count += 1;
                total += i;
            }
            System.out.println("The average is: " + (count == 0 ? "undefined" : total / count));
        }
    }
}
