package chapter_9;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Test;

public class StreamFinderTest {
    @Test
    public void testFindUniqueStringInList() {
        String[] strList = {"one", "one", "two", "one", "three", "two"};
        List<String> uniqueStr = Stream.of(strList).distinct().collect(Collectors.toList());
        assertEquals(3, uniqueStr.size());
        assertTrue(uniqueStr.contains("one"));
        assertTrue(uniqueStr.contains("two"));
        assertTrue(uniqueStr.contains("three"));
    }

}
