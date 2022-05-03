package solved.arrays_hash.nc009_M_09_128_Longest_Consecutive_Sequence;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    Solution sut = new Solution();

    @Test
    public void test_1() {
        int[] nums = {100, 4, 200, 1, 3, 2};
        int actual = sut.longestConsecutive(nums);
        int expected = 4;

        assertEquals(expected, actual);
    }

    @Test
    public void test_2() {
        int[] nums = {0, 3, 7, 2, 5, 8, 4, 6, 0, 1};
        int actual = sut.longestConsecutive(nums);
        int expected = 9;

        assertEquals(expected, actual);
    }

    @Test
    public void test_3() {
        int[] nums = {1, 0, -1};
        int actual = sut.longestConsecutive(nums);
        int expected = 3;

        assertEquals(expected, actual);
    }

}