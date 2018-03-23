package term1.lesson35;

/**
 * Lesson 35 Coding Activity
 *
 * Write four overloaded methods called randomize. Each method will
 * return a random number based on the parameters that it receives:
 *
 * Write four overloaded methods called randomize.
 * Each method will return a random number based on the parameters that it receives:
 * randomize() - Returns a random int between min and max inclusive. Must have two int parameters.
 * randomize() - Returns a random int between 0 and max inclusive. Must have one int parameter.
 * randomize() - Returns a random double between min and max inclusive. Must have two double parameters.
 * randomize() - Returns a random double between 0 and max inclusive. Must have one double parameter.
 *
 * Because these methods are overloaded, they should be declared in the same class.
 * To simulate this, copy all four methods into the single Code Runner box.
 */

@SuppressWarnings("ALL")
class Lesson_35_Activity {

    public static double randomize(double first, double last) {
        return Math.random() * (last - first + Double.MIN_VALUE) + first;
    }

    public static double randomize(double range) {
        return randomize(0.0, range);
    }

    public static int randomize(int first, int last) {
        return (int) (Math.random() * (last - first + 1)) + first;
    }

    public static int randomize(int range) {
        return (int) randomize(0, range);
    }

    public static void main(String... args) {
        for (int i = 0; i < 10; ++i) {
            System.out.println(randomize(10.0, 20.0));
            System.out.println(randomize(10.0));
            System.out.println(randomize(10, 20));
            System.out.println(randomize(10));
        }
    }
}
