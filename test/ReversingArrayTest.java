package test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

public class ReversingArrayTest {
    @Test
    public void testReverseNumbers() {
        var engine = new ReversingArray(1, 2, 3, 4, 5);
        var reversedArr = engine.reverse();
        assertEquals(5, reversedArr.length);
        System.out.println(Arrays.toString(reversedArr));
    }

    @Test
    public void testReverseChars() {
        var engine = new ReversingArray('a', 'b', 'c', 'd');
        var reversedArr = engine.reverse();
        assertEquals(4, reversedArr.length);
        System.out.println(Arrays.toString(reversedArr));
    }

    @Test
    public void testReverseStrings() {
        var engine = new ReversingArray("a", "b", "c", "d");
        var reversedArr = engine.reverse();
        assertEquals(4, reversedArr.length);
        System.out.println(Arrays.toString(reversedArr));
    }

    @Test
    public void testReverseOthers() {
        var engine = new ReversingArray(new Task(0, "ab"),
            new Task(1, "or"), new Task(2, "null"));
        var reversedArr = engine.reverse();
        assertEquals(3, reversedArr.length);
        System.out.println(Arrays.toString(reversedArr));
    }
}

class Task {
    private int id;
    private String name;
    public Task(int id, String name) {
        this.id = id;
        this.name = name;
    }
    @Override
    public String toString() {
        return "Task [id=" + id + ", name=" + name + "]";
    }
    
}
