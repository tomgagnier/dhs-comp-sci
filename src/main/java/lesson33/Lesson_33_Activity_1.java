package lesson33;

/**
 * Lesson 33 Coding Activity 1
 *
 * For the Lesson 33 activities, you will be asked to write one or more methods.
 * Use the template to write a main method that tests each of your methods,
 * then paste everything into the code runner box. Your submission should
 * begin with the first import statement and end with the final }.
 *
 * For questions 2-5, you may want to start with the printIt method
 * and use it to test the other three.
 *
 * Write a method that takes an array of Strings and changes of the Strings to UPPER CASE.
 *
 * This method must be called upper() and it must take a String[] parameter.
 *
 * Use T1_L33_Reference_Tempate.java, which is included in this folder,
 * as a reference.
 */

@SuppressWarnings("ALL")
class Lesson_33_Activity_1 {

    public static void upper(String... words) {
        for (int i = 0 ; i < words.length; ++i) {
            words[i] = words[i].toUpperCase();
        }
    }

    private static void printIt(String ...words) {
        for (int i = 0 ; i < words.length; ++i) {
            System.out.print(words[i] + (i == words.length - 1 ? '\n' : ' '));
        }
    }

    private static void testIt(String... words) {
        printIt(words);
        upper(words);
        printIt(words);
    }

    public static void main(String... args) {
        testIt("hello", "world!", "goodnight", "sweet", "prince");
    }
}
