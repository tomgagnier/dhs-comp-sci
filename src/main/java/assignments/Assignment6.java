package assignments;

import java.util.Scanner;

@SuppressWarnings("ALL")
public class Assignment6 {

    /**
     * In this lab, you will be creating a program that merges two arrays of names.
     * Your program will accept each array as input from the keyboard taking all
     * strings and then reformat them in title case. For example, "jOHN" would
     * convert to "John", "megan" would convert to "Megan", and "ADAm" would convert
     * to "Adam".
     *
     * You do not know ahead of time how many values will be entered, but you can
     * assume each array will have a maximum length of 10,000 elements. To stop
     * entering values the user will enter the word "End". Note: that any combination
     * of lowercase and uppercase characters that spell "End" should terminate asking
     * for input.
     *
     * The elements of the two input arrays should be in alphabetical order. In other
     * words, each array element must have a value that is greater than or equal to
     * the previous element value.
     *
     * After the two arrays have been input, your program must check to make sure the
     * elements of each array have been entered in order. If an out of order element
     * is found, print the message "Error: Arrays not in correct order".
     *
     * Your task is to merge the two input arrays into a new array, with all elements
     * in alphabetical order. Print out each of the original arrays entered, followed
     * by the merged array.
     *
     * Please note that your program must output the arrays with exactly one space
     * between each name.
     *
     * Determining alphabetical order: take a look back at the lesson on String
     * functions and specifically the compareTo method.
     *
     * Sample Run 1:
     *
     * Enter the values for the first array, up to 10000 values, enter 'End' to quit
     * Alf
     * BOB
     * heATher
     * john
     * ZoE
     * eNd
     *
     * Enter the values for the second array, up to 10000 values, enter 'End' to quit
     * Chloe
     * dylan
     * michAEL
     * END
     *
     * First Array
     * Alf Bob Heather John Zoe
     *
     * Second Array
     * Chloe Dylan Michael
     *
     * Merged Array
     * Alf Bob Chloe Dylan Heather John Michael Zoe
     * Sample Run 2:
     *
     * Enter the values for the first array, up to 10000 values, enter 'End' to quit
     * heATher
     * john
     * ZoE
     * Alf
     * BOB
     * eNd
     *
     * Enter the values for the second array, up to 10000 values, enter 'End' to quit
     * Chloe
     * dylan
     * michAEL
     * END
     *
     * First Array
     * Heather John Zoe Alf Bob
     *
     * Second Array
     * Chloe Dylan Michael
     *
     * Error: Arrays not in correct order
     */

    public static void main(String... args) {
        Scanner scanner = new Scanner("Alf\nBOB\nheATher\njohn\nZoE\neNd\nChloe\ndylan\nmichAEL\nEND\n");

        System.out.println("Enter the values for the first array, up to 10000 values, enter 'End' to quit");
        String[] first = readLinesUntilEndInput(scanner);

        System.out.println("Enter the values for the second array, up to 10000 values, enter 'End' to quit");
        String[] second = readLinesUntilEndInput(scanner);

        System.out.println("First Array\n" + arrayToString(first));
        System.out.println("Second Array\n" + arrayToString(second));

        if (sorted(first) && sorted(second)) {
            System.out.println("Merged Array\n" + arrayToString(merge(first, second)));
        } else {
            System.out.println("Error: Arrays not in correct order");
        }
    }

    static String[] readLinesUntilEndInput(Scanner scanner) {
        String[] lines = new String[10000];
        int count = 0;
        while (count < lines.length) {
            String line = upperCaseFirstLowerCaseRest(scanner.nextLine());
            if ("End".equals(line)) {
                break;
            }
            lines[count++] = line;
        }
        return trimArray(lines, count);
    }

    static String arrayToString(String... values) {
        String result = "";
        for (int i = 0; i < values.length; ++i) {
            result += (i == 0 ? "" : " ") + values[i];
        }
        return result;
    }

    static String[] trimArray(String[] values, int count) {
        String[] result = new String[count];
        for (int i = 0; i < result.length; ++i) {
            result[i] = values[i];
        }
        return result;
    }

    static String upperCaseFirstLowerCaseRest(String name) {
        return name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
    }

    static boolean sorted(String... words) {
        for (int i = 0; i < words.length - 1; ++i) {
            boolean outOfSortOrder = words[i].compareTo(words[i + 1]) > 0;
            if (outOfSortOrder) {
                return false;
            }
        }
        return true;
    }

    static String[] merge(String[] first, String[] second) {
        String[] merged = new String[first.length + second.length];
        int firstIndex = 0;
        int secondIndex = 0;
        for (int mergeIndex = 0; mergeIndex < merged.length; ++mergeIndex) {
            if (firstIndex == first.length) {
                merged[mergeIndex] = second[secondIndex++];
            } else if (secondIndex == second.length) {
                merged[mergeIndex] = first[firstIndex++];
            } else {
                boolean firstLessThanSecond = first[firstIndex].compareTo(second[secondIndex]) < 0;
                if (firstLessThanSecond) {
                    merged[mergeIndex] = first[firstIndex++];
                } else {
                    merged[mergeIndex] = second[secondIndex++];
                }
            }
        }
        return merged;
    }
}
