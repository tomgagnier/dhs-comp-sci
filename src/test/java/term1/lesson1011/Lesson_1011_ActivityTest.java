package term1.lesson1011;

import org.junit.Test;

import static term1.lesson1011.Lesson_1011_Activity.toInt;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.fail;
import static util.TestFunctions.assertThrows;

public class Lesson_1011_ActivityTest {
    @Test
    public void testToInt() {
        assertEquals(0, toInt("0"));
        assertEquals(1, toInt("1"));
        assertEquals(7, toInt("7"));
        assertEquals(8, toInt("10"));
        assertEquals(64, toInt("100"));
        assertEquals(83, toInt("123"));
        assertEquals(512, toInt("1000"));
    }

    @Test
    public void testToIntThrowsWhenCharLessThan0() {
        assertThrows(new IllegalArgumentException("/ is unsupported"), () -> toInt("/"));
    }

    @Test
    public void testToIntThrowsWhenCharGreaterThan8() {
        assertThrows(new IllegalArgumentException("8 is unsupported"), () -> toInt("8"));
    }

    @Test
    public void testToIntWhenTooLong() {
        assertThrows(new IllegalArgumentException("input too long"), () -> toInt("123456701"));
    }
}
