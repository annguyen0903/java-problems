package src.tmp;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.junit.Test;

public class StreamingArray {
    @Test
    public void testStreammingArrayObjects(){
        Integer[] numbers = {4,1,6,2};
        //Arrays.stream(numbers).forEach(System.out::println);
        Stream.of(numbers).forEach(System.out::println);
        Stream.of(numbers).mapToInt(i->i).toArray();
        
    }

    @Test
    public void testStreammingArrayPrimitives() {
        int[] numbers = {4,1,6,2};
        //Arrays.stream(numbers).forEach(System.out::println);
        IntStream.of(numbers).forEach(System.out::println);
        IntStream.of(numbers).toArray();
    }
}
