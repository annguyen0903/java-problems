package src.tmp;

public class CharacterCounter {
    private String input;
    public CharacterCounter(String input) {
        this.input = input;
    }

    public long countCharacter(Character c) {
        //for each character in input
        //check if it is matched with c, then increase counter by 1
        long numOfChars = (input.chars().filter(x -> x==c).count());
        return numOfChars;
    }

}
