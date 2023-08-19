package src.chapter_8;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

import org.junit.Test;

public class HighOrderFuncTest {
    //function received another function as a param
    @Test
    public void testReceivedFunction() {
        List<String> strings = new ArrayList<>(Arrays.asList(null, "bcd", "cda", "ccd"));
        var highOrderFunc = new HighOrderFunc();
        List<String> result = highOrderFunc.upperCase(strings, (String s) -> {return s.toUpperCase();});
        assertTrue(result.size() == 3);
        assertTrue(result.contains("BCD"));
        assertTrue(result.contains("CDA"));
        assertTrue(result.contains("CCD"));
    }

    //function return another function
    @Test
    public void testReturnFunction() {
        var highOrderFunc = new HighOrderFunc();
        Predicate<String> predicate = highOrderFunc.getValidPredicate();
        List<String> strings = new ArrayList<>(Arrays.asList("abc", "bcd", "cda", "ccd"));
        List<String> result = highOrderFunc.filterStrings(strings, predicate);
        assertTrue(result.size() == 2);
        assertTrue(result.contains("abc"));
        assertTrue(result.contains("cda"));


        Function<String, String> f1 = s -> s.toUpperCase();
        Function<String, String> f2 = s -> s.concat(" DONE");
        Function<String, String> f3 = s -> s.repeat(2);
        Function<String, String> f = highOrderFunc.convertString(f1, f2, f3);
        assertEquals("TEST DONETEST DONE", f.apply("test"));
    }
}
