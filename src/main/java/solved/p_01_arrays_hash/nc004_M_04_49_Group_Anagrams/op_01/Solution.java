package solved.p_01_arrays_hash.nc004_M_04_49_Group_Anagrams.op_01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
//Time Complexity: O(NK)
//Space Complexity: O(NK) for strsMap
// where N is the length of strs, and K is the maximum length of a string in strs

public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        if (strs.length == 0) return res;

        HashMap<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            char[] hash = new char[26];
            for (char c : s.toCharArray()) {
                hash[c - 'a']++;
            }
            String str = new String(hash);
            //TODO:map.computeIfAbsent(str, k -> new ArrayList<>());
            if (map.get(str) == null) {
                map.put(str, new ArrayList<>());
            }
            map.get(str).add(s);
        }
        res.addAll(map.values());
        return res;
    }
}
