package term2.assignment4;

/**
 * Dashboard() - this is like getting a brand new car! It’s not moving and has no miles on it, so both odometer and
 * speedometer should be set to zero. The check engine light should be off. Dashboard(int milesTravelled, int speed) -
 * If milesTravelled is between 0 and 99999 (inclusive), set the odometer to milesTravelled, otherwise, set it to zero
 * and turn on the check engine light. If speed is between 0 and 100 (inclusive), set the speedometer to speed,
 * otherwise, set it to zero and turn on the check engine light. The check engine light should be off if both values are
 * valid. Methods
 *
 * void accelerate() - increases speed by one mile per hour. If the car accelerates above 100mph, the car should stall
 * out and go back to 0mph, and the check engine light should turn on. void drive(int numMinutes) - drives the car for
 * numMinutes minutes at the current speed. Updates odometer accordingly (rounded down to the mile). Odometer reading
 * cannot exceed 99999, if this happens it rolls back to zero, and the check engine light comes on. numMinutes will not
 * exceed 720 (12 hours).  For example, if the current speed is 60 miles per hour, and numMinutes is 20, then the car
 * drives for 20 minutes = 20 miles. The odometer reading should increase by 20 miles. String toString() - displaj
 */

public class Dashboard implements Comparable {
    int     milesTraveled = 0;
    int     speed         = 0;
    boolean checkEngine   = false;

    public Dashboard(int milesTraveled, int speed) {
        this.milesTraveled = milesTraveled;
        this.speed = speed;
    }

    void accelerate() {
        speed = speed + 1;
        if (speed > 100) {
            speed = 0;
            checkEngine = true;
        }
    }

    void drive(int numberOfMinutes) {
        milesTraveled += numberOfMinutes / 60.0 * milesTraveled;
        if (milesTraveled > 99999) {
            milesTraveled = 0;
            checkEngine = true;
        }
    }

    @Override
    public String toString() {
        return "Dashboard{" +
               "milesTraveled=" + milesTraveled +
               ", speed=" + speed +
               ", checkEngine=" + checkEngine +
               '}';
    }

    /**
     * String race(Dashboard other, int acc1, int acc2) - This method
     * should simulate a race between this dashboard and another dashboard called
     * "other". Each dashboard will accelerate in increments of 1 mph n1 and n2
     * times, respectively (i.e. dashboard 1 will accelerate() acc1 times, and
     * dashboard 2 ("other") will accelerate() acc2 times). If the first ("this")
     * dashboard stalls out (exceeds 100 mph at any point), the method should return
     * “First car stalled out!”. If the second ("other") dashboard stalls out at any
     * point, the method should return “Second car stalled out!”. Then, the method
     * should return the status of both dashboards and the result of the race. If one
     * dashboard stalls, the one that did not should be declared the winner. If
     * neither dashboard stalls, you can assume the winner is the dashboard with the
     * higher final speed. If both dashboards stalled or neither stalls but they have
     * the same speed, the result should be "It’s a tie!" See the sample run of the
     * student runner file for the proper return formatting.
     */

    String race(Dashboard other, int acc1, int acc2) {
        int max = Math.max(acc1, acc2);
        String result = "";
        boolean firstCarStalled;
        boolean secondCarStalled;
        for (int i = 0; i < max) {
            if (i < acc1) {
                accelerate();
            }
            if (i < acc2 &&) {
                other.accelerate();
            }
            if (speed == 0) {
                firstCarStalled = true;
            }
            if (other.speed == 0) {
                secondCarStalled = true;
            }
        }
        if (firstCarStalled) {
            result += "First car stalled out!\n";
        }
        if (secondCarStalled) {
            result += "Second car stalled out!\n";
        }
        if (firstCarStalled && secondCarStalled) {
            result += "Both cars stalled!";
        } else {
            if (speed > other.speed) {
                result += "First car wins\n";
            } else if (speed < other.speed) {
                result += "Second car wins\n";
            } else {
                result += "Tie!";
            }
        }
        return result;
    }

    @Override
    public int compareTo(Object o) {
        Dashboard that = (Dashboard) o;
        if (this.milesTraveled < that.milesTraveled) {
            return -1;
        } else if (this.milesTraveled > that.milesTraveled) {
            return 1;
        } else if (this.speed < that.speed) {
            return -1;
        } else if (this.speed > that.speed) {
            return 1;
        } else if (this.checkEngine == that.checkEngine) {
            return 0;
        } else if (checkEngine) {
            return -1;
        } else {
            return 1;
        }
    }
}
