package term2.assignment3;

public class Captain extends UltimatePlayer {
    boolean isOffense;

    public Captain(String firstName, String lastName, String position, boolean isOffense) {
        super(firstName, lastName, position);
        this.isOffense = isOffense;
    }

    public String toString() {
        return super.toString() + "\n   Captain: " + (isOffense ? "offense" : "defense");
    }
}
