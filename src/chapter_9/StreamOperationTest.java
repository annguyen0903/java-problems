package chapter_9;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.junit.Test;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

public class StreamOperationTest {
    @Test
    public void testSumOnStream(){
        List<Melon> melons = Arrays.asList(
            new Melon("A", 10),
            new Melon("B", 9),
            new Melon("A", 8),
            new Melon("C", 7),
            new Melon("C", 6));
        int sumWeight = melons.stream().mapToInt(value -> value.getWeight()).sum();
        assertEquals(40, sumWeight);
    }

    @Test
    public void testMinOnStream(){
        List<Melon> melons = Arrays.asList(
            new Melon("A", 10),
            new Melon("B", 9),
            new Melon("A", 8),
            new Melon("C", 7),
            new Melon("C", 6));
        Optional<Melon> minMelon = melons.stream()
            .min((o1, o2) -> Integer.compare(o1.getWeight(), o2.getWeight()));
        assertTrue(minMelon.isPresent());
        assertEquals(6, minMelon.get().getWeight());
    }

}

@Getter
@AllArgsConstructor
class Melon {
    String type;
    int weight;
}