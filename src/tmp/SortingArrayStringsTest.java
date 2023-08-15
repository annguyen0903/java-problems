package src.tmp;

import static org.junit.Assert.assertEquals;
import java.util.Arrays;

import org.junit.Test;

public class SortingArrayStringsTest {
    @Test
    public void test(){
        var listStrings = Arrays.asList("abc", "", "a", "1111", "acbdd", "A", "@@");
        var sorter = new SortingArrayStrings();
        var sortedList = sorter.sortStringByLength(listStrings);
        //expected order? "" < a < A < @@ < abc < 1111 < acbdd
        assertEquals(7, sortedList.size());
        assertEquals("", sortedList.get(0));
        assertEquals("acbdd", sortedList.get(6));
        sortedList.forEach(System.out::println);
    }
    
}
