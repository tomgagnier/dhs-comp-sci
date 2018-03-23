package term1.lesson4;

import java.util.Scanner;

import static java.lang.System.out;

/**
 * Lesson 4 Coding Activity Question 2
 *
 * Ask the user their name and age and print out how many years until
 * they are 100. Note that age should be an integer, not a double.
 *
 * Sample run:
 *
 * Hi there. What is your name?
 * Pascal
 * Hi Pascal. How old are you?
 * 16
 * Pascal, you will be 100 in 84 years.
 */

@SuppressWarnings("UseOfSystemOutOrSystemErr")
public class Lesson_4_Activity_2 {
    public static void main(String... args) {
        try (Scanner in = new Scanner(System.in)) {
            out.print("Hi there. What is your name? ");
            String name = in.nextLine();
            out.printf("Hi%s. How old are you? ", name);
            int age = in.nextInt();
            out.printf("%s, you will 100 in %d years.%n", name, 100 - age);
        }
    }
}
