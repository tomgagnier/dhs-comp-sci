package lesson33;

/**
 * Lesson 33 Coding Activity 4
 *
 * For the Lesson 33 activities, you will be asked to write one or more methods.
 * Use the template to write a main method that tests each of your methods,
 * then paste everything into the code runner box. Your submission should
 * begin with the first import statement and end with the final }.
 *
 * For questions 2-5, you may want to start with the printIt method
 * and use it to test the other three.
 *
 * Write a method that takes an array of ints and reverses the order
 * of the values in the array. So the array {1, 2, 3} would be changed to {3, 2, 1}
 *
 * This method must be called reverse() and it must take an int[] parameter.
 */

@SuppressWarnings("UseOfSystemOutOrSystemErr")
class Lesson_33_Activity_4 {

    public static void reverse(int... ints) {
        for (int i = 0; i < ints.length / 2; ++i) {
            int j = ints.length - i - 1;
            int tmp = ints[i];
            ints[i] = ints[j];
            ints[j] = tmp;
        }
    }

    private static void printIt(int... ints) {
        for (int i = 0; i < ints.length; ++i) {
            System.out.print(ints[i] + (i == ints.length - 1 ? "\n" : " "));
        }
    }

    private static void testIt(int... ints) {
        printIt(ints);
        reverse(ints);
        printIt(ints);
    }

    public static void main(String... args) {
        testIt();
        testIt(1);
        testIt(1, 2);
        testIt(1, 2, 3);
        testIt(1, 2, 3, 4);
        testIt(1, 2, 3, 4, 5);
        testIt(1, 2, 3, 4, 5, 6);
    }
}
