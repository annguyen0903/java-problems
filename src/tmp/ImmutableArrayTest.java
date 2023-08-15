package src.tmp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

public class ImmutableArrayTest {
    @Test
    public void test() throws CloneNotSupportedException {
        var task2 = new Task(2, "dog");
        var array = new ImmutableArray(new Task(1, "ab"), 
          task2, new Task(3, "cat"));
        assertEquals(3, array.size());
        task2.setName("dog-updated");
        assertTrue(new Task(2, "dog").equals(array.get(1)));
        Collections.unmodifiableList(Arrays.asList(1,2,3));
        List.of("a", "b");
    }
}
