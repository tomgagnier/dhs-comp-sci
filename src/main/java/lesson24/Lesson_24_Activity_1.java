package lesson24;

/**
 * Lesson 24 Coding Activity 1
 * Use a for loop to print all of the numbers from 23 to 89, with 10 numbers on each line.
 * Print one space between each number.
 */
@SuppressWarnings("UseOfSystemOutOrSystemErr")
class Lesson_24_Activity_1 {
    public static void main(String... args) {
        for (int i = 23; i < 90; ++i) {
            System.out.print(i);
            char c;
            if (i % 10 == 2) { c = '\n'; } else { c = ' '; }
            System.out.print(c);
        }
    }
}
