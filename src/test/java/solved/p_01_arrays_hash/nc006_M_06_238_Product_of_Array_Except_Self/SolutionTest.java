package solved.p_01_arrays_hash.nc006_M_06_238_Product_of_Array_Except_Self;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SolutionTest {

    Solution sut = new Solution();

    @Test
    public void test_1() {

        int[] nums = {1, 2, 3, 4};

        int[] actual = sut.productExceptSelf(nums);

        int[] expected = {24, 12, 8, 6};

        assertArrayEquals(expected, actual);

    }

}