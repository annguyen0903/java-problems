package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import src.RemovingSpaces;

public class RemovingSpacesTest {
    @Test
    public void testMultipleSpaces() {
        var engine = new RemovingSpaces(" a   s1trinG w ith sp aces    ");
        assertEquals("remove all spaces", "as1trinGwithspaces", engine.removeSpace());
    }

    @Test
    public void testOnlySpace() {
        var engine = new RemovingSpaces("     ");
        assertEquals("empty string", "", engine.removeSpace());
    }

    @Test
    public void testSpecialSpace() {
        var engine = new RemovingSpaces("i-have@n123aplle\n\t\r");
        assertEquals("nothing change", "i-have@n123aplle", engine.removeSpace());
    }

    @Test
    public void testNoSpace() {
        var engine = new RemovingSpaces("i-have@n123aplle");
        assertEquals("nothing change", "i-have@n123aplle", engine.removeSpace());
    }
}
