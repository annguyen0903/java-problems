package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import src.CharacterCounter;

public class CharacterCounterTest {
    @Test
    public void testCharacterCounter () {
        var counter = new CharacterCounter("This is @ spec1al STRIng");
        assertEquals("null", 2 ,counter.countCharacter('i'));
        assertEquals("null", 4 ,counter.countCharacter(' '));
        assertEquals("null", 1 ,counter.countCharacter('@'));
        assertEquals("null", 2 ,counter.countCharacter('T'));
    }
}