package term2.lesson2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static util.Utilities.newTestScanner;

/**
 * Write a program that allows a user to input words at the command line. Your program should stop accepting words when
 * the user enters "STOP". Store the words in an ArrayList. The word STOP should not be stored in the list.
 *
 * Next, your program should loop through the list and print out only the words that contain the letter "a".
 *
 * Sample Run:
 *
 * Please enter words, enter STOP to stop the loop.
 *
 * dog
 * zebra
 * cat
 * fish
 * STOP
 *
 * zebra
 * cat
 *
 * Note: For this activity, you must use the class name, Main and the method, main.
 */
public class Main {
    public static void main(String... args) {
        Scanner scanner = newTestScanner("dog\nzebra\ncat\nfish\nSTOP\n");
        for (String word : collectWordsUntilStopEntered(scanner)) {
            if (word.contains("a")) {
                System.out.println(word);
            }
        }
    }

    private static List<String> collectWordsUntilStopEntered(Scanner scanner) {
        System.out.println("Please enter words, enter STOP to stop the loop.");
        List<String> words = new ArrayList<>();
        while (true) {
            String word = scanner.nextLine();
            if ("STOP".equals(word)) {
                return words;
            }
            words.add(word);
        }
    }
}
