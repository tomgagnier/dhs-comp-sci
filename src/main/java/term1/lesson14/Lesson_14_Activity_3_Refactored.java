package term1.lesson14;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Lesson 14 Coding Activity 3
 * The Internet runs on web addresses.The addresses we type represent the IP address
 * for each site and how the computer finds an individual web page.
 *
 * IP addresses are made up of four numbers, each between 0 and 255 separated by a period.
 * For example, 128.253.21.58 is an IP address.
 *
 * Write a program to enter four numbers and test if they make up a valid IP address.
 * In other words, test to see if the numbers entered are between 0 and 255 inclusive.
 *
 * Sample Run 1
 * Please enter the first octet:
 * 898
 * Please enter the second octet:
 * 34
 * Please enter the third octet:
 * 712
 * Please enter the fourth octet:
 * 45
 * Octet 1 is incorrect
 * Octet 3 is incorrect
 *
 *
 * Sample Run 2
 * Please enter the first octet:
 * 112
 * Please enter the second octet:
 * 200
 * Please enter the third octet:
 * 0
 * Please enter the fourth octet:
 * 254
 * IP Address: 112.200.0.254
 */
@SuppressWarnings("ALL")
class Lesson_14_Activity_3_Refactored {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String[] position = {"first", "second", "third", "fourth"};
            List<Integer> octets = new ArrayList<>();
            for (int i = 0; i < position.length; ++i) {
                System.out.println("Please enter the " + position[i] + " octet: ");
                octets.add(scanner.nextInt());
            }
            for (int i = 0; i < octets.size(); ++i) {
                if (0 > octets.get(i) || octets.get(i) > 255) {
                    System.out.println("Octet " + (i + 1) + " is incorrect.");
                }
            }
            if (octets.stream().allMatch(octet -> 0 <= octet && octet <= 255)) {
                System.out.println("IP Address: " +
                                   octets.stream().map(Object::toString)
                                         .reduce((o1, o2) -> o1 + '.' + o2).get());
            }
        }
    }
}
