package dz9;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CalcOccurrence {
    public static void calcOccurrence(List<String> list) {
        Map<String, Integer> map = new HashMap<>();
        for (String s : list) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
