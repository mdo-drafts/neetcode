package solved.p_03_silding_window.nc018_M_04_567_Permutation_in_String;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() < 2) return s2.contains(s1);

        Map<Character, Integer> s1CharMap = new HashMap<>();
        for (char c : s1.toCharArray()) s1CharMap.merge(c, 1, Integer::sum);
        int l = 0;
        int r = s1.length() - 1;
        while (r < s2.length()) {
            Map<Character, Integer> s2CharMap = new HashMap<>();
            for (int i = l; i <= r; i++) {
                s2CharMap.merge(s2.charAt(i), 1, Integer::sum);
            }
            if (s1CharMap.equals(s2CharMap)) return true;
            l++;
            r++;
        }
        return false;
    }
}
