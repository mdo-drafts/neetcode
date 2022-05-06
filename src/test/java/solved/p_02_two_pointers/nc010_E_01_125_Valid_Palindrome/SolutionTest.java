package solved.p_02_two_pointers.nc010_E_01_125_Valid_Palindrome;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SolutionTest {

    Solution sut = new Solution();

    @Test
    public void test_1() {
        String s = "A man, a plan, a canal: Panama";
        assertTrue(sut.isPalindrome(s));
    }

    @Test
    public void test_2() {
        String s = " ";
        assertTrue(sut.isPalindrome(s));
    }

    @Test
    public void test_3() {
        String s = "0P";
        assertFalse(sut.isPalindrome(s));
    }
}