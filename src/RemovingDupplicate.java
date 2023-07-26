package src;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemovingDupplicate {

    private String input;

    public RemovingDupplicate(String input) {
        this.input = input;
    }

    public String removeDupplicateChars1(){
        return input.chars().distinct().mapToObj(x -> (char)x)
            .map(String::valueOf).collect(Collectors.joining());
    }

    public String removeDupplicateChars(){
        var setOfUniqueChars = new LinkedHashSet<Character>();
        for(int i=0; i<input.length(); i++){
            setOfUniqueChars.add(input.charAt(i));
        }
        return setOfUniqueChars.stream().map(String::valueOf).collect(Collectors.joining());
    }

    //TODO: Reimplement without using map/mapToObj
}
