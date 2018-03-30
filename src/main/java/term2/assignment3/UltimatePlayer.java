package term2.assignment3;

public class UltimatePlayer extends Person {
    static int lastJerseyNumber = 0;
    int jerseyNumber;
    String position;

    public UltimatePlayer(String firstName, String lastName, String position) {
        super(firstName, lastName);
        this.position = position;
        jerseyNumber = ++lastJerseyNumber;
    }

    public String toString() {
        return super.toString() + "\n   Jersey #: " + jerseyNumber + "\n   Position: " + position;
    }
}
