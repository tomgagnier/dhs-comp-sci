package term1.lesson33;

/**
 * Lesson 33 Coding Activity 2
 *
 * For the Lesson 33 activities, you will be asked to write one or more methods.
 * Use the template to write a main method that tests each of your methods,
 * then paste everything into the code runner box. Your submission should
 * begin with the first import statement and end with the final }.
 *
 * For questions 2-5, you may want to start with the printIt method
 * and use it to test the other three.
 *
 * Write a method that takes an array of ints and stores random numbers
 * between 10 and 99 in the array. Use Math.random() to generate
 * random numbers and convert them to integers between 10 and 99 inclusive.
 *
 * This method must be called randomize() and it must take an int[] parameter.
 */

@SuppressWarnings("ALL")
class Lesson_33_Activity_2 {

    public static void randomize(int... ints) {
        for (int i = 0; i < ints.length; ++i) {
            ints[i] = (int) (Math.random() * 90) + 10;
        }
    }

    private static void printIt(int... ints) {
        for (int i = 0 ; i < ints.length; ++i) {
            System.out.print(ints[i] + (i == ints.length - 1 ? "\n" : " "));
        }
    }

    private static void testIt(int sizeOfArray) {
        int[] ints = new int[sizeOfArray];
        printIt(ints);
        randomize(ints);
        printIt(ints);
    }

    public static void main(String... args) {
        testIt(1);
        testIt(5);
        testIt(30);
    }
}
