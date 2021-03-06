package term1.lesson34;

/**
 * Lesson 34 Coding Activity 3
 *
 * For the Lesson 34 activities, you will be asked to write one or more methods.
 * Use the template to write a main method that tests each of your methods,
 * then paste everything into the code runner box. Your submission should
 * begin with the first import statement and end with the final }.
 *
 * Write a method that takes an array of ints and returns
 * the largest value in the array.
 *
 * public static int findMax(int [] a)
 */

@SuppressWarnings("ALL")
class Lesson_34_Activity_3 {

    public static int findMax(int... ints) {
        int max = ints[0];
        for (int value : ints) {
            max = max < value ? value : max;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(findMax(1, 2, 3, 4, 5, 6, 7));
        System.out.println(findMax(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
    }
}
