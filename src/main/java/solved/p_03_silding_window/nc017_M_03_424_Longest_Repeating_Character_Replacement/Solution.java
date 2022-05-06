package solved.p_03_silding_window.nc017_M_03_424_Longest_Repeating_Character_Replacement;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int characterReplacement(String s, int k) {
        Map<Character, Integer> charMap = new HashMap<>();

        int res = 0;
        int l = 0;
        for (int r = 0; r < s.length(); r++) {
            charMap.merge(s.charAt(r), 1, Integer::sum);

            while (r - l + 1 - Collections.max(charMap.values()) > k) {
                charMap.merge(s.charAt(l), -1, Integer::sum);
                l++;
            }
            res = Math.max(res, r - l + 1);
        }
        return res;
    }
}
