package chapter_9;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Test;

public class StreamSummarizeTest {
    @Test
    public void test() {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);
        Optional<Integer> min = nums.stream()
                .collect(Collectors.minBy((o1, o2) -> o1.compareTo(o2)));
        assertTrue(min.isPresent());
        assertEquals(1, min.get().intValue());

        double average = nums.stream().collect(Collectors.averagingInt(value -> value.intValue()));
        assertEquals(3.0, average, 0.0);

        Long cnt = nums.stream().collect(Collectors.counting());
        assertEquals(5, cnt.longValue());

        IntSummaryStatistics statistics = nums.stream().collect(Collectors.summarizingInt(value -> value.intValue()));
        System.out.println(statistics.toString());

        String str = "Lorem Ipsum is simply dummy text ...";
        long numberOfWords = Stream.of(str)
                .map(w -> w.split("\\s+"))
                .peek(t -> System.out.println("Map element: " + t.toString()))
                .flatMap(Arrays::stream)
                .peek(t -> System.out.println("FlatMap element: " + t))
                .filter(w -> w.trim().length() != 0)
                .count();
        assertEquals(7, numberOfWords);
    }
}
