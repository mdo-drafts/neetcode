package solved.p_01_arrays_hash.nc002_E_02_242_Valid_Anagram.nc_01;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()) return false;
        //TODO: check for both s and t equality at once
        if(s.equals(t)) return true;

        Map<Character, Integer> sMap = new HashMap<>();
        Map<Character, Integer> tMap = new HashMap<>();

        for(int i = 0; i < s.length(); i++) {
            //TODO: use modern or compact functions
            sMap.merge(s.charAt(i), 1, Integer::sum);
            tMap.merge(t.charAt(i), 1, Integer::sum);
        }

        for(Character c : sMap.keySet()) {
            //TODO: neet comparison for maps values
            if(!sMap.get(c).equals(tMap.get(c))) return false;
        }
        return true;
    }
}
