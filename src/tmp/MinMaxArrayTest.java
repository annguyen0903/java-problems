package src.tmp;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MinMaxArrayTest {
    @Test
    public void testMin() {
        var cal = new MinMaxArray(2, 5, 3, 1, -1);
        assertEquals(Integer.valueOf(-1), cal.min());

        cal = new MinMaxArray(1);
        assertEquals(Integer.valueOf(1), cal.min());

        cal = new MinMaxArray();
        assertEquals(null, cal.min());
    }

    @Test
    public void testMax() {
        var cal = new MinMaxArray(2, 5, 3, 1, -1);
        assertEquals(Integer.valueOf(5), cal.max());

        cal = new MinMaxArray(2);
        assertEquals(Integer.valueOf(2), cal.max());

        cal = new MinMaxArray();
        assertEquals(null, cal.max());
    }

    @Test
    public void testAverage() {
        var cal = new MinMaxArray(2, 5, 3);
        assertEquals(3.33, cal.avg(), 0.01);

        cal = new MinMaxArray(2);
        assertEquals(2.0, cal.avg(), 0);

        cal = new MinMaxArray();
        assertEquals(0.0, cal.avg(), 0);
    }
}
