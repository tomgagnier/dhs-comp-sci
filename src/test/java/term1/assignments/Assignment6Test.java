package term1.assignments;

import java.util.Scanner;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Assignment6Test {

    @Test
    public void sorted() {
        assertTrue(Assignment6.sorted());
        assertTrue(Assignment6.sorted("One"));
        assertTrue(Assignment6.sorted("One", "Two"));

        assertFalse(Assignment6.sorted("One", "Two", "Three"));
        assertFalse(Assignment6.sorted("One", "Three", "Two", "Four"));
    }

    @Test
    public void arrayToString() {
        assertEquals("One Two Three", Assignment6.arrayToString("One", "Two", "Three"));
    }

    @Test
    public void normalize() {
        assertEquals("Tom", Assignment6.upperCaseFirstLowerCaseRest("tom"));
        assertEquals("Tom", Assignment6.upperCaseFirstLowerCaseRest("TOM"));
        assertEquals("Tom", Assignment6.upperCaseFirstLowerCaseRest("tOM"));
        assertEquals("Tom", Assignment6.upperCaseFirstLowerCaseRest("Tom"));
    }

    @Test
    public void readLinesUntilEndInput() {
        assertArrayEquals(new String[]{"Archie", "Betty", "Jughead", "Veronica"},
                          Assignment6.readLinesUntilEndInput(new Scanner("Archie\nBetty\nJughead\nVeronica\nEnd\n")));
    }

    @Test
    public void merge() {
        assertArrayEquals(new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"},
                          Assignment6.merge(new String[]{"1", "2", "8", "9"},
                                            new String[]{"0", "3", "4", "5", "6", "7"}));

        assertArrayEquals(new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"},
                          Assignment6.merge(new String[]{"0", "3", "4", "5", "6", "7"},
                                            new String[]{"1", "2", "8", "9"}));
    }
}
