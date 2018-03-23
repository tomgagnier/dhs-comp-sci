package term1.assignments;

import java.util.Scanner;

/**
 * To test your three methods, ask the user for inputs sequentially in
 * your main method and then print out the results of the appropriate
 * method. The output of your main method should match the sample runs
 * below, so you should refer to these examples for the appropriate
 * output.
 *
 * Sample Run 1
 *
 * Welcome to the Methods Sampler Platter. Please enter a String to duplicate.
 * Opera
 * The duplicated String is: OOOOOpppppeeeeerrrrraaaaa
 * Next, please enter a String to check for Edhesive Palindromes.
 * Avid div4
 * Nice, you found an Edhesive Palindrome!
 * Almost done! Please enter a number to scramble.
 * 67
 * The scrambled number is: 6.0
 *
 * Sample Run 2
 *
 * Welcome to the Methods Sampler Platter. Please enter a String to duplicate.
 * Aria
 * The duplicated String is: AAAAAAAArrrrrrrriiiiiiiiaaaaaaaa
 * Next, please enter a String to check for Edhesive Palindromes.
 * palindrome
 * Too bad, that isn't an Edhesive Palindrome.
 * Almost done! Please enter a number to scramble.
 * 13
 * The scrambled number is: 3.0
 */
@SuppressWarnings("ALL")
public class Assignment7 {

    public static void main(String... args) {
        //        Scanner scanner = new Scanner("Opera\nAvid div4\n67");
        //        Scanner scanner = new Scanner("Aria\npalindrome\n13\n");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Methods Sampler Platter. Please enter a String to duplicate.");
        String duplicateThis = scanner.nextLine();
        System.out.println("The duplicated String is: " + duplicate(duplicateThis));
        System.out.println("Next, please enter a String to check for Edhesive Palindromes.");
        String palindrome = scanner.nextLine();
        if (isEdhesivePalindrome(palindrome)) {
            System.out.println("Nice, you found an Edhesive Palindrome!");
        } else {
            System.out.println("Too bad, that isn't an Edhesive Palindrome.");
        }
        System.out.println("Almost done! Please enter a number to scramble.");
        double num = scanner.nextDouble();
        System.out.println("The scrambled number is: " + numberScramble(num));
    }

    /**
     * duplicate - The method duplicate should accept one parameter of type String
     * (named “str”). The method should return a String with every character in str
     * repeated n times, where n is the length of str. E.g. duplicate("Hat") should
     * return "HHHaaattt"
     *
     * However, if n is an even number, each character should be repeated twice as
     * many times (2*n times per character).
     *
     * E.g. duplicate("Hi") should return "HHHHiiii"
     */
    static String duplicate(String str) {
        boolean isEvenLength = str.length() % 2 == 0;
        int repeatCount = isEvenLength ? str.length() * 2 : str.length();

        String result = "";
        for (int i = 0; i < str.length(); ++i) {
            char c = str.charAt(i);
            for (int j = 0; j < repeatCount; ++j) {
                result += c;
            }
        }
        return result;
    }

    /**
     * isEdhesivePalindrome - The method isEdhesivePalindrome should accept a
     * parameter of type String (named “str”) and return true if str is an "Edhesive
     * Palindrome,” and false otherwise. An Edhesive Palindrome must meet the
     * following requirements:
     *
     * The String parameter str must read the same backward as forwards. (e.g.
     * "racecar" is a valid Edhesive Palindrome). Case does NOT matter. (e.g.
     * "RaceCar" is still valid) The following characters are equivalent:
     *
     * a ~ 4
     * e ~ 3
     * o ~ 0
     *
     * NOTE: The letters are shown in lower-case, but since the case does NOT matter,
     * both 'a' and 'A' is equivalent to '4'. (e.g. "R4ceCar" is still valid)
     *
     * The String parameter str must be of length greater than 3 and less than 15
     * (e.g. "R4ceCar" is still valid. But "mom" and "dad" are NOT valid). If anyone
     * of these 3 requirements is NOT satisfied, then the String parameter str is NOT
     * considered an Edhesive Palindrome, and the method should return false. If all
     * 3 requirements are satisfied, then the method returns true.
     *
     * E.g. using the examples above, isEdhesivePalindrome(“R4ceCar”) should return
     * true, whereas isEdhesivePalindrome(“dad”) and isEdhesivePalindrome(“hello”)
     * should both return false.
     */
    static boolean isEdhesivePalindrome(String str) {
        if (14 < str.length() || str.length() < 4) {
            return false;
        }

        char[] chars = str.toLowerCase().toCharArray();

        for (int i = 0; i < chars.length; ++i) {
            if (chars[i] == '4') {
                chars[i] = 'a';
            } else if (chars[i] == '3') {
                chars[i] = 'e';
            } else if (chars[i] == '0') {
                chars[i] = 'o';
            }
        }

        for (int i = 0; i < chars.length / 2; ++i) {
            if (chars[i] != chars[chars.length - i - 1]) {
                return false;
            }
        }

        return true;
    }

    /**
     * numberScramble - The method numberScramble should accept one parameter of type
     * double (named “num”) and return a value of type double. If the input parameter
     * is less than 0, return 0.0. Otherwise, the following mathematical operations
     * should be performed on the parameter before returning:
     *
     * add 5 to num
     * divide num by 2
     * square root num
     * E.g. numberScramble(3.0) should return 2.0
     *
     * Breakdown:
     *
     * 3.0 + 5 = 8.0
     * 8.0 / 2 = 4.0
     * Square root of 4.0 = 2.0
     */
    static double numberScramble(double num) {
        if (num < 0) {
            return 0;
        }
        return Math.sqrt((num + 5) / 2);
    }
}
