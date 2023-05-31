package dz9;

import java.util.List;

public class CountOccurrence {
    public static int countOccurrence(List<String> list, String word) {
        int count = 0;
        for (String s : list) {
            if (s.equals(word)) {
                count++;
            }
        }
        return count;
    }
}
