package test;

import org.junit.Test;
import org.junit.Test.None;

public class IndexCheckerTest {
    @Test (expected = IndexOutOfBoundsException.class)
    public void testOutOfRange_EqualLength() {
        var checker = new IndexChecker(3);
        checker.inRange(3);
    }

        @Test (expected = IndexOutOfBoundsException.class)
    public void testOutOfRange_Negative() {
        var checker = new IndexChecker(3);
        checker.inRange(-1);
    }

    @Test (expected = None.class)
    public void testInRange() {
        var checker = new IndexChecker(3);
        checker.inRange(2);
    }

    //Test IndexCheckerV2
    @Test(expected = IndexOutOfBoundsException.class)
    public void testOutOfRange_GreaterThan() {
        var checker = new IndexCheckerV2(10);
        checker.inRange(9,11);
    }

        @Test(expected = IndexOutOfBoundsException.class)
    public void testOutOfRange_SmallerThan() {
        var checker = new IndexCheckerV2(10);
        checker.inRange(-1,10);
    }

        @Test(expected = IndexOutOfBoundsException.class)
    public void testOutOfRange_WrapOutside() {
        var checker = new IndexCheckerV2(10);
        checker.inRange(-5, 12);
    }

        @Test(expected = IndexOutOfBoundsException.class)
    public void testOutOfRange_AllRightOutside() {
        var checker = new IndexCheckerV2(10);
        checker.inRange(13, 16);
    }

        @Test(expected = None.class)
    public void testInRange_normal() {
        var checker = new IndexCheckerV2(10);
        checker.inRange(5, 9);
    }
}
