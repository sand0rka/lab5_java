package ua.lviv.iot.algo.part1.lab5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class WordsFinder {

    public static List<String> findWordAtSecondLastPosition(final String text) {
        List<String> wordsAtSecondLastPosition = new ArrayList<>();

        String pattern = "[^.!?]+[.!?]";
        Pattern compiledPattern = Pattern.compile(pattern);
        Matcher matcher = compiledPattern.matcher(text);

        while (matcher.find()) {
            String sentence = matcher.group();
            String[] words = sentence.split("\s+");
            if (words.length > 1) {
                String secondLastWord = words[words.length - 2];
                wordsAtSecondLastPosition.add(secondLastWord);
            }
        }


        return wordsAtSecondLastPosition;
    }

    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in, "UTF-8");
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        List<String> words = findWordAtSecondLastPosition(input);
        System.out.println("Words at the second-to-last position: ");
        for (var word : words) {
            System.out.println(word);
        }

    }
}
