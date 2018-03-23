package term1.lesson9;

import static java.lang.Math.random;

/**
 * Lesson 9 Coding Activity Question 3
 *
 * Write the code to print a random integer from 20 to 40 inclusive using Math.random().
 */
@SuppressWarnings("ALL")
class Lesson_9_Activity_3 {
    public static void main(String... args) {
        System.out.println(randomInt(20, 40));
    }

    private static int randomInt(int min, int max) {
        return (int) (random() * (max - min + 1)) + min;
    }
}
