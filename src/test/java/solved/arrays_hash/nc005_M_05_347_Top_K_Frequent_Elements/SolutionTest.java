package solved.arrays_hash.nc005_M_05_347_Top_K_Frequent_Elements;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SolutionTest {

    Solution sut = new Solution();

    @Test
    public void test_1() {
        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = 2;

        int[] actual = sut.topKFrequent(nums, k);

        int[] expected = {1, 2};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void test_2() {
        int[] nums = {1, 1, 1, 2, 2, 2, 3, 3, 4, 4, 5, 5, 6, 7, 8};
        int k = 3;

        int[] actual = sut.topKFrequent(nums, k);

        int[] expected = {1, 2, 3};

        assertArrayEquals(expected, actual);
    }

}