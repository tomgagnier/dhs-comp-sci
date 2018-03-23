package term1.lesson32;

import org.junit.Test;

import static term1.lesson32.Lesson_32_Activity_2.toNumberOfDays;
import static org.junit.Assert.*;

public class Lesson_32_Activity_2Test {
    @Test
    public void testToNumberOfDays() throws Exception {
        assertEquals(31, toNumberOfDays(1));
        assertEquals(28, toNumberOfDays(2));
        assertEquals(31, toNumberOfDays(3));
        assertEquals(30, toNumberOfDays(4));
        assertEquals(31, toNumberOfDays(5));
        assertEquals(30, toNumberOfDays(6));
        assertEquals(31, toNumberOfDays(7));
        assertEquals(31, toNumberOfDays(8));
        assertEquals(30, toNumberOfDays(9));
        assertEquals(31, toNumberOfDays(10));
        assertEquals(30, toNumberOfDays(11));
        assertEquals(31, toNumberOfDays(12));
    }
}
