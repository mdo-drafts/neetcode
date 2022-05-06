package unsolved.p_03_silding_window.nc016_M_02_3_Longest_Substring_Without_Repeating_Characters.at_01;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int res = 0;

        Set<Character> charSet = new HashSet<>();

        int l = 0;
        for (int r = 0; r < s.length(); r++) {
            while (charSet.contains(s.charAt(r))) {
                charSet.remove(s.charAt(l));
                l++;
            }
            res = Math.max(res, r - l + 1);
            charSet.add(s.charAt(r));
        }
        return res;
    }
}
