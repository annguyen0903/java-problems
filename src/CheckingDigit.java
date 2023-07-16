package src;

public class CheckingDigit {

    private String input;
    public CheckingDigit(String input) {
        this.input = input;
    }

    public boolean hasOnlyDigit() {
        // check if one character is NOT digit, return false
        //for (int cnt = 0; cnt < input.length(); cnt++) {
        //    if (!Character.isDigit(input.charAt(cnt))) return false;
        //}

        //boolean nonDigit = input.chars()
        //        .mapToObj(c -> (char)c)
        //        .anyMatch(c -> Character.isDigit(c)==false);

        boolean nonDigit = input.chars().anyMatch(value -> !Character.isDigit(value));
        return !nonDigit;
    }
}
