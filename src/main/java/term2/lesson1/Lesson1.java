package term2.lesson1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static util.Utilities.newTestScanner;

/**
 * Write a Java program that allows a user to input words at the command line.  Your program should stop accepting words
 * when the user enters "STOP".  Store the words in an ArrayList.  The word STOP should not be stored in the list.
 *
 * Next, print the size of the list, followed by the contents of the list.
 *
 * Then, remove the first and last words stored in the list, but only if the list has a length greater than two.
 * Finally, reprint the contents of the list.
 *
 * Sample Run:
 *
 * Please enter words, enter STOP to stop the loop.
 *
 * cup
 * spoon
 * fork
 * bowl
 * plate
 * knife
 * STOP
 *
 * 6
 * [cup, spoon, fork, bowl, plate, knife]
 * [spoon, fork, bowl, plate]
 */
public class Lesson1 {
    public static void main(String[] args) {
//        Scanner scanner =newTestScanner("cup\nspoon\nfork\nbowl\nplate\nknife\nSTOP\n");
//        Scanner scanner =newTestScanner("cup\nspoon\nfork\nSTOP\n");
        Scanner scanner =newTestScanner("cup\nspoon\nSTOP\n");
        List<String> words = new ArrayList<>();
        System.out.println("Please enter words, enter STOP to stop the loop.");
        while (true) {
            String word = scanner.nextLine();
            if ("STOP".equals(word)) {
                break;
            }
            words.add(word);
        }
        System.out.println(words.size());
        System.out.println(words);
        if (words.size() > 2) {
            words.remove(words.size() - 1);
            words.remove(0);
        }
        System.out.println(words);
    }
}
