package term2.assignment3;

import java.util.List;

public class Person {
    String firstName;
    String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String toString() {
        return lastName + ", " + firstName;
    }
}
