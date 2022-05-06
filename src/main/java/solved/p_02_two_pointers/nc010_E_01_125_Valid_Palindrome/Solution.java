package solved.p_02_two_pointers.nc010_E_01_125_Valid_Palindrome;

public class Solution {

    public boolean isPalindrome(String s) {
        int p1 = 0;
        int p2 = s.length() - 1;

        while (p1 < p2) {
            char p1c = s.charAt(p1);
            char p2c = s.charAt(p2);

            if (!Character.isLetterOrDigit(p1c)) {
                p1++;
                continue;
            }
            if (!Character.isLetterOrDigit(p2c)) {
                p2--;
                continue;
            }
            if (Character.toLowerCase(s.charAt(p1)) != Character.toLowerCase(s.charAt(p2))) {
                return false;
            }
            p1++;
            p2--;
        }
        return true;
    }
}
