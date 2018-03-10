package lesson20;

import java.util.Scanner;
import util.Utilities;

/**
 * Lesson 20 Coding Activity
 *
 * Computer science jobs are in demand. Right now we have a shortage
 * of people that can do computer programming, and one of the fastest
 * growing areas of new jobs in the sector are so-called hybrid jobs.
 * This means you specialize in an area like biology,
 * and then use computer programming to do your job.
 *
 * These hybrid jobs exist in the arts, sciences,
 * economics, healthcare, and entertainment fields.
 *
 * One of these jobs is computational biology. Computational Biology,
 * sometimes referred to as bioinformatics, is the science of
 * using biological data to develop algorithms and relations
 * among various biological systems.
 *
 * In this lab we are going to investigate the data from a
 * grey seal named Gracie. We'll input the longitude and
 * latitude data from a tracking device. We want to investigate
 * the farthest north, south, east and west Gracie has been.
 *
 * We will use the latitude to measure this.
 * Write a program to enter Gracie's longitude and Latitude data.
 * Each time through the loop it should ask if you want to continue.
 * Enter 1 to repeat, 0 to stop.
 *
 * Any value for latitude not between -90 and 90 inclusive should be ignored.
 *
 * Any value for longitude not between -180 and 180 inclusive should be ignored.
 *
 * Sample Run:
 *
 * Please enter the latitude:
 * 41.678
 * Please enter the longitude:
 * 69.938
 * Would you like to enter another location?
 * 1
 * Please enter the latitude:
 * 41.755
 * Please enter the longitude:
 * 69.862
 * Would you like to enter another location?
 * 1
 * Please enter the latitude:
 * 41.829
 * Please enter the longitude:
 * 69.947
 * Would you like to enter another location?
 * 1
 * Please enter the latitude:
 * 300
 * Please enter the longitude:
 * 69.947
 * Incorrect Latitude or Longitude
 * Please enter the latitude:
 * 41.827
 * Please enter the longitude:
 * 69.904
 * Would you like to enter another location?
 * 0
 * Farthest North: 41.829
 * Farthest South: 41.678
 * Farthest East: 69.947
 * Farthest West: 69.862
 */
@SuppressWarnings("ALL")
class Lesson_20_Activity {

    public static void main(String... args) {
        Scanner scanner;
        scanner = new Scanner(System.in);
        scanner = Utilities.newTestScanner(
                "41.678 69.938 1 41.755 69.862 1 41.829 69.947 1 300 69.947 41.827 69.904 0 ");

        determineRange(scanner);
    }

    private static void determineRange(Scanner scanner) {
        double minLatitude = Double.MAX_VALUE;
        double minLongitude = Double.MAX_VALUE;
        double maxLatitude = Double.MIN_VALUE;
        double maxLongitude = Double.MIN_VALUE;

        for (boolean enterAnotherLocation = true; enterAnotherLocation; ) {

            for (boolean incorrectLatitudeOrLongitude = true; incorrectLatitudeOrLongitude; ) {

                System.out.println("Please enter the latitude:");
                double latitude = scanner.nextDouble();
                System.out.println("Please enter the longitude:");
                double longitude = scanner.nextDouble();

                incorrectLatitudeOrLongitude = -90 > latitude || latitude > 90 || -180 > longitude || longitude > 180;

                if (incorrectLatitudeOrLongitude) {
                    System.out.println("Incorrect latitude or longitude");
                } else {
                    if (latitude < minLatitude) { minLatitude = latitude; }
                    if (latitude > maxLatitude) { maxLatitude = latitude; }
                    if (longitude < minLongitude) { minLongitude = longitude; }
                    if (longitude > maxLongitude) { maxLongitude = longitude; }
                }
            }
            System.out.println("Would you like to enter another location?");
            enterAnotherLocation = scanner.nextInt() == 1;
        }

        System.out.println("Farthest North: " + maxLatitude);
        System.out.println("Farthest South: " + minLatitude);
        System.out.println("Farthest East: " + maxLongitude);
        System.out.println("Farthest West: " + minLongitude);
    }
}
