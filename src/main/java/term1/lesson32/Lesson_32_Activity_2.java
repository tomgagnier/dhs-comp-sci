package term1.lesson32;

/**
 * Lesson 32 Coding Activity 2
 *
 * For the Lesson 32 activities, you will be asked to write one or more methods.
 * Use the template to write a main method that tests each of your methods,
 * then paste everything into the code runner box. Your submission should
 * begin with the first import statement and end with the final }.
 *
 * Write a method that takes a parameter for the number of a month
 * and prints the number of days in the month. Assume that February
 * will always have 28 days for this activity.
 *
 * This method must be called monthDays()and it must take a integer parameter.
 *
 * Calling monthDays(2) would print 28 and monthDays(9) would print 30.
 */

@SuppressWarnings("ALL")
class Lesson_32_Activity_2 {

    public static void monthDays(int numberOfMonth) {
        System.out.println(toNumberOfDays(numberOfMonth));
    }

    static int toNumberOfDays(int numberOfMonth) {
        switch (numberOfMonth) {
        case 1:
        case 3:
        case 5:
        case 7:
        case 8:
        case 10:
        case 12:
            return 31;
        case 2:
            return 28;
        case 4:
        case 6:
        case 9:
        case 11:
            return 30;
        default:
            throw new IllegalArgumentException("Only 1 through 12 are supported.");
        }
    }

    public static void main(String[] args) {
        for (int i = 1; i < 13; ++i) {
            monthDays(i);
        }
    }
}
