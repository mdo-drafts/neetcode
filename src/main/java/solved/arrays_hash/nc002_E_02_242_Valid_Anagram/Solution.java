package solved.arrays_hash.nc002_E_02_242_Valid_Anagram;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        Map<Character, Integer> sMap = new HashMap<>();
        Map<Character, Integer> tMap = new HashMap<>();

        for (char c : s.toCharArray()) {
            if (sMap.containsKey(c)) {
                int count = sMap.get(c);
                sMap.put(c, count + 1);
            } else {
                sMap.put(c, 1);
            }
        }

        for (char c : t.toCharArray()) {
            if (!sMap.containsKey(c)) {
                return false;
            }
            if (tMap.containsKey(c)) {
                int count = tMap.get(c);
                tMap.put(c, count + 1);
            } else {
                tMap.put(c, 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : sMap.entrySet()) {
            //TODO: attention to != and Objects.equals
            if (!Objects.equals(tMap.get(entry.getKey()), entry.getValue())) {
                return false;
            }
        }
        return true;
    }
}
