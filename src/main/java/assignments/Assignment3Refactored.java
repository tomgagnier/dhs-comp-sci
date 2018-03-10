package assignments;

/**
 * In this assignment, you will be creating a program that requires a secret
 * code to “unlock.” The program should first welcome the user and ask the user
 * to input his/her name. Then the program will greet the user using the entered
 * name.
 *
 * In order to “crack the code,” the user must input three integer numbers which
 * satisfy the following conditions:
 *
 * The first number must be the number 3.
 *
 * The second number can either be the number 1 or be between 33 and 100,
 * inclusive.
 *
 * The third number must be a positive number that is either evenly divisible by
 * 3 or evenly divisible by 7
 *
 * As the user enters each number, the program should immediately check whether
 * or not the number satisfies its respective requirement(s) listed above. If the
 * requirement(s) is satisfied, then a “Correct!” confirmation should be printed
 * out. If the requirement(s) is NOT satisfied, then an error message should be
 * printed out, and the user cannot input any more numbers. (i.e. if the user
 * input 5 as the first number, then the user has failed to crack the code, and
 * cannot guess the second or third number.)
 *
 * Please refer to the sample outputs below for formatting. (Any output
 * statements from the program must match the sample formatting exactly.)
 *
 * Sample Run 1:
 *
 * Welcome. What is your name?
 * Jane Doe
 * Hello Jane Doe. Try your best to crack the code!
 *
 * PHASE 1
 * Enter a number:
 * 3
 * Correct!
 *
 * PHASE 2
 * Enter a number:
 * 40
 * Correct!
 *
 * PHASE 3
 * Enter a number:
 * 6
 * Correct!
 * You have cracked the code!
 * Sample Run 2:
 *
 * Welcome. What is your name?
 * Jane Doe
 * Hello Jane Doe. Try your best to crack the code!
 *
 * PHASE 1
 * Enter a number:
 * 0
 * Sorry, that was incorrect!
 * Better luck next time!
 * Sample Run 3:
 *
 * Welcome. What is your name?
 * John Doe
 * Hello John Doe. Try your best to crack the code!
 *
 * PHASE 1
 * Enter a number:
 * 3
 * Correct!
 *
 * PHASE 2
 * Enter a number:
 * 2
 * Sorry, that was incorrect!
 * Better luck next time!
 *
 *
 * NOTE: You MUST use the class name "Main" for this assignment. REMEMBER: you
 * must SUBMIT your answer. Your assignment doesn't count as complete unless it
 * has been submitted.
 */

import java.util.Scanner;
import java.util.function.Predicate;

import static util.Utilities.newTestScanner;

@SuppressWarnings("All")
public class Assignment3Refactored {

    public static void main(String... args) {

        //        Scanner scanner = Utilities.newTestScanner("Jane Doe\n3\n40\n6\n");
        //        Scanner scanner = Utilities.newTestScanner("Jane Doe\n0\n");
        Scanner scanner = newTestScanner("Jane Doe\n3\n2\n");
        //        Scanner scanner = Utilities.newTestScanner("Jane Doe\n3\n40\n21\n");
        //        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome. What is your name?");
        String name = scanner.nextLine();
        System.out.println("Hello " + name + ". Try your best to crack the code!");
        enterNextNumber(scanner, 1, n -> n == 3);
        enterNextNumber(scanner, 2, n -> n == 1 || (33 <= n && n <= 100));
        enterNextNumber(scanner, 3, n -> 0 < n && (n % 3 == 0 || n % 7 == 0));
        System.out.println("You have cracked the code!");
    }

    private static void enterNextNumber(Scanner scanner, int phase, Predicate<Integer> valid) {
        System.out.println();
        System.out.println("PHASE " + phase);
        System.out.println("Enter a number:");
        if (valid.test(scanner.nextInt())) {
            System.out.println("Correct!");
            return;
        }
        System.out.println("Sorry, that was incorrect!");
        System.out.println("Better luck next time!");
        System.exit(1);
    }
}
