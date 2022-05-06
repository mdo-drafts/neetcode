package solved.p_02_two_pointers.nc010_E_01_125_Valid_Palindrome.lc_01;

public class Solution {

    public boolean isPalindrome(String s) {
        //TODO: consider using for with two varables
        for (int i = 0, j = s.length() - 1; i < j; i++, j--) {
            //TODO: consider using 'while' loop instead of 'if()' and 'continue'
            while (i < j && !Character.isLetterOrDigit(s.charAt(i))) {
                i++;
            }
            while (i < j && !Character.isLetterOrDigit(s.charAt(j))) {
                j--;
            }

            if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j)))
                return false;
        }

        return true;
    }
}
