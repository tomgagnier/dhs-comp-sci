package lesson32;

import org.junit.Test;

import static lesson32.Lesson_32_Activity_4.toHoursDigits;
import static lesson32.Lesson_32_Activity_4.toMinutesDigits;
import static lesson32.Lesson_32_Activity_4.toSecondsDigits;
import static org.junit.Assert.*;

public class Lesson_32_Activity_4Test {
    @Test
    public void testToHoursDigits() throws Exception {
        assertEquals(0, toHoursDigits(0));
        assertEquals(0, toHoursDigits(3599));
        assertEquals(1, toHoursDigits(3600));
        assertEquals(1, toHoursDigits(3601));
    }

    @Test
    public void testToMinutesDigits() throws Exception {
        assertEquals(0, toMinutesDigits(0));
        assertEquals(59, toMinutesDigits(3599));
        assertEquals(0, toMinutesDigits(3600));
        assertEquals(0, toMinutesDigits(3659));
        assertEquals(1, toMinutesDigits(3660));
    }

    @Test
    public void testToSecondsDigits() throws Exception {
        assertEquals(0, toSecondsDigits(0));
        assertEquals(1, toSecondsDigits(1));
        assertEquals(59, toSecondsDigits(59));
        assertEquals(0, toSecondsDigits(60));
    }
}
