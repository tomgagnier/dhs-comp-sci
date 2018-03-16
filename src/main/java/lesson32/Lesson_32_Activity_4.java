package lesson32;

/**
 * Lesson 32 Coding Activity 4
 *
 * For the Lesson 32 activities, you will be asked to write one or more methods.
 * Use the template to write a main method that tests each of your methods,
 * then paste everything into the code runner box. Your submission should
 * begin with the first import statement and end with the final }.
 *
 * Write a method that accepts a number of seconds and prints the
 * correct number of hours, minutes and seconds.
 *
 * This method must be called realTime() and its parameter must be an integer.
 *
 * Calling realTime(6342) would print the following:
 *
 * Hours: 1
 * Minutes: 45
 * Seconds: 42
 */

@SuppressWarnings("ALL")
class Lesson_32_Activity_4 {

    public static void realTime(int numberOfSeconds) {
        System.out.println("Hours: " + toHoursDigits(numberOfSeconds));
        System.out.println("Minutes: " + toMinutesDigits(numberOfSeconds));
        System.out.println("Seconds: " + toSecondsDigits(numberOfSeconds));
    }

    static int toHoursDigits(int totalSeconds) {
        return totalSeconds / 3600;
    }

    static int toMinutesDigits(int totalSeconds) {
        return (totalSeconds / 60) % 60;
    }

    static int toSecondsDigits(int totalSeconds) {
        return totalSeconds % 60;
    }

    public static void main(String... args) {
        realTime(0);
        realTime(299);
        realTime(3600);
        realTime(7201);
        realTime(7499);
    }
}
