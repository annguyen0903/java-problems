package src.tmp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.HashMap;

import org.junit.Test;

public class MapMergingTest {
    @Test
    public void testMergingUniqueMap() {
        var map1 = new HashMap<Integer, String>();
        map1.put(1, "one");
        map1.put(2, "two");
        var map2 = new HashMap<Integer, String>();
        map2.put(3, "three");
        map2.put(4, "four");
        var merging = new MapMerging();
        var map3 = merging.merge(map1, map2);
        assertEquals(4, map3.size());
        assertEquals("two", map3.get(2));
        assertEquals("three", map3.get(3));
    }

    @Test
    public void testMergingIntersecMap() {
        var map1 = new HashMap<Integer, String>();
        map1.put(1, "one");
        map1.put(2, "two");
        var map2 = new HashMap<Integer, String>();
        map2.put(2, "two-2");
        map2.put(4, "four");
        var merging = new MapMerging();
        var map3 = merging.merge(map1, map2);
        assertEquals(3, map3.size());
        assertFalse(map3.containsValue("two"));
        assertTrue(map3.containsValue("two-2"));
    }

    @Test
    public void testMergingOtherMapType() {
        var map1 = new HashMap<Character, Integer>();
        map1.put('1', 1);
        map1.put('2', 2);
        var map2 = new HashMap<Character, Integer>();
        map2.put('2', null);
        map2.put('4', 4);
        var merging = new MapMerging();
        var map3 = merging.merge(map1, map2);
        assertEquals(3, map3.size());
        assertFalse(map3.containsValue(2));
        assertTrue(map3.containsValue(null));
    }
}


