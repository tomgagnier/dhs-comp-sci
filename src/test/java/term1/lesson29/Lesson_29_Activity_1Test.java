package term1.lesson29;

import org.junit.Test;

import static term1.lesson29.Lesson_29_Activity_1.firstLongestWord;
import static org.junit.Assert.assertEquals;

public class Lesson_29_Activity_1Test {
    @Test
    public void testFirstLongestWord() {
        assertEquals("", firstLongestWord());
        assertEquals("first", firstLongestWord("first"));
        assertEquals("second", firstLongestWord("first", "second"));
        assertEquals("seventh",
                     firstLongestWord("first", "second", "third", "fourth", "fifth", "sixth",
                                      "seventh", "eigth", "ninth", "tenth"));
    }
}
