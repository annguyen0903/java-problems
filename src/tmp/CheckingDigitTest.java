package src.tmp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CheckingDigitTest {
    @Test
    void testDigitLetter() {
        var checker = new CheckingDigit("123abc123");
        assertEquals(false, checker.hasOnlyDigit(), "has letters");
    }

    @Test
    void testDigitOnly() {
        var checker = new CheckingDigit("123123");
        assertEquals(true, checker.hasOnlyDigit(), "has digit only");
    }

    @Test
    void testLetterOnly() {
        var checker = new CheckingDigit("acbs");
        assertEquals(false, checker.hasOnlyDigit(), "has letter only");
    }

    @Test
    void testOtherCharsOnly() {
        var checker = new CheckingDigit("!@#$(*^");
        assertEquals(false, checker.hasOnlyDigit(), "has other characters only");
    }
}
