package test;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class PalindromeChecking {

    private String input;

    public PalindromeChecking(String input) {
        this.input = input;
    }

    public boolean isPalindrome() {
        //reverse current string to another
        //compare (check equal) them
        final int numOfChars = input.length();
        var reversedChars = new ArrayList<Character>();
        for(int i=(numOfChars-1); i>=0; i--) {
            reversedChars.add(input.charAt(i));
        }
        var newStr = reversedChars.stream()
            .map(x -> x.toString()).collect(Collectors.joining());
        return input.equals(newStr);
        //TODO: reimplement more effective solution: meet-in-the-middle approach
    }

}
