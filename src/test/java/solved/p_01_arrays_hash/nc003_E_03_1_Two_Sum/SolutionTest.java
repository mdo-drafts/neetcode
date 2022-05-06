package solved.p_01_arrays_hash.nc003_E_03_1_Two_Sum;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SolutionTest {

    Solution sut = new Solution();

    @Test
    public void test_1() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] actual = sut.twoSum(nums, target);
        int[] expected = {0, 1};
        assertArrayEquals(expected, actual);
    }

}