package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

import org.junit.Test;

public class EmployeeTest {
    @Test
    public void testNotEquals() {
        var emp1 = new Employee("Thomas", "Developer", 25);
        var emp2 = new Employee("Edison", "Tester", 35);
        assertEquals(false, emp1.equals(emp2));
    }

        @Test
    public void testEquals() {
        var emp1 = new Employee("Thomas", "Developer", 25);
        var emp2 = new Employee("Thomas", "Developer", 25);
        assertEquals(true, emp1.equals(emp1));
        assertEquals(true, emp1.equals(emp2));
        assertTrue(emp1.hashCode() == emp2.hashCode());
    }

    @Test
    public void testByHashSet() {
        var emp1 = new Employee("Thomas", "Developer", 25);
        var emp2 = new Employee("Thomas", "Developer", 25);
        var set = new HashSet<Employee>();
        set.add(emp1);
        set.add(emp2);
        assertEquals(1, set.size());
        assertTrue(set.contains(new Employee("Thomas", "Developer", 25)));
    }

    @Test
    public void testHashCode() {
        var mapHashCode = new HashMap<Integer, Integer>();
        for (int i=0; i<1000; i++) {
            int age = (int)Math.floor(Math.random() * (81) + 20);
            int hashCode = new Employee("Thomas", "Developer", age).hashCode();
            if (mapHashCode.containsKey(hashCode)) {
                int curCnt = mapHashCode.get(hashCode);
                mapHashCode.put(hashCode, (curCnt+1));
            } else {
                mapHashCode.put(hashCode, 1);
            }
        }
        mapHashCode.forEach((k, v) -> {
            if (v > 1) {
                System.out.println("hash " + k + " -> " + "count " + v);
            }
        });
    }

    //TODO: check for hash algorithm
}
