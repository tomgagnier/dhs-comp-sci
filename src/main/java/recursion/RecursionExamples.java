package recursion;

/**
 * Simple example of recursion.
 */
public class RecursionExamples {

    public static String bangbang(String s) {
        if (s.length() < 10) {
            return bangbang(s + "!");
        }
        return s;
    }

    public static void main(String[] args) {
        System.out.println(bangbang("Dunwoody"));
        System.out.println(bangbang("Wildcats"));
        System.out.println(bangbang("Rock"));
    }

}
