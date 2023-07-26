package src;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemovingChars {
    
    private String input;
    private List<Character> removedChars;

    public RemovingChars(String input, Character ... removedChars) {
        this.input = input;
        this.removedChars = Arrays.asList(removedChars);
    }

    public String RemoveChars() {
        //return input.chars().mapToObj(c -> (char)c)
        //    .filter(c -> !removedChars.contains(c))
        //    .map(String::valueOf).collect(Collectors.joining());

        StringBuilder res = new StringBuilder();
        for (int i=0; i<input.length(); i++) {
            char curChar = input.charAt(i);
            if (removedChars.contains(curChar)) {
                continue;
            } else {
                res.append(curChar);
            }
        }
        return res.toString();
    }

    //TODO: reimplement by replace char?

}
