package chapter_8;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.function.Predicate;

import org.junit.Test;

public class LambdaExpTest {
    @Test
    public void testOnlyLambdaExp(){
        //declare a lambda expression
        Predicate<String> validString = s -> (s != null && !s.trim().isEmpty());
        //test it as following:
        assertTrue(validString.test("null"));
        assertFalse(validString.test("    "));
        assertFalse(validString.test(null));
    }
}
