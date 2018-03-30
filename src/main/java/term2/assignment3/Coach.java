package term2.assignment3;

public class Coach extends Person {
    String role;

    public Coach(String firstName, String lastName, String role) {
        super(firstName, lastName);
        this.role = role;
    }

    public String toString() {
        return super.toString() + "\n   Role: " + role;
    }
}
