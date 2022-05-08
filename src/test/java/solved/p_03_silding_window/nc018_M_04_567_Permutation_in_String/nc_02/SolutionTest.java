package solved.p_03_silding_window.nc018_M_04_567_Permutation_in_String.nc_02;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    Solution sut = new Solution();

    @Test
    public void test_1() {
        String s1 = "ab";
        String s2 = "eidbaooo";

        assertTrue(sut.checkInclusion(s1, s2));
    }


    @Test
    public void test_2() {
        String s1 = "ab";
        String s2 = "eidboaooo";

        assertFalse(sut.checkInclusion(s1, s2));
    }

    @Test
    public void test_3() {
        String s1 = "a";
        String s2 = "a";

        assertTrue(sut.checkInclusion(s1, s2));
    }

    @Test
    public void test_4() {
        String s1 = "ab";
        String s2 = "ba";

        assertTrue(sut.checkInclusion(s1, s2));
    }


    @Test
    public void test_5() {
        String s1 = "abc";
        String s2 = "bbbca";

        assertTrue(sut.checkInclusion(s1, s2));
    }

    @Test
    public void test_6() {
        String s1 = "rokx";
        String s2 = "otrxvfszxroxrzdsltg";

        assertFalse(sut.checkInclusion(s1, s2));
    }
}