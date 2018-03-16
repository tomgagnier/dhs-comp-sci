package lesson32;

import org.junit.Test;

import static lesson32.Lesson_32_Activity_1.toMonthName;
import static org.junit.Assert.*;

public class Lesson_32_Activity_1Test {
    @Test
    public void testToMonthName() throws Exception {
        assertEquals("January", toMonthName(1));
        assertEquals("February", toMonthName(2));
        assertEquals("March", toMonthName(3));
        assertEquals("April", toMonthName(4));
        assertEquals("May", toMonthName(5));
        assertEquals("June", toMonthName(6));
        assertEquals("July", toMonthName(7));
        assertEquals("August", toMonthName(8));
        assertEquals("September", toMonthName(9));
        assertEquals("October", toMonthName(10));
        assertEquals("November", toMonthName(11));
        assertEquals("December", toMonthName(12));
    }
}
