package src.tmp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ReversingEngine {
    private final String sentence;

    private final Character delimiter;

    public ReversingEngine(String sentence, Character delimiter) {
        this.sentence = sentence;
        this.delimiter = delimiter;
    }

    public String revertLetters() {
        // hello my baby  -> olleh ym ybab
        //TODO: Refine this function in near future
        var words = StringUtils.splitSentence2Words(sentence, delimiter);
        var revertedWords = new ArrayList<String>();
        //words.forEach(x -> StringUtils.revertWord(x));
        for(String word : words) {
            revertedWords.add(StringUtils.revertWord(word));
        }
        return revertedWords.stream().collect(Collectors.joining(String.valueOf(delimiter)));
    }

    public String revertSentence() {
        //split it to an array of words
        List<String> words = StringUtils.splitSentence2Words(sentence,
                StringUtils.DELIMITER_WHITESPACE);
        //reverse the array
        Collections.reverse(words);
        //join the array to sentence again
        return words.stream().collect(Collectors.joining(String.valueOf(delimiter)));
    }
}
