package src.tmp;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class StringContainerTest {
    @Test
    public void test() {
        var container = new StringContainer("input str sample");
        assertTrue(container.contains("str"));
        assertFalse(container.contains("helo"));
    }
}
