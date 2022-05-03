package solved.arrays_hash.nc004_M_04_49_Group_Anagrams;

import java.util.*;

//Time Complexity: O(NKlogK)
//Space Complexity: O(NK) for strsMap
// where N is the length of strs, and K is the maximum length of a string in strs
public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        if (strs.length == 1) {
            result.add(List.of(strs[0]));
            return result;
        }

        Map<String, List<String>> strsMap = new HashMap<>();
        for (String str : strs) {
            char[] strChars = str.toCharArray();
            Arrays.sort(strChars);
            String key = new String(strChars);

            //TODO:  if (!strsMap.containsKey(key)) strsMap.put(key, new ArrayList());
            //            strsMap.get(key).add(s);
            if (strsMap.containsKey(key)) {
                strsMap.get(key).add(str);
            } else {
                strsMap.put(key, new ArrayList<>(Collections.singleton(str)));
            }
        }

        result.addAll(strsMap.values());
        return result;
    }
}
