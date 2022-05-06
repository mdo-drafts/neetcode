package unsolved.p_03_silding_window.nc016_M_02_3_Longest_Substring_Without_Repeating_Characters;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> unique = new HashSet<>();
        int l = 0;
        int res = 0;
        for (int r = 0; r < s.length(); r++) {
            while (unique.contains(s.charAt(r))) {
                unique.remove(s.charAt(l));
                l++;
            }
            res = Math.max(res, r - l + 1);
            unique.add(s.charAt(r));
        }
        return res;
    }
}
