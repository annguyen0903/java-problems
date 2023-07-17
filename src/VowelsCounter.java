package src;

public class VowelsCounter {
    private final String input;
    public VowelsCounter(String input) {
        this.input = input;
    }
    public long countVowels() {
        System.out.println("");
        return input.chars().filter(c -> StringUtils.isVowel((char)c))
        .peek(c -> System.out.print(Character.valueOf((char)c).toString())).count();
    }

    public long countConsonant() {
        System.out.println("");
        return input.chars().filter(c -> StringUtils.isConsonant((char)c))
        .peek(c -> System.out.print(Character.valueOf((char)c).toString())).count();
    }

    //TODO: refine src by using partitioningBy, count one time!

}
