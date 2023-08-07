package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MinMaxArrayTest {
    @Test
    public void testMin() {
        var cal = new MinMaxArray(2,5,3,1,-1);
        assertEquals(Integer.valueOf(-1), cal.min());

        cal = new MinMaxArray(1);
        assertEquals(Integer.valueOf(1), cal.min());

        cal = new MinMaxArray();
        assertEquals(null, cal.min());
    }

        @Test
    public void testMax() {
       var cal = new MinMaxArray(2,5,3,1,-1);
        assertEquals(Integer.valueOf(5), cal.max());
    }

            @Test
    public void testAverage() {
       var cal = new MinMaxArray(2,5,3,1,-1);
        //assertEquals(-1, cal.avg());
    }
}
