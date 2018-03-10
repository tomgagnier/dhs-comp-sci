package assignments;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Assignment7Test {

    @Test
    public void duplicate() {
        assertEquals("I", Assignment7.duplicate("I"));
        assertEquals("HHHHiiii", Assignment7.duplicate("Hi"));
        assertEquals("HHHaaattt", Assignment7.duplicate("Hat"));
        assertEquals("HHHHHHHHaaaaaaaatttttttteeeeeeee", Assignment7.duplicate("Hate"));
    }

    @Test
    public void isEdhesivePalindrome() {
        assertTrue(Assignment7.isEdhesivePalindrome("racecar"));
        assertTrue(Assignment7.isEdhesivePalindrome("RaceCar"));
        assertTrue(Assignment7.isEdhesivePalindrome("R4ceCAr"));
        assertTrue(Assignment7.isEdhesivePalindrome("R4ceCAr"));
        assertTrue(Assignment7.isEdhesivePalindrome("r3divider"));
        assertTrue(Assignment7.isEdhesivePalindrome("0gopogO"));
        assertTrue(Assignment7.isEdhesivePalindrome("12345677654321"));

        assertFalse(Assignment7.isEdhesivePalindrome("mom"));
        assertFalse(Assignment7.isEdhesivePalindrome("dad"));
        assertFalse(Assignment7.isEdhesivePalindrome("hello"));
        assertFalse(Assignment7.isEdhesivePalindrome("AManAPlanAcanalPanama"));
        assertFalse(Assignment7.isEdhesivePalindrome("123456787654321"));
    }

    @Test
    public void numberScramble() {
        assertEquals(0.0, Assignment7.numberScramble(-0.01), 0.001);
        assertEquals(1.5811388300841898, Assignment7.numberScramble(0.0), 0.001);
        assertEquals(2.0, Assignment7.numberScramble(3.0), 0.001);
        assertEquals(3.0, Assignment7.numberScramble(13.0), 0.001);
        assertEquals(4.0, Assignment7.numberScramble(27.0), 0.001);
    }
}
