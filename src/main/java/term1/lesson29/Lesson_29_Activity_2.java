package term1.lesson29;

/**
 * Lesson 29 Coding Activity 2
 * Write a loop that processes an array of strings.
 * Each String should be printed backwards on its own line.
 *
 * For example, if the list contains:
 *
 * {"every", "nearing", "checking", "food", "stand", "value"}
 *
 * It should output:
 * yreve
 * gniraen
 * gnikcehc
 * doof
 * dnats
 * eulav
 */

@SuppressWarnings("ALL")
class Lesson_29_Activity_2 {

    /**
     * Fill this list with values that will be useful for you to test.
     * A good idea may be to copy/paste the list in the example above.
     * Do not make any changes to this list in your main method. You can
     * print values from list, but do not add or remove values to this
     * variable.
     */
    public static String[] list = {"every", "nearing", "checking", "food", "stand", "value"};

    public static void main(String[] args) {
        for (String word : list) {
            System.out.println(reverse(word));
        }
    }

    static String reverse(String input) {
        char[] chars = input.toCharArray();
        for (int i = 0; i < chars.length / 2; ++i) {
            int j = chars.length - i - 1;
            char savedChar = chars[i];
            chars[i] = chars[j];
            chars[j] = savedChar;
        }
        return new String(chars);
    }
}
