package test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

public class ReversingArrayTest {
    @Test
    public void testReverseNumbers() {
        var engine = new ReversingArray(1, 2, 3, 4, 5);
        var reversedArr = engine.reverse();
        assertEquals(5, reversedArr.length);
        System.out.println(Arrays.toString(reversedArr));
    }

    @Test
    public void testReverseChars() {
        var engine = new ReversingArray('a', 'b', 'c', 'd');
        var reversedArr = engine.reverse();
        assertEquals(4, reversedArr.length);
        System.out.println(Arrays.toString(reversedArr));
    }

    @Test
    public void testReverseStrings() {
        var engine = new ReversingArray("a", "b", "c", "d");
        var reversedArr = engine.reverse();
        assertEquals(4, reversedArr.length);
        System.out.println(Arrays.toString(reversedArr));
    }
}
