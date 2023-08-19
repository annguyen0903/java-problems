package src.chapter_8;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Collections;
import java.util.function.IntPredicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.junit.Test;

public class NonZeroFilterTest {
    @Test
    public void test(){
        //non-zero? number type
        var intStream = IntStream.of(1, 2, 0, 0, 2, 5);//6 elements
        IntPredicate nonZeroFilter = i -> i != 0;
        var result = intStream.filter(nonZeroFilter).boxed().collect(Collectors.toList());
        assertTrue(result.size() == 4);
        assertFalse(result.contains(0));
    }
}
