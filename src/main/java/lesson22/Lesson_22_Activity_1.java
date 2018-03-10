package lesson22;

import java.util.Scanner;

/**
 * Lesson 22 Coding Activity 1
 * Write the code to take a String and print it with one letter per line.
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
 */
@SuppressWarnings("ALL")
class Lesson_22_Activity_1 {
    public static void main(String[] args) {
        Scanner scanner;
        scanner = new Scanner(System.in);
        scanner = new Scanner("hello, world!\n");

        System.out.println("Enter a string:");
        String string = scanner.nextLine();

        // Using length and charAt
        // This is how your lessons taught you to accomplish the task.
        for (int i = 0; i < string.length(); ++i) {
            System.out.println(string.charAt(i));
        }

        // Using toCharArray.
        // This for loop iterates over an Iterable, yielding the Iterable's elements
        // in order.
        for (char c : string.toCharArray()) {
            System.out.println(c);
        }

        // Using length and substring.
        // The substring starts at character 'i' and ends at character
        // 'i+1'  - 'i' is the first character, i + 1 is ONE past the
        // the end of the string - the character pointed to is NOT included.
        // Also knowns as an OPEN/CLOSED or INCLUSIVE/EXCLUSIVE interval,
        // this is a common way to describe a range.
        for (int i = 0; i < string.length(); ++i) {
            System.out.println(string.substring(i, i + 1));
        }

        // Using regular expression - advanced concept.
        // The split command creates array of strings using the regular expression
        // to group characters.  The '.' means match any character, so the input
        // string is divided on each character.
        for (String c : string.split(".")) {
            System.out.println(c);
        }

        // Using streams and functional programming - advance concept
        string.chars().forEach(c -> System.out.println((char) c));
    }
}
