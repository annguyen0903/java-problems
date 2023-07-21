package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import src.StringPermutation;

public class StringPermutationTest {
    @Test
    public void testSimplePermutation() {
        var permutation = new StringPermutation("a1#");
        assertEquals("Simple permutation", 6, permutation.total());
    }

    @Test
    public void testPermutationWith4Chars() {
        var permutation = new StringPermutation("abcd");
        assertEquals("Simple permutation", 24, permutation.total());
    }

    @Test
    public void testPermutationDupplicateChars() {
        var permutation = new StringPermutation("aac");
        assertEquals("Simple permutation", 3, permutation.total());

    }

    @Test
    public void testPermutationDupplicate2Chars() {
        var permutation = new StringPermutation("cc");
        assertEquals("Simple permutation", 1, permutation.total());

    }

    @Test
    public void testPermutationEmpty() {
        var permutation = new StringPermutation("");
        assertEquals("Simple permutation", 0, permutation.total());
    }

    @Test
    public void testPermutationSingleChar() {
        var permutation = new StringPermutation("c");
        assertEquals("Simple permutation", 1, permutation.total());

    }
}
