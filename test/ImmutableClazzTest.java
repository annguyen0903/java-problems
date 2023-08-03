package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ImmutableClazzTest {
    @Test
    public void testImmutableClazz(){
        //TODO: What if immutable class has attribute is a arrayList (.asList)
    }

    @Test
    public void testPassingMutable2Immutable() {
        var m = new MutableClazz("mutable data");
        var im = new ImmutableClazz("immutable data", m);
        m.setData("updated mutable data");
        assertEquals("mutable data", im.getMutableData().getData());
    }

        @Test
    public void testReturningMutableFromImmutable() {
        var m = new MutableClazz("mutable data");
        var im = new ImmutableClazz("immutable data", m);
        var m2 = im.getMutableData();
        m2.setData("updated mutable data");
        assertEquals("mutable data", im.getMutableData().getData());
    }
}
