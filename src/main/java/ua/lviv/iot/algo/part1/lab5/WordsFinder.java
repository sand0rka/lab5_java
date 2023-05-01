package ua.lviv.iot.algo.part1.lab5;

import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class WordsFinder {
    public static final String patternWordOnSecondLastPosition = "[^.!?]+[.!?]";
    public static final Pattern compiledPattern = Pattern.compile(patternWordOnSecondLastPosition);

    public List<String> findWordAtSecondLastPosition(final String text) {
        List<String> wordsAtSecondLastPosition = new LinkedList<>();

        Matcher matcher = compiledPattern.matcher(text);

        while (matcher.find()) {
            String sentence = matcher.group();
            String[] words = sentence.trim().split("\s+");
            if (words.length > 1) {
                String secondLastWord = words[words.length - 2];
                wordsAtSecondLastPosition.add(secondLastWord);
            }
        }
        return wordsAtSecondLastPosition;
    }
}
