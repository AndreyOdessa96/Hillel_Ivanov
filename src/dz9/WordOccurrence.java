package dz9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.*;

public class WordOccurrence {
        String name;
        int occurrence;

        public WordOccurrence(String name, int occurrence) {
            this.name = name;
            this.occurrence = occurrence;
        }

    public static int countOccurrence(List<String> list, String word) {
        int count = 0;
        for (String s : list) {
            if (s.equals(word)) {
                count++;
            }
        }
        return count;
    }

    public static List<Integer> toList(int[] array) {
        List<Integer> list = new ArrayList<>();
        for (int i : array) {
            list.add(i);
        }
        return list;
    }

    public static List<Integer> findUnique(List<Integer> list) {
        Set<Integer> set = new HashSet<>(list);
        return new ArrayList<>(set);
    }

    public static void calcOccurrence(List<String> list) {
        Map<String, Integer> map = new HashMap<>();
        for (String s : list) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static List<WordOccurrence> findOccurrence(List<String> list) {
        Map<String, Integer> map = new HashMap<>();
        for (String s : list) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        List<WordOccurrence> result = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            result.add(new WordOccurrence(entry.getKey(), entry.getValue()));
        }
        return result;
    }

    public static void main(String[] args) {
        List<String> words = Arrays.asList("cat", "dog", "bird", "cat", "bird", "dog");
        String wordToCount = "cat";
        int count = countOccurrence(words, wordToCount);
        System.out.println(wordToCount + ": " + count);

        int[] array = {1, 2, 3};
        List<Integer> list = toList(array);
        System.out.println(list);

        List<Integer> numbers = Arrays.asList(1, 2, 3, 2, 3, 4);
        List<Integer> uniqueNumbers = findUnique(numbers);
        System.out.println(uniqueNumbers);

        calcOccurrence(words);

        List<WordOccurrence> occurrences = findOccurrence(words);
        for (WordOccurrence occurrence : occurrences) {
            System.out.println(occurrence.name + ": " + occurrence.occurrence);
        }
    }
}
