package lesson33;

/**
 * Lesson 33 Coding Activity 3
 *
 * For the Lesson 33 activities, you will be asked to write one or more methods.
 * Use the template to write a main method that tests each of your methods,
 * then paste everything into the code runner box. Your submission should
 * begin with the first import statement and end with the final }.
 *
 * For questions 2-5, you may want to start with the printIt method
 * and use it to test the other three.
 *
 * Write a method that takes an array of ints and prints the array on a
 * single line. Print one space between each number.
 *
 * This method must be called printit() and it must take an int[] parameter.
 */

@SuppressWarnings("ALL")
class Lesson_33_Activity_3 {

    private static void printIt(int... ints) {
        for (int i = 0 ; i < ints.length; ++i) {
            System.out.print(ints[i] + (i == ints.length - 1 ? "\n" : " "));
        }
    }


    public static void main(String... args) {
        printIt(1, 2, 3, 4, 5);
        printIt(1, 2, 3, 4, 5, 6, 7, 8);
        printIt(1, 2, 3, 4, 5, 6, 7, 80, 90, 13445);
    }
}
