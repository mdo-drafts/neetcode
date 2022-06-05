package solved.p_05_binary_search.nc030_M_03_875_Koko_Eating_Bananas;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    Solution sut = new Solution();

    @Test
    public void test_1() {
        int[] piles = {3, 6, 7, 11};
        int h = 8;

        int actual = sut.minEatingSpeed(piles, h);
        int expected = 4;

        assertEquals(expected, actual);
    }

    @Test
    public void test_2() {
        int[] piles = {30,11,23,4,20};
        int h = 6;

        int actual = sut.minEatingSpeed(piles, h);
        int expected = 23;

        assertEquals(expected, actual);
    }

}