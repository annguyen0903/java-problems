package src.tmp;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class VowelsCounterTest {
    @Test
    public void testVowelsWithSimpleString() {
        var counter = new VowelsCounter("String");
        assertEquals("count for vowels", 1, counter.countVowels());
    }

    @Test
    public void testVowelsWithComplexString() {
        var counter = new VowelsCounter("This is @ complex STRING for c0un7ing vowels");
        assertEquals("count for vowels", 10, counter.countVowels());
    }

    @Test
    public void testConsonantsWithComplexString() {
        var counter = new VowelsCounter("This is @ complex STRING for c0un7ing vowels");
        assertEquals("count for consonant", 24, counter.countConsonant());
    }
}
