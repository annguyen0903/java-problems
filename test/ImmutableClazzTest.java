package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ImmutableClazzTest {
    @Test
    public void test(){
        var im = new ImmutableClazz("data");
        //im.setData("newData");
        assertEquals("data", im.getData());
    }
}
