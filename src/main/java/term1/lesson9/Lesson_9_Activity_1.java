package term1.lesson9;

import static java.lang.Math.random;

/**
 * Lesson 9 Coding Activity Question 1
 *
 * Write the code to print a random integer from 1 to 10 inclusive using Math.random().
 */
@SuppressWarnings("UseOfSystemOutOrSystemErr")
class Lesson_9_Activity_1 {
    public static void main(String... args) {
        System.out.println((int) (random() * 10) + 1);
    }
}
