package term1.lesson3;

import java.util.Scanner;

/**
 * Lesson 3 Coding Activity Question 2
 *
 * Write a program that asks the user for three names, then prints the names in reverse order.
 *
 * Sample Run:
 *
 * Please enter three names:
 * Zoey
 * Zeb
 * Zena
 *
 * Zena Zeb Zoey
 */

@SuppressWarnings("All")
class Lesson_3_Activity_2 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Please enter three names:");
            String name1 = in.nextLine();
            String name2 = in.nextLine();
            String name3 = in.nextLine();
            System.out.printf("%s %s %s%n", name3, name2, name1);
        }
    }
}
