package src.tmp;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RemovingCharsTest {
    @Test
    public void test() {
        var engine = new RemovingChars("abbcc@11--  e", 'a', 'k', 'b', 'c', '1');
        assertEquals("@--  e", engine.RemoveChars());
    }

        @Test
    public void testNonRemovedChar() {
        var engine = new RemovingChars("abbcc@11--  e");
        assertEquals("abbcc@11--  e", engine.RemoveChars());
    }
}
