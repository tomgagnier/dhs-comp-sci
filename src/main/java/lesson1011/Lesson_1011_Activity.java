package lesson1011;

import java.util.Scanner;

import static util.Utilities.newTestScanner;

/**
 * Lesson 1011 Coding Activity
 *
 * For this program you will input an int to represent the octal number
 * and translate to the base ten number. The octal number must be 8 digits or less.
 *
 * Your program should also check that all the digits are 0 - 7, then translate the
 * number to base ten.
 *
 * Sample Run 1:
 * Enter a number in base 8:
 * 1287
 * ERROR: Incorrect Octal Format
 *
 * Sample Run 2:
 * Enter a number in base 8:
 * 123
 * 83
 *
 * Sample Run 3:
 * Enter a number in base 8:
 * 1111111111
 * ERROR: Incorrect Octal Format
 */

@SuppressWarnings("ALL")
class Lesson_1011_Activity {
    public static void main(String... args) {
//        Scanner scanner = newTestScanner("1287\n");
//        Scanner scanner = newTestScanner("123\n");
//        Scanner scanner = newTestScanner("111111111\n");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number in base 8:");
        try {
            System.out.println(toInt(scanner.nextLine()));
        } catch (IllegalArgumentException e) {
            System.out.println("ERROR: Incorrect Octal Format");
        }
    }

    /**
     * Convert the string representation of an octal number (base 8) to an integer.
     * @param octal The input octal string
     * @return the integer representing the ocatal value.
     */
    static int toInt(String octal) {
        if (octal.length() > 8) {
            throw new IllegalArgumentException("input too long");
        }
        int result = 0;
        int powerOf8 = 1;
        for (int i = 0; i < octal.length(); ++i) {
            char digit = octal.charAt(octal.length() - i - 1);
            if ('0' > digit || digit > '7') {
                throw new IllegalArgumentException(digit + " is unsupported");
            }
            int value = digit - '0';
            result += powerOf8 * value;
            powerOf8 *= 8;
        }
        return result;
    }
}
