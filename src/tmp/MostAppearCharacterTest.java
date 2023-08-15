package src.tmp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class MostAppearCharacterTest {
    @Test
    public void testOneMostAppearChar() {
        var counter = new MostAppearCharacter("a @@ba ba");
        var chars = counter.findMostAppearChars();
        assertEquals(1, chars.size());
        assertEquals(Character.valueOf('a'), chars.get(0));
    }

        @Test
    public void testTwoMostAppearChars() {
        var counter = new MostAppearCharacter("123abc123@@@   1b");
        var chars = counter.findMostAppearChars();
        assertEquals(3, chars.size());
        assertTrue(chars.contains('1'));
        assertTrue(chars.contains('@'));
        assertTrue(chars.contains(' '));
    }

}
