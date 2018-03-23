package term1.lesson29;

import org.junit.Test;

import static term1.lesson29.Lesson_29_Activity_2.reverse;
import static org.junit.Assert.assertEquals;

public class Lesson_29_Activity_2Test {
    @Test
    public void testReverse() {
        assertEquals("", reverse(""));
        assertEquals("r", reverse("r"));
        assertEquals("rat", reverse("tar"));
        assertEquals("esrever", reverse("reverse"));
    }
}
