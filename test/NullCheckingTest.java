package test;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import org.junit.Test;
import org.junit.Test.None;

import src.NullCheckingV2;
import src.NullCheckingV3;

public class NullCheckingTest {
    //Test for NullCheckingV2
    @Test(expected = NullPointerException.class)
    public void testV2ThrowNullPointerExp_NullColor() {
        var nullChecker = new NullCheckingV2("", null);
    }
    
    @Test(expected = NullPointerException.class)
    public void testV2ThrowNullPointerExp_NullName() {
        var nullChecker = new NullCheckingV2(null, "");
    }

    @Test(expected = None.class)
    public void testV2NotThrowAnyExp_AllValid() {
        var nullChecker = new NullCheckingV2("null", "");
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
}
