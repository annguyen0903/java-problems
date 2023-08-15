package src.tmp;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.HashMap;

import org.junit.Test;

public class MapComparatorTest {
    @Test
    public void testEqualMaps(){
        var map1 = new HashMap<Integer, String>();
        map1.put(1, "null");
        map1.put(2, "nonull");
        var map2 = new HashMap<Integer, String>();
        map2.put(1, "null");
        map2.put(2, "nonull");
        var comparator = new MapComparator();
        assertTrue(comparator.compareEqual(map1, map2));
    }

    @Test
    public void testMapDiffSize(){
        var map1 = new HashMap<Integer, String>();
        map1.put(1, "null");
        map1.put(2, "nonull");
        var map2 = new HashMap<Integer, String>();
        map2.put(1, "null");
        var comparator = new MapComparator();
        assertFalse(comparator.compareEqual(map1, map2));
    }

    @Test
    public void testMapDiffKey(){
        var map1 = new HashMap<Integer, String>();
        map1.put(1, "null");
        map1.put(2, "nonull");
        var map2 = new HashMap<Integer, String>();
        map2.put(1, "null");
        map2.put(3, "nonull");
        var comparator = new MapComparator();
        assertFalse(comparator.compareEqual(map1, map2));
    }

    @Test
    public void testMapDiffValue(){
        var map1 = new HashMap<Integer, String>();
        map1.put(1, "null");
        map1.put(2, "null");
        var map2 = new HashMap<Integer, String>();
        map2.put(1, "null");
        map2.put(2, "nonull");
        var comparator = new MapComparator();
        assertFalse(comparator.compareEqual(map1, map2));
    }
}
