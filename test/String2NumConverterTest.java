package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import src.String2NumConverter;

public class String2NumConverterTest {
    @Test
    public void testConvert2Int () {
        var converter = new String2NumConverter("+123");
        assertEquals("convet to int", 123, converter.parseInt());
        assertEquals("convet to long", 123, converter.parseLong());
        assertEquals(123, converter.parseFloat(), 0);
        //assertEquals("convet to float", 123f, converter.parseFloat());
        assertEquals(123, converter.parseDouble(), 0.0);
        //assertEquals("convet to double", 123.0, converter.parseDouble());
    }
}
