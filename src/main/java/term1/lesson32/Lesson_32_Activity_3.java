package term1.lesson32;

/**
 * Lesson 32 Coding Activity 3
 *
 * For the Lesson 32 activities, you will be asked to write one or more methods.
 * Use the template to write a main method that tests each of your methods,
 * then paste everything into the code runner box. Your submission should
 * begin with the first import statement and end with the final }.
 *
 * Write a method that takes two integer parameters and prints them in reverse.
 *
 * This method must be called swap and should take two integer parameters.
 *
 * Calling swap(3, 7) would print 7 3.
 */

@SuppressWarnings("UseOfSystemOutOrSystemErr")
class Lesson_32_Activity_3 {

    public static void swap(int i1, int i2) {
        System.out.println(i2 + " " + i1);
    }

    public static void main(String[] args) {
        swap(1, 2);
        swap(1, 3);
        swap(1, 4);
        swap(1, 5);
    }
}
