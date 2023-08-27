package chapter_9;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.Test;

public class StreamJoinerTest {
    @Test
    public void test(){
        List<String> strList = Arrays.asList("ab", "cd", "ef");
        String joinedStr = strList.stream().collect(Collectors.joining());
        assertEquals("abcdef", joinedStr);

        String joinedStr2 = strList.stream().collect(Collectors.joining(","));
        assertEquals("ab,cd,ef", joinedStr2);

        String joinedStr3 = strList.stream().collect(Collectors.joining("", "p", "s"));
        assertEquals("pabcdefs", joinedStr3);
    }
}
