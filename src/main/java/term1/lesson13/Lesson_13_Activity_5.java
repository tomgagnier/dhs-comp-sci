package term1.lesson13;

import java.util.Scanner;

/**
 * Lesson 13 Coding Activity 5
 * Create a program to let the user practice their multiplication tables.
 * Print two random integers between 1 and 12 each on a new line.
 * Then, ask the user to input the multiplication of the two numbers.
 * If they enter the correct product print "Correct!" otherwise print "Wrong".
 */
@SuppressWarnings("ALL")
class Lesson_13_Activity_5 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int f1 = (int) (Math.random() * 12 + 1);
            int f2 = (int) (Math.random() * 12 + 1);
            System.out.println("Input the result of " + f1 + " times " + f2 + " = ");
            if (scanner.nextInt() == f1 * f2) {
                System.out.println("Correct!");
            } else {
                System.out.println("Wrong");
            }
        }
    }
}
