package src;

import java.util.List;
import java.util.stream.Collectors;

public class JoiningStrings {

    private Character delimiter;
    private List<String> input;

    public JoiningStrings(List<String> input, Character delimiter) {
        this.input = input;
        this.delimiter = delimiter;
    }

    public String join() {
        return input.stream().filter(x -> (x!=null && !x.isBlank()))
        .collect(Collectors.joining(delimiter.toString()));
    }

}
