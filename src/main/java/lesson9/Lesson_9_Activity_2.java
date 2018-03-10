package lesson9;

import static java.lang.Math.random;

/**
 * Lesson 9 Coding Activity Question 2
 *
 * Write the code to print a random integer from -20 to 20 inclusive using Math.random().
 */
@SuppressWarnings("ALL")
class Lesson_9_Activity_2 {
    public static void main(String... args) {
        System.out.println(randomInt(20, 40));
    }

    private static int randomInt(int min, int max) {
        return (int) (random() * (max - min + 1)) + min;
    }
}
