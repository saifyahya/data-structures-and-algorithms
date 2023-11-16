package CC34.app.src.main.java.cc34;

import CC30.lib.src.main.java.cc30.HashMap;

import java.util.ArrayList;
import java.util.Arrays;

public class FirstOccurrenceWord {
    public static String firstRepeatedWord(String text) {
        HashMap<String, Integer> wordOccurrence = new HashMap<>(10);
        String mostCommonWord = "";
        int maxValue = 0;
        ArrayList<String> orderOfMostRepeatedWords = new ArrayList<>();
        String[] words = text.trim().toLowerCase().split("[^a-zA-Z0-9]+");
        for (String word : words) {
            if (wordOccurrence.contains(word)) {
                wordOccurrence.set(word, wordOccurrence.get(word) + 1);
            }
            else{
                wordOccurrence.set(word, 1);
            }
            if (wordOccurrence.get(word) > maxValue) {
                mostCommonWord = word;
                maxValue = wordOccurrence.get(word);
                orderOfMostRepeatedWords.add(word);
            }
            if (wordOccurrence.get(word) == maxValue && orderOfMostRepeatedWords.contains(word)) {
                mostCommonWord = word;
            }
        }
        return mostCommonWord;
    }
}
