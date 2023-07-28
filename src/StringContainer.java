package src;

public class StringContainer {

    private String input;

    public StringContainer(String input) {
        this.input = input;
    }

    public boolean contains(String subStr) {
        return input.contains(subStr);
    }

}
