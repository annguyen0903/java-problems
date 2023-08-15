package src.tmp;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PalindromeCheckingTest {
    @Test
    public void testTruePalindrome() {
        var checker = new PalindromeChecking("inpupni");
        assertEquals(true, checker.isPalindrome());
    }

    @Test
    public void testTruePalindromePhase() {
        var checker = new PalindromeChecking("I NOD DON I");
        assertEquals(true, checker.isPalindrome());
    }

    @Test
    public void testFalsePalindrome() {
        var checker = new PalindromeChecking("abc");
        assertEquals(false, checker.isPalindrome());
    }
}
