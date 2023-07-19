package src;

import java.util.stream.Collectors;

public class RemovingSpaces {
    private String input;
    public RemovingSpaces(String input) {
        this.input = input;
    }

    public String removeSpace() {
        //input.chars().dropWhile(x -> Character.isWhitespace(x)).collect(Collectors.toList());
        return input.chars().filter(x -> !Character.isWhitespace(x))
        .mapToObj(x -> (char)x).map(String::valueOf)
        .collect(Collectors.joining());
        //TODO: how about codepoint solution? or regular expression?
    }

}
