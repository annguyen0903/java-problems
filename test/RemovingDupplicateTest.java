package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import src.RemovingDupplicate;

public class RemovingDupplicateTest {
    @Test
    public void testDupplicate() {
        var engine = new RemovingDupplicate("abcabc");
        assertEquals("abc", engine.removeDupplicateChars());
    }

        @Test
    public void testNonDupplicate() {
        var engine = new RemovingDupplicate("1_3 4s#@~");
        assertEquals("1_3 4s#@~", engine.removeDupplicateChars());
    }

        @Test
    public void testDupplicate2() {
        var engine = new RemovingDupplicate("  a@aa  g@eeg");
        assertEquals(" a@ge", engine.removeDupplicateChars());
    }
}
