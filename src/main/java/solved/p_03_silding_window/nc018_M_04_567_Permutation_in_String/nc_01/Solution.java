package solved.p_03_silding_window.nc018_M_04_567_Permutation_in_String.nc_01;

public class Solution {

    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;

        int[] s1Count = new int[26];
        int[] s2Count = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            s1Count[s1.charAt(i) - 'a']++;
            s2Count[s2.charAt(i) - 'a']++;
        }

        int matches = 0;
        for (int i = 0; i < 26; i++) {
            if (s1Count[i] == s2Count[i]) matches++;
        }

        for (int i = 0; i < s2.length() - s1.length(); i++) {
            if (matches == 26) return true;

            char rChar = s2.charAt(i + s1.length());
            int rIndex = rChar - 'a';
            s2Count[rIndex]++;
            if (s1Count[rIndex] == s2Count[rIndex]) matches++;
            else if (s1Count[rIndex] + 1 == s2Count[rIndex]) matches--;

            char iChar = s2.charAt(i);
            int lIndex = iChar - 'a';
            s2Count[lIndex]--;
            if (s1Count[lIndex] == s2Count[lIndex]) matches++;
            else if (s1Count[rIndex] - 1 == s2Count[rIndex]) matches--;
            System.out.println("L :" + lIndex +", R :" + rIndex);
        }
        return matches == 26;
    }
}
