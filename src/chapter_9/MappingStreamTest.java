package chapter_9;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.apache.commons.lang3.stream.Streams;
import org.junit.Test;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import tmp.Employee;

public class MappingStreamTest {
    @Test
    public void testMapStringToInteger(){
        List<String> numStr = Arrays.asList("1", "2", "3", "4");
        //transform list of string to list of number
        //List<Integer> nums = Streams.of(numStr).mapToInt(Integer::valueOf).boxed().collect(Collectors.toList());
        List<Integer> nums = Streams.of(numStr).map(Integer::valueOf).collect(Collectors.toList());

        assertTrue(nums.size() == 4);
        assertTrue(nums.get(0)==1);
        assertTrue(nums.get(3)==4);
    }

    @Test
    public void testMappingWithObjects(){
        List<Employee> employeesList = Arrays.asList(
                                    new Employee(1, "Alex", 100),
                                    new Employee(2, "Brian", 100),
                                    new Employee(3, "Charles", 200),
                                    new Employee(4, "David", 200),
                                    new Employee(5, "Edward", 300),
                                    new Employee(6, "Frank", 300)
                                );
        //find all possible distinct salary
        List<Integer> distinctSalaries = employeesList.stream().mapToInt(x -> x.getSalary())
            .distinct().boxed().collect(Collectors.toList());
        assertEquals(3, distinctSalaries.size());
        assertTrue(distinctSalaries.contains(100));
        assertTrue(distinctSalaries.contains(200));
        assertTrue(distinctSalaries.contains(300));
    }
        

    @Test
    public void testMapFlatObjects(){
        //find all district words from all lines in a text file
        List<String> line1 = Arrays.asList("one", "two", "three");
        List<String> line2 = Arrays.asList("four", "file", "three");
        List<String> line3 = Arrays.asList("six", "seven", "eight");

        List<List<String>> fileContent = Arrays.asList(line1, line3, line2);
        List<String> flattedWords = fileContent.stream().flatMap(line -> line.stream())
            .distinct().collect(Collectors.toList());

        assertEquals(8, flattedWords.size());
        assertTrue(flattedWords.contains("one"));
        assertTrue(flattedWords.contains("eight"));
    }
}

@Getter
@Setter
@AllArgsConstructor
class Employee{
    private Integer id;
    private String name;
    private Integer salary;
}
