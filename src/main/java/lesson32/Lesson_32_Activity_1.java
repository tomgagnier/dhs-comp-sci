package lesson32;

/**
 * Lesson 32 Coding Activity 1
 *
 * For the Lesson 32 activities, you will be asked to write one or more methods.
 * Use the template to write a main method that tests each of your methods,
 * then paste everything into the code runner box. Your submission should
 * begin with the first import statement and end with the final }.
 *
 * Write a method that takes a parameter for the number of a month
 * and prints the month's name.
 *
 * This method must be called monthName() and it must have an integer parameter.
 *
 * Calling monthName(8) should print August to the screen.
 */

class Lesson_32_Activity_1 {

    static void monthName(int monthNumber) {
        System.out.println(toMonthName(monthNumber));
    }

    static String toMonthName(int monthNumber) {
        switch (monthNumber) {
        case 1:
            return "January";
        case 2:
            return "February";
        case 3:
            return "March";
        case 4:
            return "April";
        case 5:
            return "May";
        case 6:
            return "June";
        case 7:
            return "July";
        case 8:
            return "August";
        case 9:
            return "September";
        case 10:
            return "October";
        case 11:
            return "November";
        case 12:
            return "December";
        default:
            throw new IllegalArgumentException("Only 1 through 12 are supported.");
        }
    }

    public static void main(String[] args) {
        for (int i = 1; i < 13; ++i) {
            monthName(i);
        }
    }
}
