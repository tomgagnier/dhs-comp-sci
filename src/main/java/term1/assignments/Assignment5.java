package term1.assignments;

import java.util.Scanner;

/**
 * For this assignment, you will manipulate an input String using String
 * functions. The first input will be a String of any length that you will be
 * manipulating. The second input String will be a "pivot" String that is used to
 * shuffle around the contents of the first input String.
 *
 * If the pivot String is found somewhere inside of the first input String, then
 * you will swap the contents of the first input String that appear before and
 * after the pivot String. For example, if the first input is "OneTwoThree", and
 * the pivot String is "Two", your output will be "ThreeTwoOne". Note that the
 * contents of the first input String before and after the pivot String have been
 * swapped, but the order of characters within those substrings remains the same.
 *
 * If the pivot String is empty or the first String does not contain the pivot
 * String, print the following error message: "Error: Pivot String not found."
 *
 * If the first String contains multiple instances of the pivot String, use the
 * first occurrence of the pivot String as your pivot point.
 *
 * When testing your program, you may need to be careful about including spaces
 * in the pivot String to end up with correct spacing in your output sentences.
 *
 * Sample Run 1:
 *
 * Enter the first String:
 * OneTwoThree
 * Enter the pivot String:
 * Two
 * ThreeTwoOne
 * Sample Run 2:
 *
 * Enter the first String:
 * The Hare outpaced The Tortoise
 * Enter the pivot String:
 * outpaced
 * The Tortoise outpaced The Hare
 * Sample Run 3:
 *
 * Enter the first String:
 * I think. Therefore I am.
 * Enter the pivot String:
 * Therefore
 * I am. Therefore I think.
 * Sample Run 4:
 *
 * Enter the first String:
 * Where is my pivot String?
 * Enter the pivot String:
 * missing
 * Error: Pivot String not found.
 */

@SuppressWarnings("All")
class Assignment5 {
    public static void main(String... args) {
        pivotUsingUserInput();
        //        testPivotData();
    }

    /** Prompt user for input and pivot strings and print result. */
    private static void pivotUsingUserInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first String:");
        String input = scanner.nextLine();

        System.out.println("Enter the pivot String:");
        String pivot = scanner.nextLine();

        String result = pivot(input, pivot);

        System.out.println(result);
    }

    /**
     * Swap the characters before and after the pivot string.
     *
     * @return The swapped input or "Error Pivot String not found."
     */
    private static String pivot(String input, String pivot) {
        int pivotIndex = input.indexOf(pivot);
        if (pivotIndex == -1) {
            return "Error: Pivot String not found.";
        }
        String beforePivot = input.substring(0, pivotIndex);
        String afterPivot = input.substring(pivotIndex + pivot.length());
        return afterPivot + pivot + beforePivot;
    }

    /**
     * Inputs from the sample data given in assignment.
     */
    private static final String[] inputs = {
            "OneTwoThree\nTwo\n",
            "The Hare outpaced The Tortoise\n outpaced \n",
            "I think. Therefore I am.\n Therefore \n",
            "Where is my pivot String?\nmissing\n"
    };

    /**
     * Expected outputs from assignment.
     */
    private static final String[] expectedOutputs = {
            "ThreeTwoOne",
            "The Tortoise outpaced The Hare",
            "I am. Therefore I think.",
            "Error: Pivot String not found."
    };

    /** Simple test to determine if  inputs yield the expected outputs. */
    private static void testPivotData() {
        for (int i = 0; i < inputs.length; ++i) {
            Scanner scanner = new Scanner(inputs[i]);
            String input = scanner.nextLine();
            String pivot = scanner.nextLine();

            String output = pivot(input, pivot);

            boolean pass = expectedOutputs[i].equals(output);

            if (pass) {
                System.out.printf("PASS: input='%s' pivot='%s' output='%s'%n", input, pivot, output);
            } else {
                System.out.printf("FAIL: input='%s' pivot='%s' output='%s' expected='%s'%n", input, pivot, output,
                                  expectedOutputs[i]);
            }
        }
    }
}
