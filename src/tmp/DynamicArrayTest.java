package src.tmp;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.Test;

public class DynamicArrayTest {
    @Test
    public void testIncreaseSizeByOne() {
        var array = new DynamicArray(1, 2, 3);
        assertEquals(3, array.size());
        assertEquals(3, array.capacitySize());
        array.add(4);
        assertEquals(4, array.size());
        assertEquals(4, array.capacitySize());
        assertEquals(4, array.get(3));
    }

    @Test
    public void testInitEmptyArray() {
        var array = new DynamicArray();
        assertEquals(0, array.size());
        assertEquals(0, array.capacitySize());
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> array.get(0), "");
    }

        @Test
    public void testIncreaseSizeByN() {
        var array = new DynamicArray(1, 2, 3);
        assertEquals(3, array.size());
        assertEquals(3, array.capacitySize());
        array.increaseCapacityBy(4);
        array.add(4);
        assertEquals(4, array.size());
        assertEquals(7, array.capacitySize());
        assertEquals(4, array.get(3));
    }
}
