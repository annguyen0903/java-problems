package src.tmp;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import org.junit.Test;

public class JoiningStringsTest {
    @Test
    public void test(){
        var strings = Arrays.asList("null", "", "is", null, "fun");
        var js = new JoiningStrings(strings, ' ');
        assertEquals("join multiple strings", "null is fun", js.join());
        
        
    }

    
}
