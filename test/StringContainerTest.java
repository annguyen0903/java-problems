package test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import src.StringContainer;

public class StringContainerTest {
    @Test
    public void test() {
        var container = new StringContainer("input str sample");
        assertTrue(container.contains("str"));
        assertFalse(container.contains("helo"));
    }
}
