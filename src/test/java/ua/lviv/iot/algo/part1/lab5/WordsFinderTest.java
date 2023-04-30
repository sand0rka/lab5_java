package ua.lviv.iot.algo.part1.lab5;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WordsFinderTest {

    @Test
    void testFindWordsAtSecondLastPosition() {
        String text = "This is the first sentence. Here is the second sentence. And the third one!";
        List<String> expectedWords = List.of("first", "second", "third");
        List<String> actualWords = WordsFinder.findWordsAtSecondLastPosition(text);
        assertEquals(expectedWords, actualWords);
    }

    @Test
    void testFindWordsAtSecondLastPosition_EmptyText() {
        String text = "";
        List<String> expectedWords = List.of();
        List<String> actualWords = WordsFinder.findWordsAtSecondLastPosition(text);
        assertEquals(expectedWords, actualWords);
    }

    @Test
    void testFindWordsAtSecondLastPosition_singleWordSentences() {
        String text = "Hello. This. Is. A. Test.";
        List<String> words = WordsFinder.findWordsAtSecondLastPosition(text);
        assertEquals(0, words.size());
    }

}
