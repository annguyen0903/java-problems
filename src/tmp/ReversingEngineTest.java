package src.tmp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReversingEngineTest {
    @Test
    void testRevertSingleWord() {
        var engine = new ReversingEngine("helo", StringUtils.DELIMITER_WHITESPACE);
        assertEquals("oleh", engine.revertLetters());
    }

    @Test
    void testRevertMultipleWords() {
        var engine = new ReversingEngine("helo baby", StringUtils.DELIMITER_WHITESPACE);
        assertEquals("oleh ybab", engine.revertLetters(), "revert letters in words");
    }

    @Test
    void testRevertSentence() {
        var engine = new ReversingEngine("helo baby how are you?", StringUtils.DELIMITER_WHITESPACE);
        assertEquals("you? are how baby helo", engine.revertSentence(), "revert words in sentence");
    }

    @Test
    void testRevertSimpleSentence() {
        var engine = new ReversingEngine("howoldareyou", StringUtils.DELIMITER_WHITESPACE);
        assertEquals("howoldareyou", engine.revertSentence(), "revert words in sentence");
    }
}
