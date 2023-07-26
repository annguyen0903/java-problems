package src;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MostAppearCharacter {

    private String input;

    public MostAppearCharacter(String input) {
        this.input = input;
    }

    public List<Character> findMostAppearChars() {
        Map<Character, Integer> charCounter = new HashMap<>();
        Integer maxCounter = 0;
        for (int i=0; i<input.length(); i++) {
            char c = input.charAt(i);
            Integer counter = 1;
            if (charCounter.containsKey(c)) {
                counter = charCounter.get(c)+1;
                charCounter.put(c, counter);
            } else {
                charCounter.put(Character.valueOf(c), counter);
            }
            if (counter > maxCounter) maxCounter = counter;
        }
        List<Character> res = new ArrayList<>();
        final Integer fMax = maxCounter;
        charCounter.forEach((k,v) -> {
            if (v == fMax) {
                res.add(k);
            }
        });
        
        return res;
    }

}
