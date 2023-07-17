package src;

import java.util.Arrays;
import java.util.List;

public class StringUtils {
    public static final Character DELIMITER_WHITESPACE = ' ';
    public static final List<Character> VOWEL_CHARACTERS = Arrays.asList('a', 'o', 'e', 'i', 'u');

    public static List<String> splitSentence2Words(String sentence, char delimiter) {
        return Arrays.asList(sentence.split(String.valueOf(delimiter)));
        /*
        var words = new ArrayList<String>();
        int sentenceLength = sentence.length();
        StringBuilder wordBuilder = new StringBuilder();
        for (int cnt=0; cnt<sentenceLength; cnt++) {
            if(sentence.charAt(cnt) == separate) {
                String word = wordBuilder.toString();
                if (word != null && (word.isBlank() || word.isEmpty())) {
                    continue;
                } else {
                    words.add(word);
                    wordBuilder.setLength(0);//after each word need reset to empty
                }
            } else {
                wordBuilder.append(sentence.charAt(cnt));
            }
        }
        //handle the last word in sentence or if sentence has only one word
        if (wordBuilder.length() > 0) {
            String word = wordBuilder.toString();
            if (word != null && (word.isBlank() || word.isEmpty())) {
                //do nothing
            } else {
                words.add(word);
            }
        }
        return words;

         */
    }

    public static String revertWord(String word) {
        // h e l l o  -> o l l e h
        var wordBuilder = new StringBuilder(word);
        return wordBuilder.reverse().toString();
    }

    public static Boolean isVowel(Character c) {
        return StringUtils.VOWEL_CHARACTERS.contains(Character.toLowerCase(c));
    }

    public static Boolean isConsonant(Character c) {
        if (Character.isLetter(c)) {
            if (StringUtils.isVowel(c)) {
                return false;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }
}
