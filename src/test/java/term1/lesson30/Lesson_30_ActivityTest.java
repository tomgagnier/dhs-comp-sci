package term1.lesson30;

import org.junit.Test;

import static term1.lesson30.Lesson_30_Activity.removeSpacesFromArray;
import static term1.lesson30.Lesson_30_Activity.removeSpacesFromWord;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class Lesson_30_ActivityTest {

    @Test
    public void testMain() {
        assertArrayEquals(new String[]{"every", " near ing ", " checking", "food ", "stand", "value "},
                          Lesson_30_Activity.list);

        Lesson_30_Activity.main();

        assertArrayEquals(new String[]{"every", "nearing", "checking", "food", "stand", "value"},
                          Lesson_30_Activity.list);
    }

    @Test
    public void testRemoveSpacesFromWord() {
        assertArrayEquals(new String[]{"every", "nearing", "checking", "food", "stand", "value"},
                          removeSpacesFromArray("every", " near ing ", " checking", "food ", "stand", "value "));
    }

    @Test
    public void testRemoveSpaces() {
        assertEquals("every", removeSpacesFromWord("every"));
        assertEquals("nearing", removeSpacesFromWord(" near ing "));
        assertEquals("checking", removeSpacesFromWord(" checking"));
        assertEquals("food", removeSpacesFromWord("food "));
        assertEquals("stand", removeSpacesFromWord("stand"));
        assertEquals("value", removeSpacesFromWord("value "));
    }
}
