package term2.lesson04;

/**
 * Create a class called Vehicle that simulates a car moving along a 40 block stretch of road.
 *
 * Your class will build a vehicle and keep track of its location on the road. Location values may range from -20 to 20.
 * A location value of 0 represents block 0, a location value of 1 represents block 1, a location value of 2 represents
 * block 2, etc. If the user tries to move the vehicle beyond block +20 or -20, set the location to +/- 20
 * respectively.
 *
 * In previous exercises, we had a requirement that you name your class Vehicle. In this exercise, you must name your class
 * Vehicle.
 *
 * To test your code before submission, download the file student_runner_Vehicle.java (Links to an external site.)Links
 * to an external site. to the same folder that holds your Vehicle.java implementation. Run the main method in the
 * student_runner_Vehicle class and verify that the printed output matches the sample run output below. Please feel free
 * to change the runner to test different values to make sure your program fits the requirements. We will use a similar
 * runner class to grade the program.
 *
 * When you are done coding and testing, copy and paste your entire Vehicle class into the Code Runner and press "Run"
 * to submit the exercise. Use the "Check Answer" button to get additional feedback on your work.
 *
 * Variables
 *
 * int location - An integer that holds the current block location of the car on the road, with possible values ranging
 * from -20 to 20.
 *
 * Methods
 *
 * Vehicle() - Set location to 0.
 *
 * Vehicle(int loc) - If loc is between -20 and 20 inclusive, set location to loc. Otherwise, set location to 0.
 *
 * void forward() - Increments the Vehicle forward one block. Do not let the user move past block 20.
 *
 * void backward() - Increments the vehicle backward one block. Do not let the user move past block -20.
 *
 * int getLocation() - Should return an integer representing the block location of the car.
 *
 * String toString() - Returns a String representation of the car's location. It should print out spaces for all of the
 * blocks from -20 to the car's current location, then print the '@' character. For example if the car is at block -10,
 * the method will return the following String: "          @" (10 spaces then the '@').
 *
 * Sample Run
 */
public class Vehicle {
    private int location;

    public Vehicle(int location) {
        this.location = location;
    }

    public Vehicle() {
        this(0);
    }

    public int getLocation() {
        return location;
    }

    public void forward() {
        if (location < 20) {
            ++location;
        }
    }

    public void backword() {
        if (location > -20) {
            --location;
        }
    }

    public String toString() {
        String result = "";
        for (int i = -20; i < location; ++i) {
            result += ' ';
        }
        return result + '@';
    }

}
