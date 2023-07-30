package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import org.junit.Test;
import org.junit.Test.None;

import src.NullCheckingV2;
import src.NullCheckingV3;
import src.NullCheckingV4;

public class NullCheckingTest {
    //Test for NullCheckingV2
    @Test(expected = NullPointerException.class)
    public void testV2ThrowNullPointerExp_NullColor() {
        new NullCheckingV2("", null);
    }
    
    @Test(expected = NullPointerException.class)
    public void testV2ThrowNullPointerExp_NullName() {
        new NullCheckingV2(null, "");
    }

    @Test(expected = None.class)
    public void testV2NotThrowAnyExp_AllValid() {
        new NullCheckingV2("null", "");
    }

    //Test for NullCheckingV3
    @Test
    public void testV3ThrowNullPointerExp_NullLicense() {
        var nullChecker = new NullCheckingV3("", "");
        assertThrows(IllegalArgumentException.class, 
            () -> nullChecker.assignDriver(null, ""));
    }
    
    @Test
    public void testV3ThrowNullPointerExp_NullLocation() {
        var nullChecker = new NullCheckingV3("", "");
        assertThrows(IllegalArgumentException.class, 
            () -> nullChecker.assignDriver("", null));
    }

    @Test
    public void testV3NotThrowAnyExp_AllValid() {
        var nullChecker = new NullCheckingV3("", "");
        assertDoesNotThrow(() -> nullChecker.assignDriver("", ""));
    }

    //Test for NullCheckingV4
    @Test (expected = None.class)
    public void testV4IfNullNameReturnDefault() {
        var nullChecker = new NullCheckingV4(null, "red");
        assertEquals("", nullChecker.getName());
        assertEquals("red", nullChecker.getColor());
    }

        @Test (expected = None.class)
    public void testV4IfNullColorReturnDefault() {
        var nullChecker = new NullCheckingV4("helo", null);
        assertEquals("helo", nullChecker.getName());
        assertEquals("", nullChecker.getColor());
    }
}
