package src.tmp;

import java.util.HashMap;

import org.junit.Test;

import src.tmp.MapSorter.Task;

public class MapSorterTest {
    @Test
    public void testSortMapByKey_NaturalOrder(){
        var map1 = new HashMap<String, String>();
        map1.put("A", "a");
        map1.put("C", "c");
        map1.put("B", "b");
        //var sorter = new MapSorter();
        //sorter.sortNatural(map1);
        // A -> B -> C
        map1.forEach((k, v) -> System.out.println(k + " " + v));
    }

    @Test
    public void testSortMapByKey_ReverseOrder(){
        var map1 = new HashMap<Integer, String>();
        map1.put(1, "a");
        map1.put(3, "c");
        map1.put(2, "b");
        var sorter = new MapSorter();
        var map2 = sorter.sortReverseByKey(map1);
        //3 -> 2 -> 1
        map2.forEach((k, v) -> System.out.println(k + " " + v));
    }

    @Test
    public void testSortMapByValue_NaturalOrder(){
        var map1 = new HashMap<String, String>();
        map1.put("C", "a");
        map1.put("B", "c");
        map1.put("A", "b");
        var sorter = new MapSorter();
        var map2 = sorter.sortNaturalByValue(map1);
        // a -> b -> c
        map2.forEach((k, v) -> System.out.println(k + " " + v));
    }    

    @Test
    public void testSortMapByValue_ReverseOrder(){
        var map1 = new HashMap<String, String>();
        map1.put("C", "a");
        map1.put("B", "c");
        map1.put("A", "b");
        var sorter = new MapSorter();
        var map2 = sorter.sortReverseByValue(map1);
        // a -> b -> c
        map2.forEach((k, v) -> System.out.println(k + " " + v));
    }  

    @Test
    public void testSortMapByValueObject_NaturalOrder(){
        var map1 = new HashMap<String, MapSorter.Task>();
        map1.put("c", new Task(1, "taskC"));
        map1.put("B", new Task(2, "taskB"));
        map1.put("A", new Task(3, "taskA"));
        var sorter = new MapSorter();
        var map2 = sorter.sortNaturalByValueObject(map1);
        // taskA -> taskB -> taskC
        map2.forEach((k, v) -> System.out.println(k + " " + v.getName()));
    }  
}
