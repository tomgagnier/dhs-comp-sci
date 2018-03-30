package term2.lesson05;

/**
 * For this exercise, you will create a Student class to hold student data. In previous exercises, we had a requirement
 * that you name your class Main. In this exercise, you must name your class Student.
 *
 * Your Student class should include the following information: first name, last name, grade level, GPA, and a student
 * id. Grade level is an integer value ranging from 0 to 12, with 0 representing kindergarten. GPA is a decimal value
 * ranging from 0 to 4.5. Student id is an integer value. The first student id is 1, the second student id is 2, the
 * next is 3, and so on. When a new Student is created, your code should automatically initialize student id to the next
 * integer value. For example, if the last created Student's student id is 17, the next student id generated should be
 * 18.
 *
 * Your student class should include the following methods:
 *
 * Student() - Constructs a new student with first name and last name set to "None", grade level set to 0 and GPA set to
 * 0.0. The student id should automatically be set to the next integer.
 *
 * Student(String firstName, String lastName, int gradeLevel, double gpa) -  Constructs a new student with variables
 * initialized to the values specified. The grade level should only be allowed to range between 0 and 12 inclusive, 0
 * represents kindergarten. Otherwise, set the grade level to 0. The GPA should only be allowed to range from 0.0 to
 * 4.5, inclusive. Otherwise, set the GPA to 0.0. The student id should automatically be set to the next integer.
 *
 * String toString() -  Returns the student information as a String in the following format (notice line breaks after
 * the first name and GPA): /* /*
 *
 * Dovi, Mrs
 * GPA: 4.0
 * Grade Level: 7 id # 4
 *
 * To test your code prior to submission, download the runner class StudentRunner.java (Links to an external
 * site.)Links to an external site. to the same folder that holds your Student.java implementation. Run
 * StudentRunner.main class and verify that the output matches the sample run below. Please feel free to change
 * the runner to test different values to make sure your program fits the requirements. We will use a similar runner
 * class to grade the program.
 *
 * Sample Run
 *
 * None, None
 * GPA: 0.0
 * Grade Level: 0 id # 1
 * None, None
 * GPA: 0.0
 * Grade Level: 0 id # 2
 * None, None
 * GPA: 0.0
 * Grade Level: 0 id # 3
 * Dovi, Mrs.
 * GPA: 3.4
 * Grade Level: 7 id # 4
 *
 * When you are done coding and testing, copy and paste your entire Student class into the Code Runner and press "Run"
 * to submit the exercise. Use the "Check Answer" button to get additional feedback on your work.
 */
@SuppressWarnings("ALL")
public class Student {
    private static int lastAssignedStudentId = 0;

    private final int    studentId;
    private final String firsName;
    private final String lastName;
    private final int    gradeLevel;
    private final double gpa;

    public Student(String firsName, String lastName, int gradeLevel, double gpa) {
        studentId = ++lastAssignedStudentId;

        this.firsName = firsName;
        this.lastName = lastName;
        this.gradeLevel = gradeLevel;
        this.gpa = gpa;
    }

    public Student() {
        this("None", "None", 0, 0.0);
    }

    public String toString() {
        return lastName + ", " + firsName + "\nGPA: " + gpa + "\nGrade Level: " + gradeLevel + " id # " + studentId;
    }
}
