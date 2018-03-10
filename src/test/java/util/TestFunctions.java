package util;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.fail;

public class TestFunctions {
    /**
     * Assert the runnable throws the expected exception.
     */
    public static void assertThrows(Exception expected, Runnable runnable) {
        try {
            runnable.run();
            fail("Expected " + expected.getClass().getSimpleName());
        } catch (Exception e) {
            assertSame(expected.getClass(), e.getClass());
            assertEquals(expected.getMessage(), e.getMessage());
        }
    }
}
